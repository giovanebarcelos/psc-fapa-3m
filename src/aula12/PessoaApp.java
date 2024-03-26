package aula12;

import java.util.Scanner;

public class PessoaApp {
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
