package com.examples.designpattern.find_ranking_of_student;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Subject subject1= new Subject("Math", 5);
        Subject subject2 = new Subject("English", 5);
        Set<Subject> subjectSet1  = new HashSet<>();
        subjectSet1.add(subject1);
        subjectSet1.add(subject2);
        Student s1= new Student(1, "Jyoti", subjectSet1);


        Subject subject3= new Subject("Math", 50);
        Subject subject4 = new Subject("English", 60);
        Set<Subject> subjectSet2  = new HashSet<>();
        subjectSet2.add(subject3);
        subjectSet2.add(subject4);
        Student s2= new Student(2, "Tanjila", subjectSet2);

        Subject subject5= new Subject("Math", 80);
        Subject subject6 = new Subject("English", 80);
        Set<Subject> subjectSet3  = new HashSet<>();
        subjectSet3.add(subject5);
        subjectSet3.add(subject6);
        Student s3= new Student(3, "Shree", subjectSet3);


        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);

        Ranking ranking = new Ranking(studentSet);
        ranking.findRanking();
    }
}
