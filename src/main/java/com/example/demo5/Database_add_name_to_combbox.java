package com.example.demo5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class Database_add_name_to_combbox {


     public static  void onDatabaseCreated( ComboBox<String>combo1,ComboBox<String>combo2){
         ObservableList<String> databaseNames = FXCollections.observableArrayList();
        String A= crate_data_base_controller.a;
         databaseNames.add(A);
         combo1.getItems().addAll(databaseNames);
         combo2.getItems().addAll(databaseNames);
     }
}

