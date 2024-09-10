import br.com.dio.desafio.dominio.Curso;
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
    }
}
