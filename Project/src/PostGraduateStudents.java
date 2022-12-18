public class PostGraduateStudents extends Student {


    public PostGraduateStudents(String name, String status, String degree, String major, String year, String s, String major1) {
        super(name, major, year);
        this.degree = degree;
        this.major = major;
        this.year = year;
    }

@Override
    public String toString() {
        return "Name: " + this.name + " Major: " + this.major + " Year: " + this.year;
    }
}
