package aula16.R003A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class R003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();
        System.out.print("Digite a quantidade de pessoas que serão digitadas: ");
        int n = ler.nextInt();
        int idade, qdeMulheres3000 = 0;
        char sexo;
        double salario;
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da #" + (i + 1) + " pessoa: ");
            System.out.print("Idade: ");
            idade = ler.nextInt();
            System.out.print("Sexo: ");
            sexo = ler.next().charAt(0);
            System.out.print("Salario: ");
            salario = ler.nextDouble();
            if (sexo == 'F' && salario <= 3000) {
                qdeMulheres3000++;
            }
            list.add(new Pessoa(idade, sexo, salario));
            System.out.println("===========");
        }
        double media = list.stream().map(x -> x.getSalario()).reduce(0.0, (x, y) -> x + y) / list.size();
        List<Pessoa> homens = list.stream().filter(x -> x.getSexo() == 'M').collect(Collectors.toList());
        int qdeHomens = homens.size();
        List<Pessoa> mulheres = list.stream().filter(x -> x.getSexo() == 'F').collect(Collectors.toList());
        int qdeMulheres = mulheres.size();
        list.sort(new MyComparator());
        System.out.println("Media dos salarios = R$" + String.format("%.2f", media));
        //System.out.println("Menor idade = " + (list.getFirst()).getIdade());
        //System.out.println("Maior idade = " + (list.getLast()).getIdade());
        System.out.println("Quantidade de homens = " + qdeHomens);
        System.out.println("Porcentagem de mulheres com salario ate 3000 = "
                + String.format("%.1f", (double) qdeMulheres3000 / qdeMulheres * 100) + "%");
    }
}
