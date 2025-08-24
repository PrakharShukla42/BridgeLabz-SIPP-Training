package AIDrivenResumeSystem;

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCandidateName() + " is evaluated for Software Engineering role: Coding test + System Design.");
    }
}
