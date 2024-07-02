package aula30;

public class SomaPrimos {
    public static void main(String[] args) {
        SomaPrimos somaPrimos = new SomaPrimos();

        long somaDosPrimos = somaPrimos.somaDosPrimosMenoresQue(2000000);

        System.out.printf("A soma dos primos menores que 2 milhões é %d", somaDosPrimos);
    }

    private long somaDosPrimosMenoresQue(int numero) {
        long somaPrimos = 0;

        while (numero > 0){

            if (this.ehPrimo2(numero)){
                somaPrimos += numero;
            }

            numero--;
        }

        return somaPrimos;
    }

    private boolean ehPrimo(int numero) {
        for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++){
            if (numero % divisor == 0){
                return false;
            }
        }

        return true;
    }

    private boolean ehPrimo2(int numero) {
        int divisor = (int) Math.sqrt(numero);

        while (divisor >= 2){
            if (numero % divisor == 0){
                return false;
            }

            divisor--;
        }

        return true;
    }
}