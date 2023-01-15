package com.examples.designpattern.find_ranking_of_student;

import java.util.Set;

public class Ranking {

    Set<Student> studentSet;

    public Ranking(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public void findRanking() {
        for (Student student : studentSet) {
            double percentage = getPercentage(student);
            if (percentage > 60.0) {
                System.out.println(student.getName() + " : First Class");
            } else if (percentage < 60.0 && percentage > 50.0) {
                System.out.println(student.getName() + " : Second Class");
            } else {
                System.out.println(student.getName() + " : Third Class");
            }
        }
    }

    private double getPercentage(Student student) {
        int totalMarks = 0;
        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
        }

        return (double) totalMarks / (double) student.getSubjects().size();
    }


}
