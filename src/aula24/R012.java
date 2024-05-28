package aula24;

/*
R012 Elabore um algoritmo para calcular e imprimir a média aritmética dos
     números inteiros positivos ímpares inferiores ou iguais a um número N
     lido inicialmente.

Authors: Giovane Barcelos, Arthur
*/
import java.util.Scanner;

public class R012 {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira o número: ");
        int numero = read.nextInt();
        int soma = 0;
        int quantidadePositivos = 0;

        while (numero > 0) {
            if (numero % 2 != 0) {
                soma += numero;
                quantidadePositivos++;
            }
            numero--;
        }

        System.out.println("Média: " + (float) soma / (float) quantidadePositivos);
    }
}
