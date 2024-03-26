package aula12;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PessoaApp {
    private ArrayList<Pessoa> pessoas =
            new ArrayList<Pessoa>();

    public static void main(String[] args){
        PessoaApp pessoaApp =
                new PessoaApp();

        int opcao = 0;
        while (opcao != 9) {
            opcao = pessoaApp.menu();

            switch (opcao) {
                case 1:
                    System.out.println("Incluir");
                    pessoaApp.incluir();
                    break;
                case 2:
                    System.out.println("Listar");
                    //pessoaApp.listar();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
        }


    }

    private void incluir() {
        int codigo = Utl.getInt("Codigo: ");
        String nome = Utl.getString("Nome: ");
        String pfOuPj = Utl.getString(
                "PF ou PJ? ",
                new String[]{"PF", "PJ"},
                "Digite PF ou PJ");
        Pessoa pessoa;
        boolean isPF = "PF".equals(pfOuPj);
        String idPfOuPj = Utl.getString(
                isPF ? "CPF: ": "CNPJ");
        if (isPF){
            pessoa = new PessoaFisica(
                    codigo, nome, idPfOuPj);
        } else {
            pessoa = new PessoaJuridica(
                    codigo, nome, idPfOuPj);
        }
        String sim_nao = Utl.getString(
                "Salvar? ",
                new String[]{"S", "N"},
                "Digite S ou N");
        if ("S".equals(sim_nao)){
            pessoas.add(pessoa);
        }
    }

    private int menu() {
        System.out.println("--- Menu ---");
        System.out.println("1. Incluir");
        System.out.println("2. Listar");
        System.out.println("9. Sair");
        Scanner ler = new Scanner(System.in);
        System.out.println("Opcao: ");
        return ler.nextInt();
    }
}
