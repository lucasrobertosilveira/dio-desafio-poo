import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcampo(bootcamp);
        System.out.println("Conteúdos incritos: " + devLucas.getConteudosInscritos());

        devLucas.progredir();
        devLucas.progredir();

        System.out.println("Conteúdos incritos: " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

        System.out.println(" -------------------------- ");


        Dev devAlessandro = new Dev();
        devAlessandro.setNome("Alessandro");
        devAlessandro.inscreverBootcampo(bootcamp);
        System.out.println("Conteúdos incritos: " + devAlessandro.getConteudosInscritos());

        devAlessandro.progredir();
        devAlessandro.progredir();
        devAlessandro.progredir();

        System.out.println("Conteúdos incritos: " + devAlessandro.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devAlessandro.getConteudosConcluidos());
        System.out.println("XP: " + devAlessandro.calcularTotalXp());

    }
}