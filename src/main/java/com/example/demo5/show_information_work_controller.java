package com.example.demo5;

import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import java.io.ByteArrayInputStream;
import java.sql.*;

public class show_information_work_controller {

    @FXML
    private Rectangle clep;
    @FXML
    private Label ID_Nat_Work;

    @FXML
    private Label addres;

    @FXML
    private Label nat;

    @FXML
    private Label date_of_birth;

    @FXML
    private Label last_name;

    @FXML
    private Label name;

    @FXML
    private Label plasse_of_birth;

    @FXML
    private Label state;
    @FXML
    private Label  room;
public void mouseclick(MouseEvent event) {
    Main_APP.show_inf_work.hide();
}
    public void st(){
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + HomePage_controller.u, "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM worker WHERE National_id_card_number = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setLong(1,  Long.parseLong(HomePage_controller.A));
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ID_Nat_Work.setText(rs.getString("National_id_card_number"));
                name.setText(rs.getString("worker_name"));
                plasse_of_birth.setText(rs.getString("place_brith_worker"));
                last_name.setText(rs.getString("worker_last_name"));
                addres.setText(rs.getString("Address"));
                state.setText(rs.getString("state"));
                date_of_birth.setText(rs.getString("place_brith_worker"));
                 nat.setText(rs.getString("nationality"));
                room.setText(rs.getString("room_Num_room"));
            }
        } catch (
                SQLException e) {
            e.printStackTrace();}
        byte[] imageData = retrieveImageFromDatabase(Long.parseLong(HomePage_controller.A),HomePage_controller.u);
        if (imageData != null) {
            Image image = new Image(new ByteArrayInputStream(imageData), 140, 152, false, true);
            clep.setFill(new ImagePattern(image));


        } else{
            WritableImage writableImage = new WritableImage(140, 152);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
            }
            Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
            clep.setFill(new ImagePattern(emptyImage));
        }

    }
    byte[] retrieveImageFromDatabase(long studentId,String U) {
        System.out.println("this is"+studentId+"and"+U);
        byte[] imageData = null;
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + U, "root", "Saf3tyF!rst@2023");
            PreparedStatement statement = connection.prepareStatement("SELECT photo_worker FROM worker WHERE National_id_card_number = ?");
            statement.setLong(1, studentId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                imageData = resultSet.getBytes("photo_worker");
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
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + HomePage_controller.u, "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM worker WHERE National_id_card_number = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setLong(1, Long.parseLong(HomePage_controller.A));
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ID_Nat_Work.setText(rs.getString("National_id_card_number"));
                name.setText(rs.getString("worker_name"));
                plasse_of_birth.setText(rs.getString("place_brith_worker"));
                last_name.setText(rs.getString("worker_last_name"));
                addres.setText(rs.getString("Address"));
                state.setText(rs.getString("state"));
                date_of_birth.setText(rs.getString("place_brith_worker"));
                nat.setText(rs.getString("nationality"));
                room.setText(rs.getString("room_Num_room"));
            }
        } catch (
                SQLException e) {
            e.printStackTrace();}
        byte[] imageData = retrieveImageFromDatabase(Long.parseLong(HomePage2_controller.A),HomePage2_controller.u);
        if (imageData != null) {
            Image image = new Image(new ByteArrayInputStream(imageData), 140, 152, false, true);
            clep.setFill(new ImagePattern(image));


        } else{
            WritableImage writableImage = new WritableImage(140, 152);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
            }
            Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
            clep.setFill(new ImagePattern(emptyImage));
        }

    }



    public void initialize() {
        if(HomePage_controller.V1==1){
            st();
        }
        if(HomePage2_controller.V1==1){
            st2();
        }
    }
}





