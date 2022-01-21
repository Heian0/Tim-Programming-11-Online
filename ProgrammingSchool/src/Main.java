import java.util.ArrayList;

public class Main
{
    public static void main(String args[])
    {
        //creates an instance of the School class called school
        School ericHamber = new School("Eric Hamber", 1400, "AAAA");

        //creates 10 unique instances of the class Student
        Student Tim = new Student("Tim", "Li", 12, 820156);
        Student John = new Student("John", "Smith", 11, 749266);
        Student RJ = new Student("RJ", "Brown", 10, 792689);
        Student Kevin = new Student("Kevin", "Lam", 12, 796397);
        Student Brian = new Student("Brian", "Scalabrine", 12, 813575);
        Student Abdul = new Student("Abdul", "Khan", 12, 837493);
        Student Salvadore = new Student("Salvadore", "Carlizzi", 12, 678467);
        Student Joe = new Student("Joe", "Black", 12, 568397);
        Student Marcell = new Student("Marcell", "Monk", 11, 768456);
        Student Derek = new Student("Derek", "Hansen", 12, 896059);

        //creates 3 unique instances of the class Teacher
        Teacher Mark = new Teacher("Mark", "Angel", "Math");
        Teacher Kay = new Teacher("Kay", "Brown", "English");
        Teacher Denilson = new Teacher("Denilson", "Igwe", "Science");

        //Adds the 3 Teacher instances to array list teacherArrayList through the method AddToTeacherArrayList
        ericHamber.AddToTeacherArrayList(Mark);
        ericHamber.AddToTeacherArrayList(Kay);
        ericHamber.AddToTeacherArrayList(Denilson);

        //Adds the 10 Student instances to array list studentArrayList through the method AddToStudentArrayList
        ericHamber.AddToStudentArrayList(Tim);
        ericHamber.AddToStudentArrayList(John);
        ericHamber.AddToStudentArrayList(RJ);
        ericHamber.AddToStudentArrayList(Kevin);
        ericHamber.AddToStudentArrayList(Brian);
        ericHamber.AddToStudentArrayList(Abdul);
        ericHamber.AddToStudentArrayList(Salvadore);
        ericHamber.AddToStudentArrayList(Joe);
        ericHamber.AddToStudentArrayList(Marcell);
        ericHamber.AddToStudentArrayList(Derek);

        System.out.println("Before removal of 2 students and 1 teacher: ");

        //Debug.Logs all students, displays in console
        ericHamber.DebugAllStudents();

        //Debug.Logs all teachers, displays in console
        ericHamber.DebugAllTeachers();

        //removes the Teacher Denilson from the teacherArrayList through School's RemoveFromTeacherArrayList method
        ericHamber.RemoveFromTeacherArrayList(Denilson);

        //removes the Student Kevin and the Student Joe from the studentArrayList through
        //School's RemoveFromStudentArrayList method
        ericHamber.RemoveFromStudentArrayList(Kevin);
        ericHamber.RemoveFromStudentArrayList(Joe);

        System.out.println("After removal of 2 students and 1 teacher: ");

        //Debug.Logs all students, displays in console, two have been removed, Kevin and Joe
        ericHamber.DebugAllStudents();

        //Debug.Logs all teachers, displays in console, Denilson has been removed
        ericHamber.DebugAllTeachers();
    }
}
