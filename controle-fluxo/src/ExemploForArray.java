public class ExemploForArray {
    public static void main(String[] args) {

        // For com arrays e coleções
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Sintaxe verbosa
        /* for (int x=1; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        } */

        // Sintaxe abreviada
        for(String aluno : alunos) {
          System.out.println("Nome do aluno é: " + aluno);
        }

    }
}
