package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {
    //atributos
    private final Set<Aluno> alunoSet;

    public GerenciadorAluno() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }

        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();

        // Adicionando alunos ao gerenciador
        gerenciadorAluno.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAluno.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAluno.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAluno.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAluno.alunoSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAluno.removerAlunoPorMatricula(000L);
        gerenciadorAluno.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciadorAluno.alunoSet);

        // Exibindo alunos ordenados por nome
        gerenciadorAluno.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        gerenciadorAluno.exibirAlunosPorNota();
    }
}