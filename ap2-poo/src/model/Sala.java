package model;

public class Sala extends Local {
    private int numeroSala;
    private boolean possuiEquipamento;

    public Sala(String nome, int capacidadeMax, int bloco, int numeroSala, boolean possuiEquipamento) {
        super(capacidadeMax, bloco, nome);
        this.numeroSala = numeroSala;
        this.possuiEquipamento = possuiEquipamento;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public boolean isPossuiEquipamento() {
        return possuiEquipamento;
    }

    public void setPossuiEquipamento(boolean possuiEquipamento) {
        this.possuiEquipamento = possuiEquipamento;
    }
}

