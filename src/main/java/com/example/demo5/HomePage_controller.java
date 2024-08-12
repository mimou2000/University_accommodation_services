package com.example.demo5;
import javafx.event.ActionEvent;
import javafx.scene.control.Hyperlink;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.*;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.commons.lang3.StringUtils;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

;

public class HomePage_controller {

    static  int V1=0;
    static String A;
    private static final Logger log = LogManager.getLogger(HomePage_controller.class);
    @FXML
    private BorderPane home_pane;
    @FXML
    private AnchorPane AnchorPane1;

    @FXML
    private AnchorPane AnchorPane2;

    @FXML
    private AnchorPane AnchorPane3;

    @FXML
    private AnchorPane AnchorPane4;

    @FXML
    private AnchorPane AnchorPane5;

    @FXML
    private AnchorPane AnchorPane6;

    @FXML
    private AnchorPane AnchorPane7;

    @FXML
    private AnchorPane AnchorPane8;

    @FXML
    private AnchorPane AnchorPane9;
    @FXML
    private AnchorPane AnchorPane10;

    @FXML
    private AnchorPane AnchorPane11;

    @FXML
    private AnchorPane AnchorPane12;

    @FXML
    private AnchorPane AnchorPane13;

    @FXML
    private AnchorPane AnchorPane14;

    @FXML
    private AnchorPane AnchorPane15;

    @FXML
    private AnchorPane AnchorPane16;

    @FXML
    private AnchorPane AnchorPane17;
    //قائمة الرئسية
    @FXML
    private Label button_add_resid;

    @FXML
    private Label button_archives_resid;

    @FXML
    private Label button_block_resid;

    @FXML
    private Label button_change_information_resid;

    @FXML
    private Label button_deleate_resid;

    @FXML
    private Label button_maintnance_resid;

    @FXML
    private Label button_roms_resid;

    @FXML
    private Label button_sing_out;

    @FXML
    private Label button_table_resid;

    @FXML
    private Label close;
    //قائمة الرئسية

    @FXML
    private Button delate_block;

    @FXML
    private Button delate_student;

    @FXML
    private Button delate_worker;

    @FXML
    private Button page_abandonments_student;

    @FXML
    private Button page_abandonments_worker;

    @FXML
    private Button page_add_block;

    @FXML
    private Button page_add_room;

    @FXML
    private Button page_add_student;

    @FXML
    private Button page_add_worker;

    @FXML
    private Button page_archive_excluded_students;

    @FXML
    private Button page_archive_students1;

    @FXML
    private Button page_archive_students2;

    @FXML
    private Button page_archive_worker;

    @FXML
    private Button page_change_information_student;

    @FXML
    private Button page_change_information_worker;

    @FXML
    private Button page_create_maintenance_request;

    @FXML
    private Button page_delate_block;

    @FXML
    private Button page_delate_room;

    @FXML
    private Button page_maintenance_requests_archive;

    @FXML
    private Button save_change_information_student;

    @FXML
    private Button save_information_worker;

    @FXML
    private Button student_table;

    @FXML
    private Button worker_photo;

    @FXML
    private Button workers_table;
    @FXML
    private Button add_block;

    @FXML
    private Button add_rooms;

    @FXML
    private Button add_student;
    @FXML
    private AnchorPane an;

    @FXML
    private ComboBox<?> b;
    @FXML
    private Button de;
    @FXML
    private Button add_student_photo;
    private ScaleTransition scaleTransition;
    @FXML
    private Button add_worker;
    @FXML
    private Label username1;
    @FXML
    private Button minus;
    private ArrayList<String> URL = new ArrayList<>();
    int selectedIndex;
    static String u;
    static long a, v;
    @FXML
    private AnchorPane AnchorPane111;

    public void setUsername(String username) {

        username1.setText("مرحبا " + username);
    }

    public void ClickMouse() {
        System.exit(0);
    }

    public void student_tableOnMouseClicked(MouseEvent e) {
        AnchorPane1.setVisible(true);
        AnchorPane2.setVisible(false);
    }

    public void Work_ex(ActionEvent e) {
        AnchorPane9.setVisible(false);
        AnchorPane111.setVisible(true);

    }

    public void Workers_ex(ActionEvent e) {
        AnchorPane9.setVisible(true);
        AnchorPane111.setVisible(false);
    }

    public void worker_tableOnMouseClicked(MouseEvent e) {
        AnchorPane1.setVisible(false);
        AnchorPane2.setVisible(true);
    }

    public void hand(MouseEvent event) {
        button_table_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;" + "-fx-background-radius:0px;");
        button_add_resid.setStyle("-fx-background-radius:0px  11.5px 11.5px 0px;" + " -fx-text-fill: black;" + "-fx-background-color: white;");
        button_archives_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;" + "-fx-background-radius:0px;");
        button_block_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
        button_change_information_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
        button_deleate_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
        button_maintnance_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
        button_roms_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
        button_sing_out.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
        AnchorPane1.setVisible(false);
        AnchorPane2.setVisible(false);
        AnchorPane3.setVisible(true);
        AnchorPane4.setVisible(false);
        AnchorPane5.setVisible(false);
        AnchorPane6.setVisible(false);
        AnchorPane7.setVisible(false);
        AnchorPane8.setVisible(false);
        AnchorPane9.setVisible(false);
        AnchorPane10.setVisible(false);
        AnchorPane11.setVisible(false);
        AnchorPane12.setVisible(false);
        AnchorPane13.setVisible(false);
        AnchorPane14.setVisible(false);
        AnchorPane15.setVisible(false);
        AnchorPane16.setVisible(false);
        AnchorPane17.setVisible(false);
        AnchorPane111.setVisible(false);

    }

    public void handleButtonClick(MouseEvent event) {
        button_table_resid.setOnMouseClicked(e -> {
            button_table_resid.setStyle("-fx-background-radius:0px  11.5px 11.5px 0px;" + " -fx-text-fill: black;" + "-fx-background-color: white;");
            button_add_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_archives_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
            button_block_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
            button_change_information_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
            button_deleate_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_maintnance_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
            button_roms_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
            button_sing_out.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
            AnchorPane1.setVisible(true);
            AnchorPane2.setVisible(false);
            AnchorPane3.setVisible(false);
            AnchorPane4.setVisible(false);
            AnchorPane5.setVisible(false);
            AnchorPane6.setVisible(false);
            AnchorPane7.setVisible(false);
            AnchorPane8.setVisible(false);
            AnchorPane9.setVisible(false);
            AnchorPane10.setVisible(false);
            AnchorPane11.setVisible(false);
            AnchorPane12.setVisible(false);
            AnchorPane13.setVisible(false);
            AnchorPane14.setVisible(false);
            AnchorPane15.setVisible(false);
            AnchorPane16.setVisible(false);
            AnchorPane17.setVisible(false);
            AnchorPane111.setVisible(false);
        });

        button_change_information_resid.setOnMouseClicked(e -> {
            button_table_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;" + "-fx-background-radius:0px;");
            button_add_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;" + "-fx-background-radius:0px;");
            button_archives_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;" + "-fx-background-radius:0px;");
            button_block_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_change_information_resid.setStyle("-fx-background-radius:0px  11.5px 11.5px 0px;" + " -fx-text-fill: black;" + "-fx-background-color: white;");
            button_deleate_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
            button_maintnance_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_roms_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
            button_sing_out.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            AnchorPane1.setVisible(false);
            AnchorPane2.setVisible(false);
            AnchorPane3.setVisible(false);
            AnchorPane4.setVisible(false);
            AnchorPane5.setVisible(true);
            AnchorPane6.setVisible(false);
            AnchorPane7.setVisible(false);
            AnchorPane8.setVisible(false);
            AnchorPane9.setVisible(false);
            AnchorPane10.setVisible(false);
            AnchorPane11.setVisible(false);
            AnchorPane12.setVisible(false);
            AnchorPane13.setVisible(false);
            AnchorPane14.setVisible(false);
            AnchorPane15.setVisible(false);
            AnchorPane16.setVisible(false);
            AnchorPane17.setVisible(false);
        });
        button_deleate_resid.setOnMouseClicked(e -> {
            button_table_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;" + "-fx-background-radius:0px;");
            button_add_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;" + "-fx-background-radius:0px;");
            button_archives_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;" + "-fx-background-radius:0px;");
            button_block_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_change_information_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_deleate_resid.setStyle("-fx-background-radius:0px  11.5px 11.5px 0px;" + " -fx-text-fill: black;" + "-fx-background-color: white;");
            button_maintnance_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_roms_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
            button_sing_out.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            AnchorPane1.setVisible(false);
            AnchorPane2.setVisible(false);
            AnchorPane3.setVisible(false);
            AnchorPane4.setVisible(false);
            AnchorPane5.setVisible(false);
            AnchorPane6.setVisible(false);
            AnchorPane7.setVisible(true);
            AnchorPane8.setVisible(false);
            AnchorPane9.setVisible(false);
            AnchorPane10.setVisible(false);
            AnchorPane11.setVisible(false);
            AnchorPane12.setVisible(false);
            AnchorPane13.setVisible(false);
            AnchorPane14.setVisible(false);
            AnchorPane15.setVisible(false);
            AnchorPane16.setVisible(false);
            AnchorPane17.setVisible(false);
            AnchorPane111.setVisible(false);
        });
        button_archives_resid.setOnMouseClicked(e -> {
            button_table_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;" + "-fx-background-radius:0px;");
            button_add_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;" + "-fx-background-radius:0px;");
            button_archives_resid.setStyle("-fx-background-radius:0px  11.5px 11.5px 0px;" + " -fx-text-fill: black;" + "-fx-background-color: white;");
            button_block_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_change_information_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_deleate_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_maintnance_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_roms_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
            button_sing_out.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            AnchorPane1.setVisible(false);
            AnchorPane2.setVisible(false);
            AnchorPane3.setVisible(false);
            AnchorPane4.setVisible(false);
            AnchorPane5.setVisible(false);
            AnchorPane6.setVisible(false);
            AnchorPane7.setVisible(false);
            AnchorPane8.setVisible(false);
            AnchorPane9.setVisible(true);
            AnchorPane10.setVisible(false);
            AnchorPane11.setVisible(false);
            AnchorPane12.setVisible(false);
            AnchorPane13.setVisible(false);
            AnchorPane14.setVisible(false);
            AnchorPane15.setVisible(false);
            AnchorPane16.setVisible(false);
            AnchorPane17.setVisible(false);
            AnchorPane111.setVisible(false);
        });
        button_maintnance_resid.setOnMouseClicked(e -> {
            button_table_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;" + "-fx-background-radius:0px;");
            button_add_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;" + "-fx-background-radius:0px;");
            button_archives_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_block_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_change_information_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_deleate_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_maintnance_resid.setStyle("-fx-background-radius:0px  11.5px 11.5px 0px;" + " -fx-text-fill: black;" + "-fx-background-color: white;");
            button_roms_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
            button_sing_out.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            AnchorPane1.setVisible(false);
            AnchorPane2.setVisible(false);
            AnchorPane3.setVisible(false);
            AnchorPane4.setVisible(false);
            AnchorPane5.setVisible(false);
            AnchorPane6.setVisible(false);
            AnchorPane7.setVisible(false);
            AnchorPane8.setVisible(false);
            AnchorPane9.setVisible(false);
            AnchorPane10.setVisible(false);
            AnchorPane11.setVisible(false);
            AnchorPane12.setVisible(true);
            AnchorPane13.setVisible(false);
            AnchorPane14.setVisible(false);
            AnchorPane15.setVisible(false);
            AnchorPane16.setVisible(false);
            AnchorPane17.setVisible(false);
            AnchorPane111.setVisible(false);
        });
        button_block_resid.setOnMouseClicked(e -> {
            button_table_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;" + "-fx-background-radius:0px;");
            button_add_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;" + "-fx-background-radius:0px;");
            button_archives_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_block_resid.setStyle("-fx-background-radius:0px  11.5px 11.5px 0px;" + " -fx-text-fill: black;" + "-fx-background-color: white;");
            button_change_information_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_deleate_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_maintnance_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_roms_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
            button_sing_out.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            AnchorPane1.setVisible(false);
            AnchorPane2.setVisible(false);
            AnchorPane3.setVisible(false);
            AnchorPane4.setVisible(false);
            AnchorPane5.setVisible(false);
            AnchorPane6.setVisible(false);
            AnchorPane7.setVisible(false);
            AnchorPane8.setVisible(false);
            AnchorPane9.setVisible(false);
            AnchorPane10.setVisible(false);
            AnchorPane11.setVisible(false);
            AnchorPane12.setVisible(false);
            AnchorPane13.setVisible(false);
            AnchorPane14.setVisible(true);
            AnchorPane15.setVisible(false);
            AnchorPane16.setVisible(false);
            AnchorPane17.setVisible(false);
            AnchorPane111.setVisible(false);
        });
        button_roms_resid.setOnMouseClicked(e -> {
            button_table_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;" + "-fx-background-radius:0px;");
            button_add_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;" + "-fx-background-radius:0px;");
            button_archives_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_block_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_change_information_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_deleate_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_maintnance_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_roms_resid.setStyle("-fx-background-radius:0px  11.5px 11.5px 0px;" + " -fx-text-fill: black;" + "-fx-background-color: white;");
            button_sing_out.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            AnchorPane1.setVisible(false);
            AnchorPane2.setVisible(false);
            AnchorPane3.setVisible(false);
            AnchorPane4.setVisible(false);
            AnchorPane5.setVisible(false);
            AnchorPane6.setVisible(false);
            AnchorPane7.setVisible(false);
            AnchorPane8.setVisible(false);
            AnchorPane9.setVisible(false);
            AnchorPane10.setVisible(false);
            AnchorPane11.setVisible(false);
            AnchorPane12.setVisible(false);
            AnchorPane13.setVisible(false);
            AnchorPane14.setVisible(false);
            AnchorPane15.setVisible(false);
            AnchorPane16.setVisible(true);
            AnchorPane17.setVisible(false);
            AnchorPane111.setVisible(false);
        });


        page_add_worker.setOnMouseClicked(e -> {
            AnchorPane3.setVisible(false);
            AnchorPane4.setVisible(true);
        });
        page_add_student.setOnMouseClicked(e -> {
            AnchorPane3.setVisible(true);
            AnchorPane4.setVisible(false);
        });
        page_change_information_worker.setOnMouseClicked(e -> {
            AnchorPane5.setVisible(false);
            AnchorPane6.setVisible(true);
        });
        page_change_information_student.setOnMouseClicked(e -> {
            AnchorPane5.setVisible(true);
            AnchorPane6.setVisible(false);
        });
        page_abandonments_worker.setOnMouseClicked(e -> {
            AnchorPane7.setVisible(false);
            AnchorPane8.setVisible(true);
        });
        page_abandonments_student.setOnMouseClicked(e -> {
            AnchorPane7.setVisible(true);
            AnchorPane8.setVisible(false);
        });
        page_archive_worker.setOnMouseClicked(e -> {
            AnchorPane11.setVisible(true);
            AnchorPane9.setVisible(false);
        });
        page_archive_students2.setOnMouseClicked(e -> {
            AnchorPane11.setVisible(false);
            AnchorPane9.setVisible(true);
        });
        page_archive_excluded_students.setOnMouseClicked(e -> {
            AnchorPane10.setVisible(true);
            AnchorPane9.setVisible(false);
        });
        page_archive_students1.setOnMouseClicked(e -> {
            AnchorPane10.setVisible(false);
            AnchorPane9.setVisible(true);
        });
        page_maintenance_requests_archive.setOnMouseClicked(e -> {
            AnchorPane12.setVisible(false);
            AnchorPane13.setVisible(true);
        });
        page_create_maintenance_request.setOnMouseClicked(e -> {
            AnchorPane12.setVisible(true);
            AnchorPane13.setVisible(false);
        });
        page_delate_block.setOnMouseClicked(e -> {
            AnchorPane15.setVisible(true);
            AnchorPane14.setVisible(false);
        });
        page_add_block.setOnMouseClicked(e -> {
            AnchorPane14.setVisible(true);
            AnchorPane15.setVisible(false);
        });
        page_delate_room.setOnMouseClicked(e -> {
            AnchorPane17.setVisible(true);
            AnchorPane16.setVisible(false);
        });
        page_add_room.setOnMouseClicked(e -> {
            AnchorPane16.setVisible(true);
            AnchorPane17.setVisible(false);
        });
        minus.setOnMouseClicked(e -> {
            Main_APP.Home_page.setIconified(true);
        });
        add_student_photo.setOnMouseClicked(e -> {
            photo_student.setFitHeight(118);
            photo_student.setFitWidth(106);
            photo_student.setPreserveRatio(true);
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("اختر صورة");
            FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("صور", "*.jpg", "*.png", "*.gif", "*.bmp");
            fileChooser.getExtensionFilters().add(imageFilter);
            File selectedFile = fileChooser.showOpenDialog(Main_APP.Home_page);


            if (selectedFile != null) {


                Image image = new Image(selectedFile.toURI().toString(), 150, 160, false, true);

                clip.setFill(new ImagePattern(image));
                photo_student.setImage(image);
            }


        });
        add_student.setOnMouseClicked(e -> {
            add_student(combo1.getSelectionModel().getSelectedItem().toString());
            loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());

        });


        crate_data_base1.setOnMouseClicked(e -> {
            Main_APP a = new Main_APP();
            Stage s = new Stage();
            try {
                a.start_create_data_base(s);


                Main_APP.crate_data_base.setOnHidden(ec -> {
                    if (crate_data_base_controller.g == 1) {
                        Platform.runLater(() -> {
                            combo1.getItems().add(crate_data_base_controller.a);
                            combo2.getItems().add(crate_data_base_controller.a);
                        });
                    }
                });
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


        create_data_base2.setOnMouseClicked(e -> {
            Main_APP a = new Main_APP();
            Stage s = new Stage();
            try {
                a.start_create_data_base(s);


                Main_APP.crate_data_base.setOnHidden(ec -> {
                    if (crate_data_base_controller.g == 1) {
                        Platform.runLater(() -> {
                            combo1.getItems().add(crate_data_base_controller.a);
                            combo2.getItems().add(crate_data_base_controller.a);
                        });
                    }
                });
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


    }

    public ComboBox<String> getCombo1() {
        return combo1;
    }

    public ComboBox<String> getCombo2() {
        return combo2;
    }

    @FXML
    public ComboBox<String> combo1;

    public void setCombo2(String combo) {
        this.combo2.getItems().add(combo);
    }

    public void setCombo1(String combo) {
        this.combo1.getItems().add(combo);
    }

    @FXML
    public ComboBox<String> combo2;


    public void populateComboBoxFromDatabase(ComboBox<String> comboBox) {

        String sql = "SELECT name_data_base FROM name_data_base_work";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "Saf3tyF!rst@2023");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {


            ObservableList<String> databaseNames = FXCollections.observableArrayList();


            while (resultSet.next()) {
                String dbName = resultSet.getString("name_data_base");
                databaseNames.add(dbName);
            }
            comboBox.getItems().clear();
            comboBox.setItems(databaseNames);
            comboBox.getSelectionModel().selectFirst();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void initialize() {
        student_state.getItems().addAll("أدرار", "الشلف", "الأغواط", "أم البواقي", "باتنة", "بجاية",
                "بسكرة", "بشار", "البليدة", "البويرة", "تمنراست", "تبسة",
                "تلمسان", "تيارت", "تيزي وزو", "الجلفة", "جيجل", "سطيف",
                "سعيدة", "سكيكدة", "سيدي بلعباس", "عنابة", "قالمة", "قسنطينة",
                "المدية", "مستغانم", "المسيلة", "معسكر", "ورقلة", "وهران",
                "البيض", "إليزي", "برج بوعريريج", "بومرداس", "الطارف", "تيندوف",
                "تيسمسيلت", "الوادي", "خنشلة", "سوق أهراس", "تيبازة", "ميلة",
                "عين الدفلى", "النعامة", "سيدي بلعباس", "قالمة", "بسكرة",
                "أدرار", "تمنراست", "إليزي", "تندوف", "الوادي", "سطيف");
        State_worker.getItems().addAll("أدرار", "الشلف", "الأغواط", "أم البواقي", "باتنة", "بجاية",
                "بسكرة", "بشار", "البليدة", "البويرة", "تمنراست", "تبسة",
                "تلمسان", "تيارت", "تيزي وزو", "الجلفة", "جيجل", "سطيف",
                "سعيدة", "سكيكدة", "سيدي بلعباس", "عنابة", "قالمة", "قسنطينة",
                "المدية", "مستغانم", "المسيلة", "معسكر", "ورقلة", "وهران",
                "البيض", "إليزي", "برج بوعريريج", "بومرداس", "الطارف", "تيندوف",
                "تيسمسيلت", "الوادي", "خنشلة", "سوق أهراس", "تيبازة", "ميلة",
                "عين الدفلى", "النعامة", "سيدي بلعباس", "قالمة", "بسكرة",
                "أدرار", "تمنراست", "إليزي", "تندوف", "الوادي", "سطيف");
        num_stait51.getItems().addAll("أدرار", "الشلف", "الأغواط", "أم البواقي", "باتنة", "بجاية",
                "بسكرة", "بشار", "البليدة", "البويرة", "تمنراست", "تبسة",
                "تلمسان", "تيارت", "تيزي وزو", "الجلفة", "جيجل", "سطيف",
                "سعيدة", "سكيكدة", "سيدي بلعباس", "عنابة", "قالمة", "قسنطينة",
                "المدية", "مستغانم", "المسيلة", "معسكر", "ورقلة", "وهران",
                "البيض", "إليزي", "برج بوعريريج", "بومرداس", "الطارف", "تيندوف",
                "تيسمسيلت", "الوادي", "خنشلة", "سوق أهراس", "تيبازة", "ميلة",
                "عين الدفلى", "النعامة", "سيدي بلعباس", "قالمة", "بسكرة",
                "أدرار", "تمنراست", "إليزي", "تندوف", "الوادي", "سطيف");
        statit_work_ch.getItems().addAll("أدرار", "الشلف", "الأغواط", "أم البواقي", "باتنة", "بجاية",
                "بسكرة", "بشار", "البليدة", "البويرة", "تمنراست", "تبسة",
                "تلمسان", "تيارت", "تيزي وزو", "الجلفة", "جيجل", "سطيف",
                "سعيدة", "سكيكدة", "سيدي بلعباس", "عنابة", "قالمة", "قسنطينة",
                "المدية", "مستغانم", "المسيلة", "معسكر", "ورقلة", "وهران",
                "البيض", "إليزي", "برج بوعريريج", "بومرداس", "الطارف", "تيندوف",
                "تيسمسيلت", "الوادي", "خنشلة", "سوق أهراس", "تيبازة", "ميلة",
                "عين الدفلى", "النعامة", "سيدي بلعباس", "قالمة", "بسكرة",
                "أدرار", "تمنراست", "إليزي", "تندوف", "الوادي", "سطيف");
        reason_out.getItems().addAll("إقصاء من الاقامة", "تبرئة نهائية", "تبرئة نهاية السنة الدراسية");
        reason_ab_ex_worker.getItems().addAll("تقاعد", "نهاية السنة الدراسية", "الاقصاء", "الاستقالة");
        ch_req.getItems().addAll("عامل", "طالب");
        populateComboBoxFromDatabase(combo1);
        populateComboBoxFromDatabase(combo2);
        loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadStudentsabFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadworkersabFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        load_worker_ex(combo1.getSelectionModel().getSelectedItem().toString());
        load_student_ex(combo1.getSelectionModel().getSelectedItem().toString());
        load_maintenancerequested(combo1.getSelectionModel().getSelectedItem().toString());
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block);
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block2);
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block3);
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block4);
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block5);
        block_combobx(combo2.getSelectionModel().getSelectedItem().toString(), number_block6);

        //---------------------------------------------------------------------//
        worker_name.setCellValueFactory(new PropertyValueFactory<>("worker_name"));
        worker_last_name.setCellValueFactory(new PropertyValueFactory<>("worker_last_name"));
        Nat_id_card.setCellValueFactory(new PropertyValueFactory<>("National_id_card_number"));
        date_of_birthe_worker.setCellValueFactory(new PropertyValueFactory<>("date_of_birth"));
        place_birth_worker.setCellValueFactory(new PropertyValueFactory<>("place_of_birth"));
        address_worker.setCellValueFactory(new PropertyValueFactory<>("Addreess"));
        nat.setCellValueFactory(new PropertyValueFactory<>("nationality"));
        rom_number_worker.setCellValueFactory(new PropertyValueFactory<>("room_number"));
//-------------------------------------------------------------------------//
        ID_student.setCellValueFactory(new PropertyValueFactory<>("id"));
        Name_student.setCellValueFactory(new PropertyValueFactory<>("name"));
        Num_bac.setCellValueFactory(new PropertyValueFactory<>("Bac_certificate_number"));
        address_student.setCellValueFactory(new PropertyValueFactory<>("address"));
        date_birth_student.setCellValueFactory(new PropertyValueFactory<>("date_of_birth"));
        last_name_dad.setCellValueFactory(new PropertyValueFactory<>("father_last_name"));
        last_name_mom.setCellValueFactory(new PropertyValueFactory<>("mother_last_name"));
        last_name_student.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        name_dad.setCellValueFactory(new PropertyValueFactory<>("father_name"));
        name_mom.setCellValueFactory(new PropertyValueFactory<>("mother_name"));
        nat_student.setCellValueFactory(new PropertyValueFactory<>("nationality"));
        nember_room.setCellValueFactory(new PropertyValueFactory<>("room_number"));
        palce_birth_student.setCellValueFactory(new PropertyValueFactory<>("place_of_birth"));
        school_student.setCellValueFactory(new PropertyValueFactory<>("School_certificate_number"));
        spec_student.setCellValueFactory(new PropertyValueFactory<>("specialization"));
        year_bac.setCellValueFactory(new PropertyValueFactory<>("Year_of_obtaining_a_bac"));
        State_student.setCellValueFactory(new PropertyValueFactory<>("state_student"));
        Branch_student.setCellValueFactory(new PropertyValueFactory<>("branch_student"));
        level_student.setCellValueFactory(new PropertyValueFactory<>("level_student"));
        //---------------------------------------------------------------------------//
        ID_student_archive.setCellValueFactory(new PropertyValueFactory<>("ID"));
        Name_student_archive.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_student_archive.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        year_of_ab_St.setCellValueFactory(new PropertyValueFactory<>("date_of_ab"));
        re_ab_st.setCellValueFactory(new PropertyValueFactory<>("resion_ab"));
        room_ab_st.setCellValueFactory(new PropertyValueFactory<>("Room"));
        //---------------------------------------------------------------------------------//
        Nat_id_card_archive.setCellValueFactory(new PropertyValueFactory<>("National_id_card_number"));
        worker_name_archive.setCellValueFactory(new PropertyValueFactory<>("worker_name"));
        worker_last_name_archive.setCellValueFactory(new PropertyValueFactory<>("worker_last_name"));
        type_w_archive.setCellValueFactory(new PropertyValueFactory<>("re_ab_w"));
        date_ab_w_archive.setCellValueFactory(new PropertyValueFactory<>("date_of_ab_w"));
        room_ab_w_archive.setCellValueFactory(new PropertyValueFactory<>("Room"));
        //---------------------------------------------------------------------------------------//

        ID_student_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("ID_student_exlusion_archive"));
        Name_student_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_student_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        date_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("date_exlusion_archive"));
        room_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("Room"));
        //-----------------------------------------------------------------------------------------------------------//
        Nat_id_card_ex.setCellValueFactory(new PropertyValueFactory<>("ID_worker_exlusion_archive"));
        worker_name_ex.setCellValueFactory(new PropertyValueFactory<>(" name"));
        worker_last_name_ex.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        date_ab_w_ex.setCellValueFactory(new PropertyValueFactory<>("date_exlusion_archive"));
        room_ab_w_ex.setCellValueFactory(new PropertyValueFactory<>("Room"));
        //-----------------------------------------------------------------------------------------------//
        idrequested0.setCellValueFactory(new PropertyValueFactory<>("idrequested"));
        name_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        RequestDescription_archive0.setCellValueFactory(new PropertyValueFactory<>("RequestDescription"));
        date_requested_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("date_requested"));
        worker_Nat_id_card_number0.setCellValueFactory(new PropertyValueFactory<>("worker_National_id_card_number"));
        ID_Student_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("ID_Student"));
        Room_requst0.setCellValueFactory(new PropertyValueFactory<>("room_number"));
    }

    @FXML
    private ComboBox student_state;
    @FXML
    private TextField level;
    @FXML
    private TextField branch;

    public void add_student(String name_database) {
        String name = name_student.getText();
        String lname = Last_name_student.getText();
        String date = date_of_birth.getText();
        String nat = nationalty.getText();
        String bac = bac_number.getText();
        int Bac = Integer.parseInt(bac);
        String year = year_bac_s.getText();
        int Year = Integer.parseInt(year);
        String ad = address.getText();
        String sp = spic.getText();
        String mother_n = mother_name.getText();
        String mother_l = mother_last_name.getText();
        String father_n = father_name.getText();
        String father_l = father_last_name.getText();
        String n_d_s = number_d_s.getText();
        String address_b = address1.getText();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Image image = photo_student.getImage();
        String nomber_r = null;
        String Stait = student_state.getSelectionModel().getSelectedItem().toString();
        String Level = level.getText();
        String Branch = branch.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date utilDate = null;
        try {
            utilDate = formatter.parse(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }


        java.sql.Date sqlDate = null;
        if (utilDate != null) {
            long millis = utilDate.getTime();
            sqlDate = new java.sql.Date(millis);
        }

        if (image != null) {
            try {
                BufferedImage bufferedImage = SwingFXUtils.fromFXImage(image, null);

                // احصل على الكاتب للنوع JPG
                Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
                if (!writers.hasNext()) throw new IllegalStateException("No writers found");

                ImageWriter writer = writers.next();
                ImageOutputStream ios = ImageIO.createImageOutputStream(outputStream);
                writer.setOutput(ios);


                ImageWriteParam param = writer.getDefaultWriteParam();

                if (param.canWriteCompressed()) {
                    param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                    param.setCompressionQuality(1.0f);
                }


                writer.write(null, new IIOImage(bufferedImage, null, null), param);
                ios.close();
                writer.dispose();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        byte[] imageBytes = outputStream.toByteArray();


        if (name.isEmpty() || lname.isEmpty() || date.isEmpty() || nat.isEmpty() || bac.isEmpty() || year.isEmpty() || ad.isEmpty() || sp.isEmpty() || mother_n.isEmpty() || mother_l.isEmpty() || father_n.isEmpty() || father_l.isEmpty() || n_d_s.isEmpty() || address_b.isEmpty() || Stait.isEmpty() || Level.isEmpty() || Branch.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("تنبيه");
            alert.setHeaderText(null);
            alert.setContentText("يرجى ملء جميع الحقول المتعلقة بالمعلومات الشخصية ");
            alert.showAndWait();
            return;
        } else {
            if (nomber_room_combo.getSelectionModel().getSelectedItem() != null) {
                nomber_r = nomber_room_combo.getSelectionModel().getSelectedItem().toString();
                int a = room_capacity_noumber(name_database, nomber_room_combo);
                if (photo_student.getImage() == null) {
                    if (a > 0) {
                        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
                            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO student (student_name, student_last_name, date_of_birth, place_of_birth, nationality, Bac_certificate_number, Year_of_obtaining_a_bac, Address, Specialization, Mother_name, Mother_last_name, father_name, father_last_name, School_certificate_number, room_Num_room,state_student,branch_student,level_student) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,? )");
                            preparedStatement.setString(1, name);
                            preparedStatement.setString(2, lname);
                            preparedStatement.setDate(3, sqlDate);
                            preparedStatement.setString(4, address_b);
                            preparedStatement.setString(5, nat);
                            preparedStatement.setInt(6, Bac);
                            preparedStatement.setInt(7, Year);
                            preparedStatement.setString(8, ad);
                            preparedStatement.setString(9, sp);
                            preparedStatement.setString(10, mother_n);
                            preparedStatement.setString(11, mother_l);
                            preparedStatement.setString(12, father_n);
                            preparedStatement.setString(13, father_l);
                            preparedStatement.setString(14, n_d_s);
                            preparedStatement.setString(15, nomber_r);
                            preparedStatement.setString(16, Stait);
                            preparedStatement.setString(17, Branch);
                            preparedStatement.setString(18, Level);
                            int rowsAffected = preparedStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("تمت العملية");
                                alert.setHeaderText(null);
                                alert.setContentText("تمت إضافة الطالب بنجاح ");
                                alert.showAndWait();
                                loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                                loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        av_place(name_database, nomber_room_combo);

                    } else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("خطأ");
                        alert.setHeaderText(null);
                        alert.setContentText("الاماكن لم تعد شاغرة في هذه الغرفة ");
                        alert.showAndWait();
                    }
                } else {
                    if (a > 0) {
                        ByteArrayInputStream fis = new ByteArrayInputStream(imageBytes);
                        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
                            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO student (student_name, student_last_name, date_of_birth, place_of_birth, nationality, Bac_certificate_number, Year_of_obtaining_a_bac, Address, Specialization, Mother_name, Mother_last_name, father_name, father_last_name, School_certificate_number, photo_student, room_Num_room,state_student,branch_student,level_student) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,? )");
                            preparedStatement.setString(1, name);
                            preparedStatement.setString(2, lname);
                            preparedStatement.setDate(3, sqlDate);
                            preparedStatement.setString(4, address_b);
                            preparedStatement.setString(5, nat);
                            preparedStatement.setInt(6, Bac);
                            preparedStatement.setInt(7, Year);
                            preparedStatement.setString(8, ad);
                            preparedStatement.setString(9, sp);
                            preparedStatement.setString(10, mother_n);
                            preparedStatement.setString(11, mother_l);
                            preparedStatement.setString(12, father_n);
                            preparedStatement.setString(13, father_l);
                            preparedStatement.setString(14, n_d_s);
                            preparedStatement.setBytes(15, imageBytes);
                            preparedStatement.setString(16, nomber_r);
                            preparedStatement.setString(17, Stait);
                            preparedStatement.setString(18, Branch);
                            preparedStatement.setString(19, Level);
                            int rowsAffected = preparedStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("تمت العملية");
                                alert.setHeaderText(null);
                                alert.setContentText("تمت إضافة الطالب بنجاح ");
                                alert.showAndWait();
                                loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                                loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        av_place(name_database, nomber_room_combo);

                    } else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("خطأ");
                        alert.setHeaderText(null);
                        alert.setContentText("الاماكن لم تعد شاغرة في هذه الغرفة ");
                        alert.showAndWait();
                    }
                }
            } else {
                if (photo_student.getImage() == null) {

                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
                        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO student (student_name, student_last_name, date_of_birth, place_of_birth, nationality, Bac_certificate_number, Year_of_obtaining_a_bac, Address, Specialization, Mother_name, Mother_last_name, father_name, father_last_name, School_certificate_number,state_student,branch_student,level_student) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,? )");
                        preparedStatement.setString(1, name);
                        preparedStatement.setString(2, lname);
                        preparedStatement.setDate(3, sqlDate);
                        preparedStatement.setString(4, address_b);
                        preparedStatement.setString(5, nat);
                        preparedStatement.setInt(6, Bac);
                        preparedStatement.setInt(7, Year);
                        preparedStatement.setString(8, ad);
                        preparedStatement.setString(9, sp);
                        preparedStatement.setString(10, mother_n);
                        preparedStatement.setString(11, mother_l);
                        preparedStatement.setString(12, father_n);
                        preparedStatement.setString(13, father_l);
                        preparedStatement.setString(14, n_d_s);
                        preparedStatement.setString(15, Stait);
                        preparedStatement.setString(16, Branch);
                        preparedStatement.setString(17, Level);
                        int rowsAffected = preparedStatement.executeUpdate();
                        if (rowsAffected > 0) {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("تمت العملية");
                            alert.setHeaderText(null);
                            alert.setContentText("تمت إضافة الطالب بنجاح ");
                            alert.showAndWait();
                            loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                            loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                } else {

                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
                        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO student (student_name, student_last_name, date_of_birth, place_of_birth, nationality, Bac_certificate_number, Year_of_obtaining_a_bac, Address, Specialization, Mother_name, Mother_last_name, father_name, father_last_name, School_certificate_number, photo_student,state_student,branch_student,level_student) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,? )");
                        preparedStatement.setString(1, name);
                        preparedStatement.setString(2, lname);
                        preparedStatement.setDate(3, sqlDate);
                        preparedStatement.setString(4, address_b);
                        preparedStatement.setString(5, nat);
                        preparedStatement.setInt(6, Bac);
                        preparedStatement.setInt(7, Year);
                        preparedStatement.setString(8, ad);
                        preparedStatement.setString(9, sp);
                        preparedStatement.setString(10, mother_n);
                        preparedStatement.setString(11, mother_l);
                        preparedStatement.setString(12, father_n);
                        preparedStatement.setString(13, father_l);
                        preparedStatement.setString(14, n_d_s);
                        preparedStatement.setBytes(15, imageBytes);
                        preparedStatement.setString(16, Stait);
                        preparedStatement.setString(17, Branch);
                        preparedStatement.setString(18, Level);
                        int rowsAffected = preparedStatement.executeUpdate();
                        if (rowsAffected > 0) {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("تمت العملية");
                            alert.setHeaderText(null);
                            alert.setContentText("تمت إضافة الطالب بنجاح ");
                            alert.showAndWait();
                            loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                            loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    @FXML
    private Rectangle clip;
    @FXML
    private AnchorPane anchoer_image;
    @FXML
    private ImageView photo_student;
    @FXML
    private TextField name_student;
    @FXML
    private TextField Last_name_student;
    @FXML
    private TextField date_of_birth;
    @FXML
    private TextField nationalty;
    @FXML
    private TextField bac_number;
    @FXML
    private TextField address1;
    @FXML
    private TextField year_bac_s;
    @FXML
    private TextField address;
    @FXML
    private TextField spic;
    @FXML
    private TextField mother_name;
    @FXML
    private TextField mother_last_name;
    @FXML
    private TextField father_name;
    @FXML
    private TextField father_last_name;
    @FXML
    private TextField number_d_s;
    @FXML
    private ComboBox<String> nomber_room_combo;
    @FXML
    private ComboBox<String> number_block;
    @FXML
    private Hyperlink crate_data_base1;
    @FXML
    private Hyperlink create_data_base2;

    //-------------------------------------------------------------------------------//
    @FXML
    private TableView<student> table_student;

    @FXML
    private TableColumn<student, String> ID_student;
    @FXML
    private TableColumn<student, String> Name_student;
    @FXML
    private TableColumn<student, String> Num_bac;
    @FXML
    private TableColumn<student, String> address_student;
    @FXML
    private TableColumn<student, String> date_birth_student;
    @FXML
    private TableColumn<student, String> last_name_dad;
    @FXML
    private TableColumn<student, String> last_name_mom;
    @FXML
    private TableColumn<student, String> last_name_student;
    @FXML
    private TableColumn<student, String> name_dad;
    @FXML
    private TableColumn<student, String> name_mom;
    @FXML
    private TableColumn<student, String> nat_student;
    @FXML
    private TableColumn<student, String> nember_room;
    @FXML
    private TableColumn<student, String> palce_birth_student;
    @FXML
    private TableColumn<student, String> school_student;
    @FXML
    private TableColumn<student, String> spec_student;
    @FXML
    private TableColumn<student, String> year_bac;
    @FXML
    private TableColumn<student, String> State_student;
    @FXML
    private TableColumn<student, String> Branch_student;
    @FXML
    private TableColumn<student, String> level_student;

    //------------------------------------------------------------------------------//
    @FXML
    private TableView<worker> table_worker;

    @FXML
    private TableColumn<worker, String> worker_name;
    @FXML
    private TableColumn<worker, String> worker_last_name;
    @FXML
    private TableColumn<worker, String> Nat_id_card;
    @FXML
    private TableColumn<worker, String> date_of_birthe_worker;
    @FXML
    private TableColumn<worker, String> place_birth_worker;
    @FXML
    private TableColumn<worker, String> address_worker;
    @FXML
    private TableColumn<worker, String> nat;
    @FXML
    private TableColumn<worker, String> rom_number_worker;
    @FXML
    private TableColumn<worker, String> staite_worker;
    //----------------------------------------------------------------------------------//
    @FXML
    private TableView<student_archive> table_student_archive;

    @FXML
    private TableColumn<student_archive, String> ID_student_archive;
    @FXML
    private TableColumn<student_archive, String> Name_student_archive;

    @FXML
    private TableColumn<student_archive, String> last_name_student_archive;

    @FXML
    private TableColumn<student_archive, String> year_of_ab_St;
    @FXML
    private TableColumn<student_archive, String> room_ab_st;
    @FXML
    private TableColumn<student_archive, String> re_ab_st;


    //-------------------------------------------------------------------//
    @FXML
    private TableView<workers_archive> table_worker_archive;

    @FXML
    private TableColumn<workers_archive, String> worker_name_archive;
    @FXML
    private TableColumn<workers_archive, String> worker_last_name_archive;
    @FXML
    private TableColumn<workers_archive, String> Nat_id_card_archive;
    @FXML
    private TableColumn<workers_archive, String> type_w_archive;
    @FXML
    private TableColumn<workers_archive, String> date_ab_w_archive;
    @FXML
    private TableColumn<workers_archive, String> room_ab_w_archive;

    //-------------------------------------------------------------------------------//
    @FXML
    private TableView<exlusion_archive> table_exlusion_archive;
    @FXML
    private TableColumn<exlusion_archive, String> ID_student_exlusion_archive;
    @FXML
    private TableColumn<exlusion_archive, String> Name_student_exlusion_archive;

    @FXML
    private TableColumn<exlusion_archive, String> date_exlusion_archive;
    @FXML
    private TableColumn<exlusion_archive, String> last_name_student_exlusion_archive;
    @FXML
    private TableColumn<exlusion_archive, String> room_exlusion_archive;
    //---------------------------------------------------------------------------------------//
    @FXML
    private TableView<exulusion_worker> table_worker_ex;

    @FXML
    private TableColumn<exulusion_worker, String> worker_name_ex;
    @FXML
    private TableColumn<exulusion_worker, String> worker_last_name_ex;
    @FXML
    private TableColumn<exulusion_worker, String> Nat_id_card_ex;
    @FXML
    private TableColumn<exulusion_worker, String> date_ab_w_ex;
    @FXML
    private TableColumn<exulusion_worker, String> room_ab_w_ex;


    //---------------------------------------------------------------------------------------//
    @FXML
    private TableView<maintenance_requests_archive> table_maintenance_requests_archive0;
    @FXML
    private TableColumn<maintenance_requests_archive, String> idrequested0;
    @FXML
    private TableColumn<maintenance_requests_archive, String> name_maintenance_requests_archive0;
    @FXML
    private TableColumn<maintenance_requests_archive, String> last_name_maintenance_requests_archive0;
    @FXML
    private TableColumn<maintenance_requests_archive, String> RequestDescription_archive0;
    @FXML
    private TableColumn<maintenance_requests_archive, String> date_requested_maintenance_requests_archive0;
    @FXML
    private TableColumn<maintenance_requests_archive, String> worker_Nat_id_card_number0;
    @FXML
    private TableColumn<maintenance_requests_archive, String> ID_Student_maintenance_requests_archive0;
    @FXML
    private TableColumn<maintenance_requests_archive, String> Room_requst0;
    //---------------------------------------------------------------------//
    @FXML
    private Rectangle clip3;
    @FXML
    private ImageView photo_student3;
    @FXML
    private ScrollPane scroll1;
    @FXML
    private Hyperlink add_table_xls;
    @FXML
    private Label num_student;

    public void Handle_clicke_mouse2(MouseEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("اختر ملف");
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Excel Files", "*.xls", "*.xlsx");
        fileChooser.getExtensionFilters().add(imageFilter);
        File selectedFile = fileChooser.showOpenDialog(Main_APP.Home_page);
        Platform.runLater(() -> {
            if (selectedFile != null) {
                importData(selectedFile);
                loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            }
        });
    }

    public void Handle_clicke_mouse3(MouseEvent event) {
        u = combo1.getSelectionModel().getSelectedItem().toString();
        if (event.getClickCount() == 1) {

            student Student = table_student.getSelectionModel().getSelectedItem();
            a = Student.getId();
            v = 1;
            if (Student != null) {
                byte[] imageData = retrieveImageFromDatabase(Student.getId());
                System.out.println(Student.getId());

                if (imageData != null) {
                    Image image = new Image(new ByteArrayInputStream(imageData), 100, 100, false, true);

                    clip3.setFill(new ImagePattern(image));
                    photo_student3.setImage(image);
                } else {
                    WritableImage writableImage = new WritableImage(100, 100);
                    Color defaultColor = Color.WHITE;

                    for (int x = 0; x < 100; x++) {
                        for (int y = 0; y < 100; y++) {
                            writableImage.getPixelWriter().setColor(x, y, defaultColor);
                        }
                    }

                    Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
                    clip3.setFill(new ImagePattern(emptyImage));
                    photo_student3.setImage(emptyImage);
                }
            }
        } else if (event.getClickCount() == 2) {
            student Student = table_student.getSelectionModel().getSelectedItem();
            a = Student.getId();
            v = 1;
            Stage stage = new Stage();
            Main_APP a = new Main_APP();
            try {
                a.start_show_inf_stud(stage);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }


    public void HandleOnAction(ActionEvent event) {


        String selectedValue = combo1.getSelectionModel().getSelectedItem();
        combo2.setValue(selectedValue);
        loadStudentsFromDatabase(selectedValue);
        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }
        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip3.setFill(new ImagePattern(emptyImage));
        photo_student3.setImage(emptyImage);
        loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadStudentsabFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadworkersabFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        load_worker_ex(combo1.getSelectionModel().getSelectedItem().toString());
        load_student_ex(combo1.getSelectionModel().getSelectedItem().toString());
        load_maintenancerequested(combo1.getSelectionModel().getSelectedItem().toString());
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block);
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block2);
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block3);
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block4);
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block5);
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block6);
    }

    public void HandleOnAction2(ActionEvent event) {

        String selectedValue = combo2.getSelectionModel().getSelectedItem();
        combo1.setValue(selectedValue);
        loadStudentsFromDatabase(selectedValue);

        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }
        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip3.setFill(new ImagePattern(emptyImage));
        photo_student3.setImage(emptyImage);
        loadnumberStudentsFromDatabase(combo2.getSelectionModel().getSelectedItem().toString());
        loadWorkersFromDatabase(combo2.getSelectionModel().getSelectedItem().toString());
        loadnumberWorkersFromDatabase(combo2.getSelectionModel().getSelectedItem().toString());
        block_combobx(combo2.getSelectionModel().getSelectedItem().toString(), number_block);
        block_combobx(combo2.getSelectionModel().getSelectedItem().toString(), number_block2);
        block_combobx(combo2.getSelectionModel().getSelectedItem().toString(), number_block3);
        block_combobx(combo2.getSelectionModel().getSelectedItem().toString(), number_block4);
        block_combobx(combo2.getSelectionModel().getSelectedItem().toString(), number_block6);

    }

    public void importData(File filePath) {
        String path = filePath.getAbsolutePath();
        String URL = "jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString();
        try {
            Connection con = DriverManager.getConnection(URL, "root", "Saf3tyF!rst@2023");
            Statement stmt = con.createStatement();

            FileInputStream fis = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheet("Sheet1");

            for (int i = 1; i <= sheet.getPhysicalNumberOfRows(); i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    String query = "INSERT INTO student (student_name, student_last_name, date_of_birth, place_of_birth, nationality, Bac_certificate_number, Year_of_obtaining_a_bac,state_student,Address, Specialization,branch_student,level_student, Mother_name, Mother_last_name, father_name, father_last_name, School_certificate_number) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?)";
                    PreparedStatement pstmt = con.prepareStatement(query);

                    pstmt.setString(1, row.getCell(0) != null ? row.getCell(0).getStringCellValue() : ""); // student_name
                    pstmt.setString(2, row.getCell(1) != null ? row.getCell(1).getStringCellValue() : ""); // student_last_name
                    pstmt.setDate(3, row.getCell(2) != null ? new java.sql.Date(row.getCell(2).getDateCellValue().getTime()) : null); // date_of_birth
                    pstmt.setString(4, row.getCell(3) != null ? row.getCell(3).getStringCellValue() : ""); // place_of_birth
                    pstmt.setString(5, row.getCell(4) != null ? row.getCell(4).getStringCellValue() : ""); // nationality
                    pstmt.setLong(6, row.getCell(5) != null ? (long) row.getCell(5).getNumericCellValue() : 0); // Bac_certificate_number// Year_of_obtaining_a_bac
                    pstmt.setInt(7, (int) row.getCell(6).getNumericCellValue());
                    pstmt.setString(8, row.getCell(7) != null ? row.getCell(7).getStringCellValue() : "");// Address
                    pstmt.setString(9, row.getCell(8) != null ? row.getCell(8).getStringCellValue() : "");// state
                    pstmt.setString(10, row.getCell(9) != null ? row.getCell(9).getStringCellValue() : ""); // Specialization
                    pstmt.setString(11, row.getCell(10) != null ? row.getCell(10).getStringCellValue() : ""); //
                    pstmt.setString(12, row.getCell(11) != null ? row.getCell(11).getStringCellValue() : "");
                    pstmt.setString(13, row.getCell(12) != null ? row.getCell(12).getStringCellValue() : ""); // Mother_name
                    pstmt.setString(14, row.getCell(13) != null ? row.getCell(13).getStringCellValue() : ""); // Mother_last_name
                    pstmt.setString(15, row.getCell(14) != null ? row.getCell(14).getStringCellValue() : ""); // father_name
                    pstmt.setString(16, row.getCell(15) != null ? row.getCell(15).getStringCellValue() : ""); // father_last_name
                    pstmt.setString(17, row.getCell(16) != null ? row.getCell(16).getStringCellValue() : ""); // School_certificate_number
                    pstmt.executeUpdate();
                    pstmt.close();
                }
                loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            }

            workbook.close();
            fis.close();
            con.close();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("نجاح");
            alert.setHeaderText(null);
            alert.setContentText("تم تحميل الجدول بنجاح.");
            alert.showAndWait();
        } catch (Exception ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("خطأ");
            alert.setHeaderText(null);
            alert.setContentText("خطأ عند تحميل الملف:\n" + ex.getMessage());
            System.out.println(ex.getMessage());
            alert.showAndWait();
        }
    }

    public void loadStudentsFromDatabase(String URL) {
        ID_student.setCellValueFactory(new PropertyValueFactory<>("id"));
        Name_student.setCellValueFactory(new PropertyValueFactory<>("name"));
        Num_bac.setCellValueFactory(new PropertyValueFactory<>("Bac_certificate_number"));
        address_student.setCellValueFactory(new PropertyValueFactory<>("address"));
        date_birth_student.setCellValueFactory(new PropertyValueFactory<>("date_of_birth"));
        last_name_dad.setCellValueFactory(new PropertyValueFactory<>("father_last_name"));
        last_name_mom.setCellValueFactory(new PropertyValueFactory<>("mother_last_name"));
        last_name_student.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        name_dad.setCellValueFactory(new PropertyValueFactory<>("father_name"));
        name_mom.setCellValueFactory(new PropertyValueFactory<>("mother_name"));
        nat_student.setCellValueFactory(new PropertyValueFactory<>("nationality"));
        nember_room.setCellValueFactory(new PropertyValueFactory<>("room_number"));
        palce_birth_student.setCellValueFactory(new PropertyValueFactory<>("place_of_birth"));
        school_student.setCellValueFactory(new PropertyValueFactory<>("School_certificate_number"));
        spec_student.setCellValueFactory(new PropertyValueFactory<>("specialization"));
        year_bac.setCellValueFactory(new PropertyValueFactory<>("Year_of_obtaining_a_bac"));
        State_student.setCellValueFactory(new PropertyValueFactory<>("state_student"));
        Branch_student.setCellValueFactory(new PropertyValueFactory<>("branch_student"));
        level_student.setCellValueFactory(new PropertyValueFactory<>("level_student"));
        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID_student, student_name, student_last_name, date_of_birth, place_of_birth, nationality, Bac_certificate_number,year_of_obtaining_a_bac, Address, Specialization, Mother_name, Mother_last_name, father_name, father_last_name, School_certificate_number, room_Num_room,state_student,branch_student,level_student FROM student");
            ObservableList<student> students = FXCollections.observableArrayList();
            while (rs.next()) {
                student Student = new student(
                        rs.getLong("ID_student"),
                        rs.getString("student_name"),
                        rs.getString("student_last_name"),
                        rs.getString("date_of_birth"),
                        rs.getString("place_of_birth"),
                        rs.getString("nationality"),
                        rs.getString("Bac_certificate_number"),
                        rs.getString("year_of_obtaining_a_bac"),
                        rs.getString("Address"),
                        rs.getString("Specialization"),
                        rs.getString("Mother_name"),
                        rs.getString("Mother_last_name"),
                        rs.getString("father_name"),
                        rs.getString("father_last_name"),
                        rs.getString("School_certificate_number"),
                        rs.getString("room_Num_room"),
                        rs.getString("state_student"),
                        rs.getString("branch_student"),
                        rs.getString("level_student")
                );
                students.add(Student);
            }
            table_student.setItems(students);
            if (students == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (students != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private byte[] retrieveImageFromDatabase(long studentId) {
        byte[] imageData = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem(), "root", "Saf3tyF!rst@2023");
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
        System.out.println(imageData);
        return imageData;
    }

    public void loadnumberStudentsFromDatabase(String URL) {


        String l = URL;

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS count FROM student");

            int rowCount = 0;
            if (rs.next()) {
                rowCount = rs.getInt("count");
            }

            if (rowCount == 0) {
                num_student.setText("0");
            } else {
                String countText = String.valueOf(rowCount);
                num_student.setText(countText);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchStudentByName(String name) {
        ObservableList<student> studentsList = FXCollections.observableArrayList();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM student WHERE student_name = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();


            while (rs.next()) {

                student Student = new student(
                        rs.getLong("ID_student"),
                        rs.getString("student_name"),
                        rs.getString("student_last_name"),
                        rs.getString("date_of_birth"),
                        rs.getString("place_of_birth"),
                        rs.getString("nationality"),
                        rs.getString("Bac_certificate_number"),
                        rs.getString("year_of_obtaining_a_bac"),
                        rs.getString("Address"),
                        rs.getString("Specialization"),
                        rs.getString("Mother_name"),
                        rs.getString("Mother_last_name"),
                        rs.getString("father_name"),
                        rs.getString("father_last_name"),
                        rs.getString("School_certificate_number"),
                        rs.getString("room_Num_room"),
                        rs.getString("state_student"),
                        rs.getString("branch_student"),
                        rs.getString("level_student")
                );
                studentsList.add(Student);
            }
            table_student.setItems(studentsList);
            if (studentsList == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (studentsList != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private TextField serche_name;
    @FXML
    private Button schere1;

    public void mouseClicked4(MouseEvent e) {
        String name = serche_name.getText();
        if (name == null) {
            loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            WritableImage writableImage = new WritableImage(100, 100);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
            }
            Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
            clip3.setFill(new ImagePattern(emptyImage));
            photo_student3.setImage(emptyImage);
        } else {
            searchStudentByName(name);
        }
    }

    @FXML
    private ComboBox number_block4;
    @FXML
    private TextField block_Name;
    @FXML
    private TextField numberOfRooms;
    @FXML
    private ComboBox number_block3;

    public void handleAddButtonAction(ActionEvent event) {
        add_blcok();
    }

    public void add_blcok() {

        String blockName = block_Name.getText();
        int numberORooms = Integer.parseInt(numberOfRooms.getText());

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {

            String query = "INSERT INTO block (Num_Block,Nomber_rooms) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, blockName);
            pstmt.setInt(2, numberORooms);


            pstmt.executeUpdate();


            pstmt.close();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("نجاح");
            alert.setHeaderText(null);
            alert.setContentText("تم إضافة جناح بنجاح.");
            alert.showAndWait();
            block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block);
            block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block2);
            block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block3);
            block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block4);

        } catch (SQLException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("خطأ");
            alert.setHeaderText(null);
            alert.setContentText("حدث خطأ :\n" + e.getErrorCode());
            alert.showAndWait();
        }
    }

    @FXML
    private ComboBox number_block2;

    public void block_combobx(String url, ComboBox<String> comboBox) {

        String sql = "SELECT Num_Block FROM block";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + url, "root", "Saf3tyF!rst@2023");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {


            ObservableList<String> databaseNames = FXCollections.observableArrayList();


            while (resultSet.next()) {
                String dbName = resultSet.getString("Num_Block");
                databaseNames.add(dbName);
            }
            comboBox.getItems().clear();
            comboBox.setItems(FXCollections.observableArrayList(databaseNames));
            comboBox.getSelectionModel().clearSelection();
            comboBox.valueProperty().set(null);
            comboBox.setPromptText("إختر الجناح");
            comboBox.setButtonCell(new ListCell<String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty || item == null) {
                        setText("إختر الجناح");
                    } else {
                        setText(item);
                    }
                }
            });
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private TextField work_name_add;
    @FXML
    private TextField work_l_name_add;
    @FXML
    private TextField date_birth_work_add;
    @FXML
    private TextField nat_work_add;
    @FXML
    private TextField place_birth_work_add;
    @FXML
    private TextField address_worker_add;
    @FXML
    private TextField Id_worker_add;
    @FXML
    private Rectangle clip1;
    @FXML
    private ImageView photo_worker1;

    public void EVENT_Clean(MouseEvent e) {
        name_student.clear();
        Last_name_student.clear();
        date_of_birth.clear();
        nationalty.clear();
        bac_number.clear();
        year_bac_s.clear();
        address.clear();
        address1.clear();
        spic.clear();
        mother_name.clear();
        mother_last_name.clear();
        father_name.clear();
        father_last_name.clear();
        number_d_s.clear();
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block);
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block2);
        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }
        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip.setFill(new ImagePattern(emptyImage));
        photo_student.setImage(emptyImage);
    }

    @FXML
    private ComboBox<String> State_worker;

    public void add_worker(String name_database) {
        String lname = work_l_name_add.getText();
        String name = work_name_add.getText();
        String date = date_birth_work_add.getText();
        String nat = nat_work_add.getText();
        long ID = Long.parseLong(Id_worker_add.getText());
        String ad = address_worker_add.getText();
        String address_b = place_birth_work_add.getText();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Image image = photo_worker1.getImage();
        String nomber_r = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date utilDate = null;
        String state_w = State_worker.getSelectionModel().getSelectedItem().toString();
        try {
            utilDate = formatter.parse(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        java.sql.Date sqlDate = null;
        if (utilDate != null) {
            long millis = utilDate.getTime();
            sqlDate = new java.sql.Date(millis);
        }
        if (image != null) {
            int width = (int) image.getWidth();
            int height = (int) image.getHeight();

            WritableImage writableImage = new WritableImage(width, height);
            javafx.scene.image.PixelWriter writer = writableImage.getPixelWriter();
            javafx.scene.image.PixelReader reader = image.getPixelReader();

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Color color = reader.getColor(x, y);
                    writer.setColor(x, y, color);
                }
            }
            try {
                BufferedImage bufferedImage = SwingFXUtils.fromFXImage(writableImage, null);
                ImageIO.write(bufferedImage, "png", outputStream);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        byte[] imageBytes = outputStream.toByteArray();
        if (name.isEmpty() || lname.isEmpty() || date.isEmpty() || nat.isEmpty() || address_b.isEmpty() || Id_worker_add.getText() == null || ad.isEmpty() || state_w.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("تنبيه");
            alert.setHeaderText(null);
            alert.setContentText("يرجى ملء جميع الحقول المتعلقة بالمعلومات الشخصية ");
            alert.showAndWait();
            return;
        } else {

            if (nomber_room_combo3.getSelectionModel().getSelectedItem() != null) {
                int a = room_capacity_noumber(name_database, nomber_room_combo3);
                nomber_r = nomber_room_combo3.getSelectionModel().getSelectedItem().toString();
                if (photo_worker1.getImage() == null) {
                    if (a > 0) {
                        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
                            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO worker(National_id_card_number, worker_name, worker_last_name,date_of_birth,place_brith_worker, nationality, Address,room_Num_room,state) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)");
                            preparedStatement.setLong(1, ID);
                            preparedStatement.setString(2, name);
                            preparedStatement.setString(3, lname);
                            preparedStatement.setDate(4, sqlDate);
                            preparedStatement.setString(5, address_b);
                            preparedStatement.setString(6, nat);
                            preparedStatement.setString(7, ad);
                            preparedStatement.setString(8, nomber_r);
                            preparedStatement.setString(9, state_w);
                            int rowsAffected = preparedStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("تمت العملية");
                                alert.setHeaderText(null);
                                alert.setContentText("تمت إضافة العامل بنجاح ");
                                alert.showAndWait();
                                loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                                loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                                av_place(name_database, nomber_room_combo3);
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    } else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("خطأ");
                        alert.setHeaderText(null);
                        alert.setContentText("الغرفة لم تعد تحتوى على اماكن فارغة ");
                        alert.showAndWait();
                    }
                } else {
                    if (a > 0) {
                        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
                            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO worker(National_id_card_number, worker_name, worker_last_name,date_of_birth,place_brith_worker, nationality, Address,photo_worker,room_Num_room,state) VALUES (?, ?, ?, ?, ?, ?, ?,?,?,?)");
                            preparedStatement.setLong(1, ID);
                            preparedStatement.setString(2, name);
                            preparedStatement.setString(3, lname);
                            preparedStatement.setDate(4, sqlDate);
                            preparedStatement.setString(5, address_b);
                            preparedStatement.setString(6, nat);
                            preparedStatement.setString(7, ad);
                            preparedStatement.setBytes(8, imageBytes);
                            preparedStatement.setString(9, nomber_r);
                            preparedStatement.setString(9, state_w);
                            int rowsAffected = preparedStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("تمت العملية");
                                alert.setHeaderText(null);
                                alert.setContentText("تمت إضافة العامل بنجاح ");
                                alert.showAndWait();
                                loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                                loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                                av_place(name_database, nomber_room_combo3);
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }

                    } else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("خطأ");
                        alert.setHeaderText(null);
                        alert.setContentText("الغرفة لم تعد تحتوى على اماكن فارغة ");
                        alert.showAndWait();
                    }
                }
            } else {
                if (photo_worker1.getImage() == null) {

                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
                        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO worker(National_id_card_number, worker_name, worker_last_name,date_of_birth,place_brith_worker, nationality, Address,state) VALUES (?, ?, ?, ?, ?, ?, ?,?)");
                        preparedStatement.setLong(1, ID);
                        preparedStatement.setString(2, name);
                        preparedStatement.setString(3, lname);
                        preparedStatement.setDate(4, sqlDate);
                        preparedStatement.setString(5, address_b);
                        preparedStatement.setString(6, nat);
                        preparedStatement.setString(7, ad);
                        preparedStatement.setString(8, state_w);
                        int rowsAffected = preparedStatement.executeUpdate();
                        if (rowsAffected > 0) {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("تمت العملية");
                            alert.setHeaderText(null);
                            alert.setContentText("تمت إضافة العامل بنجاح ");
                            alert.showAndWait();
                            loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                            loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                } else {

                    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
                        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO worker(National_id_card_number, worker_name, worker_last_name,date_of_birth,place_brith_worker, nationality, Address,photo_worker,state) VALUES (?, ?, ?, ?, ?, ?, ?,?,?)");
                        preparedStatement.setLong(1, ID);
                        preparedStatement.setString(2, name);
                        preparedStatement.setString(3, lname);
                        preparedStatement.setDate(4, sqlDate);
                        preparedStatement.setString(5, address_b);
                        preparedStatement.setString(6, nat);
                        preparedStatement.setString(7, ad);
                        preparedStatement.setBytes(8, imageBytes);
                        preparedStatement.setString(9, state_w);
                        int rowsAffected = preparedStatement.executeUpdate();
                        if (rowsAffected > 0) {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("تمت العملية");
                            alert.setHeaderText(null);
                            alert.setContentText("تمت إضافة العامل بنجاح ");
                            alert.showAndWait();
                            loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                            loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }


    public void Event_add_worker(MouseEvent e) {
        add_worker(combo1.getSelectionModel().getSelectedItem().toString());
    }

    public void Event_add_image_worker(MouseEvent e) {
        add_image(photo_worker1, clip1);
    }

    public void add_image(ImageView im, Rectangle a) {

        im.setPreserveRatio(true);
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("اختر صورة");


        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("صور", "*.jpg", "*.png", "*.gif", "*.bmp");
        fileChooser.getExtensionFilters().add(imageFilter);


        File selectedFile = fileChooser.showOpenDialog(Main_APP.Home_page);


        if (selectedFile != null) {


            Image image = new Image(selectedFile.toURI().toString(), 150, 160, false, true);

            a.setFill(new ImagePattern(image));
            im.setImage(image);

        }
    }

    @FXML
    private ScrollPane scroll2;

    public void loadWorkersFromDatabase(String URL) {
        String l = URL;
        worker_name.setCellValueFactory(new PropertyValueFactory<>("worker_name"));
        worker_last_name.setCellValueFactory(new PropertyValueFactory<>("worker_last_name"));
        Nat_id_card.setCellValueFactory(new PropertyValueFactory<>("National_id_card_number"));
        date_of_birthe_worker.setCellValueFactory(new PropertyValueFactory<>("date_of_birth"));
        place_birth_worker.setCellValueFactory(new PropertyValueFactory<>("place_of_birth"));
        address_worker.setCellValueFactory(new PropertyValueFactory<>("Addreess"));
        nat.setCellValueFactory(new PropertyValueFactory<>("nationality"));
        rom_number_worker.setCellValueFactory(new PropertyValueFactory<>("room_number"));
        staite_worker.setCellValueFactory(new PropertyValueFactory<>("state"));
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT worker_name,worker_last_name,National_id_card_number,date_of_birth,place_brith_worker,Address,nationality,room_Num_room,state FROM worker");
            ObservableList<worker> Workers = FXCollections.observableArrayList();
            while (rs.next()) {
                worker Worker = new worker(
                        rs.getString("worker_name"),
                        rs.getString("worker_last_name"),
                        rs.getLong("National_id_card_number"),
                        rs.getString("date_of_birth"),
                        rs.getString("place_brith_worker"),
                        rs.getString("Address"),
                        rs.getString("nationality"),
                        rs.getString("room_Num_room"),
                        rs.getString("state"));
                Workers.add(Worker);


            }
            table_worker.setItems(Workers);
            if (Workers == null) {
                scroll2.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll2.setFitToHeight(true);
                scroll2.setFitToWidth(true);
            } else if (Workers != null) {
                scroll2.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll2.setFitToHeight(false);
                scroll2.setFitToWidth(false);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private Label number_worker_in;

    public void loadnumberWorkersFromDatabase(String URL) {
        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS count FROM worker");
            int rowCount = 0;
            if (rs.next()) {
                rowCount = rs.getInt("count");
            }
            if (rowCount == 0) {
                number_worker_in.setText("0");
            } else {
                String countText = String.valueOf(rowCount);
                number_worker_in.setText(countText);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private TextField number_room_add;
    @FXML
    private TextField capacirty_add;

    public void add_room_event(MouseEvent e) {

        String l = combo1.getSelectionModel().getSelectedItem().toString();
        String blockName = number_block2.getSelectionModel().getSelectedItem().toString();
        int numberORooms = Integer.parseInt(number_room_add.getText());
        int Capacity = Integer.parseInt(capacirty_add.getText());
        if (number_rooms_in_block(number_block2.getSelectionModel().getSelectedItem().toString()) < numberORooms) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("خطأ");
            alert.setHeaderText(null);
            alert.setContentText("رقم الغرفة اكبر من عدد الغرف في الجناح");
            alert.showAndWait();

        } else {
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {


                String query = "INSERT INTO room (Nom_Room,Av_place,capacity,Block_Num_Block) VALUES (?, ?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setInt(1, numberORooms);
                pstmt.setInt(2, Capacity);
                pstmt.setInt(3, Capacity);
                pstmt.setString(4, blockName);

                pstmt.executeUpdate();


                pstmt.close();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("نجاح");
                alert.setHeaderText(null);
                alert.setContentText("تم إضافة الغرفة بنجاح.");
                alert.showAndWait();

            } catch (SQLException ex) {
                ex.printStackTrace();
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("خطأ");
                alert.setHeaderText(null);
                alert.setContentText("الغرفة" + blockName + number_room_add.getText() + "موجودة بالفعل");
                alert.showAndWait();
            }


        }
    }

    public int number_rooms_in_block(String a) {
        int b = 0;

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT Nomber_rooms FROM block WHERE Num_Block = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, a);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            b = rs.getInt("Nomber_rooms");
            return b;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return b;
    }

    public void clen_page_add_room(MouseEvent e) {
        number_room_add.clear();
        capacirty_add.clear();
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block2);
    }

    public void combo_box_room1(ActionEvent e) {
        room1(combo1.getSelectionModel().getSelectedItem().toString(), number_block, nomber_room_combo);
    }

    public void combo_box_room_change(ActionEvent e) {
        room1(combo1.getSelectionModel().getSelectedItem().toString(), number_block5, nomber_room_combo5);
    }

    @FXML
    private ComboBox nomber_room_combo3;

    public void combo_box_room2(ActionEvent e) {
        room1(combo1.getSelectionModel().getSelectedItem().toString(), number_block3, nomber_room_combo3);
    }

    @FXML
    private ComboBox number_block5;
    @FXML
    private ComboBox nomber_room_combo5;

    public void combo_box_room3(ActionEvent e) {
        room1(combo1.getSelectionModel().getSelectedItem().toString(), number_block5, nomber_room_combo5);
    }


    public void combo_box_room4(ActionEvent e) {
        room1(combo1.getSelectionModel().getSelectedItem().toString(), number_block6, nomber_room_combo6);
    }

    public void room1(String url, ComboBox comboBox1, ComboBox comboBox) {
        String sql = "SELECT Num_room FROM room WHERE Block_Num_Block LIKE" + "'" + comboBox1.getSelectionModel().getSelectedItem() + "%" + "'";
        ;
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + url, "root", "Saf3tyF!rst@2023");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            ObservableList<String> roomNames = FXCollections.observableArrayList();
            while (resultSet.next()) {
                String dbName = resultSet.getString("Num_room");
                roomNames.add(dbName);
            }
            comboBox.getItems().clear();
            comboBox.setItems(FXCollections.observableArrayList(roomNames));
            comboBox.getSelectionModel().clearSelection();
            comboBox.valueProperty().set(null);
            comboBox.setPromptText("إختر الغرفة");
            comboBox.setButtonCell(new ListCell<String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty || item == null) {
                        setText("إختر الغرفة");
                    } else {
                        setText(item);
                    }
                }
            });
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public int room_capacity_noumber(String url, ComboBox a) {
        int b = 0;
        String sql = "SELECT Av_place FROM room WHERE Num_room= ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + url, "root", "Saf3tyF!rst@2023")) {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, a.getSelectionModel().getSelectedItem().toString());
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            b = rs.getInt("Av_place");
            return b;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


        return b;
    }

    public void av_place(String url, ComboBox a) {
        String sql = "UPDATE room SET Av_place = Av_place - 1 WHERE Num_room = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + url, "root", "Saf3tyF!rst@2023");
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, a.getSelectionModel().getSelectedItem().toString());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private Rectangle clip31;
    @FXML
    private ImageView photo_student31;

    public void Handle_clicke_mouse4(MouseEvent event) {
        if (event.getClickCount() == 1) {
            worker Worker = table_worker.getSelectionModel().getSelectedItem();
            if (Worker != null) {
                byte[] imageData = retrieveImageFromDatabase2(Worker.getNational_id_card_number());
                System.out.println(Worker.National_id_card_number);
                if (imageData != null) {
                    Image image = new Image(new ByteArrayInputStream(imageData), 100, 100, false, true);
                    clip31.setFill(new ImagePattern(image));
                    photo_student31.setImage(image);
                } else {
                    WritableImage writableImage = new WritableImage(100, 100);
                    Color defaultColor = Color.WHITE;

                    for (int x = 0; x < 100; x++) {
                        for (int y = 0; y < 100; y++) {
                            writableImage.getPixelWriter().setColor(x, y, defaultColor);
                        }
                    }

                    Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
                    clip31.setFill(new ImagePattern(emptyImage));
                    photo_student31.setImage(emptyImage);
                }
            }
        }if (event.getClickCount() == 2){
            u=combo1.getSelectionModel().getSelectedItem().toString();
            worker Worker = table_worker.getSelectionModel().getSelectedItem();
            A=String.valueOf(Worker.getNational_id_card_number());
            V1=1;
            Stage stage=new Stage();
            Main_APP A=new Main_APP();
            try {
                A.start_show_inf_work(stage);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private byte[] retrieveImageFromDatabase2(long Id) {
        byte[] imageData = null;
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem(), "root", "Saf3tyF!rst@2023");
            PreparedStatement statement = connection.prepareStatement("SELECT photo_worker FROM worker WHERE  National_id_card_number = ?");
            statement.setLong(1, Id);
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
        return imageData;
    }

    public void Handle_clicke_mouse5(MouseEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("اختر ملف");
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Excel Files", "*.xls", "*.xlsx");
        fileChooser.getExtensionFilters().add(imageFilter);
        File selectedFile = fileChooser.showOpenDialog(Main_APP.Home_page);
        Platform.runLater(() -> {
            if (selectedFile != null) {
                importDatawork(selectedFile);
                loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            }
        });

    }

    public void importDatawork(File filePath) {
        String path = filePath.getAbsolutePath();
        String URL = "jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString();
        try {
            Connection con = DriverManager.getConnection(URL, "root", "Saf3tyF!rst@2023");
            Statement stmt = con.createStatement();

            FileInputStream fis = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheet("Sheet1");

            for (int i = 1; i <= sheet.getPhysicalNumberOfRows(); i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    String query = "INSERT INTO worker (National_id_card_number, worker_name, worker_last_name, date_of_birth, place_brith_worker, nationality,state, Address) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
                    DataFormatter formatter = new DataFormatter();
                    PreparedStatement pstmt = con.prepareStatement(query);
                    pstmt.setString(1, row.getCell(0) != null ? formatter.formatCellValue(row.getCell(0)) : "");
                    pstmt.setString(2, row.getCell(1) != null ? formatter.formatCellValue(row.getCell(1)) : "");
                    pstmt.setString(3, row.getCell(2) != null ? formatter.formatCellValue(row.getCell(2)) : "");
                    if (row.getCell(3) != null && row.getCell(3).getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(row.getCell(3))) {
                        pstmt.setDate(4, new java.sql.Date(row.getCell(3).getDateCellValue().getTime()));
                    } else {
                        pstmt.setNull(4, java.sql.Types.DATE);
                    }
                    pstmt.setString(5, row.getCell(4) != null ? formatter.formatCellValue(row.getCell(4)) : "");
                    pstmt.setString(6, row.getCell(5) != null ? formatter.formatCellValue(row.getCell(5)) : "");
                    pstmt.setString(7, row.getCell(6) != null ? formatter.formatCellValue(row.getCell(6)) : "");
                    pstmt.setString(8, row.getCell(7) != null ? formatter.formatCellValue(row.getCell(7)) : "");


                    pstmt.executeUpdate();

                    pstmt.close();
                }
                loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            }

            workbook.close();
            fis.close();
            con.close();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("نجاح");
            alert.setHeaderText(null);
            alert.setContentText("تم تحميل الجدول بنجاح.");
            alert.showAndWait();
        } catch (Exception ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("خطأ");
            alert.setHeaderText(null);
            alert.setContentText("خطأ عند تحميل الملف:\n" + ex.getMessage());
            System.out.println(ex.getMessage());
            alert.showAndWait();
        }


    }

    public void Handle_clicke_mouse6(MouseEvent event) {
        loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        serche_name_worker.clear();
        serche_room_worker.clear();
        serche_block_worker.clear();
        serche_ID_worker.clear();
        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }
        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip31.setFill(new ImagePattern(emptyImage));
        photo_student31.setImage(emptyImage);
    }


    @FXML
    private TextField serche_room_student;
    @FXML
    private TextField serche_block_student;
    @FXML
    private TextField serche_ID_student;
    @FXML
    private TextField serche_name_worker;
    @FXML
    private TextField serche_room_worker;
    @FXML
    private TextField serche_block_worker;
    @FXML
    private TextField serche_ID_worker;


    public void Handle_clicke_mouse7(MouseEvent event) {
        loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        serche_name.clear();
        serche_room_student.clear();
        serche_block_student.clear();
        serche_ID_student.clear();
        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }
        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip3.setFill(new ImagePattern(emptyImage));
        photo_student3.setImage(emptyImage);
    }

    public void searchworkerByName(String name) {

        ObservableList<worker> workersList = FXCollections.observableArrayList();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM worker WHERE worker_name = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();


            while (rs.next()) {
                worker Worker = new worker(
                        rs.getString("worker_name"),
                        rs.getString("worker_last_name"),
                        rs.getLong("National_id_card_number"),
                        rs.getString("date_of_birth"),
                        rs.getString("place_brith_worker"),
                        rs.getString("Address"),
                        rs.getString("nationality"),
                        rs.getString("room_Num_room"), rs.getString("state"));
                workersList.add(Worker);
            }
            table_worker.setItems(workersList);
            if (workersList == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (workersList != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Handle_clicke_mouse8(MouseEvent event) {
        String name = serche_name_worker.getText();
        if (name == null) {
            loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            WritableImage writableImage = new WritableImage(100, 100);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
            }
            Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
            clip31.setFill(new ImagePattern(emptyImage));
            photo_student31.setImage(emptyImage);
        } else {
            searchworkerByName(name);
        }
    }

    public void Handle_clicke_mouse9(MouseEvent event) {
        work_name_add.clear();
        work_l_name_add.clear();
        date_birth_work_add.clear();
        nat_work_add.clear();
        place_birth_work_add.clear();
        address_worker_add.clear();
        Id_worker_add.clear();
        block_combobx(combo1.getSelectionModel().getSelectedItem().toString(), number_block3);
        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }
        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip1.setFill(new ImagePattern(emptyImage));
        photo_worker1.setImage(emptyImage);
        State_worker.getItems().clear();
        State_worker.getItems().addAll("أدرار", "الشلف", "الأغواط", "أم البواقي", "باتنة", "بجاية",
                "بسكرة", "بشار", "البليدة", "البويرة", "تمنراست", "تبسة",
                "تلمسان", "تيارت", "تيزي وزو", "الجلفة", "جيجل", "سطيف",
                "سعيدة", "سكيكدة", "سيدي بلعباس", "عنابة", "قالمة", "قسنطينة",
                "المدية", "مستغانم", "المسيلة", "معسكر", "ورقلة", "وهران",
                "البيض", "إليزي", "برج بوعريريج", "بومرداس", "الطارف", "تيندوف",
                "تيسمسيلت", "الوادي", "خنشلة", "سوق أهراس", "تيبازة", "ميلة",
                "عين الدفلى", "النعامة", "سيدي بلعباس", "قالمة", "بسكرة",
                "أدرار", "تمنراست", "إليزي", "تندوف", "الوادي", "سطيف");
        State_worker.valueProperty().set(null);
        State_worker.setPromptText("إختر الولاية");
        State_worker.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText("إختر الولاية");
                } else {
                    setText(item);
                }
            }
        });
    }

    public void searchStudentByroom(String name) {

        ObservableList<student> studentsList = FXCollections.observableArrayList();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM student WHERE room_Num_room = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();


            while (rs.next()) {
                student Student = new student(
                        rs.getLong("ID_student"),
                        rs.getString("student_name"),
                        rs.getString("student_last_name"),
                        rs.getString("date_of_birth"),
                        rs.getString("place_of_birth"),
                        rs.getString("nationality"),
                        rs.getString("Bac_certificate_number"),
                        rs.getString("year_of_obtaining_a_bac"),
                        rs.getString("Address"),
                        rs.getString("Specialization"),
                        rs.getString("Mother_name"),
                        rs.getString("Mother_last_name"),
                        rs.getString("father_name"),
                        rs.getString("father_last_name"),
                        rs.getString("School_certificate_number"),
                        rs.getString("room_Num_room"),
                        rs.getString("state_student"),
                        rs.getString("branch_student"),
                        rs.getString("level_student")
                );
                studentsList.add(Student);
            }
            table_student.setItems(studentsList);
            if (studentsList == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (studentsList != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Handle_clicke_mouse10(MouseEvent event) {
        String name_room = serche_room_student.getText();
        if (name_room == null) {
            loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            WritableImage writableImage = new WritableImage(100, 100);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
            }
            Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
            clip3.setFill(new ImagePattern(emptyImage));
            photo_student3.setImage(emptyImage);
        } else {
            searchStudentByroom(name_room);
        }

    }

    public void Handle_clicke_mouse11(MouseEvent event) {
        String name_block = serche_block_student.getText();

        if (name_block == null) {
            loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            WritableImage writableImage = new WritableImage(100, 100);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
            }
            Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
            clip3.setFill(new ImagePattern(emptyImage));
            photo_student3.setImage(emptyImage);
        } else {
            searchStudentByblock(name_block);
        }

    }

    public void searchStudentByblock(String name) {

        ObservableList<student> studentsList = FXCollections.observableArrayList();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM student WHERE room_Num_room LIKE ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name + "%");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                student Student = new student(
                        rs.getLong("ID_student"),
                        rs.getString("student_name"),
                        rs.getString("student_last_name"),
                        rs.getString("date_of_birth"),
                        rs.getString("place_of_birth"),
                        rs.getString("nationality"),
                        rs.getString("Bac_certificate_number"),
                        rs.getString("year_of_obtaining_a_bac"),
                        rs.getString("Address"),
                        rs.getString("Specialization"),
                        rs.getString("Mother_name"),
                        rs.getString("Mother_last_name"),
                        rs.getString("father_name"),
                        rs.getString("father_last_name"),
                        rs.getString("School_certificate_number"),
                        rs.getString("room_Num_room"),
                        rs.getString("state_student"),
                        rs.getString("branch_student"),
                        rs.getString("level_student")
                );
                studentsList.add(Student);
            }
            table_student.setItems(studentsList);
            if (studentsList == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (studentsList != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void searchStudentID(String name) {

        ObservableList<student> studentsList = FXCollections.observableArrayList();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM student WHERE ID_student = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                student Student = new student(
                        rs.getLong("ID_student"),
                        rs.getString("student_name"),
                        rs.getString("student_last_name"),
                        rs.getString("date_of_birth"),
                        rs.getString("place_of_birth"),
                        rs.getString("nationality"),
                        rs.getString("Bac_certificate_number"),
                        rs.getString("year_of_obtaining_a_bac"),
                        rs.getString("Address"),
                        rs.getString("Specialization"),
                        rs.getString("Mother_name"),
                        rs.getString("Mother_last_name"),
                        rs.getString("father_name"),
                        rs.getString("father_last_name"),
                        rs.getString("School_certificate_number"),
                        rs.getString("room_Num_room"),
                        rs.getString("state_student"),
                        rs.getString("branch_student"),
                        rs.getString("level_student")
                );
                studentsList.add(Student);
            }
            table_student.setItems(studentsList);
            if (studentsList == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (studentsList != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Handle_clicke_mouse12(MouseEvent event) {
        String name_ID = serche_ID_student.getText();
        if (name_ID == null) {
            loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            WritableImage writableImage = new WritableImage(100, 100);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
            }
            Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
            clip3.setFill(new ImagePattern(emptyImage));
            photo_student3.setImage(emptyImage);
        } else {
            searchStudentID(name_ID);
        }
    }

    public void searchworkerByRoom(String name) {

        ObservableList<worker> workersList = FXCollections.observableArrayList();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM worker WHERE room_Num_room = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();


            while (rs.next()) {
                worker Worker = new worker(
                        rs.getString("worker_name"),
                        rs.getString("worker_last_name"),
                        rs.getLong("National_id_card_number"),
                        rs.getString("date_of_birth"),
                        rs.getString("place_brith_worker"),
                        rs.getString("Address"),
                        rs.getString("nationality"),
                        rs.getString("room_Num_room"),
                        rs.getString("state"));
                workersList.add(Worker);
            }
            table_worker.setItems(workersList);
            if (workersList == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (workersList != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Handle_clicke_mouse13(MouseEvent event) {
        String name = serche_room_worker.getText();
        if (name == null) {
            loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            WritableImage writableImage = new WritableImage(100, 100);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
            }
            Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
            clip31.setFill(new ImagePattern(emptyImage));
            photo_student31.setImage(emptyImage);
        } else {
            searchworkerByRoom(name);
        }
    }

    public void searchworkerByblock(String name) {

        ObservableList<worker> workersList = FXCollections.observableArrayList();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM worker WHERE room_Num_room LIKE ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name + "%");
            ResultSet rs = pstmt.executeQuery();


            while (rs.next()) {
                worker Worker = new worker(
                        rs.getString("worker_name"),
                        rs.getString("worker_last_name"),
                        rs.getLong("National_id_card_number"),
                        rs.getString("date_of_birth"),
                        rs.getString("place_brith_worker"),
                        rs.getString("Address"),
                        rs.getString("nationality"),
                        rs.getString("room_Num_room"),
                        rs.getString("state"));
                workersList.add(Worker);
            }
            table_worker.setItems(workersList);
            if (workersList == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (workersList != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Handle_clicke_mouse14(MouseEvent event) {
        String name = serche_block_worker.getText();
        if (name == null) {
            loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            WritableImage writableImage = new WritableImage(100, 100);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
            }
            Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
            clip31.setFill(new ImagePattern(emptyImage));
            photo_student31.setImage(emptyImage);
        } else {
            searchworkerByblock(name);
        }
    }

    public void searchworkerID(String name) {

        ObservableList<worker> workersList = FXCollections.observableArrayList();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM worker WHERE National_id_card_number =?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();


            while (rs.next()) {
                worker Worker = new worker(
                        rs.getString("worker_name"),
                        rs.getString("worker_last_name"),
                        rs.getLong("National_id_card_number"),
                        rs.getString("date_of_birth"),
                        rs.getString("place_brith_worker"),
                        rs.getString("Address"),
                        rs.getString("nationality"),
                        rs.getString("room_Num_room"),
                        rs.getString("state"));
                workersList.add(Worker);
            }
            table_worker.setItems(workersList);
            if (workersList == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (workersList != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Handle_clicke_mouse15(MouseEvent event) {
        String name = serche_ID_worker.getText();
        if (name == null) {
            loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            WritableImage writableImage = new WritableImage(100, 100);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
            }
            Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
            clip31.setFill(new ImagePattern(emptyImage));
            photo_student31.setImage(emptyImage);
        } else {
            searchworkerID(name);
        }
    }

    public void HandleoneAction(ActionEvent event) {
        u = combo1.getSelectionModel().getSelectedItem().toString();
        student Student = table_student.getSelectionModel().getSelectedItem();
        a = Student.getId();
        v = 1;
        a = Student.getId();
        Stage stage = new Stage();
        Main_APP a = new Main_APP();
        try {
            a.start_show_inf_stud(stage);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void HandleoneAction2(ActionEvent event) {
        Stage stage = new Stage();
        Main_APP a = new Main_APP();
        try {
            a.start_add_admine(stage);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @FXML
    private TextField change_name_Student;
    @FXML
    private TextField change_lname_Student;
    @FXML
    private TextField change_date_birth_s;
    @FXML
    private TextField nat_change;
    @FXML
    private TextField place_of_birth_change;
    @FXML
    private TextField nombre_bac_change;
    @FXML
    private TextField year_suc_change;
    @FXML
    private ComboBox<String> num_stait51;
    @FXML
    private TextField address_change;
    @FXML
    private TextField spic_change;
    @FXML
    private TextField level_change;
    @FXML
    private TextField name_mom_change;
    @FXML
    private TextField lname_mom_change;
    @FXML
    private TextField name_dad_change;
    @FXML
    private TextField lname_dad_change;
    @FXML
    private TextField school_nome_change;
    @FXML
    private TextField branch_change;
    String old_room = null;

    public void StudentID_ch(String ID) {
        String room_ch;
        String Year;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM student WHERE ID_student = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, ID);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                change_name_Student.setText(rs.getString("student_name"));
                change_lname_Student.setText(rs.getString("student_last_name"));
                change_date_birth_s.setText(rs.getString("date_of_birth"));
                place_of_birth_change.setText(rs.getString("place_of_birth"));
                nat_change.setText(rs.getString("nationality"));
                nombre_bac_change.setText(rs.getString("Bac_certificate_number"));
                Year = rs.getString("Year_of_obtaining_a_bac");
                String year = StringUtils.substring(Year, 0, 4);
                year_suc_change.setText(year);
                address_change.setText(rs.getString("Address"));
                spic_change.setText(rs.getString("Specialization"));
                name_mom_change.setText(rs.getString("Mother_name"));
                lname_mom_change.setText(rs.getString("Mother_last_name"));
                name_dad_change.setText(rs.getString("father_name"));
                lname_dad_change.setText(rs.getString("father_last_name"));
                school_nome_change.setText(rs.getString("School_certificate_number"));
                room_ch = rs.getString("room_Num_room");
                if (room_ch != null && !room_ch.isEmpty()) {
                    char firstChar = StringUtils.substring(room_ch, 0, 1).charAt(0);
                    number_block5.setValue(firstChar);
                    nomber_room_combo5.setValue(room_ch);
                }

                num_stait51.setValue(rs.getString("state_student"));
                branch_change.setText(rs.getString("branch_student"));
                level_change.setText(rs.getString("level_student"));
                old_room = room_ch;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private TextField student_ID_ch;
    @FXML
    private Rectangle clip2;
    @FXML
    private ImageView photo_student2;

    public void Upload_Student_Information() {
        String name_ID = student_ID_ch.getText();
        if (name_ID == null || name_ID.isEmpty()) {
            loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            WritableImage writableImage = new WritableImage(100, 100);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
            }
            Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
            clip2.setFill(new ImagePattern(emptyImage));
            photo_student2.setImage(emptyImage);
        } else {
            StudentID_ch(name_ID);
            try {
                long Id = Long.parseLong(name_ID);
                byte[] imageData = retrieveImageFromDatabase(Id);
                if (imageData != null) {
                    Image image = new Image(new ByteArrayInputStream(imageData), 100, 100, false, true);
                    clip2.setFill(new ImagePattern(image));
                    photo_student2.setImage(image);
                } else {
                    loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    WritableImage writableImage = new WritableImage(100, 100);
                    Color defaultColor = Color.WHITE;
                    for (int x = 0; x < 100; x++) {
                        for (int y = 0; y < 100; y++) {
                            writableImage.getPixelWriter().setColor(x, y, defaultColor);
                        }
                    }
                    Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
                    clip2.setFill(new ImagePattern(emptyImage));
                    photo_student2.setImage(emptyImage);
                }
            } catch (NumberFormatException e) {
                // Handle the exception if the ID is not a valid number
                System.err.println("Invalid student ID: " + name_ID);
            }
        }
    }

    public void Handle_clicke_mouse16(MouseEvent event) {
        Upload_Student_Information();
    }

    public void update_information_student() {
        String ID = student_ID_ch.getText();
        String name = change_name_Student.getText();
        String lname = change_lname_Student.getText();
        String date_birth = change_date_birth_s.getText();
        String place_of_birth = place_of_birth_change.getText();
        String nat = nat_change.getText();
        String nomber_bac = nombre_bac_change.getText();
        int nomber_Bac = Integer.parseInt(nomber_bac);
        String Year_Suc_Change = year_suc_change.getText();
        int year = Integer.parseInt(Year_Suc_Change);
        String addres = address_change.getText();
        String spic = spic_change.getText();
        String name_mome = name_mom_change.getText();
        String lname_mome = lname_mom_change.getText();
        String name_dad = name_dad_change.getText();
        String lname_dad = lname_dad_change.getText();
        String scool_nomber = school_nome_change.getText();
        String Level = level_change.getText();
        String Branch = branch_change.getText();
        String room = (nomber_room_combo5.getSelectionModel().getSelectedItem() != null) ? nomber_room_combo5.getSelectionModel().getSelectedItem().toString() : null;
        String statit_ch = (num_stait51.getSelectionModel().getSelectedItem() != null) ? num_stait51.getSelectionModel().getSelectedItem().toString() : null;
        if (this.old_room == null) {
            this.old_room = "";
        }
        if (room == null) {
            room = "";
        }
        byte[] imageBytes = new byte[0];
        Image image = photo_student2.getImage();
        if (image != null) {
            try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
                BufferedImage bufferedImage = SwingFXUtils.fromFXImage(image, null);
                ImageIO.write(bufferedImage, "png", outputStream);
                imageBytes = outputStream.toByteArray();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (nomber_room_combo5.getSelectionModel().getSelectedItem() != null) {
            int a = room_capacity_noumber(combo1.getSelectionModel().getSelectedItem().toString(), nomber_room_combo5);
            if (image != null && this.old_room != null && !room.equals(old_room.isEmpty())) {
                if (a > 0) {
                    av_place_plus(combo1.getSelectionModel().getSelectedItem().toString(), old_room);
                    av_place(combo1.getSelectionModel().getSelectedItem().toString(), nomber_room_combo5);
                    updateStudentInfo(ID, name, lname, date_birth, place_of_birth, nat, nomber_Bac, year, addres, spic, name_mome, lname_mome, name_dad, lname_dad, scool_nomber, imageBytes, room, statit_ch, Branch, Level);
                } else if (a == 0) {
                    showAlert(Alert.AlertType.ERROR, "خطأ", "الغرفة " + room + "محجوزة بالكامل");
                }
            } else if (image == null && room.equals(this.old_room)) {
                updateStudentInfo(ID, name, lname, date_birth, place_of_birth, nat, nomber_Bac, year, addres, spic, name_mome, lname_mome, name_dad, lname_dad, scool_nomber, null, room, statit_ch, Branch, Level);
            } else {
                if (image != null) {
                    if (a > 0) {
                        av_place_plus(combo1.getSelectionModel().getSelectedItem().toString(), old_room);
                        av_place(combo1.getSelectionModel().getSelectedItem().toString(), nomber_room_combo5);
                        updateStudentInfo(ID, name, lname, date_birth, place_of_birth, nat, nomber_Bac, year, addres, spic, name_mome, lname_mome, name_dad, lname_dad, scool_nomber, imageBytes, room, statit_ch, Branch, Level);
                    } else if (a == 0) {
                        showAlert(Alert.AlertType.ERROR, "خطأ", "الغرفة " + room + "محجوزة بالكامل");
                    }
                } else {
                    updateStudentInfo(ID, name, lname, date_birth, place_of_birth, nat, nomber_Bac, year, addres, spic, name_mome, lname_mome, name_dad, lname_dad, scool_nomber, null, room, statit_ch, Branch, Level);
                }
            }
        } else if (nomber_room_combo5.getSelectionModel().getSelectedItem() == null && old_room.isEmpty()) {
            if (image != null) {
                updateStudentInfo(ID, name, lname, date_birth, place_of_birth, nat, nomber_Bac, year, addres, spic, name_mome, lname_mome, name_dad, lname_dad, scool_nomber, imageBytes, null, statit_ch, Branch, Level);
            } else if (image == null) {
                updateStudentInfo(ID, name, lname, date_birth, place_of_birth, nat, nomber_Bac, year, addres, spic, name_mome, lname_mome, name_dad, lname_dad, scool_nomber, null, null, statit_ch, Branch, Level);
            }
        }
    }

    private void updateStudentInfo(String ID, String name, String lname, String date_birth, String place_of_birth, String nat, int nomber_Bac, int year, String addres, String spic, String name_mome, String lname_mome, String name_dad, String lname_dad, String scool_nomber, byte[] imageBytes, String room, String statit_ch, String Branch, String Level) {
        String dbName = combo1.getSelectionModel().getSelectedItem().toString();
        String url = "jdbc:mysql://localhost:3306/" + dbName;
        String user = "root";
        String password = "Saf3tyF!rst@2023";
        String query = "UPDATE student SET student_name=?, student_last_name=?, date_of_birth=?, place_of_birth=?, nationality=?, Bac_certificate_number=?, Year_of_obtaining_a_bac=?, Address=?, Specialization=?, Mother_name=?, Mother_last_name=?, father_name=?, father_last_name=?, School_certificate_number=?, photo_student=?, room_Num_room=?, state_student=?, branch_student=?, level_student=? WHERE ID_student=?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setString(2, lname);
            pstmt.setString(3, date_birth);
            pstmt.setString(4, place_of_birth);
            pstmt.setString(5, nat);
            pstmt.setInt(6, nomber_Bac);
            pstmt.setInt(7, year);
            pstmt.setString(8, addres);
            pstmt.setString(9, spic);
            pstmt.setString(10, name_mome);
            pstmt.setString(11, lname_mome);
            pstmt.setString(12, name_dad);
            pstmt.setString(13, lname_dad);
            pstmt.setString(14, scool_nomber);
            if (imageBytes != null) {
                pstmt.setBytes(15, imageBytes);
            } else {
                pstmt.setNull(15, Types.BLOB);
            }
            if (room != null && !room.isEmpty()) {
                pstmt.setString(16, room);
            } else {
                pstmt.setNull(16, Types.VARCHAR);
            }
            pstmt.setString(17, statit_ch);
            pstmt.setString(18, Branch);
            pstmt.setString(19, Level);
            pstmt.setString(20, ID);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                showAlert(Alert.AlertType.INFORMATION, "نجاح", "تم تحديث المعلومات بنجاح.");
            } else {
                showAlert(Alert.AlertType.ERROR, "خطأ", "حدث خطأ في عملية تحديث معلومات الطالب.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public void av_place_plus(String dbName, String room) {
        String url = "jdbc:mysql://localhost:3306/" + dbName;
        String user = "root";
        String password = "Saf3tyF!rst@2023";

        String query = "SELECT Av_place, capacity FROM room WHERE Num_room = ?";
        int value = 0;
        int value2 = 0;

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, room);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    value = rs.getInt("Av_place");
                    value2 = rs.getInt("capacity");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (value < value2) {
            String updateQuery = "UPDATE room SET Av_place = Av_place + 1 WHERE Num_room = ?";
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {

                pstmt.setString(1, room);
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void Action_ch_photo(ActionEvent e) {
        photo_student2.setFitHeight(118);
        photo_student2.setFitWidth(106);
        photo_student2.setPreserveRatio(true);
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("اختر صورة");
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("صور", "*.jpg", "*.png", "*.gif", "*.bmp");
        fileChooser.getExtensionFilters().add(imageFilter);
        File selectedFile = fileChooser.showOpenDialog(Main_APP.Home_page);
        if (selectedFile != null) {
            Image image = new Image(selectedFile.toURI().toString(), 150, 160, false, true);
            clip2.setFill(new ImagePattern(image));
            photo_student2.setImage(image);
        }
    }

    public void Actoin_change_information(ActionEvent e) {
        update_information_student();
    }

    public void clearFields(ActionEvent e) {
        student_ID_ch.clear();
        change_name_Student.clear();
        change_lname_Student.clear();
        change_date_birth_s.clear();
        place_of_birth_change.clear();
        nat_change.clear();
        nombre_bac_change.clear();
        year_suc_change.clear();
        address_change.clear();
        spic_change.clear();
        name_mom_change.clear();
        lname_mom_change.clear();
        name_dad_change.clear();
        lname_dad_change.clear();
        school_nome_change.clear();
        number_block5.setValue(null);
        num_stait51.valueProperty().set(null);
        num_stait51.setPromptText("إختر الولاية*");
        num_stait51.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText("إختر الولاية*");
                } else {
                    setText(item);
                }
            }
        });
        nomber_room_combo5.setValue(null);
        num_stait51.setValue(null);
        branch_change.clear();
        level_change.clear();
        old_room = null;
        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }
        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip2.setFill(new ImagePattern(emptyImage));
        photo_student2.setImage(emptyImage);
    }

    @FXML
    private TextField num_nation_work_ch;
    @FXML
    private TextField name_worker_ch;
    @FXML
    private TextField lame_worker_ch;
    @FXML
    private TextField date_birth_worker_ch;
    @FXML
    private TextField place_birth_worker_ch;
    @FXML
    private ComboBox<String> statit_work_ch;
    @FXML
    private TextField addrees_worker_ch;
    @FXML
    private TextField Nationalty_worker_ch;
    @FXML
    private ComboBox number_block6;
    @FXML
    private ComboBox nomber_room_combo6;
    @FXML
    private Rectangle clip11;
    @FXML
    private ImageView photo_student11;
    String old_room_worker = null;

    public void worker_National_id_card_number_ch(String ID) {
        String room_ch;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM Worker WHERE National_id_card_number = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, ID);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                name_worker_ch.setText(rs.getString("worker_name"));
                lame_worker_ch.setText(rs.getString("worker_last_name"));
                date_birth_worker_ch.setText(rs.getString("date_of_birth"));
                place_birth_worker_ch.setText(rs.getString("place_brith_worker"));
                addrees_worker_ch.setText(rs.getString("Address"));
                Nationalty_worker_ch.setText(rs.getString("nationality"));
                room_ch = rs.getString("room_Num_room");
                if (room_ch != null && !room_ch.isEmpty()) {
                    char firstChar = StringUtils.substring(room_ch, 0, 1).charAt(0);
                    number_block6.setValue(firstChar);
                    nomber_room_combo6.setValue(room_ch);
                }
                statit_work_ch.setValue(rs.getString("state"));
                old_room_worker = room_ch;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Upload_worker_Information() {
        String ID = num_nation_work_ch.getText();
        if (ID == null || ID.isEmpty()) {
            loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            WritableImage writableImage = new WritableImage(100, 100);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
            }
            Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
            clip11.setFill(new ImagePattern(emptyImage));
            photo_student11.setImage(emptyImage);
        } else {
            worker_National_id_card_number_ch(ID);
            try {
                long Id = Long.parseLong(ID);
                byte[] imageData = retrieveImageFromDatabase2(Id);
                if (imageData != null) {
                    Image image = new Image(new ByteArrayInputStream(imageData), 100, 100, false, true);
                    clip11.setFill(new ImagePattern(image));
                    photo_student11.setImage(image);
                } else {
                    loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    WritableImage writableImage = new WritableImage(100, 100);
                    Color defaultColor = Color.WHITE;
                    for (int x = 0; x < 100; x++) {
                        for (int y = 0; y < 100; y++) {
                            writableImage.getPixelWriter().setColor(x, y, defaultColor);
                        }
                    }
                    Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
                    clip11.setFill(new ImagePattern(emptyImage));
                    photo_student11.setImage(emptyImage);
                }
            } catch (NumberFormatException e) {

                System.err.println("Invalid in ID: " + ID);
            }
        }
    }

    public void Action_sherch_on_worker(ActionEvent e) {
        Upload_worker_Information();
    }

    private void updateWorkerInfo(String nat_ID, String name, String lname, String date_birth, String nat, String place_of_birth, String address, byte[] imageBytes, String room, String statie) {
        String dbName = combo1.getSelectionModel().getSelectedItem().toString();
        String url = "jdbc:mysql://localhost:3306/" + dbName;
        String user = "root";
        String password = "Saf3tyF!rst@2023";
        String query = "UPDATE worker SET worker_name=?, worker_last_name=?, date_of_birth=?,nationality=?, place_brith_worker=?, Address=?, photo_worker=?, room_Num_room=?, state=? WHERE National_id_card_number=?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setString(2, lname);
            pstmt.setString(3, date_birth);
            pstmt.setString(4, nat);
            pstmt.setString(5, place_of_birth);
            pstmt.setString(6, address);
            if (imageBytes != null) {
                pstmt.setBytes(7, imageBytes);
            } else {
                pstmt.setNull(7, Types.BLOB);
            }
            if (room != null && !room.isEmpty()) {
                pstmt.setString(8, room);
            } else {
                pstmt.setNull(8, Types.VARCHAR);
            }
            pstmt.setString(9, statie);
            pstmt.setString(10, nat_ID);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                showAlert(Alert.AlertType.INFORMATION, "نجاح", "تم تحديث المعلومات بنجاح.");
            } else {
                showAlert(Alert.AlertType.ERROR, "خطأ", "حدث خطأ في عملية تحديث معلومات الطالب.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update_information_worker() {
        String ID = num_nation_work_ch.getText();
        String name = name_worker_ch.getText();
        String lname = lame_worker_ch.getText();
        String date_birth = date_birth_worker_ch.getText();
        String place_of_birth = place_birth_worker_ch.getText();
        String nat = Nationalty_worker_ch.getText();
        String addres = addrees_worker_ch.getText();
        String room = (nomber_room_combo6.getSelectionModel().getSelectedItem() != null) ? nomber_room_combo6.getSelectionModel().getSelectedItem().toString() : null;
        String statit_ch = (statit_work_ch.getSelectionModel().getSelectedItem() != null) ? statit_work_ch.getSelectionModel().getSelectedItem().toString() : null;
        if (this.old_room_worker == null) {
            this.old_room_worker = "";
        }
        if (room == null) {
            room = "";
        }
        byte[] imageBytes = new byte[0];
        Image image = photo_student11.getImage();
        if (image != null) {
            try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
                BufferedImage bufferedImage = SwingFXUtils.fromFXImage(image, null);
                ImageIO.write(bufferedImage, "png", outputStream);
                imageBytes = outputStream.toByteArray();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (nomber_room_combo6.getSelectionModel().getSelectedItem() != null) {
            int a = room_capacity_noumber(combo1.getSelectionModel().getSelectedItem().toString(), nomber_room_combo6);
            if (image != null && this.old_room_worker != null && !room.equals(this.old_room_worker.isEmpty())) {
                if (a > 0) {
                    av_place_plus(combo1.getSelectionModel().getSelectedItem().toString(), old_room_worker);
                    av_place(combo1.getSelectionModel().getSelectedItem().toString(), nomber_room_combo6);
                    updateWorkerInfo(ID, name, lname, date_birth, nat, place_of_birth, addres, imageBytes, room, statit_ch);
                } else if (a == 0) {
                    showAlert(Alert.AlertType.ERROR, "خطأ", "الغرفة " + room + "محجوزة بالكامل");
                }
            } else if (image == null && room.equals(this.old_room_worker)) {
                updateWorkerInfo(ID, name, lname, date_birth, nat, place_of_birth, addres, null, room, statit_ch);
            } else {
                if (image != null) {
                    if (a > 0) {
                        av_place_plus(combo1.getSelectionModel().getSelectedItem().toString(), old_room_worker);
                        av_place(combo1.getSelectionModel().getSelectedItem().toString(), nomber_room_combo6);
                        updateWorkerInfo(ID, name, lname, date_birth, nat, place_of_birth, addres, imageBytes, room, statit_ch);
                    } else if (a == 0) {
                        showAlert(Alert.AlertType.ERROR, "خطأ", "الغرفة " + room + "محجوزة بالكامل");
                    }
                } else {
                    updateWorkerInfo(ID, name, lname, date_birth, nat, place_of_birth, addres, null, room, statit_ch);
                }
            }
        } else if (nomber_room_combo6.getSelectionModel().getSelectedItem() == null && old_room_worker.isEmpty()) {
            if (image != null) {
                updateWorkerInfo(ID, name, lname, date_birth, nat, place_of_birth, addres, imageBytes, null, statit_ch);
            } else if (image == null) {
                updateWorkerInfo(ID, name, lname, date_birth, nat, place_of_birth, addres, null, null, statit_ch);
            }
        }
    }

    public void action_change_information_worker(ActionEvent E) {
        update_information_worker();
    }

    public void clearFields2(ActionEvent e) {
        num_nation_work_ch.clear();
        name_worker_ch.clear();
        lame_worker_ch.clear();
        date_birth_worker_ch.clear();
        place_birth_worker_ch.clear();
        Nationalty_worker_ch.clear();
        addrees_worker_ch.clear();
        school_nome_change.clear();
        number_block6.setValue(null);
        statit_work_ch.valueProperty().set(null);
        statit_work_ch.setPromptText("إختر الولاية*");
        statit_work_ch.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText("إختر الولاية*");
                } else {
                    setText(item);
                }
            }
        });
        nomber_room_combo6.setValue(null);
        statit_work_ch.setValue(null);
        old_room_worker = null;
        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }
        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip11.setFill(new ImagePattern(emptyImage));
        photo_student11.setImage(emptyImage);
    }

    public void Action_ch_photo2(ActionEvent e) {
        photo_student11.setFitHeight(118);
        photo_student11.setFitWidth(106);
        photo_student11.setPreserveRatio(true);
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("اختر صورة");
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("صور", "*.jpg", "*.png", "*.gif", "*.bmp");
        fileChooser.getExtensionFilters().add(imageFilter);
        File selectedFile = fileChooser.showOpenDialog(Main_APP.Home_page);
        if (selectedFile != null) {
            Image image = new Image(selectedFile.toURI().toString(), 150, 160, false, true);
            clip11.setFill(new ImagePattern(image));
            photo_student11.setImage(image);
        }
    }

    public void combo_box_room_change2(ActionEvent e) {
        room1(combo1.getSelectionModel().getSelectedItem().toString(), number_block6, nomber_room_combo6);
    }

    @FXML
    private TextArea reason_exclusion;
    @FXML
    private TextField ID_student_ab_ex;
    @FXML
    private Label name_ab_exl;
    @FXML
    private Label lname_ab_ex;
    @FXML
    private Label room_ab_ex;
    @FXML
    private TextField date_ab_ex;
    @FXML
    private ComboBox<String> reason_out;
    @FXML
    private Rectangle clip111;
    @FXML
    private ImageView photo_student111;

    public void StudentID_ch2(String ID) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM student WHERE ID_student = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, ID);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                name_ab_exl.setText(rs.getString("student_name"));
                lname_ab_ex.setText(rs.getString("student_last_name"));
                room_ab_ex.setText(rs.getString("room_Num_room"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Upload_Student_Information2() {
        String name_ID = ID_student_ab_ex.getText();
        if (name_ID == null || name_ID.isEmpty()) {
            loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            WritableImage writableImage = new WritableImage(100, 100);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
            }
            Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
            clip111.setFill(new ImagePattern(emptyImage));
            photo_student111.setImage(emptyImage);
        } else {
            StudentID_ch2(name_ID);
            try {
                long Id = Long.parseLong(name_ID);
                byte[] imageData = retrieveImageFromDatabase(Id);
                if (imageData != null) {
                    Image image = new Image(new ByteArrayInputStream(imageData), 100, 100, false, true);
                    clip111.setFill(new ImagePattern(image));
                    photo_student111.setImage(image);
                } else {
                    loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    WritableImage writableImage = new WritableImage(100, 100);
                    Color defaultColor = Color.WHITE;
                    for (int x = 0; x < 100; x++) {
                        for (int y = 0; y < 100; y++) {
                            writableImage.getPixelWriter().setColor(x, y, defaultColor);
                        }
                    }
                    Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
                    clip111.setFill(new ImagePattern(emptyImage));
                    photo_student111.setImage(emptyImage);
                }
            } catch (NumberFormatException e) {
                System.err.println("رقم طالب غير صحيح: " + name_ID);
            }
        }
    }

    public void Action_cha(ActionEvent e) {
        Upload_Student_Information2();
    }

    public void delate_student(ActionEvent e) {
        ab_ex_student();
    }

    public void ab_ex_student() {
        if (reason_out.getSelectionModel().getSelectedItem().toString().equals("إقصاء من الاقامة")) {
            ex_student();
        } else if (reason_out.getSelectionModel().getSelectedItem().toString().equals("تبرئة نهاية السنة الدراسية") || reason_out.getSelectionModel().getSelectedItem().toString().equals("تبرئة نهائية")) {
            ab_student();
        }
    }

    public void ab_student() {
        String name_database = combo1.getSelectionModel().getSelectedItem().toString();
        Long ID = Long.parseLong(ID_student_ab_ex.getText());
        String id = ID_student_ab_ex.getText();
        String name = name_ab_exl.getText();
        String lname = lname_ab_ex.getText();
        String date = date_ab_ex.getText();
        String type = reason_out.getSelectionModel().getSelectedItem().toString();
        String Room = room_ab_ex.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date utilDate = null;
        try {
            utilDate = formatter.parse(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        java.sql.Date sqlDate = null;
        if (utilDate != null) {
            long millis = utilDate.getTime();
            sqlDate = new java.sql.Date(millis);
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Image image = photo_student111.getImage();

        if (image != null) {
            try {

                BufferedImage bufferedImage = SwingFXUtils.fromFXImage(image, null);

                ImageIO.write(bufferedImage, "png", outputStream);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        byte[] imageBytes = outputStream.toByteArray();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO aboandonment (name_resid,last_name_resid,type_abandonments,date_abandonment,Room_room_Room,photo,student_ID_student) VALUES (?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lname);
            preparedStatement.setString(3, type);
            preparedStatement.setDate(4, sqlDate);
            if (Room != null && !Room.isEmpty()) {
                preparedStatement.setString(5, Room);
                av_place_plus(name_database, Room);
            } else {
                preparedStatement.setNull(5, Types.VARCHAR);
            }
            if (image != null && imageBytes != null) {
                preparedStatement.setBytes(6, imageBytes);
            } else {
                preparedStatement.setNull(6, Types.BLOB);
            }
            preparedStatement.setLong(7, ID);
            delate_student(id, name_database);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("تمت العملية");
                alert.setHeaderText(null);
                alert.setContentText("تم حذف طالب بنجاح ");
                alert.showAndWait();

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void delate_student(String ID_Student, String dataBase) {

        String url = "jdbc:mysql://localhost:3306/" + dataBase;
        String user = "root";
        String password = "Saf3tyF!rst@2023";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            String sql = "DELETE FROM student WHERE ID_student = ?";


            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                preparedStatement.setString(1, ID_Student);
                int rowsAffected = preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void ex_student() {
        String name_database = combo1.getSelectionModel().getSelectedItem().toString();
        Long ID = Long.parseLong(ID_student_ab_ex.getText());
        String id = ID_student_ab_ex.getText();
        String name = name_ab_exl.getText();
        String lname = lname_ab_ex.getText();
        String date = date_ab_ex.getText();
        String reason = reason_exclusion.getText();
        String Room = room_ab_ex.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date utilDate = null;
        try {
            utilDate = formatter.parse(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        java.sql.Date sqlDate = null;
        if (utilDate != null) {
            long millis = utilDate.getTime();
            sqlDate = new java.sql.Date(millis);
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Image image = photo_student111.getImage();

        if (image != null) {
            int width = (int) image.getWidth();
            int height = (int) image.getHeight();

            WritableImage writableImage = new WritableImage(width, height);
            javafx.scene.image.PixelWriter writer = writableImage.getPixelWriter();
            javafx.scene.image.PixelReader reader = image.getPixelReader();

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Color color = reader.getColor(x, y);
                    writer.setColor(x, y, color);
                }
            }
            try {
                BufferedImage bufferedImage = SwingFXUtils.fromFXImage(writableImage, null);
                ImageIO.write(bufferedImage, "png", outputStream);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        byte[] imageBytes = outputStream.toByteArray();
        if (reason.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("تمت العملية");
            alert.setHeaderText(null);
            alert.setContentText("يرجي كتابة سبب الاقصاء ");
            alert.showAndWait();

        } else {
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
                PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO exclusion (name,last_name,reason,exclusion_date,room_Room_room,photo,student_ID_student) VALUES (?, ?, ?, ?, ?, ?, ?)");
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, lname);
                preparedStatement.setString(3, reason);
                preparedStatement.setDate(4, sqlDate);
                if (Room != null && !Room.isEmpty()) {
                    preparedStatement.setString(5, Room);
                    av_place_plus(name_database, Room);
                } else {
                    preparedStatement.setNull(5, Types.VARCHAR);
                }
                if (image != null && imageBytes != null) {
                    preparedStatement.setBytes(6, imageBytes);
                } else {
                    preparedStatement.setNull(6, Types.BLOB);
                }
                preparedStatement.setLong(7, ID);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("تمت العملية");
                    alert.setHeaderText(null);
                    alert.setContentText("تم حذف طالب بنجاح ");
                    alert.showAndWait();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            delate_student(id, name_database);
        }
    }

    public void Action_hide_text_ariea(ActionEvent e) {
        if (reason_out.getSelectionModel().getSelectedItem().toString().equals("إقصاء من الاقامة")) {

            reason_exclusion.setVisible(true);

        } else if (reason_out.getSelectionModel().getSelectedItem().toString().equals("تبرئة نهاية السنة الدراسية") || reason_out.getSelectionModel().getSelectedItem().toString().equals("تبرئة نهائية")) {
            reason_exclusion.setVisible(false);
        }
    }

    public void Action_clean(ActionEvent e) {
        reason_exclusion.clear();
        ID_student_ab_ex.clear();
        name_ab_exl.setText("الاسم");
        room_ab_ex.setText("الغرفة");
        lname_ab_ex.setText("اللقب");
        date_ab_ex.clear();
        reason_out.setPromptText("سبب الخروج من الاقامة");
        reason_out.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText("سبب الخروج من الاقامة");
                } else {
                    setText(item);
                }
            }
        });
        reason_exclusion.setVisible(false);
        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }
        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip111.setFill(new ImagePattern(emptyImage));
        photo_student111.setImage(emptyImage);
    }

    @FXML
    private TextField ID_Nat_ex_ab;
    @FXML
    private Label name_worker_ex_ab;
    @FXML
    private Label lname_worker_ex_ab;
    @FXML
    private TextField date_ex_ab_worker;
    @FXML
    private Label room_worker_ex_ab;
    @FXML
    private ComboBox<String> reason_ab_ex_worker;
    @FXML
    private TextArea reson_w_ex;
    @FXML
    private Rectangle clip1111;
    @FXML
    private ImageView photo_student1111;

    public void WorkerID_ch(String ID) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM worker WHERE National_id_card_number = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, ID);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                name_worker_ex_ab.setText(rs.getString("worker_name"));
                lname_worker_ex_ab.setText(rs.getString("worker_last_name"));
                room_worker_ex_ab.setText(rs.getString("room_Num_room"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Action_worker_ch(ActionEvent e) {
        String ID = ID_Nat_ex_ab.getText();
        WorkerID_ch(ID);
        long id = Long.parseLong(ID_Nat_ex_ab.getText());
        byte[] imageData = retrieveImageFromDatabase2(id);
        if (imageData != null) {
            Image image = new Image(new ByteArrayInputStream(imageData), 100, 100, false, true);
            clip1111.setFill(new ImagePattern(image));
            photo_student1111.setImage(image);
        } else {
            loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            WritableImage writableImage = new WritableImage(100, 100);
            Color defaultColor = Color.WHITE;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    writableImage.getPixelWriter().setColor(x, y, defaultColor);
                }
                Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
                clip1111.setFill(new ImagePattern(emptyImage));
                photo_student1111.setImage(emptyImage);
            }

        }
    }

    public void ab_ex_worker() {
        if (reason_ab_ex_worker.getSelectionModel().getSelectedItem().toString().equals("الاقصاء")) {
            ex_worker();
        } else if (reason_ab_ex_worker.getSelectionModel().getSelectedItem().toString().equals("نهاية السنة الدراسية") || reason_ab_ex_worker.getSelectionModel().getSelectedItem().toString().equals("تقاعد") || reason_ab_ex_worker.getSelectionModel().getSelectedItem().toString().equals("الاستقالة")) {
            ab_worker();
        }
    }

    public void ex_worker() {

        String name_database = combo1.getSelectionModel().getSelectedItem().toString();
        Long ID = Long.parseLong(ID_Nat_ex_ab.getText());
        String id = ID_Nat_ex_ab.getText();
        String name = name_worker_ex_ab.getText();
        String lname = lname_worker_ex_ab.getText();
        String date = date_ex_ab_worker.getText();
        String Room = room_worker_ex_ab.getText();
        String reason = reson_w_ex.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date utilDate = null;
        try {
            utilDate = formatter.parse(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        java.sql.Date sqlDate = null;
        if (utilDate != null) {
            long millis = utilDate.getTime();
            sqlDate = new java.sql.Date(millis);
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Image image = photo_student1111.getImage();

        if (image != null) {
            int width = (int) image.getWidth();
            int height = (int) image.getHeight();

            WritableImage writableImage = new WritableImage(width, height);
            javafx.scene.image.PixelWriter writer = writableImage.getPixelWriter();
            javafx.scene.image.PixelReader reader = image.getPixelReader();

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Color color = reader.getColor(x, y);
                    writer.setColor(x, y, color);
                }
            }
            try {
                BufferedImage bufferedImage = SwingFXUtils.fromFXImage(writableImage, null);
                ImageIO.write(bufferedImage, "png", outputStream);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        byte[] imageBytes = outputStream.toByteArray();
        if (reason.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("تمت العملية");
            alert.setHeaderText(null);
            alert.setContentText("يرجي كتابة سبب الاقصاء ");
            alert.showAndWait();
            loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
            loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        } else {
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
                PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO exclusion (name,last_name,reason,exclusion_date,room_Room_room,photo,worker_Nat_ID) VALUES (?, ?, ?, ?, ?, ?, ?)");
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, lname);
                preparedStatement.setString(3, reason);
                preparedStatement.setDate(4, sqlDate);
                if (Room != null && !Room.isEmpty()) {
                    preparedStatement.setString(5, Room);
                    av_place_plus(name_database, Room);
                } else {
                    preparedStatement.setNull(5, Types.VARCHAR);
                }
                if (image != null && imageBytes != null) {
                    preparedStatement.setBytes(6, imageBytes);
                } else {
                    preparedStatement.setNull(6, Types.BLOB);
                }
                preparedStatement.setLong(7, ID);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("تمت العملية");
                    alert.setHeaderText(null);
                    alert.setContentText("تم حذف العامل بنجاح ");
                    alert.showAndWait();

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            delate_worker(id, name_database);
        }
    }

    public void ab_worker() {
        String name_database = combo1.getSelectionModel().getSelectedItem().toString();
        Long ID = Long.parseLong(ID_Nat_ex_ab.getText());
        String id = ID_Nat_ex_ab.getText();
        String name = name_worker_ex_ab.getText();
        String lname = lname_worker_ex_ab.getText();
        String date = date_ex_ab_worker.getText();
        String type = reason_ab_ex_worker.getSelectionModel().getSelectedItem().toString();
        String Room = room_worker_ex_ab.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date utilDate = null;
        try {
            utilDate = formatter.parse(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        java.sql.Date sqlDate = null;
        if (utilDate != null) {
            long millis = utilDate.getTime();
            sqlDate = new java.sql.Date(millis);
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Image image = photo_student1111.getImage();

        if (image != null) {
            int width = (int) image.getWidth();
            int height = (int) image.getHeight();

            WritableImage writableImage = new WritableImage(width, height);
            javafx.scene.image.PixelWriter writer = writableImage.getPixelWriter();
            javafx.scene.image.PixelReader reader = image.getPixelReader();

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Color color = reader.getColor(x, y);
                    writer.setColor(x, y, color);
                }
            }
            try {
                BufferedImage bufferedImage = SwingFXUtils.fromFXImage(writableImage, null);
                ImageIO.write(bufferedImage, "png", outputStream);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        byte[] imageBytes = outputStream.toByteArray();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO aboandonment (name_resid,last_name_resid,type_abandonments,date_abandonment,Room_room_Room,photo,worker_National_id_card_number) VALUES (?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lname);
            preparedStatement.setString(3, type);
            preparedStatement.setDate(4, sqlDate);
            if (Room != null && !Room.isEmpty()) {
                preparedStatement.setString(5, Room);
                av_place_plus(name_database, Room);
            } else {
                preparedStatement.setNull(5, Types.VARCHAR);
            }
            if (image != null && imageBytes != null) {
                preparedStatement.setBytes(6, imageBytes);
            } else {
                preparedStatement.setNull(6, Types.BLOB);
            }
            preparedStatement.setLong(7, ID);
            delate_worker(id, name_database);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("تمت العملية");
                alert.setHeaderText(null);
                alert.setContentText("تم حذف العامل بنجاح ");
                alert.showAndWait();

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void delate_worker(String ID_worker, String dataBase) {
        String url = "jdbc:mysql://localhost:3306/" + dataBase;
        String user = "root";
        String password = "Saf3tyF!rst@2023";
        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            String sql = "DELETE FROM worker WHERE National_id_card_number = ?";


            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                preparedStatement.setString(1, ID_worker);
                int rowsAffected = preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void Action_clean2(ActionEvent e) {
        reson_w_ex.clear();
        ID_Nat_ex_ab.clear();
        name_ab_exl.setText("الاسم");
        room_ab_ex.setText("الغرفة");
        lname_ab_ex.setText("اللقب");
        date_ex_ab_worker.clear();
        reason_ab_ex_worker.setPromptText("سبب الخروج من الاقامة");
        reason_ab_ex_worker.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText("سبب الخروج من الاقامة");
                } else {
                    setText(item);
                }
            }
        });
        reson_w_ex.setVisible(false);
        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }
        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip1111.setFill(new ImagePattern(emptyImage));
        photo_student1111.setImage(emptyImage);
    }

    public void Action_W_r(ActionEvent e) {
        if (reason_ab_ex_worker.getSelectionModel().getSelectedItem().toString().equals("الاقصاء")) {
            reson_w_ex.setVisible(true);
        } else {
            reson_w_ex.setVisible(false);
        }


    }

    public void loadStudentsabFromDatabase(String URL) {
        ID_student_archive.setCellValueFactory(new PropertyValueFactory<>("ID"));
        Name_student_archive.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_student_archive.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        year_of_ab_St.setCellValueFactory(new PropertyValueFactory<>("date_of_ab"));
        re_ab_st.setCellValueFactory(new PropertyValueFactory<>("resion_ab"));
        room_ab_st.setCellValueFactory(new PropertyValueFactory<>("Room"));

        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT student_ID_student,name_resid,last_name_resid,date_abandonment,type_abandonments,Room_room_Room  FROM aboandonment where student_ID_student is not null ");
            ObservableList<student_archive> students = FXCollections.observableArrayList();
            while (rs.next()) {
                student_archive Student_archive = new student_archive(
                        rs.getLong("student_ID_student"),
                        rs.getString("name_resid"),
                        rs.getString("last_name_resid"),
                        rs.getString("date_abandonment"),
                        rs.getString("type_abandonments"),
                        rs.getString("Room_room_Room"));
                students.add(Student_archive);
            }
            table_student_archive.setItems(students);
            if (students == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (students != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void loadworkersabFromDatabase(String URL) {
        Nat_id_card_archive.setCellValueFactory(new PropertyValueFactory<>("National_id_card_number"));
        worker_name_archive.setCellValueFactory(new PropertyValueFactory<>("worker_name"));
        worker_last_name_archive.setCellValueFactory(new PropertyValueFactory<>("worker_last_name"));
        type_w_archive.setCellValueFactory(new PropertyValueFactory<>("re_ab_w"));
        date_ab_w_archive.setCellValueFactory(new PropertyValueFactory<>("date_of_ab_w"));
        room_ab_w_archive.setCellValueFactory(new PropertyValueFactory<>("Room"));

        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT worker_National_id_card_number,name_resid,last_name_resid,date_abandonment,type_abandonments,Room_room_Room  FROM aboandonment where worker_National_id_card_number is not null ");
            ObservableList<workers_archive> workers = FXCollections.observableArrayList();
            while (rs.next()) {
                workers_archive workersArchive = new workers_archive(
                        rs.getLong("worker_National_id_card_number"),
                        rs.getString("name_resid"),
                        rs.getString("last_name_resid"),
                        rs.getString("date_abandonment"),
                        rs.getString("type_abandonments"),
                        rs.getString("Room_room_Room"));
                workers.add(workersArchive);
            }
            table_worker_archive.setItems(workers);
            if (workers == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (workers != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private TextField ID_student_Ab;

    public void scherch_Students_ab_FromDatabase(String URL, String ID_Ab) {
        ID_student_archive.setCellValueFactory(new PropertyValueFactory<>("ID"));
        Name_student_archive.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_student_archive.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        year_of_ab_St.setCellValueFactory(new PropertyValueFactory<>("date_of_ab"));
        re_ab_st.setCellValueFactory(new PropertyValueFactory<>("resion_ab"));
        room_ab_st.setCellValueFactory(new PropertyValueFactory<>("Room"));

        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT student_ID_student,name_resid,last_name_resid,date_abandonment,type_abandonments,Room_room_Room  FROM aboandonment where student_ID_student = " + ID_Ab);
            ObservableList<student_archive> students = FXCollections.observableArrayList();
            while (rs.next()) {
                student_archive Student_archive = new student_archive(
                        rs.getLong("student_ID_student"),
                        rs.getString("name_resid"),
                        rs.getString("last_name_resid"),
                        rs.getString("date_abandonment"),
                        rs.getString("type_abandonments"),
                        rs.getString("Room_room_Room"));
                students.add(Student_archive);
            }
            table_student_archive.setItems(students);
            if (students == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (students != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void scherch_st_ab(ActionEvent e) {
        scherch_Students_ab_FromDatabase(combo1.getSelectionModel().getSelectedItem().toString(), ID_student_Ab.getText());
    }

    @FXML
    private TextField ID_student_Ab_name;

    public void scherch_Students_ab_name_FromDatabase(String URL, String ID_Ab) {
        ID_student_archive.setCellValueFactory(new PropertyValueFactory<>("ID"));
        Name_student_archive.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_student_archive.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        year_of_ab_St.setCellValueFactory(new PropertyValueFactory<>("date_of_ab"));
        re_ab_st.setCellValueFactory(new PropertyValueFactory<>("resion_ab"));
        room_ab_st.setCellValueFactory(new PropertyValueFactory<>("Room"));
        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT student_ID_student,name_resid,last_name_resid,date_abandonment,type_abandonments,Room_room_Room  FROM aboandonment where name_resid = " + ID_Ab + "and student_ID_student is not null");
            ObservableList<student_archive> students = FXCollections.observableArrayList();
            while (rs.next()) {
                student_archive Student_archive = new student_archive(
                        rs.getLong("student_ID_student"),
                        rs.getString("name_resid"),
                        rs.getString("last_name_resid"),
                        rs.getString("date_abandonment"),
                        rs.getString("type_abandonments"),
                        rs.getString("Room_room_Room"));
                students.add(Student_archive);
            }
            table_student_archive.setItems(students);
            if (students == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (students != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void scherch_st_ab_name(ActionEvent e) {
        scherch_Students_ab_name_FromDatabase(combo1.getSelectionModel().getSelectedItem().toString(), ID_student_Ab_name.getText());
    }

    private byte[] retrieveImageStudentAbFromDatabase(long studentId) {
        byte[] imageData = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem(), "root", "Saf3tyF!rst@2023");
            PreparedStatement statement = connection.prepareStatement("SELECT photo FROM aboandonment WHERE student_ID_student = ?");
            statement.setLong(1, studentId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                imageData = resultSet.getBytes("photo");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(imageData);
        return imageData;
    }

    @FXML
    private Rectangle clip41;
    @FXML
    private ImageView photo_student12;

    public void Handle_mouse3(MouseEvent event) {

        if (event.getClickCount() == 1) {

            student_archive Student = table_student_archive.getSelectionModel().getSelectedItem();

            if (Student != null) {
                byte[] imageData = retrieveImageStudentAbFromDatabase(Student.getID());


                if (imageData != null) {
                    Image image = new Image(new ByteArrayInputStream(imageData), 100, 100, false, true);

                    clip41.setFill(new ImagePattern(image));
                    photo_student12.setImage(image);
                } else {
                    WritableImage writableImage = new WritableImage(100, 100);
                    Color defaultColor = Color.WHITE;

                    for (int x = 0; x < 100; x++) {
                        for (int y = 0; y < 100; y++) {
                            writableImage.getPixelWriter().setColor(x, y, defaultColor);
                        }
                    }

                    Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
                    clip41.setFill(new ImagePattern(emptyImage));
                    photo_student12.setImage(emptyImage);
                }
            }
        }
    }

    public void clean_ab_st(ActionEvent e) {
        ID_student_Ab.clear();
        ID_student_Ab_name.clear();
        loadStudentsabFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }

        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip41.setFill(new ImagePattern(emptyImage));
        photo_student12.setImage(emptyImage);
    }


    private byte[] retrieveImageWorkerAbFromDatabase(long WorkerId) {
        byte[] imageData = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem(), "root", "Saf3tyF!rst@2023");
            PreparedStatement statement = connection.prepareStatement("SELECT photo FROM aboandonment WHERE worker_National_id_card_number = ?");
            statement.setLong(1, WorkerId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                imageData = resultSet.getBytes("photo");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(imageData);
        return imageData;
    }

    @FXML
    private Rectangle clip42;
    @FXML
    private ImageView photo_student13;


    public void Handle_mouse4(MouseEvent event) {

        if (event.getClickCount() == 1) {

            workers_archive workersArchive = table_worker_archive.getSelectionModel().getSelectedItem();

            if (workersArchive != null) {
                byte[] imageData = retrieveImageWorkerAbFromDatabase(workersArchive.getNational_id_card_number());


                if (imageData != null) {
                    Image image = new Image(new ByteArrayInputStream(imageData), 100, 100, false, true);

                    clip42.setFill(new ImagePattern(image));
                    photo_student13.setImage(image);
                } else {
                    WritableImage writableImage = new WritableImage(100, 100);
                    Color defaultColor = Color.WHITE;

                    for (int x = 0; x < 100; x++) {
                        for (int y = 0; y < 100; y++) {
                            writableImage.getPixelWriter().setColor(x, y, defaultColor);
                        }
                    }

                    Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
                    clip42.setFill(new ImagePattern(emptyImage));
                    photo_student13.setImage(emptyImage);
                }
            }
        }
    }

    @FXML
    private TextField ID_Wo_Ab;
    @FXML
    private TextField Nam_wor_ab;

    public void scherch_workers_ab_FromDatabase(String URL, String ID_Ab) {
        Nat_id_card_archive.setCellValueFactory(new PropertyValueFactory<>("National_id_card_number"));
        worker_name_archive.setCellValueFactory(new PropertyValueFactory<>("worker_name"));
        worker_last_name_archive.setCellValueFactory(new PropertyValueFactory<>("worker_last_name"));
        type_w_archive.setCellValueFactory(new PropertyValueFactory<>("re_ab_w"));
        date_ab_w_archive.setCellValueFactory(new PropertyValueFactory<>("date_of_ab_w"));
        room_ab_w_archive.setCellValueFactory(new PropertyValueFactory<>("Room"));
        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT worker_National_id_card_number,name_resid,last_name_resid,date_abandonment,type_abandonments,Room_room_Room  FROM aboandonment where worker_National_id_card_number = " + ID_Ab);
            ObservableList<workers_archive> workers = FXCollections.observableArrayList();
            while (rs.next()) {
                workers_archive workersArchive = new workers_archive(
                        rs.getLong("worker_National_id_card_number"),
                        rs.getString("name_resid"),
                        rs.getString("last_name_resid"),
                        rs.getString("date_abandonment"),
                        rs.getString("type_abandonments"),
                        rs.getString("Room_room_Room"));
                workers.add(workersArchive);
            }
            table_worker_archive.setItems(workers);
            if (workers == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (workers != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void scherch_workers_ab_by_name_FromDatabase(String URL, String ID_Ab) {
        Nat_id_card_archive.setCellValueFactory(new PropertyValueFactory<>("National_id_card_number"));
        worker_name_archive.setCellValueFactory(new PropertyValueFactory<>("worker_name"));
        worker_last_name_archive.setCellValueFactory(new PropertyValueFactory<>("worker_last_name"));
        type_w_archive.setCellValueFactory(new PropertyValueFactory<>("re_ab_w"));
        date_ab_w_archive.setCellValueFactory(new PropertyValueFactory<>("date_of_ab_w"));
        room_ab_w_archive.setCellValueFactory(new PropertyValueFactory<>("Room"));

        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT worker_National_id_card_number,name_resid,last_name_resid,date_abandonment,type_abandonments,Room_room_Room  FROM aboandonment where name_resid = " + ID_Ab + "and worker_National_id_card_number is not null ");
            ObservableList<workers_archive> workers = FXCollections.observableArrayList();
            while (rs.next()) {
                workers_archive workersArchive = new workers_archive(
                        rs.getLong("worker_National_id_card_number"),
                        rs.getString("name_resid"),
                        rs.getString("last_name_resid"),
                        rs.getString("date_abandonment"),
                        rs.getString("type_abandonments"),
                        rs.getString("Room_room_Room"));
                workers.add(workersArchive);
            }
            table_worker_archive.setItems(workers);
            if (workers == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (workers != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void sh_workers_ab(ActionEvent e) {
        scherch_workers_ab_FromDatabase(combo1.getSelectionModel().getSelectedItem().toString(), ID_Wo_Ab.getText());
    }

    public void sh_workers_ab2(ActionEvent e) {
        scherch_workers_ab_by_name_FromDatabase(combo1.getSelectionModel().getSelectedItem().toString(), Nam_wor_ab.getText());
    }

    public void clean_worker_ab(ActionEvent e) {
        Nam_wor_ab.clear();
        ID_Wo_Ab.clear();
        loadworkersabFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;

        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }

        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip42.setFill(new ImagePattern(emptyImage));
        photo_student13.setImage(emptyImage);

    }

    public void load_worker_ex(String URL) {
        Nat_id_card_ex.setCellValueFactory(new PropertyValueFactory<>("ID_worker_exlusion_archive"));
        worker_name_ex.setCellValueFactory(new PropertyValueFactory<>(" name"));
        worker_last_name_ex.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        date_ab_w_ex.setCellValueFactory(new PropertyValueFactory<>("date_exlusion_archive"));
        room_ab_w_ex.setCellValueFactory(new PropertyValueFactory<>("Room"));
        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT worker_Nat_ID,name,last_name,exclusion_date,room_Room_room  FROM exclusion where worker_Nat_ID is not null ");
            ObservableList<exulusion_worker> workers = FXCollections.observableArrayList();
            while (rs.next()) {
                exulusion_worker workersex = new exulusion_worker(
                        rs.getString("name"),
                        rs.getString("last_name"),
                        rs.getString("exclusion_date"),
                        rs.getString("worker_Nat_ID"),
                        rs.getString("room_Room_room"));
                workers.add(workersex);
            }
            table_worker_ex.setItems(workers);
            if (workers == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (workers != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void load_student_ex(String URL) {
        ID_student_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("ID_student_exlusion_archive"));
        Name_student_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_student_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        date_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("date_exlusion_archive"));
        room_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("Room"));
        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT student_ID_student,name,last_name,exclusion_date,room_Room_room  FROM exclusion where student_ID_student is not null ");
            ObservableList<exlusion_archive> workers = FXCollections.observableArrayList();
            while (rs.next()) {
                exlusion_archive workersex = new exlusion_archive(
                        rs.getString("name"),
                        rs.getString("last_name"),
                        rs.getString("exclusion_date"),
                        rs.getString("student_ID_student"),
                        rs.getString("room_Room_room"));
                workers.add(workersex);
            }
            table_exlusion_archive.setItems(workers);
            if (workers == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (workers != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void scherch_workers_ex_by_ID_FromDatabase(String URL, String ID_Ab) {
        Nat_id_card_ex.setCellValueFactory(new PropertyValueFactory<>("ID_worker_exlusion_archive"));
        worker_name_ex.setCellValueFactory(new PropertyValueFactory<>(" name"));
        worker_last_name_ex.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        date_ab_w_ex.setCellValueFactory(new PropertyValueFactory<>("date_exlusion_archive"));
        room_ab_w_ex.setCellValueFactory(new PropertyValueFactory<>("Room"));
        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT worker_Nat_ID,name,last_name,exclusion_date,room_Room_room  FROM exclusion where worker_Nat_ID= " + ID_Ab);
            ObservableList<exulusion_worker> workers = FXCollections.observableArrayList();
            while (rs.next()) {
                exulusion_worker workersex = new exulusion_worker(
                        rs.getString("name"),
                        rs.getString("last_name"),
                        rs.getString("exclusion_date"),
                        rs.getString("worker_Nat_ID"),
                        rs.getString("room_Room_room"));
                workers.add(workersex);
            }
            table_worker_ex.setItems(workers);
            if (workers == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (workers != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void scherch_workers_ex_by_name_FromDatabase(String URL, String ID_Ab) {
        Nat_id_card_ex.setCellValueFactory(new PropertyValueFactory<>("ID_worker_exlusion_archive"));
        worker_name_ex.setCellValueFactory(new PropertyValueFactory<>(" name"));
        worker_last_name_ex.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        date_ab_w_ex.setCellValueFactory(new PropertyValueFactory<>("date_exlusion_archive"));
        room_ab_w_ex.setCellValueFactory(new PropertyValueFactory<>("Room"));
        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT worker_Nat_ID,name,last_name,exclusion_date,room_Room_room  FROM exclusion where name= " + ID_Ab + "and worker_Nat_ID is not null");
            ObservableList<exulusion_worker> workers = FXCollections.observableArrayList();
            while (rs.next()) {
                exulusion_worker workersex = new exulusion_worker(
                        rs.getString("name"),
                        rs.getString("last_name"),
                        rs.getString("exclusion_date"),
                        rs.getString("worker_Nat_ID"),
                        rs.getString("room_Room_room"));
                workers.add(workersex);
            }
            table_worker_ex.setItems(workers);
            if (workers == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (workers != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private TextField ID_Worker_ex_ar;
    @FXML
    private TextField name_Worker_ex_ar;

    public void sherche_worker_ex_by_ID(ActionEvent e) {
        scherch_workers_ex_by_ID_FromDatabase(combo1.getSelectionModel().getSelectedItem().toString(), ID_Worker_ex_ar.getText());
    }

    public void sherche_worker_ex_by_name(ActionEvent e) {
        scherch_workers_ex_by_name_FromDatabase(combo1.getSelectionModel().getSelectedItem().toString(), name_Worker_ex_ar.getText());
    }

    private byte[] retrieveImageWorkerexFromDatabase(long WorkerId) {
        byte[] imageData = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem(), "root", "Saf3tyF!rst@2023");
            PreparedStatement statement = connection.prepareStatement("SELECT photo FROM exclusion WHERE  worker_Nat_ID= ?");
            statement.setLong(1, WorkerId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                imageData = resultSet.getBytes("photo");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(imageData);
        return imageData;
    }

    private byte[] retrieveImageStudentexFromDatabase(long studentId) {
        byte[] imageData = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem(), "root", "Saf3tyF!rst@2023");
            PreparedStatement statement = connection.prepareStatement("SELECT photo FROM exclusion WHERE  student_ID_student= ?");
            statement.setLong(1, studentId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                imageData = resultSet.getBytes("photo");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(imageData);
        return imageData;
    }

    @FXML
    private Rectangle clip61;
    @FXML
    private ImageView image_v11;
    @FXML
    private Rectangle clip4;
    @FXML
    private ImageView photo_student1;
    @FXML
    private Label re_stud_ex;
    @FXML
    private Label res_work_ex;

    public void scherch_worker_exl_res_FromDatabase(String URL, String ID_Ab) {
        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT reason  FROM exclusion where worker_Nat_ID= " + ID_Ab);
            if (rs.next()) {
                res_work_ex.setText(rs.getString("reason"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Handle_mouse5(MouseEvent event) {
        if (event.getClickCount() == 1) {
            exulusion_worker workersArchive = table_worker_ex.getSelectionModel().getSelectedItem();

            if (workersArchive != null) {
                scherch_worker_exl_res_FromDatabase(combo1.getSelectionModel().getSelectedItem().toString(), workersArchive.getID_worker_exlusion_archive());
                byte[] imageData = retrieveImageWorkerexFromDatabase(Long.parseLong(workersArchive.getID_worker_exlusion_archive()));


                if (imageData != null) {
                    Image image = new Image(new ByteArrayInputStream(imageData), 100, 100, false, true);

                    clip61.setFill(new ImagePattern(image));
                    image_v11.setImage(image);
                } else {
                    WritableImage writableImage = new WritableImage(100, 100);
                    Color defaultColor = Color.WHITE;

                    for (int x = 0; x < 100; x++) {
                        for (int y = 0; y < 100; y++) {
                            writableImage.getPixelWriter().setColor(x, y, defaultColor);
                        }
                    }

                    Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
                    clip61.setFill(new ImagePattern(emptyImage));
                    image_v11.setImage(emptyImage);
                }
            }
        }
    }

    public void scherch_student_exl_res_FromDatabase(String URL, String ID_Ab) {
        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT reason FROM exclusion WHERE student_ID_student = " + ID_Ab);
            if (rs.next()) {
                re_stud_ex.setText(rs.getString("reason"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Handle_mouse6(MouseEvent event) {

        if (event.getClickCount() == 1) {

            exlusion_archive StudentArchive = table_exlusion_archive.getSelectionModel().getSelectedItem();

            if (StudentArchive != null) {
                scherch_student_exl_res_FromDatabase(combo1.getSelectionModel().getSelectedItem().toString(), StudentArchive.getID_student_exlusion_archive());
                byte[] imageData = retrieveImageStudentexFromDatabase(Long.parseLong(StudentArchive.getID_student_exlusion_archive()));
                if (imageData != null) {
                    Image image = new Image(new ByteArrayInputStream(imageData), 100, 100, false, true);
                    clip4.setFill(new ImagePattern(image));
                    photo_student1.setImage(image);
                } else {
                    WritableImage writableImage = new WritableImage(100, 100);
                    Color defaultColor = Color.WHITE;
                    for (int x = 0; x < 100; x++) {
                        for (int y = 0; y < 100; y++) {
                            writableImage.getPixelWriter().setColor(x, y, defaultColor);
                        }
                    }
                    Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
                    clip4.setFill(new ImagePattern(emptyImage));
                    photo_student1.setImage(emptyImage);
                }
            }
        }
    }

    public void scherch_student_ex_ID(String URL, String ID) {
        ID_student_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("ID_student_exlusion_archive"));
        Name_student_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_student_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        date_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("date_exlusion_archive"));
        room_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("Room"));
        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT student_ID_student,name,last_name,exclusion_date,room_Room_room  FROM exclusion where student_ID_student= " + ID);
            ObservableList<exlusion_archive> workers = FXCollections.observableArrayList();
            while (rs.next()) {
                exlusion_archive workersex = new exlusion_archive(
                        rs.getString("name"),
                        rs.getString("last_name"),
                        rs.getString("exclusion_date"),
                        rs.getString("student_ID_student"),
                        rs.getString("room_Room_room"));
                workers.add(workersex);
            }
            table_exlusion_archive.setItems(workers);
            if (workers == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (workers != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void scherch_student_ex_name(String URL, String name) {
        ID_student_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("ID_student_exlusion_archive"));
        Name_student_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_student_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        date_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("date_exlusion_archive"));
        room_exlusion_archive.setCellValueFactory(new PropertyValueFactory<>("Room"));
        String l = URL;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + l, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT student_ID_student,name,last_name,exclusion_date,room_Room_room  FROM exclusion where name= " + name + "and student_ID_student is not null ");
            ObservableList<exlusion_archive> workers = FXCollections.observableArrayList();
            while (rs.next()) {
                exlusion_archive workersex = new exlusion_archive(
                        rs.getString("name"),
                        rs.getString("last_name"),
                        rs.getString("exclusion_date"),
                        rs.getString("student_ID_student"),
                        rs.getString("room_Room_room"));
                workers.add(workersex);
            }
            table_exlusion_archive.setItems(workers);
            if (workers == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (workers != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @FXML
    private TextField ST_id_Ex;
    @FXML
    private TextField ST_name_EX;

    public void St_id_ex_sh(ActionEvent e) {
        scherch_student_ex_ID(combo1.getSelectionModel().getSelectedItem().toString(), ST_id_Ex.getText());
    }

    public void St_ex_name_sh(ActionEvent e) {
        scherch_student_ex_name(combo1.getSelectionModel().getSelectedItem().toString(), ST_name_EX.getText());
    }

    public void clean_ex_st_Element(ActionEvent e) {
        ST_id_Ex.clear();
        ST_name_EX.clear();
        re_stud_ex.setText("سبب الاقصاء");
        load_student_ex(combo1.getSelectionModel().getSelectedItem().toString());
        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }
        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip4.setFill(new ImagePattern(emptyImage));
        photo_student1.setImage(emptyImage);


    }

    public void clean_ex_worker_Element(ActionEvent e) {
        ID_Worker_ex_ar.clear();
        name_Worker_ex_ar.clear();
        res_work_ex.setText("سبب الاقصاء");
        load_worker_ex(combo1.getSelectionModel().getSelectedItem().toString());
        WritableImage writableImage = new WritableImage(100, 100);
        Color defaultColor = Color.WHITE;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                writableImage.getPixelWriter().setColor(x, y, defaultColor);
            }
        }
        Image emptyImage = SwingFXUtils.toFXImage(SwingFXUtils.fromFXImage(writableImage, null), null);
        clip61.setFill(new ImagePattern(emptyImage));
        image_v11.setImage(emptyImage);
    }

    @FXML
    private ComboBox<String> ch_req;
    @FXML
    private TextField st_id_req;
    @FXML
    private TextField Nat_ID_req;
    @FXML
    private Label name_req;
    @FXML
    private Label lname_req;

    @FXML
    private Label room_req;
    @FXML
    private TextField date_req;
    @FXML
    private TextArea request;
    @FXML
    private Button sh_1;
    @FXML
    private Button sh_2;

    public void sh_per_req(ActionEvent e) {
        if (ch_req.getSelectionModel().getSelectedItem().toString().equals("طالب")) {
            sh_1.setDisable(false);
            st_id_req.setDisable(false);
            sh_2.setDisable(true);
            Nat_ID_req.setDisable(true);

        } else if (ch_req.getSelectionModel().getSelectedItem().toString().equals("عامل")) {
            sh_2.setDisable(false);
            Nat_ID_req.setDisable(false);
            sh_1.setDisable(true);
            st_id_req.setDisable(true);
        }

    }

    public void sh_persen_st_req(ActionEvent e) {

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM student WHERE ID_student = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, st_id_req.getText());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                name_req.setText(rs.getString("student_name"));
                lname_req.setText(rs.getString("student_last_name"));
                room_req.setText(rs.getString("room_Num_room"));
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    public void sh_persen_worker_req(ActionEvent e) {

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            String query = "SELECT * FROM worker WHERE National_id_card_number = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, Nat_ID_req.getText());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                name_req.setText(rs.getString("worker_name"));
                lname_req.setText(rs.getString("worker_last_name"));
                room_req.setText(rs.getString("room_Num_room"));
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void add_maintenance_requested(ActionEvent e) {

        if (ch_req.getSelectionModel().getSelectedItem().toString().equals("طالب")) {
            String name_database = combo1.getSelectionModel().getSelectedItem().toString();
            String id = st_id_req.getText();
            String name = name_req.getText();
            String lname = lname_req.getText();
            String date = date_req.getText();
            String Room = room_req.getText();
            String RequestDescription = request.getText();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date utilDate = null;
            try {
                utilDate = formatter.parse(date);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

            java.sql.Date sqlDate = null;
            if (utilDate != null) {
                long millis = utilDate.getTime();
                sqlDate = new java.sql.Date(millis);
            }

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
                PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO maintenancerequested (Name,last_name,RequestDescription,requestsData,student_ID_student,room_Num_room) VALUES (?, ?, ?, ?, ?,?)");
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, lname);
                preparedStatement.setString(3, RequestDescription);
                preparedStatement.setDate(4, sqlDate);
                preparedStatement.setString(5, id);
                preparedStatement.setString(6, Room);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("تمت العملية");
                    alert.setHeaderText(null);
                    alert.setContentText("تم طلب الصيانة بنجاح");
                    alert.showAndWait();

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else if (ch_req.getSelectionModel().getSelectedItem().toString().equals("عامل")) {

            String name_database = combo1.getSelectionModel().getSelectedItem().toString();
            String id = Nat_ID_req.getText();
            String name = name_req.getText();
            String lname = lname_req.getText();
            String date = date_req.getText();
            String Room = room_req.getText();
            String RequestDescription = request.getText();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date utilDate = null;
            try {
                utilDate = formatter.parse(date);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

            java.sql.Date sqlDate = null;
            if (utilDate != null) {
                long millis = utilDate.getTime();
                sqlDate = new java.sql.Date(millis);
            }
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + name_database, "root", "Saf3tyF!rst@2023")) {
                PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO maintenancerequested (Name,last_name,RequestDescription,requestsData,worker_National_id_card_number,room_Num_room) VALUES (?, ?, ?, ?, ?,?)");
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, lname);
                preparedStatement.setString(3, RequestDescription);
                preparedStatement.setDate(4, sqlDate);
                preparedStatement.setString(5, id);
                preparedStatement.setString(6, Room);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("تمت العملية");
                    alert.setHeaderText(null);
                    alert.setContentText("تم طلب الصيانة بنجاح");
                    alert.showAndWait();

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }


    public void Action_clean_panel_request_manit(ActionEvent e) {
        st_id_req.clear();
        Nat_ID_req.clear();

        request.clear();
        name_req.setText("الاسم");
        lname_req.setText("اللقب");
        room_req.setText("الغرفة");
        date_req.clear();
        ch_req.setPromptText("إختر: طالب / عامل");
        ch_req.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText("إختر: طالب / عامل");
                } else {
                    setText(item);
                }
            }
        });
        Nat_ID_req.setDisable(true);
        st_id_req.setDisable(true);
        sh_1.setDisable(true);
        sh_2.setDisable(true);
    }

    public void load_maintenancerequested(String url) {
        idrequested0.setCellValueFactory(new PropertyValueFactory<>("idrequested"));
        name_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        RequestDescription_archive0.setCellValueFactory(new PropertyValueFactory<>("RequestDescription"));
        date_requested_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("date_requested"));
        worker_Nat_id_card_number0.setCellValueFactory(new PropertyValueFactory<>("worker_National_id_card_number"));
        ID_Student_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("ID_Student"));
        Room_requst0.setCellValueFactory(new PropertyValueFactory<>("room_number"));
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + url, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM maintenancerequested  ");
            ObservableList<maintenance_requests_archive> maintenanceRequestsArchives = FXCollections.observableArrayList();
            while (rs.next()) {
                maintenance_requests_archive workersex = new maintenance_requests_archive(
                        rs.getInt("idrequested"),
                        rs.getString("Name"),
                        rs.getString("last_name"),
                        rs.getString("RequestDescription"),
                        rs.getString("requestsData"),
                        rs.getString("worker_National_id_card_number"),
                        rs.getString("student_ID_student"),
                        rs.getString("room_Num_room"));
                maintenanceRequestsArchives.add(workersex);
            }
            table_maintenance_requests_archive0.setItems(maintenanceRequestsArchives);
            if (maintenanceRequestsArchives == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (maintenanceRequestsArchives != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private TextField ID_student_requst1;
    @FXML
    private TextField ID_requst_2;
    @FXML
    private TextField Nat_worker_requst_2;

    public void sh_maintenancerequested_by_ID_student(String url, String ID_student) {
        idrequested0.setCellValueFactory(new PropertyValueFactory<>("idrequested"));
        name_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        RequestDescription_archive0.setCellValueFactory(new PropertyValueFactory<>("RequestDescription"));
        date_requested_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("date_requested"));
        worker_Nat_id_card_number0.setCellValueFactory(new PropertyValueFactory<>("worker_National_id_card_number"));
        ID_Student_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("ID_Student"));
        Room_requst0.setCellValueFactory(new PropertyValueFactory<>("room_number"));
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + url, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM maintenancerequested where student_ID_student= " + ID_student);
            ObservableList<maintenance_requests_archive> maintenanceRequestsArchives = FXCollections.observableArrayList();
            while (rs.next()) {
                maintenance_requests_archive workersex = new maintenance_requests_archive(
                        rs.getInt("idrequested"),
                        rs.getString("Name"),
                        rs.getString("last_name"),
                        rs.getString("RequestDescription"),
                        rs.getString("requestsData"),
                        rs.getString("worker_National_id_card_number"),
                        rs.getString("student_ID_student"),
                        rs.getString("room_Num_room"));
                maintenanceRequestsArchives.add(workersex);
            }
            table_maintenance_requests_archive0.setItems(maintenanceRequestsArchives);
            if (maintenanceRequestsArchives == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (maintenanceRequestsArchives != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void sh_maintenancerequested_by_ID_requst(String url,String ID_request){
        idrequested0.setCellValueFactory(new PropertyValueFactory<>("idrequested"));
        name_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        RequestDescription_archive0.setCellValueFactory(new PropertyValueFactory<>("RequestDescription"));
        date_requested_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("date_requested"));
        worker_Nat_id_card_number0.setCellValueFactory(new PropertyValueFactory<>("worker_National_id_card_number"));
        ID_Student_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("ID_Student"));
        Room_requst0.setCellValueFactory(new PropertyValueFactory<>("room_number"));
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + url, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM maintenancerequested where idrequested= "+ID_request);
            ObservableList<maintenance_requests_archive> maintenanceRequestsArchives = FXCollections.observableArrayList();
            while (rs.next()) {
                maintenance_requests_archive workersex  = new  maintenance_requests_archive(
                        rs.getInt("idrequested"),
                        rs.getString("Name"),
                        rs.getString("last_name"),
                        rs.getString("RequestDescription"),
                        rs.getString("requestsData"),
                        rs.getString("worker_National_id_card_number"),
                        rs.getString("student_ID_student"),
                        rs.getString("room_Num_room"));
                maintenanceRequestsArchives.add(workersex);
            }
            table_maintenance_requests_archive0.setItems(maintenanceRequestsArchives);
            if (maintenanceRequestsArchives == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (maintenanceRequestsArchives != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void sh_maintenancerequested_by_Nat_worker_request(String url,String ID_Nat_request){
        idrequested0.setCellValueFactory(new PropertyValueFactory<>("idrequested"));
        name_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        RequestDescription_archive0.setCellValueFactory(new PropertyValueFactory<>("RequestDescription"));
        date_requested_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("date_requested"));
        worker_Nat_id_card_number0.setCellValueFactory(new PropertyValueFactory<>("worker_National_id_card_number"));
        ID_Student_maintenance_requests_archive0.setCellValueFactory(new PropertyValueFactory<>("ID_Student"));
        Room_requst0.setCellValueFactory(new PropertyValueFactory<>("room_number"));
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + url, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM maintenancerequested where worker_National_id_card_number= "+ID_Nat_request);
            ObservableList<maintenance_requests_archive> maintenanceRequestsArchives = FXCollections.observableArrayList();
            while (rs.next()) {
                maintenance_requests_archive workersex  = new  maintenance_requests_archive(
                        rs.getInt("idrequested"),
                        rs.getString("Name"),
                        rs.getString("last_name"),
                        rs.getString("RequestDescription"),
                        rs.getString("requestsData"),
                        rs.getString("worker_National_id_card_number"),
                        rs.getString("student_ID_student"),
                        rs.getString("room_Num_room"));
                maintenanceRequestsArchives.add(workersex);
            }
            table_maintenance_requests_archive0.setItems(maintenanceRequestsArchives);
            if (maintenanceRequestsArchives == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if (maintenanceRequestsArchives != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void sh1(ActionEvent e){
        sh_maintenancerequested_by_ID_student (combo1.getSelectionModel().getSelectedItem().toString(),ID_student_requst1.getText());
    }
    public void sh2(ActionEvent e){
        sh_maintenancerequested_by_ID_requst (combo1.getSelectionModel().getSelectedItem().toString(),ID_requst_2.getText());
    }
    public void sh3(ActionEvent e){
        sh_maintenancerequested_by_Nat_worker_request (combo1.getSelectionModel().getSelectedItem().toString(),Nat_worker_requst_2.getText());
    }
@FXML
    private Label requst_label2;
    public void clean_mant(ActionEvent e){
        ID_student_requst1.clear();
        ID_requst_2.clear();
        Nat_worker_requst_2.clear();
        requst_label2.setText("الطلب");
        load_maintenancerequested(combo1.getSelectionModel().getSelectedItem().toString());
    }
    public void requset_text_area(String ID_request){
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM maintenancerequested where idrequested= "+ID_request);

            while (rs.next()) {


                requst_label2.setText(rs.getString("RequestDescription"));


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
@FXML
public  void request(MouseEvent event){


        if (event.getClickCount() == 1) {

            maintenance_requests_archive maintenance_requests = table_maintenance_requests_archive0.getSelectionModel().getSelectedItem();

            if (maintenance_requests != null) {
                requset_text_area(String.valueOf(maintenance_requests.getIdrequested()));
            }
}}

    public void sing_out(MouseEvent e){
        Main_APP.Home_page.hide();
        Main_APP.login_stage.show();

    }



}



































