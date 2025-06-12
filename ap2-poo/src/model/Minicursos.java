package model;

import java.util.HashSet;
import java.util.Set;

public class Minicursos extends Evento{
    private String matrialDeApoio;
    private Sala sala;
    private LaboratorioQuimica laboratorioQuimica;
    private LaboratorioInfo laboratorioInfo;
    private Auditorio auditorio;
    private Set<Participante> participantes;
    private Set<Instrutor> instrutores;
    private Set<Organizador> organizadores;

    public Minicursos(String titulo, String data, int duracao, double orcamento, String matrialDeApoio,  Sala sala) {
        super(titulo, data, duracao, orcamento);
        this.matrialDeApoio = matrialDeApoio;
        this.sala = sala;
        this.participantes = new HashSet<Participante>();
        this.instrutores = new HashSet<Instrutor>();
        this.organizadores = new HashSet<Organizador>();
    }

    public Minicursos(String titulo, String data, int duracao, double orcamento, String matrialDeApoio, LaboratorioQuimica laboratorioQuimica) {
        super(titulo, data, duracao, orcamento);
        this.matrialDeApoio = matrialDeApoio;
        this.laboratorioQuimica = laboratorioQuimica;
        this.participantes = new HashSet<Participante>();
        this.instrutores = new HashSet<Instrutor>();
        this.organizadores = new HashSet<Organizador>();
    }

    public Minicursos(String titulo, String data, int duracao, double orcamento, String matrialDeApoio, LaboratorioInfo laboratorioInfo) {
        super(titulo, data, duracao, orcamento);
        this.matrialDeApoio = matrialDeApoio;
        this.laboratorioInfo = laboratorioInfo;
        this.participantes = new HashSet<Participante>();
        this.instrutores = new HashSet<Instrutor>();
        this.organizadores = new HashSet<Organizador>();

    }

    public Minicursos(String titulo, String data, int duracao, double orcamento, String matrialDeApoio, Auditorio auditorio) {
        super(titulo, data, duracao, orcamento);
        this.matrialDeApoio = matrialDeApoio;
        this.auditorio = auditorio;
        this.participantes = new HashSet<Participante>();
        this.instrutores = new HashSet<Instrutor>();
        this.organizadores = new HashSet<Organizador>();
    }

    public String getMatrialDeApoio() {
        return matrialDeApoio;
    }

    public void setMatrialDeApoio(String matrialDeApoio) {
        this.matrialDeApoio = matrialDeApoio;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LaboratorioQuimica getLaboratorioQuimica() {
        return laboratorioQuimica;
    }

    public void setLaboratorioQuimica(LaboratorioQuimica laboratorioQuimica) {
        this.laboratorioQuimica = laboratorioQuimica;
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

    public Set<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(Set<Instrutor> instrutores) {
        this.instrutores = instrutores;
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

    public void addInstrutor(Instrutor instrutor){
        this.instrutores.add(instrutor);
    }

    public void removeInstrutor(Instrutor instrutor){
        this.instrutores.remove(instrutor);
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
