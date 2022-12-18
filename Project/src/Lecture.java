import java.util.ArrayList;

public class Lecture extends Course{
    private static final String courses = new String();




    public Lecture(String name, int id, String collage1, String department) {
          super(name, id, collage1, department, courses);

    }
    public Lecture(String LecturerName) {
        super(LecturerName);
    }



    public void addLecture(Lecture lecture) {
        ArrayList<Course> courses = new ArrayList<Course>();
        for (Course course : courses) {
            if (course.getCourseName().equals(lecture.getCourseName())) {
                course.addLecture(lecture);
            }

        }
    }


}
