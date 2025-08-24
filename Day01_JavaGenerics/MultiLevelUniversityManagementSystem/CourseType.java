package MultiLevelUniversityManagementSystem;

public abstract class CourseType {
    private final String courseName;
    private final int courseCredits;

    public CourseType(String courseName, int courseCredits) {
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    public String getCourseName() { return courseName; }
    public int getCourseCredits() { return courseCredits; }

    public abstract void evaluate(); // strategy per course type
}
