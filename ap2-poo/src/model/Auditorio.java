package model;

public class Auditorio extends Local{
    private boolean possuiSistemaSom, traducaoSimultanea;

    public Auditorio(String nome, int capacidadeMax, int bloco, boolean possuiSistemaSom, boolean traducaoSimultanea) {
        super(capacidadeMax, bloco, nome);
        this.possuiSistemaSom = possuiSistemaSom;
        this.traducaoSimultanea = traducaoSimultanea;
    }

    public boolean isPossuiSistemaSom() {
        return possuiSistemaSom;
    }

    public void setPossuiSistemaSom(boolean possuiSistemaSom) {
        this.possuiSistemaSom = possuiSistemaSom;
    }

    public boolean isTraducaoSimultanea() {
        return traducaoSimultanea;
    }

    public void setTraducaoSimultanea(boolean traducaoSimultanea) {
        this.traducaoSimultanea = traducaoSimultanea;
    }
}
