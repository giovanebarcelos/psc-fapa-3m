package aula04;

/*
   C002 Leia um número inteiro e informar se ele
        é par ou impar.
*/

import java.util.Scanner;

public class C002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Número: ");
            numero = ler.nextInt();
            imprimirParOuImpar(numero);
            imprimirNumeros(numero);
        } while (numero > 0) ;
    }

    private static void imprimirNumeros(
            int numero) {
        while (numero > 0){
            System.out.println(numero);
            numero = numero - 1;
        }
    }

    private static void imprimirParOuImpar (
        int numero){
            if (numero % 2 == 0) {
                System.out.println("Número par");
            } else {
                System.out.println("Número impar");
            }
        }
    }
