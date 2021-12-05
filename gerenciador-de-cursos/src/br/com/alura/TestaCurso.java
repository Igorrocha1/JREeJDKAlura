package br.com.alura;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                    "Igor Rocha");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));


        List<Aula> aulasImutavel =  javaColecoes.getAulas();
        List<Aula> aulas = new ArrayList<>(aulasImutavel);
        
        System.out.println(aulas);
       
    }
}