package br.com.dio.desafio.dominio;

import java.time.LocalDate;

// extends: Usa-se extends quando você deseja aplicar herança á sua classe
public class Mentoria extends Conteudo{

    private LocalDate date;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return 0;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", date=" + date +
                '}';
    }

}
