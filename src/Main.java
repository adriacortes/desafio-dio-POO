import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso java = new Curso();
        java.setTitulo("Curso Java");
        java.setDescricao("Aprendendo Java");
        java.setCargaHoraria(8);

        Curso javaScript = new Curso();
        javaScript.setTitulo("Curso JS");
        javaScript.setDescricao("Aprendendo JS");
        javaScript.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Treinando em Java");
        bootcamp.getConteudos().add(java);
        bootcamp.getConteudos().add(javaScript);
        bootcamp.getConteudos().add(mentoria);

        Dev devAdria = new Dev();
        devAdria.setNome("Ádria Aline");
        devAdria.inscreverBootcamp(bootcamp);
        System.out.println("***** Aluno: ***** " +devAdria.getNome());
        System.out.println("Contúdos inscritos: " + devAdria.getConteudosInscritos());
        devAdria.progredir();
        devAdria.progredir();
        System.out.println("Contúdos concluidos: " + devAdria.getConteudosConcluidos());
        System.out.println("Contúdos inscritos: " + devAdria.getConteudosInscritos());
        System.out.println("XP: "+ devAdria.calcularXp());


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("***** Aluno: ***** " +devJoao.getNome());
        System.out.println("Contúdos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Contúdos concluidos: " + devAdria.getConteudosConcluidos());
        System.out.println("Contúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("XP: "+ devJoao.calcularXp());

        /*System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);*/

    }
}
