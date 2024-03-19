package aula10;

public class PessoaApp {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        PessoaFisica pessoaFisica =
                new PessoaFisica();
        PessoaJuridica pessoaJuridica =
                new PessoaJuridica();
        pessoa.id = 1;
        pessoaFisica.id = 2;
        pessoaJuridica.id = 3;
        if (pessoaFisica instanceof Pessoa){
            System.out.println("SIM");
        }
    }
}
