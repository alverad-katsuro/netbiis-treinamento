package curso_03_java8.unidade6;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxApp {
	public static void main(String args[]){
		JFrame f = new JFrame("Aplicação");
		f.setSize(350,250);
		Container cont = f.getContentPane();
		cont.setLayout(new FlowLayout());
		String[] init = {"Brasil","EUA","Portugal"};
		JComboBox<String> combo = new JComboBox<>(init);
		cont.add(combo);
		f.setVisible(true);
	}
}
