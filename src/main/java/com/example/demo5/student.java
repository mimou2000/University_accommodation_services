package com.example.demo5;

public class student {
    long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    String name;
      String last_name;
      String date_of_birth;
      String place_of_birth;
     String nationality;
      String Bac_certificate_number;
      String Year_of_obtaining_a_bac;
    String Address;
   String Specialization;
  String mother_name;
      String mother_last_name;
      String father_name;
     String father_last_name;
      String School_certificate_number;
     String room_number;
     String state_student;
      String branch_student;
      String level_student;

    public String getState_student() {
        return state_student;
    }

    public void setState_student(String state_student) {
        this.state_student = state_student;
    }

    public String getBranch_student() {
        return branch_student;
    }

    public void setBranch_student(String branch_student) {
        this.branch_student = branch_student;
    }

    public String getLevel_student() {
        return level_student;
    }

    public void setLevel_student(String level_student) {
        this.level_student = level_student;
    }

    public student(long ID_student, String name, String last_name, String date_of_birth, String place_of_birth, String nationality, String bac_certificate_number, String year_of_obtaining_a_bac, String address, String specialization, String mother_name, String mother_last_name, String father_name, String father_last_name, String school_certificate_number, String room_number, String State_student, String branch_student, String level_student) {
        this.id=ID_student;
        this.name = name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.nationality = nationality;
        this.Bac_certificate_number = bac_certificate_number;
        this.Year_of_obtaining_a_bac = year_of_obtaining_a_bac;
        this.Address = address;
        this.Specialization = specialization;
        this.mother_name = mother_name;
        this.mother_last_name = mother_last_name;
        this.father_name = father_name;
        this.father_last_name = father_last_name;
        this.School_certificate_number = school_certificate_number;
        this.room_number = room_number;
        this.place_of_birth=place_of_birth;
        this.state_student=State_student;
        this.branch_student=branch_student;
        this.level_student=level_student;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getYear_of_obtaining_a_bac() {
        return Year_of_obtaining_a_bac;
    }

    public void setYear_of_obtaining_a_bac(String year_of_obtaining_a_bac) {
        Year_of_obtaining_a_bac = year_of_obtaining_a_bac;
    }

    public String getBac_certificate_number() {
        return Bac_certificate_number;
    }

    public void setBac_certificate_number(String bac_certificate_number) {
        Bac_certificate_number = bac_certificate_number;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
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

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getMother_name() {
        return mother_name;
    }

    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }

    public String getMother_last_name() {
        return mother_last_name;
    }

    public void setMother_last_name(String mother_last_name) {
        this.mother_last_name = mother_last_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getFather_last_name() {
        return father_last_name;
    }

    public void setFather_last_name(String father_last_name) {
        this.father_last_name = father_last_name;
    }

    public String getSchool_certificate_number() {
        return School_certificate_number;
    }

    public void setSchool_certificate_number(String school_certificate_number) {
        School_certificate_number = school_certificate_number;
    }



    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }


}
