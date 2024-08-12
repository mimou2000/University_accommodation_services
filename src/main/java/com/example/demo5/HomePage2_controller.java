package com.example.demo5;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.util.StringConverter;
import org.apache.poi.ss.usermodel.Row;
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
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

;

public class HomePage2_controller {

    @FXML
    private BorderPane home_pane;
    @FXML
    private AnchorPane AnchorPane1;

    @FXML
    private AnchorPane AnchorPane2;

static  int V1=0;


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
    private Label button_archives_resid;



    @FXML
    private Label button_maintnance_resid;


    @FXML
    private Label button_sing_out;

    @FXML
    private Label button_table_resid;

    @FXML
    private Label close;
    //قائمة الرئسية





    @FXML
    private Button page_archive_excluded_students;

    @FXML
    private Button page_archive_students1;

    @FXML
    private Button page_archive_students2;

    @FXML
    private Button page_archive_worker;



    @FXML
    private Button page_create_maintenance_request;



    @FXML
    private Button page_maintenance_requests_archive;

    static String u;
    static int v=0;
     static long a;
static String A;
    @FXML
    private Button student_table;


    @FXML
    private Button workers_table;
    @FXML
    private Label username1;
    @FXML
    private Button minus;

    @FXML
    private AnchorPane AnchorPane111;

    public void Work_ex(ActionEvent e){
        AnchorPane9.setVisible(false);
        AnchorPane111.setVisible(true);

    }
    public void Workers_ex(ActionEvent e){
        AnchorPane9.setVisible(true);
        AnchorPane111.setVisible(false);
    }
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

    public void worker_tableOnMouseClicked(MouseEvent e) {
        AnchorPane1.setVisible(false);
        AnchorPane2.setVisible(true);
    }

    public void handleButtonClick(MouseEvent event) {
        button_table_resid.setOnMouseClicked(e -> {
            button_table_resid.setStyle("-fx-background-radius:0px  11.5px 11.5px 0px;" + " -fx-text-fill: black;" + "-fx-background-color: white;");

            button_archives_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");

            button_maintnance_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");

            button_sing_out.setStyle("-fx-text-fill: white;" + " -fx-background-color: transparent;");
            AnchorPane1.setVisible(true);
            AnchorPane2.setVisible(false);
            AnchorPane111.setVisible(false);
            AnchorPane9.setVisible(false);
            AnchorPane10.setVisible(false);
            AnchorPane11.setVisible(false);
            AnchorPane12.setVisible(false);
            AnchorPane13.setVisible(false);

        });



        button_archives_resid.setOnMouseClicked(e -> {
            button_table_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;" + "-fx-background-radius:0px;");
            button_archives_resid.setStyle("-fx-background-radius:0px  11.5px 11.5px 0px;" + " -fx-text-fill: black;" + "-fx-background-color: white;");
            button_maintnance_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_sing_out.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            AnchorPane1.setVisible(false);
            AnchorPane2.setVisible(false);
            AnchorPane9.setVisible(true);
            AnchorPane10.setVisible(false);
            AnchorPane11.setVisible(false);
            AnchorPane12.setVisible(false);
            AnchorPane13.setVisible(false);
            AnchorPane111.setVisible(false);
        });
        button_maintnance_resid.setOnMouseClicked(e -> {
            button_table_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;" + "-fx-background-radius:0px;");
            button_archives_resid.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            button_maintnance_resid.setStyle("-fx-background-radius:0px  11.5px 11.5px 0px;" + " -fx-text-fill: black;" + "-fx-background-color: white;");
            button_sing_out.setStyle("-fx-text-fill: white;" + " -fx-background-color:transparent;");
            AnchorPane1.setVisible(false);
            AnchorPane2.setVisible(false);
            AnchorPane111.setVisible(false);
            AnchorPane9.setVisible(false);
            AnchorPane10.setVisible(false);
            AnchorPane11.setVisible(false);
            AnchorPane12.setVisible(true);
            AnchorPane13.setVisible(false);

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

        minus.setOnMouseClicked(e -> {
            Main_APP.Home_page2.setIconified(true);
        });









    }



    @FXML
    public ComboBox<String> combo1;



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
@FXML
private TableColumn<student,String> State_student;
    @FXML
    private TableColumn<student,String>  Branch_student;
    @FXML
    private TableColumn<student,String>  level_student;
    public void initialize() {
        populateComboBoxFromDatabase(combo1);
        populateComboBoxFromDatabase(combo2);
        loadStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadnumberStudentsFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadworkersabFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadStudentsabFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        loadnumberWorkersFromDatabase(combo1.getSelectionModel().getSelectedItem().toString());
        load_worker_ex(combo1.getSelectionModel().getSelectedItem().toString());
        load_maintenancerequested(combo1.getSelectionModel().getSelectedItem().toString());
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
        State_student.setCellValueFactory(new PropertyValueFactory<>("state_student"));;
        Branch_student.setCellValueFactory(new PropertyValueFactory<>("branch_student"));;
        level_student.setCellValueFactory(new PropertyValueFactory<>("level_student"));;
        //---------------------------------------------------------------------------//
        ID_student_archive.setCellValueFactory(new PropertyValueFactory<>("ID"));
        Name_student_archive.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_student_archive.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        year_of_ab_St.setCellValueFactory(new PropertyValueFactory<>("date_of_ab"));
        re_ab_st.setCellValueFactory(new PropertyValueFactory<>("resion_ab"));
        room_ab_st.setCellValueFactory(new PropertyValueFactory<>("Room"));
        //-------------------------------------------------------------------------//
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

    //-------------------------------------------------------------------------------//
        Nat_id_card_ex.setCellValueFactory(new PropertyValueFactory<>("ID_worker_exlusion_archive"));
        worker_name_ex.setCellValueFactory(new PropertyValueFactory<>(" name"));
        worker_last_name_ex.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        date_ab_w_ex.setCellValueFactory(new PropertyValueFactory<>("date_exlusion_archive"));
        room_ab_w_ex.setCellValueFactory(new PropertyValueFactory<>("Room"));
        //--------------------------------------------------------------------------------------------//
        idrequested2.setCellValueFactory(new PropertyValueFactory<>("idrequested"));
        name_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        RequestDescription_archive2.setCellValueFactory(new PropertyValueFactory<>("RequestDescription"));
        date_requested_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("date_requested"));
        worker_Nat_id_card_number2.setCellValueFactory(new PropertyValueFactory<>("worker_National_id_card_number"));
        ID_Student_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("ID_Student"));
        Room_requst2.setCellValueFactory(new PropertyValueFactory<>("room_number"));
    }

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
    private TableColumn<student_archive, String> re_ab_st;
    @FXML
    private TableColumn<student_archive, String>  room_ab_st;
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
    private TableColumn<workers_archive,String> room_ab_w_archive;
    //-------------------------------------------------------------------------------//
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
    private TableColumn<exulusion_worker,String> room_ab_w_ex;

    //-------------------------------------------------------------------------------//
    @FXML
    private TableView<exlusion_archive> table_exlusion_archive;
    @FXML
    private TableColumn<exlusion_archive, String> ID_student_exlusion_archive;
    @FXML
    private TableColumn<exlusion_archive, String> Name_student_exlusion_archive;
    @FXML
    private TableColumn<exlusion_archive,String>room_exlusion_archive;
    @FXML
    private TableColumn<exlusion_archive, String> date_exlusion_archive;
    @FXML
    private TableColumn<exlusion_archive, String> last_name_student_exlusion_archive;
    //---------------------------------------------------------------------------------------//
    @FXML
    private TableView<maintenance_requests_archive> table_maintenance_requests_archive2;
    @FXML
    private TableColumn<maintenance_requests_archive, String> idrequested2;
    @FXML
    private TableColumn<maintenance_requests_archive, String> name_maintenance_requests_archive2;
    @FXML
    private TableColumn<maintenance_requests_archive, String> last_name_maintenance_requests_archive2;
    @FXML
    private TableColumn<maintenance_requests_archive, String> RequestDescription_archive2;
    @FXML
    private TableColumn<maintenance_requests_archive, String> date_requested_maintenance_requests_archive2;
    @FXML
    private TableColumn<maintenance_requests_archive, String> worker_Nat_id_card_number2;
    @FXML
    private TableColumn<maintenance_requests_archive, String> ID_Student_maintenance_requests_archive2;
    @FXML
    private TableColumn<maintenance_requests_archive,String>Room_requst2;
    //---------------------------------------------------------------------//
    @FXML
    private Rectangle clip3;
    @FXML
    private ImageView photo_student3;
    @FXML
    private ScrollPane scroll1;
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
        u=combo1.getSelectionModel().getSelectedItem().toString();
        if (event.getClickCount() == 1) {

            student Student = table_student.getSelectionModel().getSelectedItem();
            a=Student.getId();
            v=1;
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
        }else  if (event.getClickCount() == 2){
            student Student = table_student.getSelectionModel().getSelectedItem();
            a=Student.getId();
            v=1;
            Stage stage=new Stage();
            Main_APP a=new Main_APP();
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
                    String query = "INSERT INTO student (student_name, student_last_name, date_of_birth, place_of_birth, nationality, Bac_certificate_number, Year_of_obtaining_a_bac, Address, Specialization, Mother_name, Mother_last_name, father_name, father_last_name, School_certificate_number) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement pstmt = con.prepareStatement(query);

                    pstmt.setString(1, row.getCell(0) != null ? row.getCell(0).getStringCellValue() : ""); // student_name
                    pstmt.setString(2, row.getCell(1) != null ? row.getCell(1).getStringCellValue() : ""); // student_last_name
                    pstmt.setDate(3, row.getCell(2) != null ? new java.sql.Date(row.getCell(2).getDateCellValue().getTime()) : null); // date_of_birth
                    pstmt.setString(4, row.getCell(3) != null ? row.getCell(3).getStringCellValue() : ""); // place_of_birth
                    pstmt.setString(5, row.getCell(4) != null ? row.getCell(4).getStringCellValue() : ""); // nationality
                    pstmt.setLong(6, row.getCell(5) != null ? (long) row.getCell(5).getNumericCellValue() : 0); // Bac_certificate_number// Year_of_obtaining_a_bac
                    pstmt.setInt(7, (int) row.getCell(6).getNumericCellValue());
                    pstmt.setString(8, row.getCell(7) != null ? row.getCell(7).getStringCellValue() : "");// Address
                    pstmt.setString(9, row.getCell(8) != null ? row.getCell(8).getStringCellValue() : ""); // Specialization
                    pstmt.setString(10, row.getCell(9) != null ? row.getCell(9).getStringCellValue() : ""); // Mother_name
                    pstmt.setString(11, row.getCell(10) != null ? row.getCell(10).getStringCellValue() : ""); // Mother_last_name
                    pstmt.setString(12, row.getCell(11) != null ? row.getCell(11).getStringCellValue() : ""); // father_name
                    pstmt.setString(13, row.getCell(12) != null ? row.getCell(12).getStringCellValue() : ""); // father_last_name
                    pstmt.setString(14, row.getCell(13) != null ? row.getCell(13).getStringCellValue() : ""); // School_certificate_number

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
        State_student.setCellValueFactory(new PropertyValueFactory<>("state_student"));;
        Branch_student.setCellValueFactory(new PropertyValueFactory<>("branch_student"));;
        level_student.setCellValueFactory(new PropertyValueFactory<>("level_student"));;
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
            // افتح الاتصال بقاعدة البيانات وقم بتنفيذ استعلام SQL لاسترجاع الصورة
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem(), "root", "Saf3tyF!rst@2023");
            PreparedStatement statement = connection.prepareStatement("SELECT photo_student FROM student WHERE ID_student = ?");
            statement.setLong(1, studentId);
            ResultSet resultSet = statement.executeQuery();

            // إذا وُجد السجل، استرجع البيانات كبايتات
            if (resultSet.next()) {
                imageData = resultSet.getBytes("photo_student");
            }

            // أغلق الاتصال والعبارات
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
    @FXML
    private ComboBox number_block6;
    @FXML
    private ComboBox nomber_room_combo6;

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
                        rs.getString("room_Num_room"),
                        rs.getString("state"));
                workersList.add(Worker);
            }
            table_worker.setItems( workersList);
            if ( workersList == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if ( workersList != null) {
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
    public void Handle_clicke_mouse10(MouseEvent event){
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
    public void Handle_clicke_mouse11(MouseEvent event){
        String name_block= serche_block_student.getText();
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
            String query= "SELECT * FROM student WHERE room_Num_room LIKE ?";
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
                        rs.getString("level_student"));
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
    public void Handle_clicke_mouse12(MouseEvent event){
        String name_ID= serche_ID_student.getText();

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
                workersList.add(Worker);}
            table_worker.setItems( workersList);
            if ( workersList == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if ( workersList != null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scroll1.setFitToHeight(false);
                scroll1.setFitToWidth(false);}
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
            table_worker.setItems( workersList);
            if ( workersList == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if ( workersList != null) {
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
            table_worker.setItems( workersList);
            if ( workersList == null) {
                scroll1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
                scroll1.setFitToHeight(true);
                scroll1.setFitToWidth(true);
            } else if ( workersList != null) {
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
    public void HandleoneAction(ActionEvent event){
        u=combo1.getSelectionModel().getSelectedItem().toString();
        student Student = table_student.getSelectionModel().getSelectedItem();
        a=Student.getId();
        v=1;
        a=Student.getId();

        Stage stage=new Stage();
        Main_APP a=new Main_APP();
        try {
            a.start_show_inf_stud(stage);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
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
        idrequested2.setCellValueFactory(new PropertyValueFactory<>("idrequested"));
        name_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        RequestDescription_archive2.setCellValueFactory(new PropertyValueFactory<>("RequestDescription"));
        date_requested_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("date_requested"));
        worker_Nat_id_card_number2.setCellValueFactory(new PropertyValueFactory<>("worker_National_id_card_number"));
        ID_Student_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("ID_Student"));
        Room_requst2.setCellValueFactory(new PropertyValueFactory<>("room_number"));
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + url, "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM maintenancerequested  ");
            ObservableList<maintenance_requests_archive> maintenanceRequestsArchives = FXCollections.observableArrayList();
            while (rs.next()) {
                maintenance_requests_archive rsex = new maintenance_requests_archive(
                        rs.getInt("idrequested"),
                        rs.getString("Name"),
                        rs.getString("last_name"),
                        rs.getString("RequestDescription"),
                        rs.getString("requestsData"),
                        rs.getString("worker_National_id_card_number"),
                        rs.getString("student_ID_student"),
                        rs.getString("room_Num_room"));
                maintenanceRequestsArchives.add(rsex);
            }
            table_maintenance_requests_archive2.setItems(maintenanceRequestsArchives);
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
    private TextField ID_student_requst;
    @FXML
    private TextField ID_requst_1;
    @FXML
    private TextField Nat_worker_requst_1;

    public void sh_maintenancerequested_by_ID_student(String url, String ID_student) {
        idrequested2.setCellValueFactory(new PropertyValueFactory<>("idrequested"));
        name_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        RequestDescription_archive2.setCellValueFactory(new PropertyValueFactory<>("RequestDescription"));
        date_requested_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("date_requested"));
        worker_Nat_id_card_number2.setCellValueFactory(new PropertyValueFactory<>("worker_National_id_card_number"));
        ID_Student_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("ID_Student"));
        Room_requst2.setCellValueFactory(new PropertyValueFactory<>("room_number"));
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
            table_maintenance_requests_archive2.setItems(maintenanceRequestsArchives);
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
        idrequested2.setCellValueFactory(new PropertyValueFactory<>("idrequested"));
        name_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        RequestDescription_archive2.setCellValueFactory(new PropertyValueFactory<>("RequestDescription"));
        date_requested_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("date_requested"));
        worker_Nat_id_card_number2.setCellValueFactory(new PropertyValueFactory<>("worker_National_id_card_number"));
        ID_Student_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("ID_Student"));
        Room_requst2.setCellValueFactory(new PropertyValueFactory<>("room_number"));
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
            table_maintenance_requests_archive2.setItems(maintenanceRequestsArchives);
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
        idrequested2.setCellValueFactory(new PropertyValueFactory<>("idrequested"));
        name_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_name_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        RequestDescription_archive2.setCellValueFactory(new PropertyValueFactory<>("RequestDescription"));
        date_requested_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("date_requested"));
        worker_Nat_id_card_number2.setCellValueFactory(new PropertyValueFactory<>("worker_National_id_card_number"));
        ID_Student_maintenance_requests_archive2.setCellValueFactory(new PropertyValueFactory<>("ID_Student"));
        Room_requst2.setCellValueFactory(new PropertyValueFactory<>("room_number"));
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
            table_maintenance_requests_archive2.setItems(maintenanceRequestsArchives);
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
        sh_maintenancerequested_by_ID_student (combo1.getSelectionModel().getSelectedItem().toString(),ID_student_requst.getText());
    }
    public void sh2(ActionEvent e){
        sh_maintenancerequested_by_ID_requst (combo1.getSelectionModel().getSelectedItem().toString(),ID_requst_1.getText());
    }
    public void sh3(ActionEvent e){
        sh_maintenancerequested_by_Nat_worker_request (combo1.getSelectionModel().getSelectedItem().toString(),Nat_worker_requst_1.getText());
    }
    @FXML
    private Label requst_label;
    public void clean_mant(ActionEvent e){
        ID_student_requst.clear();
        ID_requst_1.clear();
        Nat_worker_requst_1.clear();
        requst_label.setText("الطلب");
        load_maintenancerequested(combo2.getSelectionModel().getSelectedItem().toString());
    }
    public void requset_text_area(String ID_request){
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + combo1.getSelectionModel().getSelectedItem().toString(), "root", "Saf3tyF!rst@2023")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM maintenancerequested where idrequested= "+ID_request);

            while (rs.next()) {


                requst_label.setText(rs.getString("RequestDescription"));


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public  void event_table_request1(MouseEvent event){


        if (event.getClickCount() == 1) {

            maintenance_requests_archive maintenance_requests = table_maintenance_requests_archive2.getSelectionModel().getSelectedItem();

            if (maintenance_requests != null) {
                requset_text_area(String.valueOf(maintenance_requests.getIdrequested()));
            }
        }}

    public void sing_out(MouseEvent e){
        Main_APP.Home_page2.hide();
        Main_APP.login_stage.show();}}





































