import java.util.ArrayList;
public class Student{
    ArrayList<Student> students = new ArrayList<>();
    protected String degree,major,year,name,grades;
    protected int id,semester;



public Student(String name,String major,String year){
    this.name=name;
    this.major=major;
    this.year=year;
    }


    public void addStudent(Student student) {
        students.add(student);
    }
    public void addStudent(UnderGraduateStudents student) { students.add(student);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Major: " + this.major + " Year: " + this.year;
    }


    public String getCourseName() {
        return name;
    }

    public String getName() {
        return name;
    }

}
