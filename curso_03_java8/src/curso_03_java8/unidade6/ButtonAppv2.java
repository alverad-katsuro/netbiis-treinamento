package curso_03_java8.unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonAppv2 {

	public static void main(String args[]){
		JFrame frame = new JFrame();
		frame.setTitle("Aplicação");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		cont.setLayout(new FlowLayout());
		JButton botao = new JButton("Isto é um botão!");
		cont.add(botao);
		botao.addActionListener(ev -> {JOptionPane.showMessageDialog(cont, ev.getActionCommand());});
		frame.setVisible(true);
	}
}
