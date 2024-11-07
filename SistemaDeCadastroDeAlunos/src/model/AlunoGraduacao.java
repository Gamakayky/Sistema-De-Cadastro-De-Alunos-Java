package model;

public class AlunoGraduacao extends Aluno {
	public AlunoGraduacao(String nome, String matricula, double nota1, double nota2) {
		super(nome, matricula, nota1, nota2);
	}

	@Override
	public double calcularMedia() {
		return (nota1 + nota2) / 2;
	}
}
