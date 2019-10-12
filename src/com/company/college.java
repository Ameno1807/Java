package com.company;

public class college extends Project {
    college(String Name,  String City) {
        super(Name, City);
    }

    public void getName() {
        System.out.println("Название колледжа: " + Name);
    }


    public static void main(String args[]) {
        college first = new college("МЭСИ", "Москва");
        first.getName();
    }
}
