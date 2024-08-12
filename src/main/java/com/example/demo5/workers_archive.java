package com.example.demo5;

public class workers_archive {
     String worker_name;
     String worker_last_name;
     long National_id_card_number;
     String date_of_ab_w;
     String re_ab_w;
     String Room;

    public workers_archive( long national_id_card_number,String worker_name, String worker_last_name, String date_of_ab_w, String re_ab_w, String room) {
        this.worker_name = worker_name;
        this.worker_last_name = worker_last_name;
        National_id_card_number = national_id_card_number;
        this.date_of_ab_w = date_of_ab_w;
        this.re_ab_w = re_ab_w;
        Room = room;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String room) {
        Room = room;
    }

    public workers_archive() {}



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

    public String getDate_of_ab_w() {
        return date_of_ab_w;
    }

    public void setDate_of_ab_w(String date_of_ab_w) {
        this.date_of_ab_w = date_of_ab_w;
    }

    public String getRe_ab_w() {
        return re_ab_w;
    }

    public void setRe_ab_w(String re_ab_w) {
        this.re_ab_w = re_ab_w;
    }
}
