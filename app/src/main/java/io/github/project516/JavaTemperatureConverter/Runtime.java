package io.github.project516.JavaTemperatureConverter;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class Runtime {

    Scanner scan = new Scanner(System.in, StandardCharsets.UTF_8.name());
    ConvertTemp temp = new ConvertTemp();
    Text text = new Text();

    void run() {

        try {
            text.printInst();
            String input = scan.nextLine().toLowerCase();

            if (input.equals("f")) {
                System.out.print("Enter Celsius: ");
                Double cel = scan.nextDouble();
                System.out.println("Fahrenheit: " + temp.cToF(cel));
            } else if (input.equals("c")) {
                System.out.print("Enter Fahrenheit: ");
                Double far = scan.nextDouble();
                System.out.println("Celsius: " + temp.fToC(far));
            } else {
                System.out.println("Invalid input!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
