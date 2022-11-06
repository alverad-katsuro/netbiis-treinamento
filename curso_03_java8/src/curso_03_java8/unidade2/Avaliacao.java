package curso_03_java8.unidade2;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;
public class Avaliacao extends JApplet {
	
	private static final long serialVersionUID = 1L;
	
	public void paint(Graphics g){
		float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite uma nota"));
		
		if (nota < 0 || nota > 100) {
			JOptionPane.showMessageDialog(rootPane, "Nota invalida - Nota 0 a 100");
			paint(null);
		} else {
			if (nota < 50) {
				JOptionPane.showMessageDialog(rootPane, "Insuficiente");
			} else if (nota < 70) {
				JOptionPane.showMessageDialog(rootPane, "Regular");
			} else if (nota < 90) {
				JOptionPane.showMessageDialog(rootPane, "Bom");
			} else {
				JOptionPane.showMessageDialog(rootPane, "Excelente");
			}
			System.exit(0);
		}
		
		/*
		this.setBackground(Color.GREEN);
        this.setSize(400,100);
        //g.drawRect(0,0,150,150);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
		g.drawString("Versão JVM " + System.getProperty("java.version"),20,20);
		g.drawString("Versão SO: " + System.getProperty("os.name"),20,50);
		*/
	}
}
