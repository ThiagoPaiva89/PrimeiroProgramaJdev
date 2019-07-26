package cursoJava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
	/*Main é um método auto executável em java*/
	public static void main(String[] args) {
		/*Cálculo de média*/
		
		String nota1 = JOptionPane.showInputDialog("Informe a nota do primeiro bimestre, com duas casas decimais");
		String nota2 = JOptionPane.showInputDialog("Informe a nota do segundo bimestre, com duas casas decimais");
		String nota3 = JOptionPane.showInputDialog("Informe a nota do terceiro bimestre, com duas casas decimais");
		String nota4 = JOptionPane.showInputDialog("Informe a nota do quarto bimestre, com duas casas decimais");
		
		/*Converte strings para números reais*/
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		/*Calcula média do aluno*/
		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
		if	(media >= 50) {
			
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Parabéns, você foi aprovado com a media de: " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Infelizamente você obteve a média de " + media + " que é abaixo da média para ser aprovado. Favor, marcar prova de recuperação");
			}	
		}else {
		
			JOptionPane.showMessageDialog(null, "Sua média foi: " + media + "Com esta nota você reprovou direto");
		
		}
	}
	
}
