package aula24;

/*
  C010 Faça um algoritmo que entre com a Nota do Grau 1 e do Grau 2 e, faça a média aritmética
dos valores digitados e informe: Aprovado se média for maior ou igual a 7 e Reprovado se
for menor que 7.

  Authors: Giovane Barcelos, Arthur
 */

import java.util.Scanner;

public class C010 {
    public static void main (String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a nota do Grau 1");
        double grau1 = ler.nextDouble();

        System.out.println("Insira a nota do Grau 2");
        double grau2 = ler.nextDouble();

        double media = (grau1 + grau2) / 2;

        if(media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
        }
    }
}