package AIDrivenResumeSystem;

class ProductManager extends JobRole {
    public ProductManager(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCandidateName() + " is evaluated for Product Manager role: Case Study + Leadership skills.");
    }
}
