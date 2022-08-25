package org.example.gradeCalculator;

import java.util.List;

public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {

        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCouseGrade)
                .sum();
    }

    public int calculateTotalCredits() {

        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
