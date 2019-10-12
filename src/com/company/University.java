package com.company;

public class University extends Project {
    University(String Name,  String City) {
        super(Name, City);
    }

    public void getName() {
        System.out.println("Название Университета: " + Name);
    }


    public static void main(String args[]) {
        University first2 = new University("МЭСИ", "Москва");
        first2.getName();
    }
}