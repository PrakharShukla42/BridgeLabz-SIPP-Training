package AIDrivenResumeSystem;

class DataScientist extends JobRole {
    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCandidateName() + " is evaluated for Data Scientist role: Statistics + ML test.");
    }
}
