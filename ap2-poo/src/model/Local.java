package model;

public abstract class Local {
    private String nome;
    private int capacidadeMax, bloco;

    public Local(int capacidadeMax, int bloco, String nome) {
        this.capacidadeMax = capacidadeMax;
        this.bloco = bloco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }
}
