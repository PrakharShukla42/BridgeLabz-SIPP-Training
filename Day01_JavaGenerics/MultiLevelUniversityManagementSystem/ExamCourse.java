package MultiLevelUniversityManagementSystem;

public class ExamCourse extends CourseType {
    public ExamCourse(String courseName, int courseCredits) {
        super(courseName, courseCredits);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated by a final exam.");
    }
}
