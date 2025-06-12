package control;

import model.*;

public class Programa {
    public static void main(String[] args) {
        // Definindo Locais
        Auditorio auditorio1 = new Auditorio("Auditorio principal",80,5,true,true);
        Auditorio auditorio2 = new Auditorio("Auditorio secundario",40,4,true,false);
        Sala sala1 = new Sala("Sala Tech",20,5,121,true);
        Sala sala2 = new Sala("Sala Premium",30,4,203,false);
        LaboratorioInfo labTech = new LaboratorioInfo("Tech 3",20,4,20);
        LaboratorioQuimica labQuim = new LaboratorioQuimica("Quimica Lab",15,4,8);

        //Definindo organizadores e instrutores
        Organizador john1 = new Organizador("sla@gmail.com","John Testes","coordenador");
        Organizador Ferrett = new Organizador("exemplo@gmail.com","Ferrett Organiza","responsável por inscrições");
        Instrutor instru1 = new Instrutor("Exemplo", "Exemplo2@gmail.com","formação tal","AreaTech");
        Instrutor instru2 = new Instrutor("Exemplo2", "Exemplo3@gmail.com","formação2","AreaJuridica");

        //Palestrante
        Palestrante palestrante1 = new Palestrante("Pedro","sla50@gmail.com","Havard");
        Palestrante palestrante2 = new Palestrante("Eduardo","edu@gmail.com","havard");

        //Participantes
        Participante participante1 = new Participante("Rodrigo","12132131","sla23813@gmail.com","Ciencia de dados");
        Participante participante2 = new Participante("Lucas","143534","sla23343@gmail.com","Eng Software");


        //Eventos
        Minicursos cursoTech = new Minicursos("O guia da IA","12-02-2027",5,1000,"Livro 5 etc etc", auditorio2);
        Minicursos cursoJuri = new Minicursos("o Juridico","10-29-2045",2,1000,"Livro juridico tal",auditorio1);
        cursoTech.addOrganizador(john1);
        cursoTech.addInstrutor(instru1);

        cursoJuri.addInstrutor(instru1);
        cursoJuri.addInstrutor(instru2);
        cursoJuri.addOrganizador(john1);

        Palestra palestra1 = new Palestra("palestra","15-03-2025",6,1000,sala2,palestrante1);
        Palestra palestra2 = new Palestra("palestra2","09-05-2056",7,2000,sala1,palestrante2);
        palestra1.addOrganizador(Ferrett);
        palestra1.addOrganizador(john1);

        palestra2.addOrganizador(Ferrett);

        Seminario seminario1 = new Seminario("seminario","03-12-2079","Juridico","Rafael", "professor etc",3,3000,labTech);
        Seminario seminario2 = new Seminario("seminario2","02-12-2045","tema2","Bernardo","Prof Sla",4,100, labQuim);
        seminario1.addOrganizador(john1);
        seminario2.addOrganizador(john1);

        cursoTech.addParticipantes(participante1);
        cursoJuri.addParticipantes(participante2);

        palestra1.addParticipantes(participante1);
        palestra1.addParticipantes(participante2);
        palestra2.addParticipantes(participante2);

        seminario1.addParticipantes(participante1);
        seminario2.addParticipantes(participante2);
        seminario2.addParticipantes(participante1);

    }
}
