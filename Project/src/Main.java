import java.util.Scanner;
//Write a Java console application that, firstly, creates an instance of the Collage class
//with “CCITT” as the collageName and “1” as collageID. Afterwards, the application
//should display the “Course Registration System Main Menu” and ask the user to enter
//the number of the option he/she wants to choose. The application should continue to
//display the “Course Registration System Main Menu” and ask the user to enter the
//number of the option he/she wants to choose until the user enters the number 0 to
//exit the application.
public class Main {

    public static void pressEnterKeyToContinue()
    {
        System.out.println("Press Enter key to continue...");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }
    public static void main(String[] args) {

        //Creating a new instance of the Collage class
        Collage collage = new Collage("CCITT", 1);

        //launching the main menu
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Course Registration System Main Menu");
            System.out.println("------------------------------------");
            System.out.println("1. Add a new course");
            System.out.println("2. Register new student");
            System.out.println("3. Register new lecturer");
            System.out.println("4. Display all courses");
            System.out.println("5. Display all courses of a specific department");
            System.out.println("6. Display all courses of a specific semester");
            System.out.println("7. Display all courses of a specific year");
            System.out.println("8. Display all students of a specific course");
            System.out.println("0. Exit the application");
            System.out.println("------------------------------------");
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            switch (option) {
                //Add a new course
                case 1 -> {
                    System.out.print("Enter the course name: ");
                    String courseName = scanner.next();
                    System.out.print("Enter the course code: ");
                    String courseCode = scanner.next();
                    System.out.print("Enter the course credit hours: ");
                    int courseCreditHours = scanner.nextInt();
                    System.out.print("Enter the course department: ");
                    String courseDepartment = scanner.next();
                    System.out.print("Enter the course semester: ");
                    int courseSemester = scanner.nextInt();
                    System.out.print("Enter the course year: ");
                    int courseYear = scanner.nextInt();
                    System.out.print("Enter the lecturer name: ");
                    Lecture lecture = new Lecture(scanner.next());
                    Course course = new Course(courseName, courseCode, courseCreditHours, courseDepartment, courseSemester, courseYear, lecture);
                    collage.addCourse(course);
                    System.out.println("Course added successfully.");
                    pressEnterKeyToContinue();

                }
                //Register new student
                case 2 -> {

                    System.out.println("Undergraduate student or postgraduate student? (1/2)");
                    int studentType = scanner.nextInt();
                    switch (studentType){
                        //Register new Undergraduate student
                        case 1-> {
                            System.out.print("Enter the student name: ");
                            String name = scanner.next();
                            System.out.print("Enter the student ID: ");
                            int id = scanner.nextInt();
                            System.out.print("Enter the student department: ");
                            String department = scanner.next();
                            System.out.print("Enter the student year: ");
                            int year = scanner.nextInt();
                            System.out.print("Enter the student courses: ");
                            String courses = scanner.next();
                            System.out.print("Enter the student grade: ");
                            String grades = scanner.next();
                            UnderGraduateStudents student = new UnderGraduateStudents(name, id, department, year, courses, grades);
                            collage.addStudent(student);
                            System.out.println("Student added successfully");
                            pressEnterKeyToContinue();
                        }
                        //Register new postgraduate student
                        case 2-> {
                            System.out.print("Enter the student name: ");
                            String name = scanner.next();
                            System.out.println("Enter the student department: ");
                            String department = scanner.next();
                            System.out.print("Enter the student courses: ");
                            String courses = scanner.next();
                            System.out.print("Enter the student grades: ");
                            String grades = scanner.next();
                            System.out.print("Enter the student degree: ");
                            String degree = scanner.next();
                            System.out.print("Enter the student major: ");
                            String major = scanner.next();
                            PostGraduateStudents student = new PostGraduateStudents(name, department,degree, courses, grades, degree, major);
                            collage.addStudent(student);
                            System.out.println("Student added successfully");
                            pressEnterKeyToContinue();
                        }
                    }

                }
                //Register new lecturer
                case 3 -> {
                    System.out.print("Enter the lecturer name: ");
                    String name = scanner.next();
                    System.out.print("Enter the lecturer ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter the lecturer department: ");
                    String department = scanner.next();
                    System.out.print("Enter the lecturer courses: ");
                    String courses = scanner.next();
                    Lecture lecturer = new Lecture(name, id, department, courses);
                    collage.addLecture(lecturer);
                    System.out.println("Lecturer added successfully");
                    pressEnterKeyToContinue();

                }
                //Display all courses
                case 4 -> {
                    for (Course c : collage.getCourses()) {
                        if (c.getCourseName() != null) {
                        System.out.println("Displaying all courses: ");
                        System.out.println("Course Name: " + c.getCourseName());
                        System.out.println("Course Code: " + c.getCourseCode());
                        System.out.println("Course Credit Hours: " + c.getCourseCreditHours());
                        System.out.println("Course Department: " + c.getCourseDepartment());
                        System.out.println("Course Semester: " + c.getCourseSemester());
                        System.out.println("Course Year: " + c.getCourseYear());
                        System.out.println("Course Lecturer: " + c.getLecture());
                        System.out.println(".....................................");
                            System.out.println("All courses displayed...");
                        }
                    else{ System.err.println("No courses found");}
                    }
                    pressEnterKeyToContinue();
                }
                //Display all courses of a specific department
                case 5 -> {
                    System.out.println("Enter the course department: ");
                    String courseDepartment1 = scanner.next();
                    System.out.println("Displaying all courses for the specific department: "+courseDepartment1);
                    for (Course c : collage.getCourses()) {
                        if (c.getCourseDepartment().equals(courseDepartment1)){
                            System.out.println("Course Name: " + c.getCourseName());
                            System.out.println("All courses displayed...");}
                       else
                            System.err.println("No courses match this specific department");
                    }

                    pressEnterKeyToContinue();
                }
                //Display all courses of a specific semester
                case 6 -> {
                    System.out.print("Enter the course semester: ");
                    int courseSemester1 = scanner.nextInt();
                    System.out.println("Displaying all courses for the specific semester: "+courseSemester1);
                    for (Course c : collage.getCourses()) {
                        if (c.getCourseSemester() == courseSemester1){
                            System.out.println("Course Name: " + c.getCourseName());
                            System.out.println("-----------------------------------");
                            System.out.println("All courses displayed...");}
                        else{
                            System.err.println("No courses match this specific semester");}
                    }

                    pressEnterKeyToContinue();
                }
                //Display all courses of a specific year
                case 7 -> {
                    System.out.print("Enter the course year: ");
                    int courseYear1 = scanner.nextInt();
                    System.out.println("Displaying all courses for the specific year: "+courseYear1);
                    for (Course c : collage.getCourses()) {
                        if (c.getCourseYear() == courseYear1){
                            System.out.println("Course Name: " + c.getCourseName());
                            System.out.println("-----------------------------------");
                            System.out.println("All courses displayed...");}
                        else{
                            System.err.println("No courses match this specific year");}
                    }

                    pressEnterKeyToContinue();
                }
                //Display all courses of a specific lecturer
                case 8 -> {
                    System.out.print("Enter the course name: ");
                    String courseName1 = scanner.next();
                    System.out.println("Displaying all students for the specific course: "+courseName1);
                    for (Course c : collage.getCourses()) {
                        if (c.getCourseName().equals(courseName1)){
                            System.out.println("Student Name: " + c.getStudents());
                            System.out.println("-----------------------------------");
                            System.out.println("All students displayed...");}
                        else{
                            System.err.println("No students match this specific course");}
                    }

                    pressEnterKeyToContinue();

                }
                //Exiting the system
                case 0-> {
                    System.out.println("Exiting the system...");
                    System.exit(0);
                }
                default -> {
                    System.err.println("Invalid input");
                    pressEnterKeyToContinue();
                }
            }
        } while (option != 0);     {
            System.out.println("Thank you for using the application.");

        }


    }
}

