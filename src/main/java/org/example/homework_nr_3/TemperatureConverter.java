package org.example.homework_nr_3;

class TemperatureConverter {

    double celsius;
    double fahrenheit;

    TemperatureConverter(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public double toCelsius() {
        return (fahrenheit - 32) / 1.8;
    }

    public double toFahrenheit() {
        return celsius * 1.8 + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter celsius = new TemperatureConverter(0, 123);
        TemperatureConverter fahrenheit = new TemperatureConverter(232.78, 0);
            double celdegree = celsius.toCelsius();
            double fahdegree = fahrenheit.toFahrenheit();
                System.out.println("В цельсиях: " + celdegree + " В форенгейтах: " + fahdegree);
    }

}