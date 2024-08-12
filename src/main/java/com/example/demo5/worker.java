package com.example.demo5;

import javafx.scene.control.cell.PropertyValueFactory;

public class worker {
     public String worker_name;
   public   String worker_last_name;
   public long National_id_card_number;
     public String date_of_birth;
    public String place_of_birth;
    public String Addreess;
  public String nationality;
    public String room_number;
    public String state;

    public void setAddreess(String addreess) {
        Addreess = addreess;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public worker() {}

    public worker(String worker_name, String worker_last_name, long national_id_card_number, String date_of_birth, String place_of_birth, String Addrees, String nationality,  String room_number,String state) {
        this.worker_name = worker_name;
        this.worker_last_name = worker_last_name;
        this.National_id_card_number = national_id_card_number;
        this.date_of_birth = date_of_birth;
        this.place_of_birth = place_of_birth;
        this.Addreess = Addrees;
        this.nationality = nationality;
        this.room_number = room_number;
this.state=state;
    }

    public String getWorker_name() {
        return worker_name;
    }

    public void setWorker_name(String worker_name) {
        this.worker_name = worker_name;
    }

    public String getWorker_last_name() {
        return worker_last_name;
    }

    public void setWorker_last_name(String worker_last_name) {
        this.worker_last_name = worker_last_name;
    }

    public long getNational_id_card_number() {
        return National_id_card_number;
    }

    public void setNational_id_card_number(long national_id_card_number) {
        National_id_card_number = national_id_card_number;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public String getAddreess() {
        return Addreess;
    }

    public void setAddrees(String addreess) {
        this.Addreess = addreess;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }



    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }


}
