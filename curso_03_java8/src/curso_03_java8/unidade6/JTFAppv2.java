package curso_03_java8.unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTFAppv2 {

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setTitle("Aplicação");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		JTextField tf = new JTextField("Digite Aqui:");
		tf.addActionListener(ev -> {JOptionPane.showMessageDialog(cont, ev.getActionCommand());});
		cont.add(tf,BorderLayout.NORTH);
		frame.setVisible(true);
	}
		
}
