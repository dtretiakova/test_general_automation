package chapter5;

import java.util.Scanner;

/* Phone Bill Calculator
Подсчитайте окончательную сумму счета за мобильный телефон.
Разрешите оператору ввести плату за план и количество минут превышения.
Взимайте с пользователя 0,25 за каждую минуту превышения плана и налог в размере 15%  за каждую минуту превышения тарифного плана.
промежуточный итог.
Создайте отдельные методы для расчета tax, сборов за перерасход и окончательной суммы.
Распечатайте подробный счет.
 */
public class CalculateCellPhoneBillMethods {

    public static void main(String[] args) {
        // Get what we know
        double minutePercentTax = 0.15;
        double minuteOverageFee = 0.25;

        // Get what we don't know
        System.out.println("Please enter your monthly tariff plan fee: ");
        Scanner scanner = new Scanner(System.in);
        double tariffCost =  scanner.nextDouble();
        System.out.println("Enter the number of minutes overruns: ");
        double overrunsMinutes = scanner.nextDouble();
        scanner.close();

        // Calculate the overage fees, tax, calculate and print the final total bill.
        calculateTotalBill(overrunsMinutes, minuteOverageFee, tariffCost, minutePercentTax);
    }

    public static void calculateTotalBill(double overrunsMinutes, double minuteOverageFee, double tariffCost,
                                          double minutePercentTax) {
        double overageFee = overrunsMinutes * minuteOverageFee;
        double tax = (tariffCost + overageFee) * minutePercentTax;
        double totalBill = tariffCost + overageFee + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Tariff plan: $" + String.format("%.2f", tariffCost));
        System.out.println("Overage fee: $" + String.format("%.2f", overageFee));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total bill:$ " + String.format("%.2f", totalBill));
    }
}

