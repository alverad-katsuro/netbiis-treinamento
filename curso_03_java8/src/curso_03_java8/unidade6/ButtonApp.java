package curso_03_java8.unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ButtonApp extends JFrame implements ActionListener, WindowListener{
	private static final long serialVersionUID = 1L;
	public UIManager.LookAndFeelInfo looks[];
	
	public static void main(String args[]){
		
		ButtonApp frame = new ButtonApp();
		frame.setTitle("Aplicação");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		cont.setLayout(new FlowLayout());
		JButton botao = new JButton("Isto é um botão!");
		botao.addActionListener(frame);
		cont.add(botao);
		frame.addWindowListener(frame);
		
		frame.looks = UIManager.getInstalledLookAndFeels();

		try {
			UIManager.setLookAndFeel(frame.looks[0].getClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(rootPane, e.getActionCommand());
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		JOptionPane.showMessageDialog(rootPane, "Maximizar???");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(rootPane, "Fechando???");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		JOptionPane.showMessageDialog(rootPane, "Fechou???");
		System.exit(0);
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}
}
