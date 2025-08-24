package MultiLevelUniversityManagementSystem;

public class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, int courseCredits) {
        super(courseName, courseCredits);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated by assignments.");
    }
}
