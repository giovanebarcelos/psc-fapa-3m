package aula16.R003A;

public class Pessoa {
    private Integer idade;
    private char sexo;
    private Double salario;
    public Pessoa(Integer idade,char sexo,Double salario){
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}