package kz.bitlab.springfirst.db;

import kz.bitlab.springfirst.entity.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DbManager {
    @Getter

    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1L, "Adil", "A", 78, "B"));
        students.add(new Student(2L, "Sanzhar", "S", 60, "B"));
        students.add(new Student(3L, "Kazy", "M", 60, "B"));
        students.add(new Student(1L, "Alisher", "A", 60, "B"));
    }
}
