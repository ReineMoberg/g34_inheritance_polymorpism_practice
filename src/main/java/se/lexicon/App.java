package se.lexicon;


import se.lexicon.model.SystemDeveloper;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        SystemDeveloper fullstackDeveloper1 = new SystemDeveloper();
        fullstackDeveloper1.setName("Test");
        fullstackDeveloper1.addCertificate("OCA"); // 1000
        fullstackDeveloper1.addCertificate("OCP"); // 1000
        fullstackDeveloper1.addCertificate("CEH"); // 1000

        fullstackDeveloper1.addLanguage("Java"); // 1500
        fullstackDeveloper1.addLanguage("Python");  // 1500

        fullstackDeveloper1.setDateHired(LocalDate.parse("2021-03-10"));
        fullstackDeveloper1.calculateSalary(); // 25000 + (1000 * 3) + (1500 * 2) = 31000.0
        System.out.println(fullstackDeveloper1);


    }
}
