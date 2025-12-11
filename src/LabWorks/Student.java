package LabWorks;
import java.util.Date;

public class Student {
    private String name;
    private String address;
    private String[] courses;
    private int[] grades;
    private int numCourses;
    private static int studentCounter;
    public int stuId;
    public Date dateRegistered;

    public Student(){

    }
    public Student(String name, String address){
        this.name = name;
        this.address = address;
        this.courses = new String[30];
        this.grades = new int[30];
        this.numCourses = 0;
        this.stuId = ++studentCounter;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String toString(){
        return this.name + this.stuId + this.address;
    }

    public void addCoursseGrade(String course, int grade){
        this.courses[this.numCourses] = course;
        this.grades[numCourses] = grade;
        numCourses++;
    }


}
