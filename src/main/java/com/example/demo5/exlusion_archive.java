package com.example.demo5;

public class exlusion_archive {
    String name;
    String last_name;
    String date_exlusion_archive;

    String ID_student_exlusion_archive;
    String Room;

    public String getRoom() {
        return Room;
    }

    public void setRoom(String room) {
        Room = room;
    }

    public exlusion_archive() {
    }

    public exlusion_archive(String name, String last_name, String date_exlusion_archive, String ID_student_exlusion_archive,String Room) {
        this.name = name;
        this.last_name = last_name;
        this.date_exlusion_archive = date_exlusion_archive;
        this.ID_student_exlusion_archive = ID_student_exlusion_archive;
        this.Room = Room;
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

    public String getDate_exlusion_archive() {
        return date_exlusion_archive;
    }

    public void setDate_exlusion_archive(String date_exlusion_archive) {
        this.date_exlusion_archive = date_exlusion_archive;
    }


    public String getID_student_exlusion_archive() {
        return ID_student_exlusion_archive;
    }

    public void setID_student_exlusion_archive(String ID_student_exlusion_archive) {
        this.ID_student_exlusion_archive = ID_student_exlusion_archive;
    }
}