package objects;

import java.util.Random;

public class PhoneBill {
    private double tariffCost;
    private double usedMinutes;
    private double allottedMinutes;
    private int id;

    public PhoneBill(double tariffCost, double usedMinutes, double allottedMinutes) {
        this.tariffCost = tariffCost;
        this.usedMinutes = usedMinutes;
        this.allottedMinutes = allottedMinutes;
        Random randomId = new Random();
        this.id = randomId.nextInt(1, Integer.MAX_VALUE);
    }

    public int getId() {
        return id;
    }

    public double calculateOverageFee() {
        double minuteOverageFee = 0.25;
        double overageFee;
        if (usedMinutes > allottedMinutes) {
            double overrunsMinutes = usedMinutes - allottedMinutes;
            overageFee = overrunsMinutes * minuteOverageFee;
        } else{
            overageFee = 0;
        }
        return overageFee;
    }

    public double calculateTax(double overageFee) {
        double minutePercentTax = 0.15;
        double tax;
        if (usedMinutes > allottedMinutes){
            tax = (tariffCost + overageFee) * minutePercentTax;
        } else {
            tax = 0;
        }
        return tax;
    }

    public double calculateTotal(double overageFee, double tax) {
         double totalBill = tariffCost + overageFee + tax;
         return totalBill;
    }


}
