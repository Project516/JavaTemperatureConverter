package io.github.project516.JavaTemperatureConverter;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class Runtime {

    Scanner scan = new Scanner(System.in, StandardCharsets.UTF_8.name());
    ConvertTemp temp = new ConvertTemp();

    void run() {

        try {
            String input = scan.nextLine().toLowerCase();

            if (input.equals("f")) {
                System.out.println("Enter Celcus");
                Double cel = scan.nextDouble();
                System.out.println(temp.cToF(cel));
            } else if (input.equals("c")) {
                System.out.println("Enter Farenghitght");
                Double far = scan.nextDouble();
                System.out.println(temp.fToC(far));
            } else {
                System.out.println("Invalid input!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
