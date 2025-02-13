package app;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame 
{
	Font fuente = new Font("Serif", Font.PLAIN, 20);
	
	public Ventana(String title)
	{
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		
		this.setMinimumSize(new Dimension(400, 400));
		this.setMaximumSize(new Dimension(600, 600));
		
		this.add(login());
		this.repaint();
		
	}
	
	public JPanel login()
	{
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(this.WIDTH, this.HEIGHT);
		panel.setOpaque(true);
		panel.setBackground(new Color(146, 255, 255));
		
		JLabel etiqueta = new JLabel("Bienvenido");
		etiqueta.setSize(160, 40);
		etiqueta.setLocation(160, 10);
		etiqueta.setBackground(Color.green);
		etiqueta.setOpaque(true);
		etiqueta.setFont(fuente);
		etiqueta.setHorizontalAlignment(JLabel.CENTER);
		
		
		panel.add(etiqueta);
		
		panel.revalidate();
		return panel;
	}
	
}
