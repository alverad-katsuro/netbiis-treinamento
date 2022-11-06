package curso_03_java8.unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTFApp extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		JTFApp frame = new JTFApp();
		frame.setTitle("Aplicação");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		JTextField tf = new JTextField("Digite Aqui:");
		tf.addActionListener(frame);
		cont.add(tf,BorderLayout.NORTH);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(rootPane, e.getActionCommand());
	}
		
}
