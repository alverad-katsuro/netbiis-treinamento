package curso_03_java8.unidade6;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConverterApp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	static JTextField TF_temperatura = new JTextField();
	static JLabel L_resultado = new JLabel("32º Farenheith");
	static JButton botao = new JButton("Converter");
	
	public static void main(String args[]){
		ConverterApp frame = new ConverterApp();
		frame.setTitle("Aplicação");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		cont.setLayout(new GridLayout(1,2));
		JPanel esquerda = new JPanel();
		esquerda.setLayout(new BoxLayout(esquerda, BoxLayout.Y_AXIS));
		//esquerda.setLayout(new FlowLayout());
		//TF_temperatura.setSize(150, 150);
		//esquerda.setSize(150, 150);
		esquerda.add(TF_temperatura);
		esquerda.add(new JLabel("Celsius"));
		
		JPanel direita = new JPanel();
		direita.setLayout(new BoxLayout(direita, BoxLayout.Y_AXIS));
		//direita.setLayout(new FlowLayout());
		
		direita.add(botao);
		direita.add(L_resultado);
		
		
		cont.add(esquerda);
		cont.add(direita);
		
		botao.addActionListener(frame);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			L_resultado.setText(String.format("%.2fº Farenheith",(Float.parseFloat(TF_temperatura.getText()) * (9/5)) + 32));
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
	}
}
