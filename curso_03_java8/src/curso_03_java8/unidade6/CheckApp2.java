package curso_03_java8.unidade6;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class CheckApp2 {
	public static void main(String args[]){
		JFrame f = new JFrame("Aplicação");
		f.setSize(350,250);
		Container cont = f.getContentPane();
		cont.setLayout(new FlowLayout());
		ButtonGroup btg = new ButtonGroup();
		JRadioButton rb = new JRadioButton("Pequeno",true);
		btg.add(rb); cont.add(rb);
		rb = new JRadioButton("Médio");
		btg.add(rb); cont.add(rb);
		rb = new JRadioButton("Grande");
		btg.add(rb); cont.add(rb); f.setVisible(true);
	}
}
