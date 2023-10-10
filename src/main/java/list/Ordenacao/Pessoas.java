package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoas implements Comparable<Pessoas> {
    //atributos
    private String nome;
    private int idade;
    private double altura;

    public Pessoas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoas p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

class ComparatorPorAltura implements Comparator<Pessoas> {
    @Override
    public int compare(Pessoas p1, Pessoas p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
