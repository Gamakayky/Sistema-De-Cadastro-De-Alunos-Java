package app;

import model.Aluno;
import model.AlunoGraduacao;
import model.AlunoPosGraduacao;
import service.CadastroAluno;

public class Main {

	public static void main(String[] args) {

		CadastroAluno cadastro = new CadastroAluno();

		// Criando alunos de graduação e pós-graduação
		Aluno aluno1 = new AlunoGraduacao("João Silva", "202101", 8.5, 7.0);
		Aluno aluno2 = new AlunoPosGraduacao("Maria Souza", "202102", 7.5, 9.0);

		// Cadastrando alunos
		cadastro.cadastrarAluno(aluno1);
		cadastro.cadastrarAluno(aluno2);

		// Exibindo todos os alunos
		System.out.println("Todos os alunos cadastrados:");
		cadastro.exibirTodosAlunos();

		// Buscando e exibindo um aluno específico pela matrícula
		System.out.println("Buscando aluno com matrícula 202101:");
		cadastro.exibirAlunoPorMatricula("202101");
	}
}
