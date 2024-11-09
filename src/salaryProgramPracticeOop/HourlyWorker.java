package salaryProgramPracticeOop;

public class HourlyWorker extends Employee{
    private double hourlyPay = 10.75;
    private int bonus = 2;
    private int estimatedWorkingHoursPerDay = 8;
    private int overtimeWorkingHours;
    private int workingDays;

    public HourlyWorker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public void setOvertimeWorkingHours(int overtimeWorkingHours) {
        this.overtimeWorkingHours = overtimeWorkingHours;
    }

    @Override
    public double calculateSalary() {
        double estimateSalary = (estimatedWorkingHoursPerDay * hourlyPay) * workingDays;
        double bonusSalary = (hourlyPay * overtimeWorkingHours) * bonus;
        double monthlySalary = estimateSalary + bonusSalary;
        setSalary(monthlySalary);
        return monthlySalary;
    }

    public void addToList(){
        System.out.println("Please enter the number of working days the hourly worker worked this month?");
        System.out.println("How many overtime hours did Hourly worker work this month?");
    }
}
