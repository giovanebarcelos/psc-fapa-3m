package aula18;
/*
C028 Um plano de saúde, após as negociações com o
governo enviou a tabela abaixo para seus
associados. Faça um algoritmo que leia o nome
e a idade do associado e imprima o nome
o valor que esta pessoa deverá pagar.
- até 10 anos = R$ 30,00
- maior de 10 até 29 anos = R$ 60,00
- maior de 29 até 45 anos = R$ 120,00
- maior de 45 até 59 anos = R$ 150,00
- maior de 59 até 65 anos = R$ 250,00
- maior 65 anos = R$ 400,00
 */

import java.util.Scanner;

public class C028 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = ler.nextLine();
        System.out.print("Idade: ");
        int idade = ler.nextInt();

        //double valor = getValorTabela(idade);
        double valor = getValorTabelaF(idade);

        System.out.printf("Nome: %s", nome);
        System.out.printf("Valor: %12.2f", valor);
    }

    private static double getValorTabela(int idade) {
        if (idade <= 10){
            return 30.0;
        } else if (idade <= 29){
            return 60.0;
        } else if (idade <= 45){
            return 120.0;
        } else if (idade <= 59){
            return 150.0;
        } else if (idade <= 65){
            return 250.0;
        } else {
            return 400.0;
        }
    }

    private static double getValorTabelaF(int idade) {
        double[][] tabela = {
                {10, 30.0}, {29, 60.0}, {45, 120.0},
                {59, 150.0}, {65, 250.0}};

        for (int faixa = 0; faixa < tabela.length; faixa++ ){
            if (idade <= tabela[faixa][0]){
                return tabela[faixa][1];
            }
        }

        return 400.0;
    }
}
