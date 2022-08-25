package org.example.gradeCalculator;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;


    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        // 학점 수 * 교과목 평균의 합계
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        int totalCredits = courses.calculateTotalCredits();

        return totalMultipliedCreditAndCourseGrade / totalCredits;
    }
}
