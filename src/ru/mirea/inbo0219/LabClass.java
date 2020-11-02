package ru.mirea.inbo0219;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Vector;
import java.lang.*;
import java.lang.Throwable;

public class LabClass implements LabClassUI{
    public Vector<Student> list = new Vector<Student>();
    public Student cl[] = new Student[3];
    LabClass(){}

    public void search(String in) throws Throwable {

        try{
            int i = 0;
            while (in != list.get(i).fio){
                    i++;
            }
            for (int j=0; j < list.get(i).fio.length(); j++)
                j = j;
            System.out.print("Good");
        }catch (ArrayIndexOutOfBoundsException e) {
            throw new StudentNotFoundException("Empty string");
        }catch (NullPointerException e){
            throw new EmptyStringException("Not found");
        }
    }


    public void sort() {

    }
}
