public class Student {
    private String firstName; //Strings for Student
    private String lastName;
    private int grade;
    private int studentID;
    private static int stuNum = ((int)Math.round(Math.pow((Math.random() * 100), 3))); //Student ID generator

    Student() {
        firstName = ""; //String packages
        lastName = "";
        grade = 1;
        studentID = stuNum;
        stuNum = ((int)Math.round(Math.pow((Math.random() * 100), 3)));
    }

    Student(String firstName, String lastName, int grade) {
        this.firstName = firstName; //this.String
        this.lastName = lastName;
        this.grade = grade;
        this.studentID = stuNum;
        stuNum = ((int)Math.round(Math.pow((Math.random() * 100), 3)));
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
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String toString() { //printing students
        return this.firstName + " " + this.lastName + " is in Grade " + this.grade + " and their student ID is: " + studentID;
    }
}
