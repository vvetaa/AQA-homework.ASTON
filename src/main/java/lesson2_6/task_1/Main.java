package lesson2_6.task_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Students> students = new HashSet<>();
        students.add(new Students("Андрей",3, 4022, new ArrayList<>(Arrays.asList(4, 3, 8, 7))));
        students.add(new Students("Иван",3, 4022, new ArrayList<>(Arrays.asList(2, 3, 3, 3))));
        students.add(new Students("Ольга",1, 3025, new ArrayList<>(Arrays.asList(9, 9, 5, 8))));
        students.add(new Students("Никита",2, 4024, new ArrayList<>(Arrays.asList(6, 2, 5, 4))));
        students.add(new Students("Максим",1, 1025, new ArrayList<>(Arrays.asList(2, 4, 2, 5))));

        System.out.println("Список всех студентов:");
        for (Students student : students) {
            System.out.println(student.getName() + " на " + student.getCourse() + " курсе. Средний балл: " + student.getAverageMarks());
        }

        Students.deleteStudentWithLowMarks(students);
        Students.promoteStudents(students);
        System.out.println("\nСтуденты перешедшие на следующий курс:");
        for (Students student : students) {
            System.out.println(student.getName() + " на " + student.getCourse() + " курс. Средний балл: " + student.getAverageMarks());
        }

        System.out.println();
        Students.printStudentsOnCourse(students, 2);
    }
}
