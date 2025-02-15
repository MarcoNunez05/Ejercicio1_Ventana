package app;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame 
{
	Font titulo = new Font("Serif", Font.PLAIN, 32);
	Font subtitulo = new Font("Serif", Font.PLAIN, 20);
	Font mini = new Font("Cambria", Font.PLAIN, 14);
	
	public Ventana(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		
		this.setMinimumSize(new Dimension(400, 400));
		this.setMaximumSize(new Dimension(600, 600));
		
		this.add(login());
		this.repaint();
		this.setVisible(true);
	}
	
	public JPanel login()
	{
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(this.WIDTH, this.HEIGHT);
		panel.setOpaque(true);
		panel.setLayout(null);
		panel.setBackground(new Color(159, 252, 238));
		
		
		// JLabels
		
		JLabel bienvenida = new JLabel("Bienvenido");
		bienvenida.setSize(160, 40);
		bienvenida.setLocation(160, 10);
		bienvenida.setBackground(new Color(95, 238, 250));
		bienvenida.setOpaque(true);
		bienvenida.setFont(titulo);
		bienvenida.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel labelNombre = new JLabel("Nombre de usuario:");
		labelNombre.setSize(180, 30);
		labelNombre.setLocation(90, 100);
		labelNombre.setFont(subtitulo);
		labelNombre.setHorizontalAlignment(JLabel.LEFT);
		
		JLabel labelPassword = new JLabel("Contraseña:");
		labelPassword.setSize(180, 30);
		labelPassword.setLocation(90, 200);
		labelPassword.setFont(subtitulo);
		labelPassword.setHorizontalAlignment(JLabel.LEFT);
		
		JLabel olvidar = new JLabel("¿Olvidó su contraseña?");
		olvidar.setSize(150, 20);
		olvidar.setLocation(250, 280);
		olvidar.setFont(mini);
		olvidar.setHorizontalAlignment(JLabel.LEFT);
		
		
		// JTextField
		
		JTextField nombre = new JTextField();
		nombre.setSize(300, 30);
		nombre.setLocation(90, 140);
		nombre.setLayout(null);
		
		
		// JPasswordField
		
		JPasswordField password = new JPasswordField();
		password.setSize(300, 30);
		password.setLocation(90, 240);
		password.setLayout(null);
		
		
		// JCheckBox
		
		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setSize(120, 20);
		recordar.setLocation(90, 280);
		recordar.setOpaque(false);
		recordar.setLayout(null);
		recordar.setFont(mini);
		
		
		// JButton
		
		JButton acceder = new JButton("Acceder");
		acceder.setSize(120, 40);
		acceder.setLocation(180, 340);
		acceder.setFont(subtitulo);
		acceder.setLayout(null);
		
		
		// Añadir elementos al panel
		
		panel.add(bienvenida);
		panel.add(labelNombre);
		panel.add(labelPassword);
		panel.add(nombre);
		panel.add(password);
		panel.add(recordar);
		panel.add(olvidar);
		panel.add(acceder);
		
		panel.revalidate();
		return panel;
	}
	
}
