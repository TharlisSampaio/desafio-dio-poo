package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    //Utilizando conceito de herança, já conteudo dos set's pode armazenar tando mentorias como cursos
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public Dev() {
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        // Regra de negocio: ao me inscrever em um bootCamp automaticamente todos os cursos do BootCamp para
        // o set conteudoInscritos
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não matriculado em nenhum conteúdo");
        }
    }

    public double calcularTotalXp() {
        return this.conteudoConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev devs = (Dev) o;
        return Objects.equals(getNome(), devs.getNome()) && Objects.equals(getConteudoInscritos(), devs.getConteudoInscritos()) && Objects.equals(getConteudoConcluidos(), devs.getConteudoConcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudoInscritos(), getConteudoConcluidos());
    }
}
