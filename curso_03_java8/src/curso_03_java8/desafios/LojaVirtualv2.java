package curso_03_java8.desafios;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

@SuppressWarnings("unused")

public class LojaVirtualv2 extends JFrame  {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Loja Virtual");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		JMenuBar barra = new JMenuBar();
		
		JMenu n1 = new JMenu("Clientes");
		JMenuItem n11 = new JMenuItem("Novo");
		JMenuItem n12 = new JMenuItem("Consultar");
		JMenuItem n13 = new JMenuItem("Alterar");
		JMenuItem n14 = new JMenuItem("Deletar");
		n1.add(n11);
		n1.add(n12);
		n1.add(n13);
		n1.add(n14);
		
		JMenu n2 = new JMenu("Cursos");
		JMenuItem n21 = new JMenuItem("Novo");
		JMenuItem n22 = new JMenuItem("Consultar");
		JMenuItem n23 = new JMenuItem("Alterar");
		JMenuItem n24 = new JMenuItem("Deletar");
		n2.add(n21);
		n2.add(n22);
		n2.add(n23);
		n2.add(n24);
		
		barra.add(n1);
		barra.add(n2);
		
		frame.setJMenuBar(barra);
		n11.addActionListener(ev -> cadastroCliente(frame));
		frame.setVisible(true);
	}
	
	public static void cadastroCliente(JFrame frame) {
		frame.setVisible(true);
		JFrame novo_frame = new JFrame("Cadastro");
		novo_frame.setSize(350,250);
		Container cont = novo_frame.getContentPane();
		
		JMenuBar barra = new JMenuBar();
		
		JMenu n1 = new JMenu("Clientes");
		JMenuItem n11 = new JMenuItem("Novo");
		JMenuItem n12 = new JMenuItem("Consultar");
		JMenuItem n13 = new JMenuItem("Alterar");
		JMenuItem n14 = new JMenuItem("Deletar");
		n1.add(n11);
		n1.add(n12);
		n1.add(n13);
		n1.add(n14);
		
		JMenu n2 = new JMenu("Cursos");
		JMenuItem n21 = new JMenuItem("Novo");
		JMenuItem n22 = new JMenuItem("Consultar");
		JMenuItem n23 = new JMenuItem("Alterar");
		JMenuItem n24 = new JMenuItem("Deletar");
		n2.add(n21);
		n2.add(n22);
		n2.add(n23);
		n2.add(n24);
		
		barra.add(n1);
		barra.add(n2);
		
		novo_frame.setJMenuBar(barra);
		
		
		JLabel novo_label = new JLabel("Cadastro cliente");
		cont.add(novo_label);
		JTextField tf_nome = new JTextField("Nome do cliente");
		cont.add(tf_nome);
		novo_frame.setVisible(true);
	}
}
