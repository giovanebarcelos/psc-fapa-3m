package aula12;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PessoaApp {
    private ArrayList<Pessoa> pessoas =
            new ArrayList<Pessoa>();

    public static void main(String[] args) {
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
                    pessoaApp.listar();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
        }


    }

    private void listar() {
        System.out.printf("%-10s", "Código");
        System.out.printf("%-60s", "Nome");
        for (Pessoa pessoa : this.pessoas) {
            System.out.printf("\n%-10d", pessoa.codigo);
            System.out.printf("%-60s", pessoa.nome);
        }
    }

    private void incluir() {
        int codigo = 0;
        while (codigo == 0) {
            codigo = Utl.getInt("Codigo: ");
            try {
                if (this.existPessoa(codigo)) {
                    throw new Exception("Código já existe!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                codigo = 0;
            }
        }

        String nome = Utl.getString("Nome: ");
        String pfOuPj = Utl.getString(
                "PF ou PJ? ",
                new String[]{"PF", "PJ"},
                "Digite PF ou PJ");
        Pessoa pessoa;
        boolean isPF = "PF".equals(pfOuPj);
        String idPfOuPj = Utl.getString(
                isPF ? "CPF: " : "CNPJ");
        if (isPF) {
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
        if ("S".equals(sim_nao)) {
            pessoas.add(pessoa);
        }
    }

    private boolean existPessoa(int codigo) {
        boolean eureka = false;
        for (Pessoa pessoa: this.pessoas){
            if (pessoa.codigo == codigo){
                eureka = true;
            }
        }
        return eureka;
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
