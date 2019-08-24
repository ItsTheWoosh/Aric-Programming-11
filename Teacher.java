public class Teacher {
    private String firstName; //Strings for teachers
    private String lastName;
    private String subject;
    Teacher() {
        firstName = ""; //String packages
        firstName = "";
        subject = "";
    }
    Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName; //this.string
        this.lastName = lastName;
        this.subject = subject;
    }
    //getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String toString() { //sout(teachers)
        return "Name: " + this.firstName + " " + this.lastName + " " + "Subject: " + subject;
    }
}
