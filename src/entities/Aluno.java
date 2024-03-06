package entities;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;

    public double notaTotal() {
        return nota1 + nota2 + nota3 + nota4;
    }
    public double notaFinal() {
        return notaTotal() / 4;
    }
    public double pontosFaltando() {
        if (notaFinal() < 6.0) {
            return 6.0 - notaFinal();
        } else {
            return 0.0;
        }
    }
}
