package aula26;

/*
M015 Faça um algoritmo para ler e armazenar em um vetor a temperatura média de todos os dias
de um mês escolhido.
Calcular e escrever:
a) Menor temperatura do mês
b) Maior temperatura do mês
c) Temperatura média mensal
d) O número de dias no mês em que a temperatura foi inferior a média mensal

Authors:
 */

import java.util.Random;
import java.util.Scanner;

public class M015 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Random rdm = new Random();
        int mes, ano;

        System.out.print("Digite o mês: ");
        mes = ler.nextInt();

        System.out.print("Digite o ano: ");
        ano = ler.nextInt();

        TemperaturaMensal temperaturaMensal = new TemperaturaMensal(mes, ano);

        System.out.println("\nTemperaturas: ");
        temperaturaMensal.imprimirTemperatura();

        System.out.println("\nEstatísticas das Temperaturas Mensais");
        System.out.printf("Menor: %d\n", temperaturaMensal.getMenorTemperatura() );
        System.out.printf("Maior: %d\n", temperaturaMensal.getMaiorTemperatura() );
        System.out.printf("Média: %d\n", temperaturaMensal.getMediaTemperaturas() );
        System.out.printf("Qtde de dias do mes que temperatura \n" +
                          "eh menor que a media mensal: %d ",
                temperaturaMensal.getQtdeTemperaturasMenorQueMedia());

    }
}
