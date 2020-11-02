package ru.mirea.inbo0219;
import java.lang.Throwable;
import java.lang.*;
public class Student{
    int score;
    String fio;

    Student(String fio, int score) throws EmptyStringException {
        this.fio = fio;
        this.score = score;


    }
}
