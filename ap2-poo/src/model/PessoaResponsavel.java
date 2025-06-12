package model;

public abstract class PessoaResponsavel {
    private String nome;
    private String email;

    public PessoaResponsavel(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
