package com.example.demo5;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.sql.*;

public class crate_data_base_controller {
    static boolean Home = false;
    static int g=0;
    @FXML
    private Label close;

    @FXML
    private Button create_data_base;

    @FXML
    private TextField tx;

    public static String a;

    public static String getA() {
        return a;
    }

    public static void setA(String a) {
        crate_data_base_controller.a = a;
    }

    public void exit() {
        Main_APP.crate_data_base.hide();
    }

    public void handleButtonClick(MouseEvent event) {
        create_data_base.setOnMouseClicked(e -> {
            String newDatabaseName = tx.getText();
            if (!newDatabaseName.isEmpty()) {
                createDatabaseCopyAndAddToNameDataBaseList(newDatabaseName);

                addNameToDataBaseList(newDatabaseName);
                g=1;
                 Main_APP.crate_data_base.hide();
            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Database name cannot be empty.");
            }
        });
    }

    public void createDatabaseCopyAndAddToNameDataBaseList(String newDatabaseName) {
        String oldDatabaseURL = "jdbc:mysql://localhost:3306/my_project_uas";
        String newDatabaseURL = "jdbc:mysql://localhost:3306/";

        String username = "root";
        String password = "Saf3tyF!rst@2023";

        try (Connection oldConnection = DriverManager.getConnection(oldDatabaseURL, username, password);
             Connection newConnection = DriverManager.getConnection(newDatabaseURL, username, password)) {


            try (Statement createDatabaseStatement = newConnection.createStatement()) {
                String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + newDatabaseName;
                createDatabaseStatement.executeUpdate(createDatabaseSQL);
            }


            try (Statement useDatabaseStatement = newConnection.createStatement()) {
                String useDatabaseSQL = "USE " + newDatabaseName;
                useDatabaseStatement.executeUpdate(useDatabaseSQL);
            }


            DatabaseMetaData oldMetaData = oldConnection.getMetaData();


            ResultSet tables = oldMetaData.getTables(null, null, "%", null);


            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                String createTableQuery = "CREATE TABLE IF NOT EXISTS " + newDatabaseName + "." + tableName +
                        " LIKE my_project_uas." + tableName;

                try (Statement createTableStatement = newConnection.createStatement()) {
                    createTableStatement.executeUpdate(createTableQuery);
                } catch (SQLException ex) {

                    ex.printStackTrace();
                }
            }
            g=1;
            a = newDatabaseName;



            showAlert(Alert.AlertType.INFORMATION, "نجاح", "تم انشاء قاعدة بيانات فارغة");

        } catch (SQLException ex) {
            ex.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "خطأ", "حدث خطأ اثناء انشاء قاعدة البيانات");
        }
    }

    public void addNameToDataBaseList(String newDatabaseName) {
        Home = true;
        String URL = "jdbc:mysql://localhost:3306/";
        String url1 = URL + newDatabaseName;
        String insertNameIntoTableSQL = "INSERT INTO users.name_data_base_work (name_data_base, url) VALUES ('" + newDatabaseName + "', '" + url1 + "');";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "Saf3tyF!rst@2023");
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(insertNameIntoTableSQL);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }

    public void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }


}
