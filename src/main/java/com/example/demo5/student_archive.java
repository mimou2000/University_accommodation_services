package com.example.demo5;

public class student_archive {


    long ID;
     String name;
     String last_name;
    String date_of_ab;
    String resion_ab;
   String Room;

    public student_archive(long ID, String name, String last_name, String date_of_ab, String resion_ab, String room) {
        this.ID = ID;
        this.name = name;
        this.last_name = last_name;
        this.date_of_ab = date_of_ab;
        this.resion_ab = resion_ab;
        this.Room = room;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String room) {
        Room= room;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
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

    public String getDate_of_ab() {
        return date_of_ab;
    }

    public void setDate_of_ab(String date_of_ab) {
        this.date_of_ab = date_of_ab;
    }

    public String getResion_ab() {
        return resion_ab;
    }

    public void setResion_ab(String resion_ab) {
        this.resion_ab = resion_ab;
    }



    public student_archive() {};}


