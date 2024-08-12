package com.example.demo5;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.sql.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Login_Controller{
    public void setUser(String user) {
        this.user = user;
    }

    String user;

    public  String getUser() {
        return user;
    }
    static String a;
    static int b = 0;

    @FXML
    private ImageView show_and_hide_image;

    @FXML
    private Button stet_show_and_hide_button;

    @FXML
    private Button btnLogin;
    @FXML
    public PasswordField password_accont;
    @FXML
    public TextField password_accont1;
    @FXML
    public TextField tfUsername;

    @FXML
    private Hyperlink create_account;
    @FXML
    private Label x_exit;
    @FXML
    private Button close;
    @FXML
    private Hyperlink frog;
    public void exit(){
        System.exit(0);
    }
    public void MouseClike(MouseEvent Event){

            Stage stage=new Stage();
            Main_APP dialoge= new Main_APP();
            try {
                dialoge.Start_dialoge_forgetPassword(stage);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


    }
    public void MouseClikeLogin(MouseEvent Event) throws IOException {

        Main_APP a= new Main_APP();
        Stage create_accont =new Stage();
        a.start_create_account(create_accont);

    }
    @FXML
    public ComboBox<String> rool;

    public void initialize() {
        show_and_hide_image.setImage(new Image("file:src/main/resources/com/example/demo5/hide-password-30.png"));

        stet_show_and_hide_button.setOnMouseClicked(e -> togglePasswordVisibility());
         rool.getItems().addAll("مسؤول","عامل");

    }
    public void handleButtonClick(MouseEvent event) {
        stet_show_and_hide_button.setOnMouseClicked(e -> togglePasswordVisibility());
     }

    public void togglePasswordVisibility() {
        if (password_accont.isVisible()) {
            // إظهار كلمة السر
            password_accont1.setText(password_accont.getText());
            password_accont.setVisible(false);
            password_accont1.setVisible(true);

            // تغيير الصورة لإظهار كلمة السر
            show_and_hide_image.setImage(new Image("file:src/main/resources/com/example/demo5/show-password-30.png"));
        } else {
            // إخفاء كلمة السر
            password_accont.setText(password_accont1.getText());
            password_accont.setVisible(true);
            password_accont1.setVisible(false);

            // تغيير الصورة لإخفاء كلمة السر
            show_and_hide_image.setImage(new Image("file:src/main/resources/com/example/demo5/hide-password-30.png"));
        }
    }


public boolean authenticateUser(String username, String password) {
    String Rool=rool.getSelectionModel().getSelectedItem().toString();
    String query = "SELECT * FROM users WHERE (username = ? OR email = ?) AND password = ?and rool=?  ";
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "Saf3tyF!rst@2023");
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, username);
        stmt.setString(2, username);
        stmt.setString(3, password);
        stmt.setString(4,Rool);
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    } catch (SQLException e) {

        return false;
    }
}
    public  void A(String username, String password,String rool) {
        String query = "SELECT * FROM users WHERE (username = ? OR email = ?) AND password = ?AND rool=?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "Saf3tyF!rst@2023");
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, username);
            stmt.setString(3, password);
            stmt.setString(4,rool);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()==true){
                a=rs.getString("username");
            };
        } catch (SQLException e) {
            Alert alert1 = new Alert(Alert.AlertType.ERROR);
            alert1.setTitle("خطأ");
            alert1.setHeaderText(null);
            alert1.setContentText("هناك خطأ");
        }
    }
public void loginClicke(MouseEvent event){
    String username = tfUsername.getText();
    String password = password_accont.getText();
if(password.isEmpty()||username.isEmpty()){
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("خطأ");
    alert.setHeaderText(null);
    alert.setContentText("هناك خطأ في معلومات يرجي تحقق منها");
    alert.showAndWait();
}else{
String Rool = rool.getSelectionModel().getSelectedItem().toString();
    if (password_accont.isVisible()) {
        password_accont1.setText(password_accont.getText());
        password = password_accont.getText();
    }else{ password_accont.setText(password_accont1.getText());
        password = password_accont.getText();}
    boolean loginSuccessful = authenticateUser(username, password);
    if (loginSuccessful==true && Rool=="عامل"){
        setUser(username);
        b=1;
A(username, password,Rool);

Stage Home =new Stage();
Main_APP a=new Main_APP();

        try {
            a.start_Home_page2(Home);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        Main_APP.login_stage.hide();


        }else if(loginSuccessful==true && Rool=="مسؤول"){

        setUser(username);
        b=1;
        A(username, password,Rool);

        Stage Home =new Stage();
        Main_APP a=new Main_APP();

        try {

            a.start_Home_page(Home);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        Main_APP.login_stage.hide();

    }else{
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("خطأ");
    alert.setHeaderText(null);
    alert.setContentText("هناك خطأ في معلومات يرجي تحقق منها");
    alert.showAndWait();
    return;}}}}