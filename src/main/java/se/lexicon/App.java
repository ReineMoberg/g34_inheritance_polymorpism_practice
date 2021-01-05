package se.lexicon;


import se.lexicon.model.SystemDeveloper;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        SystemDeveloper fullstackDeveloper1 = new SystemDeveloper();    //Create a system developer object
        fullstackDeveloper1.setName("Test");                            //Add name
        fullstackDeveloper1.addCertificate("OCA");             //Add certificates
        fullstackDeveloper1.addCertificate("OCP");
        fullstackDeveloper1.addCertificate("CEH");

        fullstackDeveloper1.addLanguage("Java");       //Add programming languages
        fullstackDeveloper1.addLanguage("Python");

        fullstackDeveloper1.setDateHired(LocalDate.parse("2021-03-10"));            //Add hiring date, formatted
        fullstackDeveloper1.calculateSalary(); //Calculate and set salary (25000 + (1000 * 3) + (1500 * 2) = 31000.0)
        System.out.println(fullstackDeveloper1); //Print variables in object


    }
}
