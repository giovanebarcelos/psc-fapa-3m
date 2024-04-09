package aula16;

import java.util.Scanner;

/*
  Author: Alonso
 */

public class R003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int totalParticipantes = 0;
        double totalSalario = 0.0;
        int idadeMinima = 0;
        int idadeMaxima = 0;
        int mulheresSalarioAte300 = 0;
        int homemContagem = 0;

        System.out.println("Iniciando a pesquisa. Para encerrar, digite idade 0 ou menor.");

        int idade;
        char genero;
        double salario;

        do {
            System.out.print("Digite a idade: ");
            idade = ler.nextInt();

            if (idade > 0) {
                System.out.print("Digite o sexo (M/F): ");
                genero = ler.next().charAt(0);

                System.out.print("Digite o salário: ");
                salario = ler.nextDouble();

                totalParticipantes++;
                totalSalario += salario;

                if (idade < idadeMinima) {
                    idadeMinima = idade;
                }

                if (idadeMaxima < idade) {
                    idadeMaxima = idade;
                }

                if (genero == 'F' && salario <= 300) {
                    mulheresSalarioAte300++;
                }

                if (genero == 'M') {
                    homemContagem++;
                }
            }
        } while (idade > 0);

        double mediaSalario = totalSalario / totalParticipantes;

        System.out.printf("a. Média de salário do grupo: R$%.2f%n", mediaSalario);
        System.out.printf("b. Maior idade do grupo: %d%n", idadeMaxima);
        System.out.printf("c. Menor idade do grupo: %d%n", idadeMinima);
        System.out.printf("d. Porcentagem de mulheres com salário até R$ 300,00: %.2f%%%n", (mulheresSalarioAte300 / (double) totalParticipantes) * 100);
        System.out.printf("e. Quantidade de homens: %d%n", homemContagem);
    }
}

