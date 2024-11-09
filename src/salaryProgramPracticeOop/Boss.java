package salaryProgramPracticeOop;

public class Boss extends Employee {
    private double fixedSalaryPerWeek = 5000;
    private int numberOfWorkingWeeks = 4;

    public Boss(String firstName, String lastName) {
        super(firstName, lastName);
    }


    public void setNumberOfWorkingWeeks(int numberOfWorkingWeeks){
        this.numberOfWorkingWeeks = numberOfWorkingWeeks;
    }

    @Override
    public double calculateSalary() {
        double monthlySalary = fixedSalaryPerWeek * numberOfWorkingWeeks;
        setSalary(monthlySalary);
        return monthlySalary;
    }

}
