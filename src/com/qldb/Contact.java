package com.qldb;

public class Contact {
    private int numberPhone;
    private String group;
    private String name;
    private String gender;
    private String address;
    private String birthDay;
    private String email;

    public Contact() {

    }

    public Contact(int numberPhone, String group, String name, String gender, String address, String birthDay, String email) {
        this.numberPhone = numberPhone;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthDay = birthDay;
        this.email = email;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Số điện thoại: "+numberPhone+", Nhóm: "+group+", Tên: "+name+", Giới tính: "+gender+", Địa chỉ: "+address;
    }

    public String formatString() {
        return numberPhone+","+group+","+name+","+gender+","+address+","+birthDay+","+email;
    }
}
