package DesafiosMatematicos;

import java.util.Scanner;

public class CalculoDeViagem {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Integer tempo = scan.nextInt();
        Integer velocidade = scan.nextInt();

        System.out.printf("%.3f\n", (velocidade*tempo)/12.0);
    }
}
