package model;

public class LaboratorioInfo extends Local{
    private int numComputadores;

    public LaboratorioInfo(String nome, int capacidadeMax, int bloco, int numComputadores) {
        super(capacidadeMax, bloco, nome);
        this.numComputadores = numComputadores;
    }

    public int getNumComputadores() {
        return numComputadores;
    }

    public void setNumComputadores(int numComputadores) {
        this.numComputadores = numComputadores;
    }
}
