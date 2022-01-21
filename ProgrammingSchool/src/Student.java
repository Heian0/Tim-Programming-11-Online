public class Student
{
    //creates fields firstName, lastName, grade, and studentNumber
    public String firstName;
    public String lastName;
    public int grade;
    public int studentNumber;

    //if Students's firstName, lastName, grade, and studentNumber are not specified, they are set to the following
    Student()
    {
        firstName = "undefined";
        lastName = "undefined";
        grade = 0;
        studentNumber = 0;
    }

    //sets the Student's firstName, lastName, grade, and studentNumber to the parameters given
    Student(String firstName, String lastName, int grade, int studentNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = studentNumber;
    }

    //returns firstName
    public String getFirstName()
    {
        return firstName;
    }

    //returns lastName
    public String getLastName()
    {
        return lastName;
    }

    //return grade
    public int getGrade()
    {
        return grade;
    }

    //returns studentNumber
    public int getStudentNumber()
    {
        return studentNumber;
    }

    //changes first name to passed parameter newFirstName
    public void setFirstName(String newFirstName)
    {
        this.firstName = newFirstName;
    }

    //changes lastName to passed parameter newLastName
    public void setLastName(String newLastName)
    {
        this.lastName = newLastName;
    }

    //changes grade to passed parameter newGrade
    public void setGrade(int newGrade)
    {
        this.grade = newGrade;
    }

    //changes student number to passed parameter newStudentNumber
    public void setStudentNumber(int newStudentNumber)
    {
        this.studentNumber = newStudentNumber;
    }

    //prints a Student's firstName and grade
    public void printNameGrade()
    {
        System.out.println("Name: " + this.firstName + " Grade: " + this.grade);
    }
}
