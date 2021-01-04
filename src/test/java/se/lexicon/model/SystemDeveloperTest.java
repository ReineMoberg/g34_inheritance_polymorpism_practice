package se.lexicon.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class SystemDeveloperTest {

    private SystemDeveloper testObject;

    @Before
    public void setup() {
        testObject = new SystemDeveloper();
        testObject.setName("Test");
        testObject.addLanguage("Java");
        testObject.addLanguage("Python");

        testObject.addCertificate("OCA");
        testObject.addCertificate("OCP");
        testObject.addCertificate("CEH");

        testObject.setDateHired(LocalDate.parse("2021-04-04"));

        testObject.calculateSalary();

    }


    @Test
    public void testObject_has_correct_fields() {
        //Assert.assertEquals(expectedName,actualName);
        int expectedLanguagesLength = 2;
        int actualLanguagesLength = testObject.getLanguages().length;
        assertEquals(expectedLanguagesLength,actualLanguagesLength);
        assertEquals(3,testObject.getCertificates().length);
        assertEquals( "OCA", testObject.getCertificates()[0]);
        assertEquals( "OCP", testObject.getCertificates()[1]);
        assertEquals( "CEH", testObject.getCertificates()[2]);
        assertEquals(LocalDate.parse("2021-04-04"),testObject.getDateHired());
    }

    @Test
    public void test_Name(){
        String expectedName = "Test";
        String actualName = testObject.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void test_calculateSalary_3100(){
        double expectedSalary = 31000.0;
        double actualSalary = testObject.getSalary();
        assertEquals(expectedSalary,actualSalary,0);
    }

    @Test
    public void test_cert_addCert_should_successfully_add_cert(){
        int expectedCertLength = 4;
        testObject.addCertificate("C#");
        assertEquals(expectedCertLength,testObject.getCertificates().length);
    }

}
