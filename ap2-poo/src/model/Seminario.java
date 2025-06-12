package model;

import java.util.HashSet;
import java.util.Set;

public class Seminario extends Evento {
    private String tema, nomeAluno, nomeOrientador;
    private Sala sala;
    private LaboratorioQuimica laboratorioQuimica;
    private LaboratorioInfo laboratorioInfo;
    private Auditorio auditorio;
    private Set<Participante> participantes;
    private Set<Organizador> organizadores;

    public Seminario(String titulo, String data, String tema, String nomeAluno, String nomeOrientador, int duracao, double orcamento, Sala sala) {
        super(titulo, data, duracao, orcamento);
        this.tema = tema;
        this.nomeAluno = nomeAluno;
        this.nomeOrientador = nomeOrientador;
        this.sala = sala;
        this.participantes = new HashSet<Participante>();
        this.organizadores = new HashSet<Organizador>();
    }

    public Seminario(String titulo, String data, String tema, String nomeAluno, String nomeOrientador, int duracao, double orcamento, LaboratorioQuimica laboratorioQuimica) {
        super(titulo, data, duracao, orcamento);
        this.tema = tema;
        this.nomeAluno = nomeAluno;
        this.nomeOrientador = nomeOrientador;
        this.laboratorioQuimica = laboratorioQuimica;
        this.participantes = new HashSet<Participante>();
        this.organizadores = new HashSet<Organizador>();
    }

    public Seminario(String titulo, String data, String tema, String nomeAluno, String nomeOrientador, int duracao, double orcamento, LaboratorioInfo laboratorioInfo) {
        super(titulo, data, duracao, orcamento);
        this.tema = tema;
        this.nomeAluno = nomeAluno;
        this.nomeOrientador = nomeOrientador;
        this.laboratorioInfo = laboratorioInfo;
        this.participantes = new HashSet<Participante>();
        this.organizadores = new HashSet<Organizador>();
    }

    public Seminario(Auditorio auditorio, String titulo, String data, String tema, String nomeAluno, String nomeOrientador, int duracao, double orcamento) {
        super(titulo, data, duracao, orcamento);
        this.auditorio = auditorio;
        this.tema = tema;
        this.nomeAluno = nomeAluno;
        this.nomeOrientador = nomeOrientador;
        this.participantes = new HashSet<Participante>();
        this.organizadores = new HashSet<Organizador>();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeOrientador() {
        return nomeOrientador;
    }

    public void setNomeOrientador(String nomeOrientador) {
        this.nomeOrientador = nomeOrientador;
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }

    public void addParticipantes(Participante participante){
        this.participantes.add(participante);
    }

    public void removeParticipantes(Participante participante){
        this.participantes.remove(participante);
    }

    public LaboratorioQuimica getLaboratorioQuimica() {
        return laboratorioQuimica;
    }

    public void setLaboratorioQuimica(LaboratorioQuimica laboratorioQuimica) {
        this.laboratorioQuimica = laboratorioQuimica;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LaboratorioInfo getLaboratorioInfo() {
        return laboratorioInfo;
    }

    public void setLaboratorioInfo(LaboratorioInfo laboratorioInfo) {
        this.laboratorioInfo = laboratorioInfo;
    }

    public Auditorio getAuditorio() {
        return auditorio;
    }

    public void setAuditorio(Auditorio auditorio) {
        this.auditorio = auditorio;
    }

    public Set<Organizador> getOrganizadores() {
        return organizadores;
    }

    public void setOrganizadores(Set<Organizador> organizadores) {
        this.organizadores = organizadores;
    }

    public void addOrganizador(Organizador organizador){
        this.organizadores.add(organizador);
    }

    public void removeOrganizador(Organizador organizador) {
        this.organizadores.remove(organizador);
    }
}
