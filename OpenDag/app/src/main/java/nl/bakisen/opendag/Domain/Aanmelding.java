package nl.bakisen.opendag.Domain;

public class Aanmelding {

    private String sex, firstName, lastName, dateOfBirth, mail, phone, education;

    public Aanmelding(String sex, String firstName, String lastName, String dateOfBirth, String mail, String phone, String education) {
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.mail = mail;
        this.phone = phone;
        this.education = education;
    }

    public Aanmelding(String sex, String firstName, String lastName, String dateOfBirth, String mail) {
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.mail = mail;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getMail() {
        return this.mail;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEducation() {
        return this.education;
    }

    public String getSex() {
        return this.sex;
    }
}