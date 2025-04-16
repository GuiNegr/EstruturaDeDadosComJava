package org.example;

public class Fila {
    private Pessoas[] fila;

    public Fila() {
        fila = new Pessoas[1];
    }

    public void inserir(Pessoas p) {
        if(this.fila[fila.length - 1] == null) {
            p.setPos(1);
            this.fila[fila.length - 1] = p;
        }
       else{
            Pessoas[] filaNova = new Pessoas[fila.length + 1];
            System.arraycopy(fila, 0, filaNova, 0, fila.length);
            Pessoas ultimaPos = filaNova[fila.length - 1];
            p.setPos(ultimaPos.getPos() + 1);
            filaNova[filaNova.length - 1] = p;
            this.fila = filaNova;
        }
    }

    private void pop(int pos) {
        Pessoas[] filaNova = new Pessoas[fila.length - 1];
        int aux = 0;


        for (int i = 0; i <= fila.length - 1; i++) {
            if(this.fila[i].getPos() == pos) {
                continue;
            }
            filaNova[aux] = this.fila[i];
            aux++;
        }
        this.fila = filaNova;

    }


    public void chamarPessoas(){
       if(this.fila.length != 1) {
           if(this.fila[1].getTipo() == Tipo.PREFERENCIAL && this.fila[0].getTipo() == Tipo.NORMAL){
               pop(fila[1].getPos());
           }else{
               pop(fila[0].getPos());
           }
       }
    }
}
