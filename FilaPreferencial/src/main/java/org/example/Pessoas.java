package org.example;

public class Pessoas {
    private String nome;
    private int pos;
    private Tipo tipo;

    public Pessoas(String nome, Tipo tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getNome() {
        return nome;
    }

    public int getPos() {
        return pos;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
