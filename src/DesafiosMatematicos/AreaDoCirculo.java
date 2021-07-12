package DesafiosMatematicos;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double area = 3.14159 * (Math.pow(scan.nextDouble(),2));

        System.out.printf("A=%.4f\n", area);
    }
}
