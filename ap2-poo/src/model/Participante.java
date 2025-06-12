package model;

public class Participante {
    private String nome, cpfParti, emailParti, curso;

    public Participante(String nome, String cpfParti, String emailParti, String curso) {
        this.nome = nome;
        this.cpfParti = cpfParti;
        this.emailParti = emailParti;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfParti() {
        return cpfParti;
    }

    public void setCpfParti(String cpfParti) {
        this.cpfParti = cpfParti;
    }

    public String getEmailParti() {
        return emailParti;
    }

    public void setEmailParti(String emailParti) {
        this.emailParti = emailParti;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
