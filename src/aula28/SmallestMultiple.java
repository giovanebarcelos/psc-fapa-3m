package aula28;

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
--
2520 é o menor número que pode ser dividido por cada um dos números de 1 a 10 sem nenhum restante.
Qual é o menor número positivo que é uniformemente divisível por todos os números de 1 a 20?
--
Project Euler: https://projecteuler.net/problem=5

*/

public class SmallestMultiple {
    public static void main(String[] args) {
        boolean eureka = false;
        long numero = 0, numIni = 1, numFim = 20;

        do {
            numero++;
            eureka = ehDivisivel(numero, numIni, numFim);

        } while (!eureka);

        System.out.printf("O número %d é divisível por todos os números entre %d e %d",
                numero, numIni, numFim );
    }

    private static boolean ehDivisivel(long numero, long numIni, long numFim) {
        for (long divisor = numIni; divisor <= numFim; divisor++){
            if (numero % divisor != 0){
                return false;
            }
        }

        return true;
    }
}
