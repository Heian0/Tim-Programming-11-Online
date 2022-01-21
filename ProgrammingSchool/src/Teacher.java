public class Teacher
{
    //creates fields firstName, lastName, grade, and subject
    public String firstName;
    public String lastName;
    public String subject;

    //if Teachers's firstName, lastName, and subject are not specified, they are set to the following
    Teacher()
    {
        firstName = "undefined";
        lastName = "undefined";
        subject = "undefined";
    }

    //sets the Teachers's firstName, lastName, subject to the parameters given
    Teacher(String firstName, String lastName, String subject)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    //returns subject
    public String getSubject()
    {
        return subject;
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

    //changes subject to passed parameter newsubject
    public void setSubject(String newSubject)
    {
        this.subject = newSubject;
    }

    //prints a Teacher's firstName and subject
    public void printNameSubject()
    {
        System.out.println("Name: " + this.firstName + " Subject: " + this.subject);
    }
}
