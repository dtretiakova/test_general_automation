package exceptionsTemperatureConverter;

public class TemperatureConverter {
    private double celsius;
    private double fahrenheit;

    public TemperatureConverter() {
    }

    public void printInfo(){
        System.out.println("Enter 1 - for calculating Celsius°C temperature to Fahrenheit°F temperature" + "\n" +
                "OR Enter 2 - for calculating Fahrenheit°F temperature to Celsius°C temperature" + "\n" +
                "OR Enter 0 - to exit");
    }

    public double calculateCelsiusToFahrenheit(double celsius) throws InvalidTemperatureException {
        double koef = 1.8;
        double celsiusMaxValue = 273.15;
        double celsiusMinValue = -273.15;
        if (celsius > celsiusMaxValue) {
            throw new InvalidTemperatureException("You entered invalid value, " +
                    "celsius temperature cannot be more than " + celsiusMaxValue + "°C");
        } else if (celsius < celsiusMinValue) {
            throw new InvalidTemperatureException("You entered invalid value, " +
                    "celsius temperature cannot be less than " + celsiusMinValue + "°C");
        }
        this.celsius = celsius;
        return this.fahrenheit = (koef * celsius) + 32;
    }


    public double calculateFahrenheitToCelsius(double fahrenheit) throws InvalidTemperatureException {
        double koef = 0.5555;
        double fahrenheitMaxValue = 459.67;
        double fahrenheitMinValue = -459.67;
        if (fahrenheit > fahrenheitMaxValue) {
            throw new InvalidTemperatureException("You entered invalid value, " +
                    "Fahrenheit temperature cannot be more than " + fahrenheitMaxValue + "°F");
        } else if (fahrenheit < fahrenheitMinValue) {
            throw new InvalidTemperatureException("You entered invalid value," +
                    "Fahrenheit temperature cannot be more than " + fahrenheitMinValue + "°F");
        }

        this.fahrenheit = fahrenheit;
        return this.celsius = (fahrenheit - 32) * koef;
    }

    @Override
    public String toString() {
        return "TemperatureConverter{" +
                "celsius=" + celsius +
                ", fahrenheit=" + fahrenheit +
                '}';
    }
}
