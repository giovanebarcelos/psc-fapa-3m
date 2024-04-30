package aula22;
/*
R016 Construa um algoritmo que, para um grupo de N valores
     inteiros lidos, determine:
- a soma dos números ÍMPARES;
- a quantidade de valores PARES;
- quando N for igual a 0 o programa deve parar de ler os valores
*/

import java.util.Scanner;

public class R016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = -1, somaImpares = 0, qtdePares = 0;
        while (true) {
            System.out.print("Numero: ");
            numero = scanner.nextInt();

            if (numero == 0){
                break;
            } else if (numero % 2 == 0){
                qtdePares++;
            } else {
                somaImpares += numero;
            }
        }

        System.out.println("Qtde Pares: "+qtdePares);
        System.out.println("Soma Impares: "+somaImpares);
    }
}
