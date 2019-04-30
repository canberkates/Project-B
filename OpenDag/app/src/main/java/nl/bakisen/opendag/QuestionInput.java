package nl.bakisen.opendag;

public class QuestionInput{
    private String Gender;
    private String FirstName;
    private String LastName;
    private String Email;
    private String DateOfBirth;
    private String PreviousSchool;
    private String Phonenumber;
    private String Question;

    public QuestionInput(String Gender, String FirstName, String LastName, String Email, String DateOfBirth, String PreviousSchool, String Phonenumber) {
        this.Gender = Gender;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.DateOfBirth = DateOfBirth;
        this.PreviousSchool = PreviousSchool;
        this.Phonenumber = Phonenumber;
        this.Question = "";
    }
    public QuestionInput(String FirstName, String LastName, String Email, String Question) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Question = Question;
        this.Gender = "";
        this.DateOfBirth = "";
        this.Phonenumber = "";
        this.PreviousSchool = "";
    }

    public String getGender() {
        return this.Gender;
    }
    public String getFirstName() {
        return this.FirstName;
    }
    public String getLastName() {
        return this.LastName;
    }
    public String getEmail() {
        return this.Email;
    }
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }
    public String getPreviousSchool() {
        return this.PreviousSchool;
    }
    public String getPhonenumber() {
        return this.Phonenumber;
    }
    public String getQuestion() {
        return this.Question;
    }

}
