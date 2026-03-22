package com.beans;

public class Student {
    private int regno;
    private String name;
    private Address address;

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void display(){
        System.out.println("Regno:"+regno);
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);




    }
}
