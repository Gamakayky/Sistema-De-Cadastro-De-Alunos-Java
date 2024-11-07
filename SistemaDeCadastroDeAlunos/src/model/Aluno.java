package model;

import interfaceGrafica.Calculavel;

public abstract class Aluno implements Calculavel {

	protected String nome;
	private String matricula;
	protected double nota1;
	protected double nota2;

	public Aluno(String nome, String matricula, double nota1, double nota2) {
		this.nome = nome;
		this.setMatricula(matricula);
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public boolean verificarAprovacao() {
		return calcularMedia() >= 7.0;
	}

	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("Média: " + calcularMedia());
		System.out.println("Status: " + (verificarAprovacao() ? "Aprovado" : "Reprovado"));
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
