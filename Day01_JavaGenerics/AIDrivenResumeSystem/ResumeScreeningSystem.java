package AIDrivenResumeSystem;

import java.util.List;

class ResumeScreeningSystem {

    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            role.evaluate();
        }
    }
}
