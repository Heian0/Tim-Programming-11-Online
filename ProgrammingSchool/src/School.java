import java.util.ArrayList;

public class School
{
    //creates fields firstName, lastName, grade, and studentNumber
    public String schoolName;
    public int schoolPopulation;
    public String aRanking;

    //creates an array list of Teachers teacherArrayList
    ArrayList<Teacher> teacherArrayList = new ArrayList<>();
    //creates an array list of Students studentArrayList
    ArrayList<Student> studentArrayList = new ArrayList<>();


    //if School's schoolName, schoolPopulation, and aRanking is undefined, they are set to the following
    School()
    {
        schoolName = "undefined";
        schoolPopulation = 0;
        aRanking = "undefined";
    }

    //sets the School's schoolName, schoolPopulation, and aRanking to the given parameters
    School(String schoolName, int schoolPopulation, String aRanking)
    {
        this.schoolName = schoolName;
        this.schoolPopulation = schoolPopulation;
        this.aRanking = aRanking;
    }

    //returns schoolName
    public String getSchoolName() { return schoolName; }

    //returns schoolPopulation
    public int getSchoolPopulation() { return schoolPopulation; }

    //return aRanking
    public String getaRanking() { return aRanking; }

    //sets schoolName to given parameter newSchoolName
    public void setSchoolName(String newSchoolName)
    {
        this.schoolName = newSchoolName;
    }

    //sets schoolPopulation to given parameter newSchoolPopulation
    public void setSchoolPopulation(int newSchoolPopulation)
    {
        this.schoolPopulation = newSchoolPopulation;
    }

    //sets aRanking to given parameter newaRanking
    public void setaRanking(String newaRanking)
    {
        this.aRanking = newaRanking;
    }

    //adds a passed parameter, teacher t, to the teacher array list
    public void AddToTeacherArrayList(Teacher t)
    {
        teacherArrayList.add(t);
    }

    //adds a passed parameter,student s, to the teacher array list
    public void AddToStudentArrayList(Student s)
    {
        studentArrayList.add(s);
    }

    //removes a passed parameter, Teacher t, from the teacher array list
    public void RemoveFromTeacherArrayList(Teacher t)
    {
        for (int i = 0; i < teacherArrayList.size(); i++)
        {
            //if the given parameter Teacher t matches a Teacher at a certain index i in the list, the teacher
            //at the index i is removed.
            if (teacherArrayList.get(i) == t)
            {
                teacherArrayList.remove(i);
            }
        }
    }
    //removes a passed parameter, Student s, from the teacher array list
    public void RemoveFromStudentArrayList(Student s)
    {
        for (int i = 0; i < studentArrayList.size(); i++)
        {
            //if the given parameter Student s matches a Student at a certain index i in the list, the Student
            //at the index i is removed.
            if (studentArrayList.get(i) == s)
            {
                studentArrayList.remove(i);
            }
        }
    }

    //iterates through the studentArrayList and prints out the firstName, lastName, grade, and studentNumber
    //of each Student in StudentArrayList
    public void DebugAllStudents()
    {
        for (int i = 0; i < studentArrayList.size(); i++)
        {
            Student student = studentArrayList.get(i);

            System.out.println(student.firstName + " "
                    + student.lastName + " "
                    + student.grade + " "
                    + student.studentNumber);

        }
    }

    //iterates through the teacherArrayList and prints out the firstName, lastName, and subject
    //of each Teacher in TeacherArrayList
    public void DebugAllTeachers()
    {
        for (int i = 0; i < teacherArrayList.size(); i++)
        {
            Teacher teacher = teacherArrayList.get(i);

            System.out.println(teacher.firstName+ " "
                    + teacher.lastName + " "
                    + teacher.subject);

        }
    }
}
