package dev.project516.JavaTemperatureConverter;

/** Convert Temp */
public class ConvertTemp {
    /** Celsius to Fahrenheit */
    public Double cToF(Double c) {
        return (c * 9.0 / 5.0) + 32.0;
    }

    /** Fahrenheit to Celsius */
    public Double fToC(Double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }
}
