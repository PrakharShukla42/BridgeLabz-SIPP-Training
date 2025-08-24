package MultiLevelUniversityManagementSystem;

public class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, int courseCredits) {
        super(courseName, courseCredits);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated by research output.");
    }
}
