package com.example.demo5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class add_admine_controler {
    public void click(){
       Main_APP.add_admine.hide();
    }
String rool="مسؤول";
    @FXML
    private TextField conform_password;

    @FXML
    private TextField email;

    @FXML
    private TextField name_adime;

    @FXML
    private PasswordField password;

    @FXML
    private TextField password_accont1;

    @FXML
    ImageView show_and_hide_image;

    public void handleSignUp(ActionEvent event) throws IOException {
        String user1 = name_adime.getText();
        String email_user = email.getText();
        String password_user = password.getText();
        String Confirm_password = conform_password.getText();
        if (user1.isEmpty() || email_user.isEmpty() || password_user.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("تنبيه");
            alert.setHeaderText(null);
            alert.setContentText("يرجى ملء جميع الحقول");
            alert.showAndWait();
            return;}
        if (password.isVisible()) {

            password_accont1.setText(password.getText());
            password_user = password.getText();
        }else{ password.setText(password_accont1.getText());
            password_user = password.getText();}
        if(!Confirm_password.equals(password_user)){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("تنبيه");
            alert.setHeaderText(null);
            alert.setContentText("يرجى إعادة كتابة كلمة السر");
            alert.showAndWait();
        }else {

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "Saf3tyF!rst@2023")) {
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO users (username,password,email,rool) VALUES (?, ?, ?,?)");
            preparedStatement.setString(1, user1);
            preparedStatement.setString(2, password_user);
            preparedStatement.setString(3, email_user);
            preparedStatement.setString(4,rool);
            int rowsAffected= preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("تمت العملية");
                alert.setHeaderText(null);
                alert.setContentText("تم انشاء المسؤول بنجاح");
                alert.showAndWait();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("تنبيه");
            alert.setHeaderText(null);
            alert.setContentText("حدث خطأ في عملية الانشاء");
            alert.showAndWait();
        }
    }}
    public void EventtogglePasswordVisibility(ActionEvent e){
        togglePasswordVisibility();
    }
    public void togglePasswordVisibility() {
        if (password.isVisible()) {

            password_accont1.setText(password.getText());
            password.setVisible(false);
            password_accont1.setVisible(true);


            show_and_hide_image.setImage(new Image("file:src/main/resources/com/example/demo5/show-password-30.png"));
        } else {

            password.setText(password_accont1.getText());
            password.setVisible(true);
            password_accont1.setVisible(false);


            show_and_hide_image.setImage(new Image("file:src/main/resources/com/example/demo5/hide-password-30.png"));
        }
    }
}
