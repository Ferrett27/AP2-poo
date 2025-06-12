package model;

import java.util.HashSet;
import java.util.Set;

public class Organizador extends PessoaResponsavel{
    private String funcaoAdministrativa;
    private Set<Palestra> palestras;
    private Set<Seminario> seminarios;

    public Organizador(String email, String nome, String funcaoAdministrativa) {
        super(email, nome);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.palestras = new HashSet<Palestra>();
        this.seminarios = new HashSet<Seminario>();
    }

    public Set<Palestra> getPalestras() {
        return palestras;
    }

    public void setPalestras(Set<Palestra> palestras) {
        this.palestras = palestras;
    }

    public Set<Seminario> getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Set<Seminario> seminarios) {
        this.seminarios = seminarios;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public void addPalestra(Palestra palestra){
        this.palestras.add(palestra);
    }

    public void removePalestra(Palestra palestra){
        this.palestras.remove(palestra);
    }

    public void addSeminario(Seminario seminario){
        this.seminarios.add(seminario);
    }

    public void removeSeminario(Seminario seminario){
        this.seminarios.remove(seminario);
    }

}
