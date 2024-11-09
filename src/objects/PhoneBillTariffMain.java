package objects;

import java.util.Scanner;

public class PhoneBillTariffMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your monthly tariff plan fee: ");
        double tariffPlanCost = scanner.nextDouble();
        System.out.println("Please enter how many minutes you have monthly: ");
        double allottedMinutes = scanner.nextDouble();
        System.out.println("Please enter how many minutes you used: ");
        double usedMinutes = scanner.nextDouble();
        scanner.close();

        PhoneBill bill = new PhoneBill(tariffPlanCost, usedMinutes, allottedMinutes);

        double overageFee = bill.calculateOverageFee();
        double tax = bill.calculateTax(overageFee);
        double totalBill = bill.calculateTotal(overageFee, tax);


        System.out.println("Your bill for this month" + "\n"
                + "ID: " + bill.getId() + "\n"
                + "Tariff plan costs: $" + tariffPlanCost + "\n"
                + "Overage fee: $" + overageFee + "\n"
                + "Tax: $" + tax + "\n"
                + "Total bill: $" + totalBill);
    }


}
