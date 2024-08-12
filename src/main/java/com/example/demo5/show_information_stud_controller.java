package com.example.demo5;

import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import java.io.ByteArrayInputStream;
import javafx.scene.image.*;
import java.sql.*;

public class show_information_stud_controller {
    public void mouseClicked(){
      Main_APP.show_inf_stud.hide();
      HomePage2_controller.v=0;
      HomePage_controller.v=0;
    }
    @FXML
    private Label ID;

    @FXML
    private Label Number_room;

    @FXML
    private Label Number_schol;

    @FXML
    private Label address;

    @FXML
    private Label branch;

    @FXML
    private Label date_birth;

    @FXML
    private Label last_name;

    @FXML
    private Label last_name_dad;

    @FXML
    private Label level;

    @FXML
    private Label name;

    @FXML
    private Label name_dad;


    @FXML
    private Label name_mom;

    @FXML
    private Label nat;

    @FXML
    private Label place_birth;

    @FXML
    private Label spic;

    @FXML
    private Rectangle cli;
    @FXML
    private ImageView im;
    @FXML
    private Label state;
    @FXML
    private Label last_name_mom;
    public void st(){
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + HomePage_controller.u, "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM student WHERE ID_student = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setLong(1, HomePage_controller.a);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ID.setText(rs.getString("ID_student"));
                Number_room.setText(rs.getString("room_Num_room"));
                place_birth.setText(rs.getString("place_of_birth"));
                date_birth.setText(rs.getString("date_of_birth"));
                last_name.setText(rs.getString("student_last_name"));
                last_name_dad.setText(rs.getString("father_last_name"));
                name_dad.setText(rs.getString("father_name"));
                state.setText(rs.getString("state_student"));
                name.setText(rs.getString("student_name"));
                name_mom.setText(rs.getString("Mother_name"));
                Number_schol.setText(rs.getString("School_certificate_number"));
                address.setText(rs.getString("Address"));
                branch.setText(rs.getString("branch_student"));
                level.setText(rs.getString("level_student"));
                nat.setText(rs.getString("nationality"));
                spic.setText(rs.getString("Specialization"));
                last_name_mom.setText(rs.getString("Mother_last_name"));
            }
    } catch (
    SQLException e) {
        e.printStackTrace();}
            byte[] imageData = retrieveImageFromDatabase(HomePage_controller.a,HomePage_controller.u);
            if (imageData != null) {
                Image image = new Image(new ByteArrayInputStream(imageData), 140, 152, false, true);
                cli.setFill(new ImagePattern(image));


            } else{
                WritableImage writableImage = new WritableImage(140, 152);
                Color defaultColor = Color.WHITE;
                for (int x = 0; x < 100; x++) {
                    for (int y = 0; y < 100; y++) {
                        writableImage.getPixelWriter().setColor(x, y, defaultColor);
                    }
                }
                Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
                cli.setFill(new ImagePattern(emptyImage));
            }

    }
     byte[] retrieveImageFromDatabase(long studentId,String U) {
        System.out.println("this is"+studentId+"and"+U);
        byte[] imageData = null;
        try {
            // افتح الاتصال بقاعدة البيانات وقم بتنفيذ استعلام SQL لاسترجاع الصورة
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + U, "root", "Saf3tyF!rst@2023");
            PreparedStatement statement = connection.prepareStatement("SELECT photo_student FROM student WHERE ID_student = ?");
            statement.setLong(1, studentId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                imageData = resultSet.getBytes("photo_student");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println( imageData);
        return imageData;
    }

    public void st2(){
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + HomePage2_controller.u, "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM student WHERE ID_student = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setLong(1, HomePage2_controller.a);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ID.setText(rs.getString("ID_student"));
                Number_room.setText(rs.getString("room_Num_room"));
                place_birth.setText(rs.getString("place_of_birth"));
                date_birth.setText(rs.getString("date_of_birth"));
                last_name.setText(rs.getString("student_last_name"));
                last_name_dad.setText(rs.getString("father_last_name"));
                name_dad.setText(rs.getString("father_name"));
                state.setText(rs.getString("state_student"));
                name.setText(rs.getString("student_name"));
                name_mom.setText(rs.getString("Mother_name"));
                Number_schol.setText(rs.getString("School_certificate_number"));
                address.setText(rs.getString("Address"));
                branch.setText(rs.getString("branch_student"));
                level.setText(rs.getString("level_student"));
                nat.setText(rs.getString("nationality"));
                spic.setText(rs.getString("Specialization"));
                last_name_mom.setText(rs.getString("Mother_last_name"));
            }
        } catch (
                SQLException e) {
            e.printStackTrace();}
    byte[] imageData2 = retrieveImageFromDatabase(HomePage2_controller.a,HomePage2_controller.u);
            if (imageData2 != null) {
        Image image = new Image(new ByteArrayInputStream(imageData2), 140, 152, false, true);
        cli.setFill(new ImagePattern(image));
    } else{
        WritableImage writableImage = new WritableImage(140, 152);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }
        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        cli.setFill(new ImagePattern(emptyImage));
    }}


    public void initialize() {
        if(HomePage_controller.v==1){
            st();
        }
        if(HomePage2_controller.v==1){
            st2();
        }
    }
}
