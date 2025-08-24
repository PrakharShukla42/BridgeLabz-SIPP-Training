package AIDrivenResumeSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Amit"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Priya"));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Rahul"));


        seResume.processResume();
        dsResume.processResume();
        pmResume.processResume();


        List<JobRole> candidates = Arrays.asList(
                new SoftwareEngineer("Vikram"),
                new DataScientist("Neha"),
                new ProductManager("Suresh")
        );

        System.out.println("\n--- Bulk Resume Screening ---");
        ResumeScreeningSystem.screenResumes(candidates);
    }
}
