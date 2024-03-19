package aula10;

/*
   Gerenciamento de cadastro de alunos
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AlunoStat {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        ArrayList<Aluno> alunos =
                new ArrayList<Aluno>();

        lerDados(ler, alunos);
    }

    private static void lerDados(Scanner ler, ArrayList<Aluno> alunos) {
        Aluno aluno;
        do {
            aluno = new Aluno();
            System.out.print("Primeiro Nome: ");
            aluno.nome = ler.next();
            System.out.print("Idade: ");
            aluno.idade = ler.nextInt();
            if (aluno.idade >0){alunos.add(aluno);}
        } while(aluno.idade > 0);
    }
}
