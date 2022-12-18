import java.util.ArrayList;

public class Course {

    private final String courseName;
    private String courseDepartment;
    private String courseCode;
    private int courseCreditHours;
    private int courseSemester;
    private int courseYear;
    private int numberOfRegisteredStudents;
    protected Lecture lecture;
    private final ArrayList<Student> students = new ArrayList<>();


    public Course(String courseName, String courseCode, int courseCreditHours, String courseDepartment, int courseSemester, int courseYear, Lecture lecture) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseCreditHours = courseCreditHours;
        this.courseDepartment = courseDepartment;
        this.courseSemester = courseSemester;
        this.courseYear = courseYear;
        this.lecture= lecture;
    }
    public Course(String courseName, int id, String courseCode, String department, String courses){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDepartment = department;
        this.courseCode = courses;
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
 
    public String getCourseCode() {
        return courseCode;
    }

    public int getCourseCreditHours() {
        return courseCreditHours;
    }
    public String getCourseDepartment() {
        return courseDepartment;
    }
    public int getCourseSemester() {
        return courseSemester;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public int getNumberOfRegisteredStudents() {
        return numberOfRegisteredStudents;
    }
    public void setNumberOfRegisteredStudents(int numberOfRegisteredStudents) {
        this.numberOfRegisteredStudents = numberOfRegisteredStudents;
    }





    public void addStudent(UnderGraduateStudents student) {
        students.add(student);
    }
    public void addStudent(PostGraduateStudents student) {
        students.add(student);
    }




    protected void addLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public Lecture getLecture() {
        return lecture;
    }


    public Object getStudents() {
        StringBuilder studentsString = new StringBuilder();
        for (Student student : students) {
            studentsString.append(student.getName()).append(", ");
        }
        return studentsString.toString();
    }

    @Override
    public String toString() {
        return  courseName;
    }
}