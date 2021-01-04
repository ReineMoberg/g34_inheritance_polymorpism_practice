package se.lexicon.model;

import java.util.Arrays;

public class SystemDeveloper extends Employee {


    private String[] certificates;
    private String[] languages;

    public SystemDeveloper() {
        certificates = new String[0];
        languages = new String[0];
    }

    @Override
    public void calculateSalary() {
        int baseSalary = 25000;
        int extraPriceCertificate = 1000;
        int extraPriceProgrammingLanguage = 1500;
        double calcSalary = baseSalary +
                (extraPriceCertificate * certificates.length) +
                (extraPriceProgrammingLanguage * languages.length);
        // 25000 +
        // (1000 * 3) +
        // (1500 * 2) = 31000
        this.setSalary(calcSalary);
    }

    public  void addLanguage(String programmingLanguage){
        String[] newArray = Arrays.copyOf(languages, languages.length + 1);
        newArray[newArray.length - 1] = programmingLanguage;
        this.setLanguages(newArray);
    }

    public void addCertificate(String certName){
        String[] newArr= Arrays.copyOf(certificates,certificates.length + 1);
        newArr[newArr.length - 1] = certName;
        this.setCertificates(newArr);
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SystemDeveloper developer = (SystemDeveloper) o;
        return Arrays.equals(certificates, developer.certificates) && Arrays.equals(languages, developer.languages);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(certificates);
        result = 31 * result + Arrays.hashCode(languages);
        return result;
    }

    @Override
    public String toString() {
        return "SystemDeveloper{" +
                "certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                super.toString() +
                '}';
    }

}
