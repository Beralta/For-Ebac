package ebac_Mod18.reflections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AlunoReflexaoYT {
    private String nome;
    private Integer numMatricula;
    private ArrayList notas = new ArrayList();

    public String getNome(String pedro) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumMatricula(int numMatricula) {
        return numMatricula;
    }

    public void setNumMatricula(Integer numMatricula) {
        this.numMatricula = numMatricula;
    }

    public void AddNotas(Integer nota) {
        notas.add(nota);
    }

    public void imprimir() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Numero de matrícula: " + numMatricula);
        System.out.println("Notas do semestre:" + notas);
    }

}
