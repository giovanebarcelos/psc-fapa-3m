package aula08;

/*
Se listarmos todos os números naturais
abaixo 10 que são múltiplos de 3 ou 5,
nós temos 3, 5, 6 e 9.
A soma desses múltiplos é 23.
Encontre a soma de todos os múltiplos
de 3 ou 5  abaixo 1000.
*/

public class Multiple3_5 {
    public static void main(String[] args) {
        int soma = 0;
        for (int numero = 0;
             numero < 1000;
             numero++) {
            if (numero % 3 == 0 ||
                    numero % 5 == 0) {
                soma = soma + numero;
            }
        }
        System.out.println(soma);
    }
}
