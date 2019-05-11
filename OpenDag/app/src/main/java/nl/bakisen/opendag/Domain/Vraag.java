package nl.bakisen.opendag.Domain;

public class Vraag {

    private String firstName, lastName, mail, question;

    public Vraag(String firstName, String lastName, String mail, String question) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.question = question;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }

    public String getQuestion() {
        return question;
    }


}
