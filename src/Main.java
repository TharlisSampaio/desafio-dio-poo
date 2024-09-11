import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args){
        Curso curso = new Curso();

        curso.setTitulo("Curso Java");
        curso.setDescricao("descrição");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição");
        curso2.setCargaHoraria(4);

        System.out.println(curso2);

        // não possivel que a classe Conteudo é abstract
        //Conteudo conteudo = new Conteudo();

        // polimorfismo
        //Conteudo curso3 = new Curso();

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setDate(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcammp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos da Camila: " + devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("Conteudos inscritos da Camila: " + devCamila.getConteudoInscritos());
        System.out.println("Conteudos concluidos da Camila: " + devCamila.getConteudoConcluidos());
        System.out.println("Xp: " + devCamila.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos do João: " + devJoao.getConteudoInscritos());
        devJoao.progredir();
        System.out.println("Conteudos inscritos do João: " + devJoao.getConteudoInscritos());
        System.out.println("Conteudos concluidos do João: " + devJoao.getConteudoConcluidos());


    }
}
