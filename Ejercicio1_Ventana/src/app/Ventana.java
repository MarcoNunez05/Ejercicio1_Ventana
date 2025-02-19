package app;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame 
{
	Font titulo = new Font("Serif", Font.PLAIN, 32);
	Font subtitulo = new Font("Serif", Font.PLAIN, 20);
	Font mini = new Font("Cambria", Font.PLAIN, 14);
	
	Font calculadoraFontResultado = new Font("Cambria", Font.PLAIN, 32);
	Font calculadoraFont = new Font("Cambria", Font.PLAIN, 20);
	
	public Ventana(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		
		this.setMinimumSize(new Dimension(400, 400));
		
		// this.add(login());
		// this.add(register());
		this.add(calculadora());
		this.repaint();
		this.setVisible(true);
	}
	
	public JPanel login()
	{
		// Size de ventana recomendada: (500, 500)
		
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
	
	
	public JPanel register()
	{
		// Size de la ventana recomendada: (500, 800)
		
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(this.WIDTH, this.HEIGHT);
		panel.setOpaque(true);
		panel.setLayout(null);
		panel.setBackground(new Color(152, 190, 250));
		
		// JLabels
		
		JLabel registro = new JLabel("Registro");
		registro.setSize(160, 40);
		registro.setLocation(160, 10);
		registro.setBackground(new Color(83, 143, 237));
		registro.setOpaque(true);
		registro.setFont(titulo);
		registro.setHorizontalAlignment(JLabel.CENTER);
		panel.add(registro);
		
		JLabel labelNombre = new JLabel("Nombre de usuario:");
		labelNombre.setSize(190, 30);
		labelNombre.setLocation(165, 90);
		labelNombre.setFont(subtitulo);
		labelNombre.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelNombre);
		
		JLabel labelBio = new JLabel("Escriba una breve biografía:");
		labelBio.setSize(250, 30);
		labelBio.setLocation(130, 190);
		labelBio.setFont(subtitulo);
		labelBio.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelBio);
		
		JLabel labelPreferencia = new JLabel("Escoja sus preferencias:");
		labelPreferencia.setSize(250, 30);
		labelPreferencia.setLocation(150, 355);
		labelPreferencia.setFont(subtitulo);
		labelPreferencia.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelPreferencia);
		
		JLabel labelTerminos = new JLabel("¿Usted acepta los términos?");
		labelTerminos.setSize(250, 30);
		labelTerminos.setLocation(130, 455);
		labelTerminos.setFont(subtitulo);
		labelTerminos.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelTerminos);
		
		JLabel labelColonia = new JLabel("Elija su colonia:");
		labelColonia.setSize(250, 30);
		labelColonia.setLocation(175, 550);
		labelColonia.setFont(subtitulo);
		labelColonia.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelColonia);
		
		
		// JTextField
		
		JTextField nombre = new JTextField();
		nombre.setSize(300, 30);
		nombre.setLocation(90, 130);
		nombre.setLayout(null);
		panel.add(nombre);
		
		
		// JTextArea
		
		JTextArea bio = new JTextArea();
		bio.setSize(400, 100);
		bio.setLocation(40, 230);
		bio.setLayout(null);
		panel.add(bio);
		
		
		// JCheckBox
		
		JCheckBox dulces = new JCheckBox("Dulces");
		dulces.setSize(120, 20);
		dulces.setLocation(100, 395);
		dulces.setOpaque(false);
		dulces.setLayout(null);
		dulces.setFont(mini);
		panel.add(dulces);
		
		JCheckBox salado = new JCheckBox("Salado");
		salado.setSize(120, 20);
		salado.setLocation(210, 395);
		salado.setOpaque(false);
		salado.setLayout(null);
		salado.setFont(mini);
		panel.add(salado);
		
		JCheckBox saludable = new JCheckBox("Saludable");
		saludable.setSize(120, 20);
		saludable.setLocation(315, 395);
		saludable.setOpaque(false);
		saludable.setLayout(null);
		saludable.setFont(mini);
		panel.add(saludable);
		
		
		// JRadioButton
		
		ButtonGroup terminos = new ButtonGroup();
		
		JRadioButton terms1 = new JRadioButton("Acepto los términos", true);
		terms1.setLocation(80, 485);
		terms1.setSize(180, 40);
		terms1.setOpaque(false);
		terms1.setBorder(BorderFactory.createLineBorder(Color.red));
		panel.add(terms1);
		
		JRadioButton terms2 = new JRadioButton("Rechazo los términos");
		terms2.setLocation(260, 485);
		terms2.setSize(180, 40);
		terms2.setOpaque(false);
		terms2.setBorder(BorderFactory.createLineBorder(Color.red));
		panel.add(terms2);
		
		terminos.add(terms1);
		terminos.add(terms2);
		
		// JComboBox
		
		String [] coloniasDataSet = {"Centro", "Villas del encanto", "Pedregal", "Agua escondida", "Balandra"};
		
		JComboBox colonias = new JComboBox(coloniasDataSet);
		colonias.setLocation(150, 590);
		colonias.setSize(180, 40);
		colonias.setLayout(null);
		panel.add(colonias);
		
		
		// JButton
		
		JButton registrarse = new JButton("Crear cuenta");
		registrarse.setSize(300, 50);
		registrarse.setLocation(90, 670);
		registrarse.setFont(subtitulo);
		registrarse.setLayout(null);
		panel.add(registrarse);
		
		panel.revalidate();
		return panel;
	}
	
	
	public JPanel calculadora()
	{
		// Size de la ventana recomendada: (500, 500)
		
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(this.WIDTH, this.HEIGHT);
		panel.setOpaque(true);
		panel.setLayout(null);
		panel.setBackground(new Color(15, 15, 3));
		
		// Creamos un segundo panel para ponerle un GridLayout y lo añadimos al panel principal
		
		JPanel panelGrid = new JPanel();
		panelGrid.setLocation(20, 100);
		panelGrid.setSize(450, 350);
		panelGrid.setOpaque(false);
		panelGrid.setLayout(new GridLayout(0, 4, 10, 10));
		panel.add(panelGrid);
		
		
		// JLabel
		
		JLabel resultado = new JLabel("192");
		resultado.setSize(450, 80);
		resultado.setLocation(20, 10);
		resultado.setBackground(new Color(74, 74, 66));
		resultado.setForeground(Color.white);
		resultado.setOpaque(true);
		resultado.setFont(calculadoraFontResultado);
		resultado.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(resultado);
		
		
		// JButtons
		// Todos los botones se pondrán en panelGrid.
		// Los botones se van a ir añadiendo de izquierda a derecha.
		
		// Primera fila
		
		JButton borrar = new JButton("CE");
		borrar.setSize(50, 50);
		borrar.setLocation(90, 100);
		borrar.setFont(calculadoraFont);
		borrar.setLayout(null);
		borrar.setBackground(new Color(61, 61, 61));
		borrar.setForeground(Color.white);
		borrar.setBorderPainted(false);
		panelGrid.add(borrar);
		
		JButton espacio1 = new JButton();
		espacio1.setSize(50, 50);
		espacio1.setLocation(90, 100);
		espacio1.setFont(calculadoraFont);
		espacio1.setLayout(null);
		espacio1.setBackground(new Color(61, 61, 61));
		espacio1.setForeground(Color.white);
		espacio1.setBorderPainted(false);
		panelGrid.add(espacio1);
		
		JButton espacio2 = new JButton();
		espacio2.setSize(50, 50);
		espacio2.setLocation(90, 100);
		espacio2.setFont(calculadoraFont);
		espacio2.setLayout(null);
		espacio2.setBackground(new Color(61, 61, 61));
		espacio2.setForeground(Color.white);
		espacio2.setBorderPainted(false);
		panelGrid.add(espacio2);
		
		JButton espacio3 = new JButton();
		espacio3.setSize(50, 50);
		espacio3.setLocation(90, 100);
		espacio3.setFont(calculadoraFont);
		espacio3.setLayout(null);
		espacio3.setBackground(new Color(61, 61, 61));
		espacio3.setForeground(Color.white);
		espacio3.setBorderPainted(false);
		panelGrid.add(espacio3);
		
		// Segunda fila
		
		JButton siete = new JButton("7");
		siete.setSize(50, 50);
		siete.setLocation(90, 100);
		siete.setFont(calculadoraFont);
		siete.setLayout(null);
		siete.setBackground(new Color(31, 31, 15));
		siete.setForeground(Color.white);
		siete.setBorderPainted(false);
		panelGrid.add(siete);
		
		JButton ocho = new JButton("8");
		ocho.setSize(50, 50);
		ocho.setLocation(90, 100);
		ocho.setFont(calculadoraFont);
		ocho.setLayout(null);
		ocho.setBackground(new Color(31, 31, 15));
		ocho.setForeground(Color.white);
		ocho.setBorderPainted(false);
		panelGrid.add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.setSize(50, 50);
		nueve.setLocation(90, 100);
		nueve.setFont(calculadoraFont);
		nueve.setLayout(null);
		nueve.setBackground(new Color(31, 31, 15));
		nueve.setForeground(Color.white);
		nueve.setBorderPainted(false);
		panelGrid.add(nueve);
		
		JButton division = new JButton("/");
		division.setSize(50, 50);
		division.setLocation(90, 100);
		division.setFont(calculadoraFont);
		division.setLayout(null);
		division.setBackground(new Color(115, 76, 8));
		division.setForeground(Color.white);
		division.setBorderPainted(false);
		panelGrid.add(division);
		
		// Tercera fila
		
		JButton cuatro = new JButton("4");
		cuatro.setSize(50, 50);
		cuatro.setLocation(90, 100);
		cuatro.setFont(calculadoraFont);
		cuatro.setLayout(null);
		cuatro.setBackground(new Color(31, 31, 15));
		cuatro.setForeground(Color.white);
		cuatro.setBorderPainted(false);
		panelGrid.add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.setSize(50, 50);
		cinco.setLocation(90, 100);
		cinco.setFont(calculadoraFont);
		cinco.setLayout(null);
		cinco.setBackground(new Color(31, 31, 15));
		cinco.setForeground(Color.white);
		cinco.setBorderPainted(false);
		panelGrid.add(cinco);
		
		JButton seis = new JButton("6");
		seis.setSize(50, 50);
		seis.setLocation(90, 100);
		seis.setFont(calculadoraFont);
		seis.setLayout(null);
		seis.setBackground(new Color(31, 31, 15));
		seis.setForeground(Color.white);
		seis.setBorderPainted(false);
		panelGrid.add(seis);
		
		JButton multiplicacion = new JButton("*");
		multiplicacion.setSize(50, 50);
		multiplicacion.setLocation(90, 100);
		multiplicacion.setFont(calculadoraFont);
		multiplicacion.setLayout(null);
		multiplicacion.setBackground(new Color(115, 76, 8));
		multiplicacion.setForeground(Color.white);
		multiplicacion.setBorderPainted(false);
		panelGrid.add(multiplicacion);
		
		// Cuarta fila
		
		JButton uno = new JButton("1");
		uno.setSize(50, 50);
		uno.setLocation(90, 100);
		uno.setFont(calculadoraFont);
		uno.setLayout(null);
		uno.setBackground(new Color(31, 31, 15));
		uno.setForeground(Color.white);
		uno.setBorderPainted(false);
		panelGrid.add(uno);
		
		JButton dos = new JButton("2");
		dos.setSize(50, 50);
		dos.setLocation(90, 100);
		dos.setFont(calculadoraFont);
		dos.setLayout(null);
		dos.setBackground(new Color(31, 31, 15));
		dos.setForeground(Color.white);
		dos.setBorderPainted(false);
		panelGrid.add(dos);
		
		JButton tres = new JButton("3");
		tres.setSize(50, 50);
		tres.setLocation(90, 100);
		tres.setFont(calculadoraFont);
		tres.setLayout(null);
		tres.setBackground(new Color(31, 31, 15));
		tres.setForeground(Color.white);
		tres.setBorderPainted(false);
		panelGrid.add(tres);
		
		JButton menos = new JButton("-");
		menos.setSize(50, 50);
		menos.setLocation(90, 100);
		menos.setFont(calculadoraFont);
		menos.setLayout(null);
		menos.setBackground(new Color(115, 76, 8));
		menos.setForeground(Color.white);
		menos.setBorderPainted(false);
		panelGrid.add(menos);
		
		// Última fila
		
		JButton cero = new JButton("0");
		cero.setSize(50, 50);
		cero.setLocation(90, 100);
		cero.setFont(calculadoraFont);
		cero.setLayout(null);
		cero.setBackground(new Color(31, 31, 15));
		cero.setForeground(Color.white);
		cero.setBorderPainted(false);
		panelGrid.add(cero);
		
		JButton decimal = new JButton(".");
		decimal.setSize(50, 50);
		decimal.setLocation(90, 100);
		decimal.setFont(calculadoraFont);
		decimal.setLayout(null);
		decimal.setBackground(new Color(31, 31, 15));
		decimal.setForeground(Color.white);
		decimal.setBorderPainted(false);
		panelGrid.add(decimal);
		
		JButton igual = new JButton("=");
		igual.setSize(50, 50);
		igual.setLocation(90, 100);
		igual.setFont(calculadoraFont);
		igual.setLayout(null);
		igual.setBackground(new Color(115, 76, 8));
		igual.setForeground(Color.white);
		igual.setBorderPainted(false);
		panelGrid.add(igual);
		
		JButton mas = new JButton("+");
		mas.setSize(50, 50);
		mas.setLocation(90, 100);
		mas.setFont(calculadoraFont);
		mas.setLayout(null);
		mas.setBackground(new Color(115, 76, 8));
		mas.setForeground(Color.white);
		mas.setBorderPainted(false);
		panelGrid.add(mas);
		
		
		panel.revalidate();
		return panel;
	}
}