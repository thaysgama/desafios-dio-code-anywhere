package DesafiosBasicos;

import java.util.Scanner;

public class EntradaSaidaCpf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] cpf = sc.nextLine().split("[-.]");
        for (int i = 0; i <= cpf.length-1; i++) {
            System.out.printf("%s\n",cpf[i]);
        }
        sc.close();
    }
}

