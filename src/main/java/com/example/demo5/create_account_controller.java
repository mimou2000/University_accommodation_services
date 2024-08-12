package com.example.demo5;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class create_account_controller {

    @FXML
    private TextField email;

    @FXML
    private TextField user;

    @FXML
    private PasswordField password_accont;
    @FXML
    private ImageView show_and_hide_image;

    @FXML
    private Button stet_show_and_hide_button;

    static String d;
    @FXML
    private Button sing_up;
    @FXML
    private TextField password_accont1;
    static int c=0;
private String rool="عامل";

    public void initialize() {
        show_and_hide_image.setImage(new Image("file:src/main/resources/com/example/demo5/hide-password-30.png"));

        stet_show_and_hide_button.setOnMouseClicked(e -> togglePasswordVisibility());
    }
    public void handleButtonClick(MouseEvent event) {
        stet_show_and_hide_button.setOnMouseClicked(e -> togglePasswordVisibility());
    }

    public void togglePasswordVisibility() {
        if (password_accont.isVisible()) {

            password_accont1.setText(password_accont.getText());
            password_accont.setVisible(false);
            password_accont1.setVisible(true);


            show_and_hide_image.setImage(new Image("file:src/main/resources/com/example/demo5/show-password-30.png"));
        } else {

            password_accont.setText(password_accont1.getText());
            password_accont.setVisible(true);
            password_accont1.setVisible(false);


            show_and_hide_image.setImage(new Image("file:src/main/resources/com/example/demo5/hide-password-30.png"));
        }
    }
    public void ClickMouse(){
        System.exit(0);
    }







    public void MouseClikeLogin(MouseEvent Event) throws IOException {
        Stage a= new Stage();
        Main_APP b=new Main_APP();
        b.start(a);
        Main_APP.create_account.hide();

    }

    public void handleSignUp(ActionEvent event) throws IOException {
        String user1 = user.getText();
        String email_user = email.getText();
        String password_user = password_accont.getText();

        if (user1.isEmpty() || email_user.isEmpty() || password_user.isEmpty()) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("تنبيه");
            alert.setHeaderText(null);
            alert.setContentText("يرجى ملء جميع الحقول");
            alert.showAndWait();
          return;}
        if (password_accont.isVisible()) {

            password_accont1.setText(password_accont.getText());
            password_user = password_accont.getText();
        }else{ password_accont.setText(password_accont1.getText());
            password_user = password_accont.getText();}

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "Saf3tyF!rst@2023")) {
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO users (username,password,email,rool) VALUES (?, ?, ?,?)");
            preparedStatement.setString(1, user1);
            preparedStatement.setString(2, password_user);
            preparedStatement.setString(3, email_user);
            preparedStatement.setString(4,rool);
            int rowsAffected= preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                c=1;
                d=user.getText();
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("تمت العملية");
                alert.setHeaderText(null);
                alert.setContentText("تم انشاء المستخدم بنجاح");
                alert.showAndWait();
                Main_APP.create_account.hide();
                Stage a= new Stage();
                Main_APP b=new Main_APP();
                b.start_Home_page2(a);
                user.setText("");
                password_user.isEmpty();}
        } catch (SQLException ex) {
            ex.printStackTrace();
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("تنبيه");
            alert.setHeaderText(null);
            alert.setContentText("حدث خطأ في عملية الانشاء");

            alert.showAndWait();
        }
    }
    }
