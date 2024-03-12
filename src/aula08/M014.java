package aula08;

/*
M014 Faça um algoritmo para ler 5 idades
     e armazenar em um array.
     Após a leitura total das 5 idades,
     o algoritmo deve escrever essas
     5 idades lidas na ordem inversa.
 */

import java.util.Scanner;

public class M014 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] idades = new int[5];

        for (int pos = 0; pos < 5; pos++){
            System.out.print(pos+") Idade: ");
            idades[pos] = ler.nextInt();
        }

        int pos = 4;
        System.out.print("\n\nIdades invertidas: ");
        while ( pos > -1){
            System.out.print(idades[pos]+" ");
            pos--;
        }
    }
}
