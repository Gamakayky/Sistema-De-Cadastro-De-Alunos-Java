package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Aluno;

public class CadastroAluno {
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private Map<String, Aluno> alunosMap = new HashMap<>();

	public void cadastrarAluno(Aluno aluno) {
		alunos.add(aluno);
		alunosMap.put(aluno.getMatricula(), aluno);
	}

	public void exibirTodosAlunos() {
		for (Aluno aluno : alunos) {
			aluno.exibirInfo();
			System.out.println("--------------");
		}
	}

	public Aluno buscarAlunoPorMatricula(String matricula) {
		return alunosMap.get(matricula);
	}

	public void exibirAlunoPorMatricula(String matricula) {
		Aluno aluno = buscarAlunoPorMatricula(matricula);
		if (aluno != null) {
			aluno.exibirInfo();
		} else {
			System.out.println("Aluno não encontrado.");
		}
	}
}
