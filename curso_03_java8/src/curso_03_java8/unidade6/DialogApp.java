package curso_03_java8.unidade6;

import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class DialogApp {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Programa instalado", "Instalação concluída", JOptionPane.INFORMATION_MESSAGE);
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome", "Cadastro do cliente", JOptionPane.INFORMATION_MESSAGE);
		int resposta = JOptionPane.showConfirmDialog(null, "O nome "+nome+" foi informado. Salvar as alterações?");
	}
}
