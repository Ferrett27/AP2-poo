package model;

public abstract class Evento {
    private String titulo, data;
    private int duracao;
    private double orcamento;

    public Evento(String titulo, String data, int duracao, double orcamento) {
        this.titulo = titulo;
        this.data = data;
        this.duracao = duracao;
        this.orcamento = orcamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }
}
