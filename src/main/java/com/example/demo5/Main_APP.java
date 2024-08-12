package com.example.demo5;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;

public class Main_APP extends Application {
    private double x=0;
    private double y=0;
 public static Stage login_stage,add_admine,show_inf_work,dialoge_forgetPassword,create_account,show_inf_stud,Home_page,crate_data_base,Home_page2;



    @Override
    public void start(Stage stage) throws IOException {
        Image icon = new Image("file:C:\\Users\\Ahmed Elamine\\IdeaProjects\\demo5\\src\\main\\resources\\com\\example\\demo5\\UAS.png");
        stage.getIcons().add(icon);
        stage.setTitle("University Accommodation service");
        Main_APP.login_stage=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent root = fxmlLoader.load();
        Login_Controller Controller = fxmlLoader.getController();

        login_stage.setOnHidden(ec -> {
                Platform.runLater(() -> {
                    Controller.password_accont1.clear();
                    Controller.password_accont.clear();
                    Controller.tfUsername.clear();
                    Controller.rool.valueProperty().set(null);
                    Controller.rool.setPromptText("دور المستعمل");
                    Controller.rool.setButtonCell(new ListCell<String>() {
                        @Override
                        protected void updateItem(String item, boolean empty) {
                            super.updateItem(item, empty);
                            if (empty || item == null) {
                                setText("دور المستعمل");
                            } else {
                                setText(item);
                            }
                        }
                    });
                });
            }
        );


        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application_design.css").toExternalForm());
        FadeTransition a=new FadeTransition(Duration.seconds(2),scene.getRoot());
        a.setFromValue(0);
        a.setToValue(1);
        a.play();
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();

        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                x= mouseEvent.getSceneX();
                y=mouseEvent.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.setX(mouseEvent.getScreenX()-x);
                stage.setY(mouseEvent.getScreenY()-y);
            }
        });

    }
    public void Start_dialoge_forgetPassword(Stage stage)throws IOException{
        Main_APP.dialoge_forgetPassword=stage;
        FXMLLoader F= new FXMLLoader(getClass().getResource("forgetpassword.fxml"));
        Parent root =F.load();
        Scene scene=new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application_design.css").toExternalForm());
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initOwner(login_stage);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        root.setStyle("-fx-background-color: transparent;");
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                x= mouseEvent.getSceneX();
                y=mouseEvent.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.setX(mouseEvent.getScreenX()-x);
                stage.setY(mouseEvent.getScreenY()-y);
            }
        });



    }
    public void start_create_account(Stage stage) throws IOException {
        Image icon = new Image("file:C:\\Users\\Ahmed Elamine\\IdeaProjects\\demo5\\src\\main\\resources\\com\\example\\demo5\\UAS.png");
        stage.getIcons().add(icon);
        stage.setTitle("University Accommodation service");
        Main_APP.create_account=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create_account.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application_design.css").toExternalForm());
        FadeTransition a=new FadeTransition(Duration.seconds(2),scene.getRoot());
        a.setFromValue(0);
        a.setToValue(1);
        a.play();
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initOwner(login_stage);
        stage.setScene(scene);
        Main_APP.login_stage.hide();
        stage.show();


        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                x= mouseEvent.getSceneX();
                y=mouseEvent.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.setX(mouseEvent.getScreenX()-x);
                stage.setY(mouseEvent.getScreenY()-y);
            }
        });

    }
    public void start_Home_page(Stage stage) throws IOException {
        Image icon = new Image("file:C:\\Users\\Ahmed Elamine\\IdeaProjects\\demo5\\src\\main\\resources\\com\\example\\demo5\\UAS.png");
        stage.getIcons().add(icon);
        stage.setTitle("University Accommodation service");
        Main_APP.Home_page=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        Parent root = fxmlLoader.load();
        HomePage_controller homePageController = fxmlLoader.getController();
        Login_Controller loginController = new Login_Controller();
        create_account_controller createaccountcontroller= new create_account_controller();
        if(loginController.b==1){
        String username = loginController.a;
        homePageController.setUsername(username);}
        if( createaccountcontroller.c==1){
            String username1= createaccountcontroller.d;
            homePageController.setUsername(username1);
        }
        if(crate_data_base_controller.Home==true){
            homePageController.populateComboBoxFromDatabase(homePageController.combo1);
                homePageController.populateComboBoxFromDatabase(homePageController.combo2);

        }
        Scene scene = new Scene(root,1050,680);
        scene.getStylesheets().add(getClass().getResource("application_design.css").toExternalForm());
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initStyle(StageStyle.TRANSPARENT);
        FadeTransition a=new FadeTransition(Duration.seconds(2),scene.getRoot());
        a.setFromValue(0);
        a.setToValue(1);
        a.play();
        stage.setScene(scene);
        stage.show();

        root.setStyle("-fx-background-color: transparent;");


        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                x= mouseEvent.getSceneX();
                y=mouseEvent.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.setX(mouseEvent.getScreenX()-x);
                stage.setY(mouseEvent.getScreenY()-y);
            }
        });

    }
    public void start_create_data_base(Stage stage) throws IOException {
        Main_APP.crate_data_base=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create_data_base.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application_design.css").toExternalForm());
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initOwner(Main_APP.Home_page);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();
        root.setStyle("-fx-background-color: transparent;");
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                x= mouseEvent.getSceneX();
                y=mouseEvent.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.setX(mouseEvent.getScreenX()-x);
                stage.setY(mouseEvent.getScreenY()-y);
            }
        });

    }
    public void start_Home_page2(Stage stage) throws IOException {
        Image icon = new Image("file:C:\\Users\\Ahmed Elamine\\IdeaProjects\\demo5\\src\\main\\resources\\com\\example\\demo5\\UAS.png");
        stage.getIcons().add(icon);
        stage.setTitle("University Accommodation service");
        Main_APP.Home_page2=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomePage2.fxml"));
        Parent root = fxmlLoader.load();
        HomePage2_controller homePageController = fxmlLoader.getController();
        Login_Controller loginController = new Login_Controller();
        create_account_controller createaccountcontroller= new create_account_controller();
        if(loginController.b==1){
            String username = loginController.a;
            homePageController.setUsername(username);}
        if( createaccountcontroller.c==1){
            String username1= createaccountcontroller.d;
            homePageController.setUsername(username1);
        }
        if(crate_data_base_controller.Home==true){
            homePageController.populateComboBoxFromDatabase(homePageController.combo1);
            homePageController.populateComboBoxFromDatabase(homePageController.combo2);

        }
        Scene scene = new Scene(root,1050,680);
        scene.getStylesheets().add(getClass().getResource("application_design.css").toExternalForm());
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initStyle(StageStyle.TRANSPARENT);
        FadeTransition a=new FadeTransition(Duration.seconds(2),scene.getRoot());
        a.setFromValue(0);
        a.setToValue(1);
        a.play();
        stage.setScene(scene);
        stage.show();

        root.setStyle("-fx-background-color: transparent;");


        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                x= mouseEvent.getSceneX();
                y=mouseEvent.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.setX(mouseEvent.getScreenX()-x);
                stage.setY(mouseEvent.getScreenY()-y);
            }
        });

    }
    public void start_show_inf_stud(Stage stage) throws IOException {
        Main_APP.show_inf_stud=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("show_information_stud.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root ,741,600);
        scene.getStylesheets().add(getClass().getResource("application_design.css").toExternalForm());
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initOwner(Main_APP.Home_page);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();

        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                x= mouseEvent.getSceneX();
                y=mouseEvent.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.setX(mouseEvent.getScreenX()-x);
                stage.setY(mouseEvent.getScreenY()-y);
            }
        });
    }
    public void start_show_inf_work(Stage stage) throws IOException {
        Main_APP.show_inf_work=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("show_information_work.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application_design.css").toExternalForm());
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initOwner(Main_APP.Home_page);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        root.setStyle("-fx-background-color: transparent;");
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                x= mouseEvent.getSceneX();
                y=mouseEvent.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.setX(mouseEvent.getScreenX()-x);
                stage.setY(mouseEvent.getScreenY()-y);
            }
        });
    }
    public void start_add_admine(Stage stage) throws IOException {
        Main_APP.add_admine=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add_admin.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application_design.css").toExternalForm());
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.initOwner(Main_APP.Home_page);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        root.setStyle("-fx-background-color: transparent;");
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                x= mouseEvent.getSceneX();
                y=mouseEvent.getSceneY();
            }
        });
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.setX(mouseEvent.getScreenX()-x);
                stage.setY(mouseEvent.getScreenY()-y);
            }
        });
    }
    public static void main(String[] args) {
        launch();
    }
}