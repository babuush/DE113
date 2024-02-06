import java.util.Scanner;

public class Temperature {
    private double temperatureFahrenheit;

    // Constructor
    public Temperature(double temperatureFahrenheit) {
        this.temperatureFahrenheit = temperatureFahrenheit;
    }

    // Method to convert Fahrenheit to Celsius
    public double toCelsius() {
        return (temperatureFahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public double toFahrenheit() {
        return temperatureFahrenheit;
    }

    // Mutator method to set temperature in Fahrenheit
    public void setFahrenheit(double temperatureFahrenheit) {
        this.temperatureFahrenheit = temperatureFahrenheit;
    }

    // Mutator method to set temperature in Celsius
    public void setCelsius(double temperatureCelsius) {
        this.temperatureFahrenheit = temperatureCelsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in degrees Fahrenheit: ");
        double tempFahrenheit = scanner.nextDouble();

        Temperature temperature = new Temperature(tempFahrenheit);

        double tempCelsius = temperature.toCelsius();

        System.out.println("Temperature in degrees Celsius: " + tempCelsius);

        scanner.close();
    }
}





