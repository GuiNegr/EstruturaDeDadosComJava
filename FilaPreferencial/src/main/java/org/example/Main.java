package org.example;

import static org.example.Tipo.NORMAL;
import static org.example.Tipo.PREFERENCIAL;

public class Main {
    public static void main(String[] args) {
        Pessoas joao = new Pessoas("joao",NORMAL);
        Pessoas roberto = new Pessoas("roberto",PREFERENCIAL);

        Pessoas paulo = new Pessoas("paulo",NORMAL);
        Pessoas jonas = new Pessoas("jonas",NORMAL);

        Pessoas pietro = new Pessoas("pietro",PREFERENCIAL);

        Fila fila = new Fila();
        fila.inserir(joao);
        fila.inserir(roberto);
        fila.inserir(jonas);
        fila.inserir(paulo);
        fila.inserir(pietro);


        fila.chamarPessoas();
        fila.chamarPessoas();
        fila.chamarPessoas();
        fila.chamarPessoas();
        fila.chamarPessoas();


    }
}