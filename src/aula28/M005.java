package aula28;

/*
M005 Dado uma matriz de ordem 4x4 faça um algoritmo que:
a) Calcule a soma dos elementos da primeira coluna ;
b) Calcule o produto dos elementos da primeira linha;
c) Calcule a soma de todos os elementos da matriz;
d) Calcule a soma do diagonal principal;
e) Calcule a soma da diagonal secundária.
 */

public class M005 {
    private int[][] matriz;

    public static void main(String[] args) {
        M005 matriz = new M005(
                new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});

        System.out.println("Dados da Matriz:");
        matriz.imprimir();
        System.out.printf("\na) Soma dos elementos da primeira coluna: %d",
                matriz.somaPrimeiraColuna());
        System.out.printf("\nb) Produto dos elementos da primeira linha: %d",
                matriz.produtoPrimeiraLinha());
        System.out.printf("\nc) Soma de todos os elementos da matriz: %d",
                matriz.somaTotal());
        System.out.printf("\nd) Soma da diagonal principal: %d",
                matriz.somaDiagonalPrincipal());
        System.out.printf("\ne) Soma da diagonal secundária: %d",
                matriz.somaDiagonalSecundaria());
    }

    public M005(int[][] matriz){
        this.matriz = matriz;
    }

    public void imprimir(){
        System.out.printf("%4s %4d %4d %4d %4d\n", "M", 0, 1, 2, 3);
        for (int linha = 0; linha < this.matriz.length; linha++){
            System.out.printf("%4d", linha);
            for (int coluna = 0; coluna < this.matriz.length; coluna++){
                System.out.printf(" %4d", this.matriz[linha][coluna]);
            }
            System.out.println();
        }
    }

    public int somaPrimeiraColuna(){
        int soma = 0;

        for (int linha = 0; linha < this.matriz.length; linha++){
            soma += this.matriz[linha][0];
        }

        return soma;
    }

    public int produtoPrimeiraLinha(){
        int produto = 1;

        for (int coluna = 0; coluna < this.matriz.length; coluna++){
            produto *= this.matriz[0][coluna];
        }

        return produto;
    }

    public int somaTotal(){
        int soma = 0;

        int linha = 0;
        while ( linha < this.matriz.length){

            int coluna = 0;
            while ( coluna < this.matriz.length){
                soma += this.matriz[linha][coluna];
                coluna++;
            }

            linha++;
        }

        return soma;
    }

    public int somaDiagonalPrincipal(){
        int soma = 0;
        for (int linha = 0; linha < this.matriz.length; linha++){
            for (int coluna = 0; coluna < this.matriz.length; coluna++){
                if (linha == coluna) {
                    soma += this.matriz[linha][coluna];
                }
            }
        }

        return soma;
    }

    public int somaDiagonalSecundaria(){
        int qtdElementos = this.matriz.length - 1;
        int soma = 0;

        for (int linha = 0; linha < this.matriz.length; linha++){
            soma += this.matriz[linha][ qtdElementos - linha];
        }

        return soma;
    }
}

