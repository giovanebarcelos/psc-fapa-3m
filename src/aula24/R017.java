package aula24;

/*
R017 Elabore um algoritmo que imprima todos os números pares compreendidos entre 13 e 133.
O algoritmo deve também calcular e imprimir a soma destes valores.
 */

public class R017 {
    public static void main(String[] args) {
        int somaPares = 0, qtdePares = 0;

        for (int numero = 13; numero <= 133; numero++){
            if (numero % 2 == 0){
                if (qtdePares > 10){
                    System.out.println();
                    qtdePares = 0;
                }
                System.out.printf("%d, ", numero);
                somaPares += numero;
                qtdePares++;
            }
        }
        System.out.println("\nSoma dos pares entre 13 e 133 é "+somaPares);
    }
}
