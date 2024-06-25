package aula30;

public class Refeicao {
    private int codigo;
    private String nome;
    private int qtdeCalorias;
    private TipoRefeicao tipo;

    public Refeicao(int codigo, String nome, int qtdeCalorias, TipoRefeicao tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdeCalorias = qtdeCalorias;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdeCalorias() {
        return qtdeCalorias;
    }

    public TipoRefeicao getTipo() {
        return tipo;
    }


}
