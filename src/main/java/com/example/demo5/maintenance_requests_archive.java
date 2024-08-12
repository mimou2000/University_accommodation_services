package com.example.demo5;

public class maintenance_requests_archive {
    public int idrequested;
    public String name;
    public String last_name;
    public String RequestDescription;
    public String date_requested;
    public String worker_National_id_card_number;
    public String ID_Student;
    public String room_number;
    public String getID_Student() {
        return ID_Student;
    }

    public void setID_Student(String ID_Student) {
        this.ID_Student = ID_Student;
    }

    public maintenance_requests_archive() {}

    public maintenance_requests_archive(int idrequested, String name, String last_name, String requestDescription, String date_requested, String worker_National_id_card_number,String id_student, String room_number) {
        this.idrequested = idrequested;
        this.name = name;
        this.last_name = last_name;
        RequestDescription = requestDescription;
        this.date_requested = date_requested;
        this.worker_National_id_card_number = worker_National_id_card_number;
        this.room_number = room_number;
        this.ID_Student=id_student;
    }

    public int getIdrequested() {
        return idrequested;
    }

    public void setIdrequested(int idrequested) {
        this.idrequested = idrequested;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRequestDescription() {
        return RequestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        RequestDescription = requestDescription;
    }

    public String getDate_requested() {
        return date_requested;
    }

    public void setDate_requested(String date_requested) {
        this.date_requested = date_requested;
    }

    public String getWorker_National_id_card_number() {
        return worker_National_id_card_number;
    }

    public void setWorker_National_id_card_number(String worker_National_id_card_number) {
        this.worker_National_id_card_number = worker_National_id_card_number;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }
}
