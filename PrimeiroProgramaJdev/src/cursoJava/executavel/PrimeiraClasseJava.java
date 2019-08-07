package cursoJava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;
import cursoJava.classes.Disciplina;
import cursoJava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	/*Main é um método auto executável em java*/
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		
		
		for (int qtd = 1; qtd <= 5; qtd++) {
	
		String nome = JOptionPane.showInputDialog("Digite o nome do " +qtd+ "o Aluno");
		String dataNascimento = JOptionPane.showInputDialog("Aluno, digite sua data de nascimento: ");
		String registroGeral = JOptionPane.showInputDialog("Aluno, digite seu RG: ");
		String cpf = JOptionPane.showInputDialog("Aluno, digite seu CPF: ");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome do pai");
		String dataMatricula = JOptionPane.showInputDialog("Data de matrícula");
		String nomeEscola = JOptionPane.showInputDialog("Nome da escola:");
		String serie = JOptionPane.showInputDialog("Serie matriculado");
	
		
		
		Aluno aluno1 = new Aluno(); /*Aluno joão*/
		aluno1.setNome(nome);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serie);
		
		for (int posicao = 1; posicao <= 4; posicao++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina " + posicao + ": ");
			String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da disciplina " + posicao + ": ");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");
		
		if (escolha == 0) { /*Opção sim = 0*/
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while(continuarRemover == 0) {
			
			String disciplinaRemover = JOptionPane.showInputDialog("Qual deseja remover, 1, 2, 3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
			}
		}
		
		alunos.add(aluno1);
		
		}
		
		for (Aluno aluno : alunos) {
			
			if (aluno.getResultadoAluno().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			}else if (aluno.getResultadoAluno().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			}else {
				alunosReprovados.add(aluno);
			}
			
		}
		
		System.out.println("----------------------Lista dos Aprovados------------------");
			for	(Aluno aluno : alunosAprovados) {
				System.out.println("Resultado = " + aluno.getResultadoAluno() + " com média de " + aluno.getMediaNota());
				
			}
			
		System.out.println("----------------------Lista dos Reprovados------------------");
			for	(Aluno aluno : alunosReprovados) {
				System.out.println("Resultado = " + aluno.getResultadoAluno() + " com média de " + aluno.getMediaNota());
				
			}
		System.out.println("----------------------Lista dos em Recuperação------------------");
			for	(Aluno aluno : alunosRecuperacao) {
				System.out.println("Resultado = " + aluno.getResultadoAluno() + " com média de " + aluno.getMediaNota());
				
			}	
	}
}
