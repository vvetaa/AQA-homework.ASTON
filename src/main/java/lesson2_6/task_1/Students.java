package lesson2_6.task_1;

import java.util.ArrayList;
import java.util.Set;

public class Students {
    private String name;
    private int course;
    private int group;
    private ArrayList<Integer> marks;
    private Set<Students> students;

    public Students(String name, int course, int group, ArrayList<Integer> marks) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    //  средний балл
    public double getAverageMarks() {
        int sum = 0;
        for (int grade : marks) {
            sum += grade;
        }
        return (double) sum / marks.size();
    }

//  удаляет студентов со средним баллом < 3
    public static void deleteStudentWithLowMarks(Set<Students> students) {
        students.removeIf(student -> student.getAverageMarks() < 3.0);
    }

//  переводит студента на следующий курс, если средний балл >= 3
    public static void promoteStudents(Set<Students> students) {
        for (Students student : students) {
            if (student.getAverageMarks() >= 3.0) {
                student.course += 1;
            }
        }
    }

    public static void printStudentsOnCourse(Set<Students> students, int course) {
        System.out.println("Студенты на " + course + " курсе:");
        for (Students student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }
}
