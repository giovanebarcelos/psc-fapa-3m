package aula12;

public class PessoaJuridica
        extends Pessoa {
    public String CNPJ;

    public PessoaJuridica(int codigo, String nome, String idPfOuPj) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.CNPJ = idPfOuPj;
    }
}
