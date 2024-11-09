package salaryProgramPracticeOop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee("Test", "Test");

        Boss boss = new Boss("Daria", "Tretiakova");
        employee.setEmployeesList(boss);
        boss.calculateSalary();


        HourlyWorker hourlyWorker = new HourlyWorker("Den", "Ofrin");
        employee.setEmployeesList(hourlyWorker);
        hourlyWorker.addToList();
        hourlyWorker.setWorkingDays(scanner.nextInt());
        hourlyWorker.setOvertimeWorkingHours(scanner.nextInt());
        hourlyWorker.calculateSalary();

        CommissionWorker commissionWorker = new CommissionWorker("Igor", "Horodenko");
        employee.setEmployeesList(commissionWorker);
        commissionWorker.addToList();
        commissionWorker.setSales(scanner.nextInt());
        commissionWorker.calculateSalary();

        PieceWorker pieceWorker = new PieceWorker("Irina", "Irris");
        employee.setEmployeesList(pieceWorker);
        pieceWorker.addToList();
        pieceWorker.setNumberOfSimpleDetailsMade(scanner.nextInt());
        pieceWorker.setNumberOfComplexDetailsMade(scanner.nextInt());
        pieceWorker.calculateSalary();

        employee.addToList();

    }
}
