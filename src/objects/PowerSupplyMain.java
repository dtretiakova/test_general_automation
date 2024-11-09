package objects;

public class PowerSupplyMain {
    public static void main(String[] args) {
        PowerSupply ps = new PowerSupply();
        ps.printInfo();

        ps.setInputVoltage(199);
        ps.printInfo();

        ps.setInputVoltage(200);
        ps.printInfo();

        ps.setInputVoltage(250);
        ps.printInfo();

        ps.setInputVoltage(251);
        ps.printInfo();
    }
}
