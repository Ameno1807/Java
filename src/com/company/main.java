package com.company;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String args[]) {
        List<Project> Education = new ArrayList<>();
        Education.add(new Schools("Номер 1", "Москва"));
        Education.add(new Schools("Номер 2", "Москва"));
        Education.add(new Schools("Номер 3", "Москва"));
        Education.add(new University("МЭСИ 1", "Москва"));
        Education.add(new University("МЭСИ 2", "Москва"));
        Education.add(new University("МЭСИ 3", "Москва"));
        Education.add(new college("КЭСИ 1", "Москва"));
        Education.add(new college("КЭСИ 2", "Москва"));
        Education.add(new college("КЭСИ 3", "Москва"));


        for (Project st : Education) {
            if (st instanceof Schools) {
                System.out.println("Название Школ: ");
                System.out.println(st.Name);

            }
            if (st instanceof University) {
                System.out.println("Название Университета: ");
                System.out.println(st.Name);

            }
            if (st instanceof college) {
                System.out.println("Название Колледжа: ");
                System.out.println(st.Name);

            }

        }
    }
}
