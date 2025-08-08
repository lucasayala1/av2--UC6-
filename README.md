# av2--UC6-

public class Main {
    public static void main(String[] args) {
        // Array com 5 cursos
        Curso[] cursos = new Curso[5];

        cursos[0] = new Curso("Java Básico", 150);
        cursos[1] = new Curso("Python Avançado", 300);
        cursos[2] = new Curso("Desenvolvimento Web", 220);
        cursos[3] = new Curso("Banco de Dados", 180);
        cursos[4] = new Curso("Inteligência Artificial", 270);

        int somaAlunos = 0;

        System.out.println("Cursos com mais de 200 alunos inscritos:");
        for (int i = 0; i < cursos.length; i++) {
            somaAlunos += cursos[i].alunosInscritos;

            if (cursos[i].alunosInscritos > 200) {
                System.out.println("- " + cursos[i].titulo + ": " + cursos[i].alunosInscritos + " alunos");
            }
        }

        double media = (double) somaAlunos / cursos.length;
        System.out.println("\nMédia de alunos inscritos: " + media);
    }
}

class Curso {
    String titulo;
    int alunosInscritos;

    public Curso(String titulo, int alunosInscritos) {
        this.titulo = titulo;
        this.alunosInscritos = alunosInscritos;
    }
}
