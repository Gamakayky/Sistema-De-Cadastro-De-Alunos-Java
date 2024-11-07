package model;

public class AlunoPosGraduacao extends Aluno {
	public AlunoPosGraduacao(String nome, String matricula, double nota1, double nota2) {
		super(nome, matricula, nota1, nota2);
	}

	@Override
	public double calcularMedia() {
		return (nota1 * 0.6) + (nota2 * 0.4);
	}
}
