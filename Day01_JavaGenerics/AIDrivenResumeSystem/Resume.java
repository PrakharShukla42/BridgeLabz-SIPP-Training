package AIDrivenResumeSystem;

class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void processResume() {
        jobRole.evaluate();
    }

    public T getJobRole() {
        return jobRole;
    }
}
