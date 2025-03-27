package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class VentanaPaint extends JFrame 
{
	Font fuente = new Font("Aptos", Font.BOLD, 20);
	
	int grosor = 12;
	
	public VentanaPaint(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200, 850);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon(getClass().getResource("images/app.png")).getImage());
		
		this.setMinimumSize(new Dimension(400, 400));
		
		
		// Añadimos el panel
		
		this.add(panel());
		this.repaint();
		this.setVisible(true);
		
	}
	
	public JPanel panel()
	{
		JPanel panelAfuera = new JPanel();
		panelAfuera.setLocation(0, 0);
		panelAfuera.setSize(this.WIDTH, this.HEIGHT);
		panelAfuera.setLayout(new BorderLayout(50, 20));
		panelAfuera.setBackground(new Color(50, 51, 54));
		panelAfuera.setOpaque(true);
		
		JPanel panelHerramientas = new JPanel();
		panelHerramientas.setLayout(new GridLayout(2, 5, 25, 5));
		panelHerramientas.setBackground(new Color(192, 196, 193));
		panelHerramientas.setOpaque(true);
		panelHerramientas.setBorder(new LineBorder(Color.black, 1, true));
		panelAfuera.add(panelHerramientas, BorderLayout.NORTH);
		
		JPanel panelDibujo = new JPanel();
		panelDibujo.setLayout(null);
		panelDibujo.setBackground(new Color(255, 255, 255));
		panelDibujo.setOpaque(true);
		panelAfuera.add(panelDibujo, BorderLayout.CENTER);
		
		JPanel panelColores = new JPanel();
		panelColores.setLayout(new GridLayout(12, 1, 15, 10));
		panelColores.setBackground(new Color(192, 196, 193));
		panelColores.setOpaque(true);
		panelAfuera.add(panelColores, BorderLayout.EAST);
		
		
		// JLabels
		
		panelAfuera.add(new JLabel(""), BorderLayout.WEST);
		panelAfuera.add(new JLabel(""), BorderLayout.SOUTH);
		
		panelHerramientas.add(new JLabel(""));
		panelHerramientas.add(new JLabel(""));
		
		JLabel labelGrosor = new JLabel("Tamaño del grosor:");
		labelGrosor.setFont(new Font("Aptos", Font.BOLD, 17));
		labelGrosor.setForeground(Color.black);
		labelGrosor.setHorizontalAlignment(JLabel.CENTER);
		panelHerramientas.add(labelGrosor);
		
		JLabel labelFormas = new JLabel("Formas geométricas:");
		labelFormas.setFont(new Font("Aptos", Font.BOLD, 17));
		labelFormas.setForeground(Color.black);
		labelFormas.setHorizontalAlignment(JLabel.CENTER);
		panelHerramientas.add(labelFormas);
		
		panelHerramientas.add(new JLabel(""));
		
		
		// JButtons
		
		JButton pincel = new JButton("    Pincel    ");
		pincel.setBackground(Color.white);
		pincel.setForeground(Color.black);
		pincel.setFont(fuente);
		pincel.setBorder(new LineBorder(Color.black, 3));
		panelHerramientas.add(pincel);
		
		JButton borrador = new JButton("  Borrador  ");
		borrador.setBackground(Color.white);
		borrador.setForeground(Color.black);
		borrador.setFont(fuente);
		borrador.setBorder(new LineBorder(Color.black, 3));
		panelHerramientas.add(borrador);
		
		
		// JSpinner
		
		JSpinner tGrosor = new JSpinner(new SpinnerNumberModel(grosor, grosor - 11, grosor + 88, 1));
		tGrosor.setBorder(new LineBorder(Color.black, 3));
		tGrosor.setFont(fuente);
		panelHerramientas.add(tGrosor);
		
		
		// JPanel para las figuras
		
		JPanel panelFiguras = new JPanel();
		panelFiguras.setLayout(new GridLayout(1, 3));
		panelFiguras.setBorder(new LineBorder(Color.black, 2));
		panelHerramientas.add(panelFiguras);
		
		JButton circulo = new JButton();
		circulo.setBackground(Color.white);
		circulo.setForeground(Color.black);
		circulo.setFont(fuente);
		circulo.setIcon(new ImageIcon(getClass().getResource("images/circle.png")));
		panelFiguras.add(circulo);
		
		JButton cuadrado = new JButton();
		cuadrado.setBackground(Color.white);
		cuadrado.setForeground(Color.black);
		cuadrado.setFont(fuente);
		cuadrado.setIcon(new ImageIcon(getClass().getResource("images/square.png")));
		panelFiguras.add(cuadrado);
		
		JButton triangulo = new JButton();
		triangulo.setBackground(Color.white);
		triangulo.setForeground(Color.black);
		triangulo.setFont(fuente);
		triangulo.setIcon(new ImageIcon(getClass().getResource("images/triangle.png")));
		panelFiguras.add(triangulo);
		
		JButton linea = new JButton();
		linea.setBackground(Color.white);
		linea.setForeground(Color.black);
		linea.setFont(fuente);
		linea.setIcon(new ImageIcon(getClass().getResource("images/line.png")));
		panelFiguras.add(linea);
		
		
		// JButton para limpiar
		
		JButton limpiar = new JButton("   Limpiar   ");
		limpiar.setBackground(Color.white);
		limpiar.setForeground(Color.black);
		limpiar.setFont(fuente);
		limpiar.setBorder(new LineBorder(Color.black, 3));
		panelHerramientas.add(limpiar);
		
		
		// JButton para colores
		
		panelColores.add(new JLabel(""));
		
		JButton blanco = new JButton("                                  ");
		blanco.setBackground(Color.white);
		blanco.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(blanco);
		
		JButton negro = new JButton();
		negro.setBackground(Color.black);
		negro.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(negro);
		
		JButton gris = new JButton();
		gris.setBackground(Color.gray);
		gris.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(gris);
		
		JButton azul = new JButton();
		azul.setBackground(Color.blue);
		azul.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(azul);
		
		JButton rojo = new JButton();
		rojo.setBackground(Color.red);
		rojo.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(rojo);
		
		JButton verde = new JButton();
		verde.setBackground(Color.green);
		verde.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(verde);
		
		
		// JLabel y JTextField y JButton de color HEX
		
		panelColores.add(new JLabel(""));
		
		JLabel labelHex = new JLabel("Custom (HEX)");
		labelHex.setFont(new Font("Aptos", Font.BOLD, 15));
		labelHex.setForeground(Color.black);
		labelHex.setHorizontalAlignment(JLabel.CENTER);
		panelColores.add(labelHex);
		
		JTextField hex = new JTextField();
		panelColores.add(hex);
		
		JButton aplicar = new JButton("Aplicar");
		aplicar.setFont(new Font("Aptos", Font.BOLD, 15));
		aplicar.setBackground(Color.white);
		aplicar.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(aplicar);
		
		panelColores.add(new JLabel(""));
		
		
		panelHerramientas.revalidate();
		
		panelAfuera.revalidate();
		return panelAfuera;
	}
}
