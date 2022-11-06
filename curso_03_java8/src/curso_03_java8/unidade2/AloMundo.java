package curso_03_java8.unidade2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;

public class AloMundo extends JApplet {
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
		this.setBackground(Color.GREEN);
        this.setSize(400,100);
        //g.drawRect(0,0,150,150);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
		g.drawString("Versão JVM " + System.getProperty("java.version"),20,20);
		g.drawString("Versão SO: " + System.getProperty("os.name"),20,50);
	}
	@Override
	public void init() {
		System.out.println("Iniciou");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destruiu");
	}
	
	@Override
	public void start() {
		System.out.println("Start");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop");
	}
}
