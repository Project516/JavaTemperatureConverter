package io.github.project516.JavaTemperatureConverter;

import io.github.project516.jlibutils.SystemInfo;

public class Main {

    static SystemInfo info = new SystemInfo();

    public static void main(String[] args) {

        System.out.println("Vendor: " + info.vendor());
        Runtime run = new Runtime();
        run.run();
    }
}
