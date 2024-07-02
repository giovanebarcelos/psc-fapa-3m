package aula30;

import java.util.ArrayList;
import java.util.Scanner;

public class RefeicaoApp {
    private ArrayList<Refeicao> refeicoes;
    private ArrayList<Refeicao> comanda;

    public static void main(String args[]) {
        RefeicaoApp refeicaoApp = new RefeicaoApp();
        refeicaoApp.carregarRefeicoes();

        refeicaoApp.lerRefeicoes();
    }

    private void carregarRefeicoes() {
        this.refeicoes = new ArrayList<Refeicao>();

        this.refeicoes.add(new Refeicao(1, "Vegetariano", 180, TipoRefeicao.Prato));
        this.refeicoes.add(new Refeicao(2, "Peixe", 230, TipoRefeicao.Prato));
        this.refeicoes.add(new Refeicao(3, "Frango", 250, TipoRefeicao.Prato));
        this.refeicoes.add(new Refeicao(4, "Carne", 350, TipoRefeicao.Prato));

        this.refeicoes.add(new Refeicao(1, "Abacaxi", 75, TipoRefeicao.Sobremesa));
        this.refeicoes.add(new Refeicao(2, "Sorvete diet", 110, TipoRefeicao.Sobremesa));
        this.refeicoes.add(new Refeicao(3, "Mousse diet", 170, TipoRefeicao.Sobremesa));
        this.refeicoes.add(new Refeicao(4, "Mouse chocolate", 200, TipoRefeicao.Sobremesa));

        this.refeicoes.add(new Refeicao(1, "Chá", 20, TipoRefeicao.Bebida));
        this.refeicoes.add(new Refeicao(2, "Suco de Laranja", 70, TipoRefeicao.Bebida));
        this.refeicoes.add(new Refeicao(3, "Suco melão", 100, TipoRefeicao.Bebida));
        this.refeicoes.add(new Refeicao(4, "Refrigerante diet", 65, TipoRefeicao.Bebida));
    }

    private void lerRefeicoes(){
        String continuarSN;
        Scanner scanner = new Scanner(System.in);
        do {
            this.lerRefeicao();

            while (true){
                System.out.print("\nContinuar calculando calorias das refeições <S/N>? ");
                continuarSN = scanner.next().toUpperCase();

                if ("S".equals(continuarSN) || "N".equals(continuarSN)){
                    break;
                } else {
                    System.out.println("Digite S para Sim e N para Não!\n");
                }
            }
        } while ("S".equals(continuarSN));
    }

    private void lerRefeicao() {
        System.out.println("== Refeição ==");
        Refeicao prato = this.lerRefeicao(TipoRefeicao.Prato);
        Refeicao sobremesa = this.lerRefeicao(TipoRefeicao.Sobremesa);
        Refeicao bebida = this.lerRefeicao(TipoRefeicao.Bebida);

        comanda = new ArrayList<Refeicao>();
        comanda.add(prato);
        comanda.add(sobremesa);
        comanda.add(bebida);

        System.out.printf("\nTotal de calorias da refeição: %d\n", this.getTotalCalorias());
    }

    Refeicao lerRefeicao(TipoRefeicao tipo) {
        Scanner scanner = new Scanner(System.in);

        Refeicao refeicao;
        do {
            System.out.println(tipo.name() + ": ");
            this.listarRefeicoes(tipo);
            System.out.printf("Digite código da opção de %s: ", tipo.name());
            int codigo = scanner.nextInt();

            refeicao = this.getRefeicao(tipo, codigo);
            if (refeicao == null) {
                System.out.println("Código Inválido");
            }
        } while (refeicao == null);

        return refeicao;
    }

    private void listarRefeicoes(TipoRefeicao tipo) {
        for (Refeicao refeicao : this.refeicoes) {
            if (refeicao.getTipo().equals(tipo)) {
                System.out.println(refeicao.getCodigo() + " - " + refeicao.getNome());
            }
        }

    }

    private Refeicao getRefeicao(TipoRefeicao tipo, int codigo) {
        for (Refeicao refeicao: this.refeicoes){
            if (refeicao.getTipo().equals(tipo) && refeicao.getCodigo() == codigo){
                return refeicao;
            }
        }


        return null;
    }

    private int getTotalCalorias() {
        int totalCalorias = 0;
        for (Refeicao refeicao: this.comanda){
            totalCalorias += refeicao.getQtdeCalorias();
        }
        return totalCalorias;
    }
}
