package salaryProgramPracticeOop;

public class CommissionWorker extends Employee {
    private double baseMonthlySalary = 1000;
    private int sales;
    private double salePercent = 0.10;

    public CommissionWorker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public double calculateSalary() {
        double salary = baseMonthlySalary + (sales * salePercent);
        setSalary(salary);
        return salary;
    }

    public void addToList(){
        System.out.println("Please enter how many sales Commission worker made in this month?");
    }

}
