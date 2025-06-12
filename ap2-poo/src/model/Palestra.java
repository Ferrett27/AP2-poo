package model;

import java.util.HashSet;
import java.util.Set;

public class Palestra extends Evento{
    private Sala sala;
    private LaboratorioQuimica laboratorioQuimica;
    private LaboratorioInfo laboratorioInfo;
    private Auditorio auditorio;
    private Palestrante palestrante;
    private Set<Participante> participantes;
    private Set<Organizador> organizadores;

    public Palestra(String titulo, String data, int duracao, double orcamento, Sala sala, Palestrante palestrante) {
        super(titulo, data, duracao, orcamento);
        this.sala = sala;
        this.palestrante = palestrante;
        this.participantes = new HashSet<Participante>();
        this.organizadores = new HashSet<Organizador>();
    }

    public Palestra(String titulo, String data, int duracao, double orcamento, LaboratorioQuimica laboratorioQuimica, Palestrante palestrante) {
        super(titulo, data, duracao, orcamento);
        this.laboratorioQuimica = laboratorioQuimica;
        this.palestrante = palestrante;
        this.participantes = new HashSet<Participante>();
        this.organizadores = new HashSet<Organizador>();
    }

    public Palestra(String titulo, String data, int duracao, double orcamento, LaboratorioInfo laboratorioInfo, Palestrante palestrante) {
        super(titulo, data, duracao, orcamento);
        this.laboratorioInfo = laboratorioInfo;
        this.palestrante = palestrante;
        this.participantes = new HashSet<Participante>();
        this.organizadores = new HashSet<Organizador>();
    }

    public Palestra(String titulo, String data, int duracao, double orcamento, Auditorio auditorio, Palestrante palestrante) {
        super(titulo, data, duracao, orcamento);
        this.auditorio = auditorio;
        this.palestrante = palestrante;
        this.participantes = new HashSet<Participante>();
        this.organizadores = new HashSet<Organizador>();
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
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

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    public void addParticipantes(Participante participante){
        this.participantes.add(participante);
    }

    public void removeParticipantes(Participante participante){
        this.participantes.remove(participante);
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
