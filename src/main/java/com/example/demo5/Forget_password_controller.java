package com.example.demo5;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.sql.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Forget_password_controller {

    @FXML
    private TextField email;

    @FXML
    private Button passwordRecoveryButton;

    @FXML
    public void handleButtonClick(MouseEvent event) {
        String userEmail = email.getText();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "Saf3tyF!rst@2023")) {
            String sql = "SELECT password FROM users WHERE email = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, userEmail);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String password = resultSet.getString("password");
                sendPasswordByEmail(userEmail, password);
                showAlert(Alert.AlertType.INFORMATION, "تم الإرسال", "تم إرسال كلمة السر إلى البريد الإلكتروني");
                Main_APP.dialoge_forgetPassword.hide();
            } else {
                showAlert(Alert.AlertType.ERROR, "خطأ", "البريد الإلكتروني غير مسجل في قاعدة البيانات");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "خطأ", "حدث خطأ أثناء الاتصال بقاعدة البيانات");
        }
    }

    private void sendPasswordByEmail(String userEmail, String password) {
        String fromEmail ="MS_Bxyo5r@trial-3z0vklojx51g7qrx.mlsender.net";
        String toEmail = userEmail;
        String subject = "Password Recovery";
        String body = "Your password is: " + password;

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.mailersend.net"); // اسم المضيف الصحيح هو smtp.mailersend.net
        props.put("mail.smtp.port", "587"); // البوابة الصحيحة هي 587
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true"); // تفعيل TLS
        props.put("mail.smtp.ssl.trust", "smtp.mailersend.net"); // اسم المضيف الموثوق به هو smtp.mailersend.net
        props.put("mail.smtp.ssl.protocols", "TLSv1.2"); // استخدام بروتوكول TLS آمن
        props.put("mail.smtp.user", "MS_Bxyo5r@trial-3z0vklojx51g7qrx.mlsender.net"); // اسم المستخدم الصحيح
        props.put("mail.smtp.password", "kQPhGGw51m3uYwiU"); // كلمة المرور الصحيحة


        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("MS_Bxyo5r@trial-3z0vklojx51g7qrx.mlsender.net", "kQPhGGw51m3uYwiU");
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText(body);
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "خطأ", "حدث خطأ أثناء إرسال البريد الإلكتروني");
        }
    }

    private void showAlert(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public void exit() {
        Main_APP.dialoge_forgetPassword.hide();
    }
}