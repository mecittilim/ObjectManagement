package University;

public class Test {
    public static void main(String[] args) {

        Department department1 = new Department();
        department1.name = "Software Engineering";

        Professor professor1 = new Professor();
        professor1.name = "Mecit Tilim";

        Course course1 = new Course();
        course1.name = "Int. to Software";

        Student student1 = new Student();
        student1.name = "Eda ÖZYURT";

        // 1 to 1
        department1.head = professor1;
        professor1.department = department1;

        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] = course1;

        course1.teacher = professor1;
        professor1.coursesGiven = new Course[5];
        professor1.coursesGiven[0] = course1;

        professor1.advisee = new Student[10];
        professor1.advisee[0] = student1;
        student1.advisor = professor1;

        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;

        course1.students = new Student[100];
        course1.students[0] = student1;

        System.out.println("Name of student1's first course is " + student1.coursesTaken[0].name);
        System.out.println("Name of student1's first course's professor is "+ student1.coursesTaken[0].teacher.name);
        System.out.println("Name of student1's first course's professor's deparment is " + student1.coursesTaken[0].teacher.department.name);
        System.out.println("Name of Course's professor first student name is "+ course1.teacher.advisee[0].name);


    }
}
