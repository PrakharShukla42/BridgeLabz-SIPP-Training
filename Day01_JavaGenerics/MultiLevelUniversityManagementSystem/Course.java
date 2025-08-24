package MultiLevelUniversityManagementSystem;

import java.util.ArrayList;
import java.util.List;


public class Course<T extends CourseType> {
    private final String departmentName;
    private final List<T> courses = new ArrayList<>();

    public Course(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    public void displayCourses() {
        System.out.println("Department: " + departmentName);
        for (T c : courses) {
            System.out.println("- " + c.getCourseName() + " (" + c.getCourseCredits() + " credits)");
            c.evaluate();
        }
    }

    public static void showAllCourses(List<? extends CourseType> list) {
        System.out.println("\nAll Courses (mixed types):");
        for (CourseType c : list) {
            System.out.println(c.getCourseName() + " [" + c.getCourseCredits() + " credits]");
            c.evaluate();
        }
    }
}
