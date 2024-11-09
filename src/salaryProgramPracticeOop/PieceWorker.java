package salaryProgramPracticeOop;

public class PieceWorker extends Employee {
    private double simpleDetailPay = 3.20;
    private double complexDetailPay = 5.95;
    private double numberOfSimpleDetailsMade;
    private double numberOfComplexDetailsMade;

    public PieceWorker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setNumberOfSimpleDetailsMade(double numberOfSimpleDetailsMade) {
        this.numberOfSimpleDetailsMade = numberOfSimpleDetailsMade;
    }

    public void setNumberOfComplexDetailsMade(double numberOfComplexDetailsMade) {
        this.numberOfComplexDetailsMade = numberOfComplexDetailsMade;
    }

    @Override
    public double calculateSalary() {
        double monthlySalary = (numberOfComplexDetailsMade * complexDetailPay) + (numberOfSimpleDetailsMade * numberOfSimpleDetailsMade);
        setSalary(monthlySalary);
        return monthlySalary;
    }

    public void addToList(){
        System.out.println("Please enter how many complex details Piece worker made in this month?");
        System.out.println("How many simple details Piece worker made in this month?");
    }




}
