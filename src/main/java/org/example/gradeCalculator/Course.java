package org.example.gradeCalculator;

import java.util.Map;

public class Course {

    private final String subject;
    private final int credit;
    private final String grade;
    private final Map<String, Double> gradeMap = Map.of(
            "A+", 4.5, "A", 4.0, "B+", 3.5,
            "B", 3.0, "C+", 2.5, "C", 2.0
    );

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public double getGradeToNumber() {
        double numberGrade = 0.0;

        if (gradeMap.containsKey(grade)) {
            numberGrade = gradeMap.get(grade);
        }

        return numberGrade;
    }

    public double multiplyCreditAndCouseGrade() {
        return credit * getGradeToNumber();
    }
}
