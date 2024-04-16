package aula16.R003A;

import java.util.Comparator;

public class MyComparator implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        int idadeMenorMaior = p1.getIdade().compareTo(p2.getIdade());
        return idadeMenorMaior;
    }
}
