package objects;

public class PowerSupply {
    private boolean state;
    private int inputVoltage;
    private int outputVoltageFirst;
    private int getOutputVoltageSecond;
    private String message = "";


    public void setInputVoltage(int newVoltage) {
        inputVoltage = newVoltage;
        if (inputVoltage >= 200 && inputVoltage <= 250) {
            state = true;
            outputVoltageFirst = 5;
            getOutputVoltageSecond = 12;
            message = "";
        } else {
            state = false;
            outputVoltageFirst = 0;
            getOutputVoltageSecond = 0;
            if (inputVoltage < 200) {
                message = "Low voltage! ";
            } else {
                message = "High voltage! ";
            }
        }
    }

    public void printInfo() {
        System.out.println(message
                + "Power: " + (state ? "ON" : "OFF")
                + ", Input voltage: " + inputVoltage
                + ", Output voltage first: " + outputVoltageFirst
                + ", Output voltage second: " + getOutputVoltageSecond);
    }
}
