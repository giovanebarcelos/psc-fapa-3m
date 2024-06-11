package aula28;

/*
R001 Faça um algoritmo que leia um número de referência, um número inicial e outro final.
Informe se o valor de referência encontra-se entre o número inicial e o final digitados.
 */

import java.util.Scanner;

public class R001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de Referência: ");
        int numRef = scanner.nextInt();
        System.out.print("Número Inicial: ");
        int numIni = scanner.nextInt();
        System.out.print("Número Final: ");
        int numFim = scanner.nextInt();

        /*
        if (numRef >= numIni && numRef <= numFim){
            System.out.printf("Número %d encontra-se entre %d e %d", numRef, numIni, numFim );
        } else {
            System.out.printf("Número %d não encontra-se entre %d e %d", numRef, numIni, numFim );
        }
        */

        System.out.printf("Número %d %sencontra-se entre %d e %d", numRef,
                (numRef >= numIni && numRef <= numFim) ? "" : "não ",
                numIni, numFim );
    }
}
