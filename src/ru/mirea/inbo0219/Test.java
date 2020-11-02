package ru.mirea.inbo0219;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Throwable {
        Student s1 = new Student(null, 50);
        Student s2 = new Student("ttw", 94);
        Student s3 = new Student("knn", 12);
        LabClass cl = new LabClass();
        cl.list.add(s1);
        cl.list.add(s2);
        cl.list.add(s3);

        String name1 = null;
        String name2 = "null";
        String name3 = "knn";
        cl.search(name1);
        cl.search(name2);
        cl.search(name3);
    }
}
