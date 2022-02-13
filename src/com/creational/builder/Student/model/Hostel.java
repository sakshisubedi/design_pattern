package com.creational.builder.Student.model;

public class Hostel {
    private String hostelName;
    private Integer roomNum;

    public Hostel(String hostelName, Integer roomNum) {
        this.hostelName = hostelName;
        this.roomNum = roomNum;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }
}
