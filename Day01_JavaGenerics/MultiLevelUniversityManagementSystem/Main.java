package MultiLevelUniversityManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course<ExamCourse> csDept = new Course<>("Computer Science");
        csDept.addCourse(new ExamCourse("Data Structures", 4));
        csDept.addCourse(new ExamCourse("Algorithms", 3));

        Course<AssignmentCourse> litDept = new Course<>("Literature");
        litDept.addCourse(new AssignmentCourse("Modern Poetry", 2));
        litDept.addCourse(new AssignmentCourse("Drama Studies", 3));

        Course<ResearchCourse> researchDept = new Course<>("Advanced Research");
        researchDept.addCourse(new ResearchCourse("AI Research", 5));
        researchDept.addCourse(new ResearchCourse("Quantum Computing", 6));

        csDept.displayCourses();
        litDept.displayCourses();
        researchDept.displayCourses();


        List<CourseType> mixed = new ArrayList<>();
        mixed.add(new ExamCourse("Database Systems", 3));
        mixed.add(new AssignmentCourse("World History", 2));
        mixed.add(new ResearchCourse("Nanotechnology", 6));

        Course.showAllCourses(mixed);
    }
}
