package cursoJava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
	/*Main � um m�todo auto execut�vel em java*/
	public static void main(String[] args) {
		/*C�lculo de m�dia*/
		
		String nota1 = JOptionPane.showInputDialog("Informe a nota do primeiro bimestre, com duas casas decimais");
		String nota2 = JOptionPane.showInputDialog("Informe a nota do segundo bimestre, com duas casas decimais");
		String nota3 = JOptionPane.showInputDialog("Informe a nota do terceiro bimestre, com duas casas decimais");
		String nota4 = JOptionPane.showInputDialog("Informe a nota do quarto bimestre, com duas casas decimais");
		
		/*Converte strings para n�meros reais*/
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		/*Calcula m�dia do aluno*/
		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
		if	(media >= 50) {
			
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Parab�ns, voc� foi aprovado com a media de: " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Infelizamente voc� obteve a m�dia de " + media + " que � abaixo da m�dia para ser aprovado. Favor, marcar prova de recupera��o");
			}	
		}else {
		
			JOptionPane.showMessageDialog(null, "Sua m�dia foi: " + media + "Com esta nota voc� reprovou direto");
		
		}
	}
	
}
