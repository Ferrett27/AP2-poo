package model;

public class Instrutor extends PessoaResponsavel{
    private String formacao, areaDeEspecializacao;


    public Instrutor(String nome, String email, String formacao, String areaDeEspecializacao) {
        super(nome, email);
        this.formacao = formacao;
        this.areaDeEspecializacao = areaDeEspecializacao;
    }


    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAreaDeEspecializacao() {
        return areaDeEspecializacao;
    }

    public void setAreaDeEspecializacao(String areaDeEspecializacao) {
        this.areaDeEspecializacao = areaDeEspecializacao;
    }
}
