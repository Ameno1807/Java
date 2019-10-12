package com.company;

public class Schools extends Project {
    Schools(String Name,  String City) {
        super(Name, City);
    }

    public void getName() {
        System.out.println("Название школы: " + Name);
    }


    public static void main(String args[]) {
        Schools first1 = new Schools("Romaskovo",  "Москва");
        first1.getName();
    }
}
