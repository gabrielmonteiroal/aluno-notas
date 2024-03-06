import entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome e nota do aluno (a): ");
        System.out.println("-----------------------------------");
        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        System.out.print("Primeira nota: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        aluno.nota3 = sc.nextDouble();
        System.out.print("Quarta nota: ");
        aluno.nota4 = sc.nextDouble();
        System.out.println();

        System.out.printf("Nota Final: %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() < 6.0) {
            System.out.println("ALUNO(A) REPROVOU");
            System.out.printf("FALTOU %.2f PONTOS%n", aluno.pontosFaltando());
        }
        else {
            System.out.println();
            System.out.println("ALUNO(A) APROVADO");
        }

        sc.close();

    }
}