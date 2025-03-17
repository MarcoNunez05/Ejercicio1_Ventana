
package app;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class Ventana extends JFrame 
{
	Font titulo = new Font("Cambria", Font.BOLD, 32);
	Font subtitulo = new Font("Cambria Math", Font.PLAIN, 20);
	Font mini = new Font("Cambria Math", Font.PLAIN, 14);
	
	Font calculadoraFontResultado = new Font("Cambria", Font.PLAIN, 48);
	Font calculadoraFont = new Font("Cambria", Font.PLAIN, 28);
	
	public Ventana(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 730);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon(getClass().getResource("images/app.png")).getImage());
		
		this.setMinimumSize(new Dimension(400, 400));
		
		
		// JMenuBar, JMenu y JMenuItem
		
		JMenuBar barra = new JMenuBar();
		
		
		JMenu cuenta = new JMenu("Cuenta");
		
		JMenuItem login = new JMenuItem("Login");
		
		login.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("login");
			}
			
		});
		
		
		JMenuItem registro = new JMenuItem("Registro");
		
		registro.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("register");
			}
			
		});
		
		
		JMenuItem recuperacion = new JMenuItem("Recuperación de cuenta");
		

		recuperacion.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("recuperacion");
			}
			
		});
		
		cuenta.add(login);
		cuenta.add(registro);
		cuenta.add(recuperacion);
		
		
		JMenu usuarios = new JMenu("Usuarios");
		
		JMenuItem alta = new JMenuItem("Alta");
		
		alta.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("alta");
			}
			
		});
		
		
		JMenuItem baja = new JMenuItem("Baja");
		
		baja.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("baja");
			}
			
		});
		
		
		JMenuItem consultar = new JMenuItem("Consultar");
		
		consultar.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("consultar");
			}
			
		});
				
		usuarios.add(alta);
		usuarios.add(baja);
		usuarios.add(consultar);
		
		
		JMenu ayuda = new JMenu("Ayuda");
		
		JMenuItem crearUsuario = new JMenuItem("¿Cómo crear un usuario?");
		
		crearUsuario.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("comoCrearUsuario");
			}
			
		});
		
		
		JMenuItem accederSistema = new JMenuItem("¿Cómo acceder al sistema?");
		
		accederSistema.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("comoAccederSistema");
			}
			
		});
		
		
		JMenuItem passwordOlvidada = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		
		passwordOlvidada.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("passwordOlvidada");
			}
			
		});
		
		ayuda.add(crearUsuario);
		ayuda.add(accederSistema);
		ayuda.add(passwordOlvidada);
		
		
		barra.add(cuenta);
		barra.add(usuarios);
		barra.add(ayuda);
		
		this.setJMenuBar(barra);
		
		
		// Añadimos el panel
		
		this.add(login());
		// this.add(register());
		// this.add(calculadora());
		// this.add(tablaRegistros());
		// this.add(interes());
		this.repaint();
		this.setVisible(true);
	}
	
	public JPanel login()
	{
		// Size de ventana recomendada: ((800, 700) o si tiene un JMenuBar: (800, 730))
		
		JPanel panelAfuera = new JPanel();
		panelAfuera.setLocation(0, 0);
		panelAfuera.setSize(this.WIDTH, this.HEIGHT);
		panelAfuera.setOpaque(true);
		panelAfuera.setBackground(new Color(61, 98, 219));
		panelAfuera.setLayout(null);
		
		JPanel panelAdentro = new JPanel();
		panelAdentro.setLocation(160, 90);
		panelAdentro.setSize(470, 450);
		panelAdentro.setOpaque(true);
		panelAdentro.setLayout(null);
		panelAdentro.setBackground(Color.white);
		panelAdentro.setBorder(new LineBorder(new Color(16, 47, 125), 6));
		
		
		// JLabels
		
		JLabel bienvenida = new JLabel("Bienvenido/a");
		bienvenida.setSize(210, 40);
		bienvenida.setLocation(285, 10);
		bienvenida.setBackground(new Color(43, 107, 217));
		bienvenida.setForeground(Color.white);
		bienvenida.setOpaque(true);
		bienvenida.setFont(titulo);
		bienvenida.setHorizontalAlignment(JLabel.CENTER);
		panelAfuera.add(bienvenida);
		
		JLabel accede = new JLabel("Accede con tu cuenta");
		accede.setSize(320, 40);
		accede.setLocation(75, 15);
		accede.setFont(titulo);
		accede.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(accede);
		
		JLabel labelNombre = new JLabel("E-mail o nombre de usuario:");
		labelNombre.setSize(250, 20);
		labelNombre.setLocation(90, 100);
		labelNombre.setFont(subtitulo);
		labelNombre.setHorizontalAlignment(JLabel.LEFT);
		panelAdentro.add(labelNombre);
		
		JLabel labelPassword = new JLabel("Contraseña:");
		labelPassword.setSize(180, 20);
		labelPassword.setLocation(90, 210);
		labelPassword.setFont(subtitulo);
		labelPassword.setHorizontalAlignment(JLabel.LEFT);
		panelAdentro.add(labelPassword);
		
		JLabel olvidar = new JLabel("¿Olvidó su contraseña?");
		olvidar.setSize(150, 20);
		olvidar.setLocation(250, 290);
		olvidar.setFont(mini);
		olvidar.setForeground(new Color(78, 118, 245));
		olvidar.setHorizontalAlignment(JLabel.LEFT);
		panelAdentro.add(olvidar);
		
		JLabel labelRegistro = new JLabel("¿No tienes una cuenta?");
		labelRegistro.setSize(150, 20);
		labelRegistro.setLocation(325, 560);
		labelRegistro.setFont(mini);
		labelRegistro.setForeground(Color.white);
		labelRegistro.setHorizontalAlignment(JLabel.LEFT);
		panelAfuera.add(labelRegistro);
		
		
		// JTextField
		
		JTextField nombre = new JTextField();
		nombre.setSize(300, 40);
		nombre.setLocation(90, 130);
		nombre.setLayout(null);
		nombre.setBorder(new LineBorder(Color.black, 3, true));
		panelAdentro.add(nombre);
		
		
		
		// JPasswordField
		
		JPasswordField password = new JPasswordField();
		password.setSize(300, 40);
		password.setLocation(90, 240);
		password.setLayout(null);
		password.setBorder(new LineBorder(Color.black, 3, true));
		panelAdentro.add(password);
		
		
		// JCheckBox
		
		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setSize(120, 20);
		recordar.setLocation(90, 290);
		recordar.setOpaque(false);
		recordar.setLayout(null);
		recordar.setFont(mini);
		panelAdentro.add(recordar);
		
		
		// JButton
		
		JButton acceder = new JButton("Acceder");
		acceder.setSize(130, 50);
		acceder.setLocation(170, 350);
		acceder.setBackground(new Color(11, 156, 154));
		acceder.setForeground(Color.white);
		acceder.setFont(subtitulo);
		acceder.setLayout(null);
		acceder.setBorder(new LineBorder(Color.black, 3, true));
		panelAdentro.add(acceder);
		
		JButton registrar = new JButton("Regístrate");
		registrar.setSize(130, 50);
		registrar.setLocation(330, 590);
		registrar.setBackground(new Color(11, 60, 219));
		registrar.setForeground(Color.white);
		registrar.setFont(subtitulo);
		registrar.setLayout(null);
		registrar.setBorder(new LineBorder(Color.black, 3, true));
		panelAfuera.add(registrar);
		
		// Le ponemos un evento de Mouse a los botones
		
		acceder.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e)
			{
				acceder.setBackground(new Color(97, 186, 186));
			}
			
			public void mouseExited(MouseEvent e)
			{
				acceder.setBackground(new Color(11, 156, 154));
			}
		});
		
		registrar.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e)
			{
				registrar.setBackground(new Color(41, 83, 217));
			}
			
			public void mouseExited(MouseEvent e)
			{
				registrar.setBackground(new Color(11, 60, 219));
			}
		});
		
		// Le ponemos un ActionListener a los botones
		
		acceder.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String pass = new String(password.getPassword());
				
				if (nombre.getText().equals("") || nombre.getText().trim().isEmpty())
					nombre.setBorder(BorderFactory.createLineBorder(Color.red, 5));
				else
					nombre.setBorder(BorderFactory.createLineBorder(Color.green, 5));
				
				if (password.getPassword().length < 6 || pass.trim().isEmpty())
					password.setBorder(BorderFactory.createLineBorder(Color.red, 5));
				else
					password.setBorder(BorderFactory.createLineBorder(Color.green, 5));
				
				
				if ((nombre.getText().equals("mnunez_23@alu.uabcs.mx") || nombre.getText().equals("MarcoNunez")) && pass.equals("pepe12"))
 					JOptionPane.showMessageDialog(panelAfuera, "Bienvenido de vuelta, Marco!", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
 				else
 					JOptionPane.showMessageDialog(panelAfuera, "Nombre de usuario o contraseña incorrectos.", "Datos incorrectos", JOptionPane.ERROR_MESSAGE);
			}
				
		});
		
		registrar.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("register");
			}
			
		});
		
		
		// ImageIcon
		
		JLabel imagenUsuario = new JLabel(new ImageIcon(getClass().getResource("images/user.png")));
		imagenUsuario.setSize(32, 32);
		imagenUsuario.setLocation(50, 133);
		panelAdentro.add(imagenUsuario);
		
		JLabel imagenClave = new JLabel(new ImageIcon(getClass().getResource("images/lock.png")));
		imagenClave.setSize(32, 32);
		imagenClave.setLocation(50, 242);
		panelAdentro.add(imagenClave);
		
		JLabel imagenOjo = new JLabel(new ImageIcon(getClass().getResource("images/eye.png")));
		imagenOjo.setSize(32, 32);
		imagenOjo.setLocation(400, 244);
		panelAdentro.add(imagenOjo);
		

		panelAdentro.revalidate();
		
		panelAfuera.add(panelAdentro);
		
		panelAfuera.revalidate();
		return panelAfuera;
	}
	
	
	public JPanel register()
	{
		// Size de la ventana recomendada: ((500, 830) o si tiene un JMenuBar: (500, 830))
		
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
		dulces.setSize(80, 20);
		dulces.setLocation(100, 395);
		dulces.setOpaque(false);
		dulces.setLayout(null);
		dulces.setFont(mini);
		panel.add(dulces);
		
		JCheckBox salado = new JCheckBox("Salado");
		salado.setSize(80, 20);
		salado.setLocation(210, 395);
		salado.setOpaque(false);
		salado.setLayout(null);
		salado.setFont(mini);
		panel.add(salado);
		
		JCheckBox saludable = new JCheckBox("Saludable");
		saludable.setSize(100, 20);
		saludable.setLocation(315, 395);
		saludable.setOpaque(false);
		saludable.setLayout(null);
		saludable.setFont(mini);
		panel.add(saludable);
		
		
		// JRadioButton
		
		ButtonGroup terminos = new ButtonGroup();
		
		JRadioButton terms1 = new JRadioButton("Acepto los términos");
		terms1.setLocation(80, 485);
		terms1.setSize(150, 40);
		terms1.setOpaque(false);
		panel.add(terms1);
		
		JRadioButton terms2 = new JRadioButton("Rechazo los términos");
		terms2.setLocation(260, 485);
		terms2.setSize(180, 40);
		terms2.setOpaque(false);
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
		
		JButton volver = new JButton("Volver");
		volver.setSize(90, 30);
		volver.setLocation(20, 15);
		volver.setFont(mini);
		volver.setLayout(null);
		panel.add(volver);
	
		// Le ponemos un ActionListener a los botones
		
		registrarse.addActionListener(new ActionListener()  
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				terms1.setBorderPainted(true);
				dulces.setBorderPainted(true);
				
				if (nombre.getText().equals("") || nombre.getText().trim().isEmpty())
					nombre.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				else
					nombre.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				
				if (bio.getText().equals(""))
					bio.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				else
					bio.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				
				if (dulces.isSelected() || salado.isSelected() || saludable.isSelected())
					dulces.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				else
					dulces.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				
				if (terms1.isSelected())
					terms1.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				else
					terms1.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				
			}
			
		});
		
		volver.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("login");
			}
			
		});
		
		panel.revalidate();
		return panel;
	}
	
	
	public JPanel calculadora()
	{
		// Size de la ventana recomendada: ((500, 500) o si tiene un JMenuBar: (500, 530))
		
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(this.WIDTH, this.HEIGHT);
		panel.setOpaque(true);
		panel.setLayout(new BorderLayout(10, 10));
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
		resultado.setBackground(new Color(74, 74, 66));
		resultado.setForeground(Color.white);
		resultado.setOpaque(true);
		resultado.setFont(calculadoraFontResultado);
		resultado.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(resultado, BorderLayout.NORTH);
		
		
		// JButtons
		// Todos los botones se pondrán en panelGrid.
		// Los botones se van a ir añadiendo de izquierda a derecha.
		
		// Primera fila
		
		JButton borrar = new JButton("CE");
		borrar.setFont(calculadoraFont);
		borrar.setBackground(new Color(61, 61, 61));
		borrar.setForeground(Color.white);
		borrar.setBorderPainted(false);
		panelGrid.add(borrar);
		
		JButton espacio1 = new JButton();
		espacio1.setFont(calculadoraFont);
		espacio1.setBackground(new Color(61, 61, 61));
		espacio1.setForeground(Color.white);
		espacio1.setBorderPainted(false);
		panelGrid.add(espacio1);
		
		JButton espacio2 = new JButton();
		espacio2.setFont(calculadoraFont);
		espacio2.setBackground(new Color(61, 61, 61));
		espacio2.setForeground(Color.white);
		espacio2.setBorderPainted(false);
		panelGrid.add(espacio2);
		
		JButton espacio3 = new JButton();
		espacio3.setFont(calculadoraFont);
		espacio3.setBackground(new Color(61, 61, 61));
		espacio3.setForeground(Color.white);
		espacio3.setBorderPainted(false);
		panelGrid.add(espacio3);
		
		// Segunda fila
		
		JButton siete = new JButton("7");
		siete.setFont(calculadoraFont);
		siete.setBackground(new Color(31, 31, 15));
		siete.setForeground(Color.white);
		siete.setBorderPainted(false);
		panelGrid.add(siete);
		
		JButton ocho = new JButton("8");
		ocho.setFont(calculadoraFont);
		ocho.setBackground(new Color(31, 31, 15));
		ocho.setForeground(Color.white);
		ocho.setBorderPainted(false);
		panelGrid.add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.setFont(calculadoraFont);
		nueve.setBackground(new Color(31, 31, 15));
		nueve.setForeground(Color.white);
		nueve.setBorderPainted(false);
		panelGrid.add(nueve);
		
		JButton division = new JButton("/");
		division.setFont(calculadoraFont);
		division.setBackground(new Color(115, 76, 8));
		division.setForeground(Color.white);
		division.setBorderPainted(false);
		panelGrid.add(division);
		
		// Tercera fila
		
		JButton cuatro = new JButton("4");
		cuatro.setFont(calculadoraFont);
		cuatro.setBackground(new Color(31, 31, 15));
		cuatro.setForeground(Color.white);
		cuatro.setBorderPainted(false);
		panelGrid.add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.setFont(calculadoraFont);
		cinco.setBackground(new Color(31, 31, 15));
		cinco.setForeground(Color.white);
		cinco.setBorderPainted(false);
		panelGrid.add(cinco);
		
		JButton seis = new JButton("6");
		seis.setFont(calculadoraFont);
		seis.setBackground(new Color(31, 31, 15));
		seis.setForeground(Color.white);
		seis.setBorderPainted(false);
		panelGrid.add(seis);
		
		JButton multiplicacion = new JButton("*");
		multiplicacion.setFont(calculadoraFont);
		multiplicacion.setBackground(new Color(115, 76, 8));
		multiplicacion.setForeground(Color.white);
		multiplicacion.setBorderPainted(false);
		panelGrid.add(multiplicacion);
		
		// Cuarta fila
		
		JButton uno = new JButton("1");
		uno.setFont(calculadoraFont);
		uno.setBackground(new Color(31, 31, 15));
		uno.setForeground(Color.white);
		uno.setBorderPainted(false);
		panelGrid.add(uno);
		
		JButton dos = new JButton("2");
		dos.setFont(calculadoraFont);
		dos.setBackground(new Color(31, 31, 15));
		dos.setForeground(Color.white);
		dos.setBorderPainted(false);
		panelGrid.add(dos);
		
		JButton tres = new JButton("3");
		tres.setFont(calculadoraFont);
		tres.setBackground(new Color(31, 31, 15));
		tres.setForeground(Color.white);
		tres.setBorderPainted(false);
		panelGrid.add(tres);
		
		JButton menos = new JButton("-");
		menos.setFont(calculadoraFont);
		menos.setBackground(new Color(115, 76, 8));
		menos.setForeground(Color.white);
		menos.setBorderPainted(false);
		panelGrid.add(menos);
		
		// Última fila
		
		JButton cero = new JButton("0");
		cero.setFont(calculadoraFont);
		cero.setBackground(new Color(31, 31, 15));
		cero.setForeground(Color.white);
		cero.setBorderPainted(false);
		panelGrid.add(cero);
		
		JButton decimal = new JButton(".");
		decimal.setFont(calculadoraFont);
		decimal.setBackground(new Color(31, 31, 15));
		decimal.setForeground(Color.white);
		decimal.setBorderPainted(false);
		panelGrid.add(decimal);
		
		JButton igual = new JButton("=");
		igual.setFont(calculadoraFont);
		igual.setBackground(new Color(115, 76, 8));
		igual.setForeground(Color.white);
		igual.setBorderPainted(false);
		panelGrid.add(igual);
		
		JButton mas = new JButton("+");
		mas.setFont(calculadoraFont);
		mas.setBackground(new Color(115, 76, 8));
		mas.setForeground(Color.white);
		mas.setBorderPainted(false);
		panelGrid.add(mas);
		
		
		panel.revalidate();
		return panel;
	}
	
	
	public JPanel recuperar()
	{
		
		// Size de ventana recomendada: ((800, 700) o si tiene un JMenuBar: (800, 730))
		
		JPanel panelAfuera = new JPanel();
		panelAfuera.setLocation(0, 0);
		panelAfuera.setSize(this.WIDTH, this.HEIGHT);
		panelAfuera.setOpaque(true);
		panelAfuera.setBackground(new Color(114, 111, 247));
		panelAfuera.setLayout(null);
		
		JPanel panelAdentro = new JPanel();
		panelAdentro.setLocation(160, 90);
		panelAdentro.setSize(470, 450);
		panelAdentro.setOpaque(true);
		panelAdentro.setLayout(null);
		panelAdentro.setBackground(Color.white);
		panelAdentro.setBorder(new LineBorder(new Color(16, 47, 125), 6));
		
		
		// JLabels
		
		JLabel labelRecuperar = new JLabel("Recuperación de cuenta");
		labelRecuperar.setSize(385, 40);
		labelRecuperar.setLocation(200, 10);
		labelRecuperar.setBackground(new Color(153, 151, 247));
		labelRecuperar.setOpaque(true);
		labelRecuperar.setFont(titulo);
		labelRecuperar.setHorizontalAlignment(JLabel.CENTER);
		panelAfuera.add(labelRecuperar);
		
		JLabel accede = new JLabel("Verifique su cuenta");
		accede.setSize(320, 40);
		accede.setLocation(75, 15);
		accede.setFont(titulo);
		accede.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(accede);
		
		JLabel labelCodigo = new JLabel("Revise el código que enviamos al");
		labelCodigo.setSize(385, 20);
		labelCodigo.setLocation(45, 100);
		labelCodigo.setFont(subtitulo);
		labelCodigo.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(labelCodigo);
		
		JLabel labelCorreo = new JLabel("Email añadido a su cuenta.");
		labelCorreo.setSize(385, 20);
		labelCorreo.setLocation(45, 130);
		labelCorreo.setFont(subtitulo);
		labelCorreo.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(labelCorreo);
		
		JLabel labelInserte = new JLabel("Inserte el código:");
		labelInserte.setSize(200, 20);
		labelInserte.setLocation(65, 205);
		labelInserte.setFont(subtitulo);
		labelInserte.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(labelInserte);
		
		
		// JTextField
		
		JTextField codigo = new JTextField();
		codigo.setSize(300, 40);
		codigo.setLocation(90, 240);
		codigo.setLayout(null);
		codigo.setBorder(new LineBorder(Color.black, 3, true));
		panelAdentro.add(codigo);
		
		
		// JButton
		
		JButton volver = new JButton("Volver");
		volver.setSize(150, 50);
		volver.setLocation(80, 350);
		volver.setBackground(new Color(92, 92, 91));
		volver.setForeground(Color.white);
		volver.setFont(subtitulo);
		volver.setLayout(null);
		volver.setBorder(new LineBorder(Color.black, 3, true));
		panelAdentro.add(volver);
		
		JButton siguiente = new JButton("Siguiente");
		siguiente.setSize(150, 50);
		siguiente.setLocation(250, 350);
		siguiente.setBackground(new Color(11, 156, 154));
		siguiente.setForeground(Color.white);
		siguiente.setFont(subtitulo);
		siguiente.setLayout(null);
		siguiente.setBorder(new LineBorder(Color.black, 3, true));
		panelAdentro.add(siguiente);
		
		// Le ponemos un evento de Mouse a los botones
		
		siguiente.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e)
			{
				siguiente.setBackground(new Color(97, 186, 186));
			}
			
			public void mouseExited(MouseEvent e)
			{
				siguiente.setBackground(new Color(11, 156, 154));
			}
		});
		
		volver.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e)
			{
				volver.setBackground(new Color(125, 125, 124));
			}
			
			public void mouseExited(MouseEvent e)
			{
				volver.setBackground(new Color(92, 92, 91));
			}
		});
			
		// Le ponemos un ActionListener a los botones
		
		volver.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("login");
			}
			
		});
		
		
		panelAdentro.revalidate();
		
		panelAfuera.add(panelAdentro);
		
		panelAfuera.revalidate();
		return panelAfuera;

	}
	
	public JPanel alta()
	{
		// Size de ventana recomendada: ((800, 700) o si tiene un JMenuBar: (800, 730))
		
		JPanel panelAfuera = new JPanel();
		panelAfuera.setLocation(0, 0);
		panelAfuera.setSize(this.WIDTH, this.HEIGHT);
		panelAfuera.setOpaque(true);
		panelAfuera.setBackground(new Color(66, 101, 153));
		panelAfuera.setLayout(null);
		
		JPanel panelAdentro = new JPanel();
		panelAdentro.setLocation(160, 90);
		panelAdentro.setSize(470, 450);
		panelAdentro.setOpaque(true);
		panelAdentro.setLayout(null);
		panelAdentro.setBackground(Color.white);
		panelAdentro.setBorder(new LineBorder(new Color(16, 47, 125), 6));
		
		
		// JLabels
		
		JLabel labelAlta = new JLabel("Alta");
		labelAlta.setSize(80, 40);
		labelAlta.setLocation(360, 10);
		labelAlta.setBackground(new Color(77, 117, 179));
		labelAlta.setOpaque(true);
		labelAlta.setFont(titulo);
		labelAlta.setHorizontalAlignment(JLabel.CENTER);
		panelAfuera.add(labelAlta);
		
		JLabel accede = new JLabel("Revise su correo");
		accede.setSize(320, 40);
		accede.setLocation(75, 15);
		accede.setFont(titulo);
		accede.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(accede);
		
		JLabel labelCodigo = new JLabel("Hemos enviado un código a la bandeja");
		labelCodigo.setSize(385, 20);
		labelCodigo.setLocation(45, 100);
		labelCodigo.setFont(subtitulo);
		labelCodigo.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(labelCodigo);
		
		JLabel labelCorreo = new JLabel("de correo asignado a la cuenta.");
		labelCorreo.setSize(385, 20);
		labelCorreo.setLocation(45, 130);
		labelCorreo.setFont(subtitulo);
		labelCorreo.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(labelCorreo);
		
		JLabel labelInserte = new JLabel("Inserte el código:");
		labelInserte.setSize(200, 20);
		labelInserte.setLocation(65, 205);
		labelInserte.setFont(subtitulo);
		labelInserte.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(labelInserte);
		
		
		// JTextField
		
		JTextField codigo = new JTextField();
		codigo.setSize(300, 40);
		codigo.setLocation(90, 240);
		codigo.setLayout(null);
		codigo.setBorder(new LineBorder(Color.black, 3, true));
		panelAdentro.add(codigo);
		
		
		// JButton
		
		JButton volver = new JButton("Volver");
		volver.setSize(150, 50);
		volver.setLocation(80, 350);
		volver.setBackground(new Color(92, 92, 91));
		volver.setForeground(Color.white);
		volver.setFont(subtitulo);
		volver.setLayout(null);
		volver.setBorder(new LineBorder(Color.black, 3, true));
		panelAdentro.add(volver);
		
		JButton siguiente = new JButton("Siguiente");
		siguiente.setSize(150, 50);
		siguiente.setLocation(250, 350);
		siguiente.setBackground(new Color(11, 156, 154));
		siguiente.setForeground(Color.white);
		siguiente.setFont(subtitulo);
		siguiente.setLayout(null);
		siguiente.setBorder(new LineBorder(Color.black, 3, true));
		panelAdentro.add(siguiente);
		
		// Le ponemos un evento de Mouse a los botones
		
		siguiente.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e)
			{
				siguiente.setBackground(new Color(97, 186, 186));
			}
			
			public void mouseExited(MouseEvent e)
			{
				siguiente.setBackground(new Color(11, 156, 154));
			}
		});
		
		volver.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e)
			{
				volver.setBackground(new Color(125, 125, 124));
			}
			
			public void mouseExited(MouseEvent e)
			{
				volver.setBackground(new Color(92, 92, 91));
			}
		});
		
		// Le ponemos un ActionListener a los botones
		
		volver.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("login");
			}
			
		});
		

		panelAdentro.revalidate();
		
		panelAfuera.add(panelAdentro);
		
		panelAfuera.revalidate();
		return panelAfuera;
	}
	
	public JPanel baja()
	{
		// Size de ventana recomendada: ((800, 700) o si tiene un JMenuBar: (800, 730))
		
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(this.WIDTH, this.HEIGHT);
		panel.setOpaque(true);
		panel.setLayout(null);
		
		JPanel panelAfuera = new JPanel();
		panelAfuera.setLocation(0, 0);
		panelAfuera.setSize(this.WIDTH, this.HEIGHT);
		panelAfuera.setOpaque(true);
		panelAfuera.setBackground(new Color(244,80,89));
		panelAfuera.setLayout(null);
		
		JPanel panelAdentro = new JPanel();
		panelAdentro.setLocation(160, 90);
		panelAdentro.setSize(470, 500);
		panelAdentro.setOpaque(true);
		panelAdentro.setLayout(null);
		panelAdentro.setBackground(Color.white);
		panelAdentro.setBorder(new LineBorder(new Color(16, 47, 125), 6));
		
		
		// JLabels
		
		JLabel labelBaja = new JLabel("Baja");
		labelBaja.setSize(100, 40);
		labelBaja.setLocation(350, 10);
		labelBaja.setBackground(new Color(247, 121, 134));
		labelBaja.setOpaque(true);
		labelBaja.setFont(titulo);
		labelBaja.setHorizontalAlignment(JLabel.CENTER);
		panelAfuera.add(labelBaja);
		
		JLabel accede = new JLabel("Eliminar su cuenta");
		accede.setSize(320, 40);
		accede.setLocation(75, 15);
		accede.setFont(titulo);
		accede.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(accede);
		
		JLabel labelCodigo = new JLabel("Hemos enviado un código a la bandeja");
		labelCodigo.setSize(385, 20);
		labelCodigo.setLocation(45, 100);
		labelCodigo.setFont(subtitulo);
		labelCodigo.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(labelCodigo);
		
		JLabel labelTelefono = new JLabel("de correo asignado a la cuenta.");
		labelTelefono.setSize(385, 20);
		labelTelefono.setLocation(45, 130);
		labelTelefono.setFont(subtitulo);
		labelTelefono.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(labelTelefono);
		
		JLabel labelInserte = new JLabel("Inserte el código:");
		labelInserte.setSize(200, 20);
		labelInserte.setLocation(65, 195);
		labelInserte.setFont(subtitulo);
		labelInserte.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(labelInserte);
		
		JLabel labelPassword = new JLabel("Inserte su contraseña:");
		labelPassword.setSize(200, 20);
		labelPassword.setLocation(85, 300);
		labelPassword.setFont(subtitulo);
		labelPassword.setHorizontalAlignment(JLabel.CENTER);
		panelAdentro.add(labelPassword);
		
		
		// JTextField
		
		JTextField codigo = new JTextField();
		codigo.setSize(300, 40);
		codigo.setLocation(90, 230);
		codigo.setLayout(null);
		codigo.setBorder(new LineBorder(Color.black, 3, true));
		panelAdentro.add(codigo);
		
		
		// JPasswordField
		
		JPasswordField password = new JPasswordField();
		password.setSize(300, 40);
		password.setLocation(90, 330);
		password.setLayout(null);
		password.setBorder(new LineBorder(Color.black, 3, true));
		panelAdentro.add(password);
		
		// JButton
		
		JButton volver = new JButton("Volver");
		volver.setSize(150, 50);
		volver.setLocation(80, 410);
		volver.setBackground(new Color(92, 92, 91));
		volver.setForeground(Color.white);
		volver.setFont(subtitulo);
		volver.setLayout(null);
		volver.setBorder(new LineBorder(Color.black, 3, true));
		panelAdentro.add(volver);
		
		JButton siguiente = new JButton("Eliminar");
		siguiente.setSize(150, 50);
		siguiente.setLocation(250, 410);
		siguiente.setBackground(new Color(230, 14, 46));
		siguiente.setForeground(Color.white);
		siguiente.setFont(subtitulo);
		siguiente.setLayout(null);
		siguiente.setBorder(new LineBorder(Color.black, 3, true));
		panelAdentro.add(siguiente);
		
		// Le ponemos un evento de Mouse a los botones
		
		siguiente.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e)
			{
				siguiente.setBackground(new Color(219, 86, 105));
			}
			
			public void mouseExited(MouseEvent e)
			{
				siguiente.setBackground(new Color(230, 14, 46));
			}
		});
		
		volver.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e)
			{
				volver.setBackground(new Color(125, 125, 124));
			}
			
			public void mouseExited(MouseEvent e)
			{
				volver.setBackground(new Color(92, 92, 91));
			}
		});
		
		// Le ponemos un ActionListener a los botones
		
		volver.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("login");
			}
			
		});
		
		
		panelAdentro.revalidate();
		
		panelAfuera.add(panelAdentro);
		
		panelAfuera.revalidate();
		return panelAfuera;
	}
	
	public JPanel comoCrearUsuario()
	{
		// Size de ventana recomendada: (700, 500) o si tiene un JMenuBar: (700, 530))
		
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(this.WIDTH, this.HEIGHT);
		panel.setOpaque(true);
		panel.setBackground(new Color(236,235,233));
		panel.setLayout(null);
		
		JLabel labelCrearUsuario = new JLabel("¿Cómo crear un usuario?");
		labelCrearUsuario.setSize(700, 40);
		labelCrearUsuario.setLocation(0, 10);
		labelCrearUsuario.setBackground(new Color(101,186,191));
		labelCrearUsuario.setOpaque(true);
		labelCrearUsuario.setFont(titulo);
		labelCrearUsuario.setHorizontalAlignment(JLabel.CENTER);
		panel.add(labelCrearUsuario);
		
		JLabel labelPaso1 = new JLabel("1. Vaya a la página de registro.");
		labelPaso1.setSize(800, 40);
		labelPaso1.setLocation(50, 75);
		labelPaso1.setOpaque(false);
		labelPaso1.setFont(calculadoraFont);
		labelPaso1.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelPaso1);
		
		JLabel labelPaso2 = new JLabel("2. Rellene el formulario con su");
		labelPaso2.setSize(800, 40);
		labelPaso2.setLocation(50, 135);
		labelPaso2.setOpaque(false);
		labelPaso2.setFont(calculadoraFont);
		labelPaso2.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelPaso2);
		
		JLabel labelPaso2_1 = new JLabel("información personal y regístrese.");
		labelPaso2_1.setSize(800, 40);
		labelPaso2_1.setLocation(80, 175);
		labelPaso2_1.setOpaque(false);
		labelPaso2_1.setFont(calculadoraFont);
		labelPaso2_1.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelPaso2_1);
		
		JLabel labelPaso3 = new JLabel("3. Vaya a la página de alta.");
		labelPaso3.setSize(800, 40);
		labelPaso3.setLocation(50, 235);
		labelPaso3.setOpaque(false);
		labelPaso3.setFont(calculadoraFont);
		labelPaso3.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelPaso3);
		
		JLabel labelPaso4 = new JLabel("4. Siga las instrucciones para verificar su cuenta.");
		labelPaso4.setSize(800, 40);
		labelPaso4.setLocation(50, 295);
		labelPaso4.setOpaque(false);
		labelPaso4.setFont(calculadoraFont);
		labelPaso4.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelPaso4);
		
		
		// JButton
		
		JButton volver = new JButton("Volver");
		volver.setSize(150, 50);
		volver.setLocation(275, 370);
		volver.setBackground(new Color(92, 92, 91));
		volver.setForeground(Color.white);
		volver.setFont(subtitulo);
		volver.setLayout(null);
		volver.setBorder(new LineBorder(Color.black, 3, true));
		panel.add(volver);
		
		// Le ponemos un evento de Mouse a los botones
		
		volver.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e)
			{
				volver.setBackground(new Color(125, 125, 124));
			}
			
			public void mouseExited(MouseEvent e)
			{
				volver.setBackground(new Color(92, 92, 91));
			}
		});
		
		// Le ponemos un ActionListener a los botones
		
		volver.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("login");
			}
			
		});
		
		
		panel.revalidate();
		return panel;
	}
	
	public JPanel comoAccederSistema()
	{
		// Size de ventana recomendada: (800, 400) o si tiene un JMenuBar: (800, 430))
		
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(this.WIDTH, this.HEIGHT);
		panel.setOpaque(true);
		panel.setBackground(new Color(236,235,233));
		panel.setLayout(null);
		
		JLabel labelAccederSistema = new JLabel("¿Cómo acceder al sistema?");
		labelAccederSistema.setSize(800, 40);
		labelAccederSistema.setLocation(0, 10);
		labelAccederSistema.setBackground(new Color(114, 171, 130));
		labelAccederSistema.setOpaque(true);
		labelAccederSistema.setFont(titulo);
		labelAccederSistema.setHorizontalAlignment(JLabel.CENTER);
		panel.add(labelAccederSistema);
		
		JLabel labelPaso1 = new JLabel("1. Tiene que tener una cuenta registrada y verificada.");
		labelPaso1.setSize(800, 40);
		labelPaso1.setLocation(50, 75);
		labelPaso1.setOpaque(false);
		labelPaso1.setFont(calculadoraFont);
		labelPaso1.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelPaso1);
		
		JLabel labelPaso2 = new JLabel("2. Navegue hacia la página de login.");
		labelPaso2.setSize(800, 40);
		labelPaso2.setLocation(50, 135);
		labelPaso2.setOpaque(false);
		labelPaso2.setFont(calculadoraFont);
		labelPaso2.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelPaso2);
		
		
		JLabel labelPaso3 = new JLabel("3. Ingrese su información personal e inicie sesión.");
		labelPaso3.setSize(800, 40);
		labelPaso3.setLocation(50, 195);
		labelPaso3.setOpaque(false);
		labelPaso3.setFont(calculadoraFont);
		labelPaso3.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelPaso3);
		
		
		// JButton
		
		JButton volver = new JButton("Volver");
		volver.setSize(150, 50);
		volver.setLocation(315, 280);
		volver.setBackground(new Color(92, 92, 91));
		volver.setForeground(Color.white);
		volver.setFont(subtitulo);
		volver.setLayout(null);
		volver.setBorder(new LineBorder(Color.black, 3, true));
		panel.add(volver);
		
		// Le ponemos un evento de Mouse a los botones
		
		volver.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e)
			{
				volver.setBackground(new Color(125, 125, 124));
			}
			
			public void mouseExited(MouseEvent e)
			{
				volver.setBackground(new Color(92, 92, 91));
			}
		});
		
		// Le ponemos un ActionListener a los botones
		
		volver.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("login");
			}
			
		});
		
		
		panel.revalidate();
		return panel;
	}
	
	public JPanel passwordOlvidada()
	{
		// Size de ventana recomendada: (800, 400) o si tiene un JMenuBar: (800, 430))
		
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(this.WIDTH, this.HEIGHT);
		panel.setOpaque(true);
		panel.setBackground(new Color(236,235,233));
		panel.setLayout(null);
		
		JLabel labelpasswordOlvidada = new JLabel("¿Qué pasa si olvidé mi contraseña?");
		labelpasswordOlvidada.setSize(900, 40);
		labelpasswordOlvidada.setLocation(0, 10);
		labelpasswordOlvidada.setBackground(new Color(207, 158, 138));
		labelpasswordOlvidada.setOpaque(true);
		labelpasswordOlvidada.setFont(titulo);
		labelpasswordOlvidada.setHorizontalAlignment(JLabel.CENTER);
		panel.add(labelpasswordOlvidada);
		
		JLabel labelPaso1 = new JLabel("1. Navegue a la página de recuperación y siga las instrucciones.");
		labelPaso1.setSize(800, 40);
		labelPaso1.setLocation(50, 75);
		labelPaso1.setOpaque(false);
		labelPaso1.setFont(calculadoraFont);
		labelPaso1.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelPaso1);
		
		JLabel labelPaso2 = new JLabel("2. Revise la bandeja de entrada de su correo.");
		labelPaso2.setSize(800, 40);
		labelPaso2.setLocation(50, 135);
		labelPaso2.setOpaque(false);
		labelPaso2.setFont(calculadoraFont);
		labelPaso2.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelPaso2);
		
		
		JLabel labelPaso3 = new JLabel("3. Cambie su contraseña con el enlace en el correo enviado.");
		labelPaso3.setSize(800, 40);
		labelPaso3.setLocation(50, 195);
		labelPaso3.setOpaque(false);
		labelPaso3.setFont(calculadoraFont);
		labelPaso3.setHorizontalAlignment(JLabel.LEFT);
		panel.add(labelPaso3);
		
		
		// JButton
		
		JButton volver = new JButton("Volver");
		volver.setSize(150, 50);
		volver.setLocation(375, 280);
		volver.setBackground(new Color(92, 92, 91));
		volver.setForeground(Color.white);
		volver.setFont(subtitulo);
		volver.setLayout(null);
		volver.setBorder(new LineBorder(Color.black, 3, true));
		panel.add(volver);
		
		// Le ponemos un evento de Mouse a los botones
		
		volver.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e)
			{
				volver.setBackground(new Color(125, 125, 124));
			}
			
			public void mouseExited(MouseEvent e)
			{
				volver.setBackground(new Color(92, 92, 91));
			}
		});
		
		// Le ponemos un ActionListener a los botones
		
		volver.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("login");
			}
			
		});
		
		
		panel.revalidate();
		return panel;
	}
	
	
	public JPanel tablaRegistros()
	{
		// Size de la ventana recomendada: ((1000, 800) o si tiene un JMenuBar: (1000, 830))
		
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(this.WIDTH, this.HEIGHT);
		panel.setOpaque(true);
		panel.setLayout(null);
		panel.setBackground(new Color(200, 180, 237));
		
				
		// JLabels
				
		JLabel labelUsuarios = new JLabel("Usuarios");
		labelUsuarios.setSize(160, 40);
		labelUsuarios.setLocation(420, 10);
		labelUsuarios.setBackground(new Color(153, 151, 247));
		labelUsuarios.setOpaque(true);
		labelUsuarios.setFont(titulo);
		labelUsuarios.setHorizontalAlignment(JLabel.CENTER);
		panel.add(labelUsuarios);
		
		JLabel totalUsuarios = new JLabel("Total de usuarios registrados: 100");
		totalUsuarios.setSize(300, 40);
		totalUsuarios.setLocation(350, 80);
		totalUsuarios.setOpaque(true);
		totalUsuarios.setFont(subtitulo);
		totalUsuarios.setBorder(BorderFactory.createLineBorder(Color.black));
		totalUsuarios.setHorizontalAlignment(JLabel.CENTER);
		panel.add(totalUsuarios);
		
		
		// JButtons
		
		JButton exportar = new JButton("Exportar");
		exportar.setSize(150, 40);
		exportar.setLocation(335, 670);
		exportar.setFont(subtitulo);
		exportar.setLayout(null);
		panel.add(exportar);
		
		JButton agregar = new JButton("Añadir");
		agregar.setSize(150, 40);
		agregar.setLocation(510, 670);
		agregar.setFont(subtitulo);
		agregar.setLayout(null);
		panel.add(agregar);
		
		JButton volver = new JButton("Volver");
		volver.setSize(150, 40);
		volver.setLocation(35, 30);
		volver.setFont(subtitulo);
		volver.setLayout(null);
		panel.add(volver);
		
		// Le ponemos un ActionListener a los botones
		
		volver.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				manager("login");
			}
			
		});
		
		
		// JTable
		
		String[] nombreColumnas = {
				"ID",
				"Nombre",
				"Correo Electrónico",
				"Edad",
				"Juego"
				};
		
		Object[][] datos = {
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"},
				{"ID", "Nombre", "Correo", "Edad", "Juego"}};
					
		
		JTable tabla = new JTable(datos, nombreColumnas);
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setLocation(30, 150);
		scrollPane.setSize(920, 500);
		panel.add(scrollPane);
		
		panel.revalidate();
		return panel;
	}
	
	public JPanel interes() 
	{
		// Size de ventana recomendada: ((500, 500) o si tiene un JMenuBar: (500, 530))
		
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(this.WIDTH, this.HEIGHT);
		panel.setBackground(Color.white);
		panel.setLayout(new BorderLayout(10, 10));
		
		JPanel calcular = new JPanel();
		calcular.setLayout(new BorderLayout(10, 10));
		calcular.setBackground(new Color(114, 240, 103));
		calcular.setOpaque(true);
		calcular.setBorder(BorderFactory.createMatteBorder(10, 20, 10, 20, Color.white));
		panel.add(calcular, BorderLayout.CENTER);
		
		JPanel calcularGrid = new JPanel();
		calcularGrid.setLayout(new GridLayout(4, 2, 10, 10));
		calcularGrid.setBackground(new Color(114, 240, 103));
		calcular.add(calcularGrid);
		
		JPanel monto = new JPanel();
		monto.setLayout(new GridLayout(2, 2, 10, 30));
		monto.setBackground(new Color(237, 139, 135));
		monto.setOpaque(true);
		monto.setBorder(BorderFactory.createMatteBorder(10, 20, 40, 20, Color.white));
		panel.add(monto, BorderLayout.SOUTH);
		
		
		// JLabels
		
		JLabel tituloInteres = new JLabel("Interés");
		tituloInteres.setFont(new Font("Cambria", Font.ITALIC, 28));
		tituloInteres.setForeground(Color.red);
		tituloInteres.setHorizontalAlignment(JLabel.LEFT);
		tituloInteres.setBorder(BorderFactory.createMatteBorder(0, 20, 0, 0, Color.white));
		panel.add(tituloInteres, BorderLayout.NORTH);
		
		JLabel labelCalcular = new JLabel("Calcular interés");
		labelCalcular.setFont(new Font("Cambria", Font.BOLD, 20));
		labelCalcular.setHorizontalAlignment(JLabel.LEFT);
		calcular.add(labelCalcular, BorderLayout.NORTH);
		
		// Desde aquí, se van a ir implementando los elementos de calcularGrid
		
		// Fila 1
		
		JLabel labelCapital = new JLabel("Capital:");
		labelCapital.setFont(mini);
		labelCapital.setHorizontalAlignment(JLabel.CENTER);
		labelCapital.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
		calcularGrid.add(labelCapital);
		
		JTextField capital = new JTextField("1500");
		capital.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 50, new Color(114, 240, 103)));
		calcularGrid.add(capital);
		
		// Fila 2
		
		JLabel labelTiempo = new JLabel("Tiempo:");
		labelTiempo.setFont(mini);
		labelTiempo.setHorizontalAlignment(JLabel.CENTER);
		labelTiempo.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
		calcularGrid.add(labelTiempo);
		
		JTextField tiempo = new JTextField("2");
		tiempo.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 50, new Color(114, 240, 103)));
		calcularGrid.add(tiempo);
		
		// Fila 3
		
		JLabel labelTasa = new JLabel("Tasa interés:");
		labelTasa.setFont(mini);
		labelTasa.setHorizontalAlignment(JLabel.CENTER);
		labelTasa.setBorder(BorderFactory.createEmptyBorder(10, 45, 10, 10));
		calcularGrid.add(labelTasa);
				
		JTextField tasa = new JTextField("0.1");
		tasa.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 50, new Color(114, 240, 103)));
		calcularGrid.add(tasa);
		
		// Fila 4
		
		// JButtons
		
		JButton buttonCalcular = new JButton("Calcular");
		buttonCalcular.setFont(mini);
		buttonCalcular.setBorder(BorderFactory.createMatteBorder(5, 100, 5, 5, new Color(114, 240, 103)));
		buttonCalcular.setBackground(Color.DARK_GRAY);
		buttonCalcular.setForeground(Color.white);
		buttonCalcular.setIcon(new ImageIcon(getClass().getResource("images/calcular.png")));
		calcularGrid.add(buttonCalcular);
		
		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setFont(mini);
		buttonCancelar.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 100, new Color(114, 240, 103)));
		buttonCancelar.setBackground(Color.DARK_GRAY);
		buttonCancelar.setForeground(Color.white);
		buttonCancelar.setIcon(new ImageIcon(getClass().getResource("images/cancelar.png")));
		calcularGrid.add(buttonCancelar);
		
		// CalcularGrid terminado.
		
		
		// A partir de este punto ponemos los componentes del panel monto
		
		// Fila 1
		
		JLabel labelInteres = new JLabel("Interés:");
		labelInteres.setFont(mini);
		labelInteres.setHorizontalAlignment(JLabel.CENTER);
		labelInteres.setBorder(BorderFactory.createEmptyBorder(10, 25, 0, 0));
		monto.add(labelInteres);
		
		JTextField textInteres = new JTextField("315.0000000000002");
		textInteres.setBorder(BorderFactory.createMatteBorder(10, 0, 3, 50, new Color(237, 139, 135)));
		monto.add(textInteres);
		
		// Fila 2
		
		JLabel labelMonto = new JLabel("Monto:");
		labelMonto.setFont(mini);
		labelMonto.setHorizontalAlignment(JLabel.CENTER);
		labelMonto.setBorder(BorderFactory.createEmptyBorder(10, 30, 14, 10));
		monto.add(labelMonto);
		
		JTextField textMonto = new JTextField("1815.0000000000000002");
		textMonto.setBorder(BorderFactory.createMatteBorder(3, 0, 10, 50, new Color(237, 139, 135)));
		monto.add(textMonto);
		
		panel.revalidate();
		return panel;
	}
	
	public void manager(String target)
	{
		this.getContentPane().removeAll();
		
		if (target.equals("register"))
		{	
			this.setSize(500, 830);
			this.add(register());
		}
		
		if (target.equals("login"))
		{
			this.setSize(800, 730);
			this.add(login());
		}
		
		if (target.equals("recuperacion"))
		{
			this.setSize(800, 730);
			this.add(recuperar());
		}
		
		if (target.equals("alta"))
		{
			this.setSize(800, 730);
			this.add(alta());
		}
		
		if (target.equals("baja"))
		{
			this.setSize(800, 730);
			this.add(baja());
		}
		
		if (target.equals("consultar"))
		{
			this.setSize(1000, 830);
			this.add(tablaRegistros());
		}
		
		if (target.equals("comoCrearUsuario"))
		{
			this.setSize(700, 530);
			this.add(comoCrearUsuario());
		}

		if (target.equals("comoAccederSistema"))
		{
			this.setSize(800, 430);
			this.add(comoAccederSistema());
		}
		
		if (target.equals("passwordOlvidada"))
		{
			this.setSize(900, 430);
			this.add(passwordOlvidada());
		}
		

		this.repaint();
		this.revalidate();
	}

	/* public void paint(Graphics g)
	{
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		
		// Cielo
		
		g2.setColor(new Color(31, 196, 237));
		g2.fillRect(0, 0, 800, 830);
		
		
		// Cerca
		
		g2.setColor(new Color(176, 130, 32));
		g2.fillRect(0, 450, 800, 100);
		
		g2.setColor(new Color(237, 175, 43));
		g2.fillRect(20, 400, 60, 250);
		g2.fillRect(100, 400, 60, 250);
		g2.fillRect(660, 400, 60, 250);
		g2.fillRect(740, 400, 60, 250);
		
		
		int [] picoCercaX1 = {20, 50, 80};
		int [] picoCerca = {400, 350, 400};
		
		g2.fillPolygon(picoCercaX1, picoCerca, 3);
		
		
		int [] picoCercaX2 = {100, 130, 160};
		
		g2.fillPolygon(picoCercaX2, picoCerca, 3);
		
		
		int [] picoCercaX3 = {660, 690, 720};
		
		g2.fillPolygon(picoCercaX3, picoCerca, 3);
		
		
		int [] picoCercaX4 = {740, 770, 800};
		
		g2.fillPolygon(picoCercaX4, picoCerca, 3);
		
		
		// Pared
		
		g2.setColor(new Color(234, 237, 133));
		g2.fillRect(150, 300, 500, 300);
		
		
		int [] sombraParedX = {150, 650, 650};
		int [] sombraParedY = {300, 400, 300};
		
		g2.setColor(new Color(153, 156, 89));
		g2.fillPolygon(sombraParedX, sombraParedY, 3);
		
		
		int [] sombraVentanaX = {440, 650, 650};
		int [] sombraVentanaY = {478, 525, 478};
		
		g2.setColor(new Color(153, 156, 89));
		g2.fillPolygon(sombraVentanaX, sombraVentanaY, 3);
		
		
		g2.setColor(new Color(93, 94, 52));
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(150, 575, 647, 575);
		g2.drawLine(150, 525, 647, 525);
		g2.drawLine(150, 475, 647, 475);
		g2.drawLine(150, 425, 647, 425);
		g2.drawLine(150, 375, 647, 375);
		g2.drawLine(150, 325, 647, 325);
		
		
		// Puerta
		
		g2.setColor(new Color(102, 80, 44));
		g2.fillRect(176, 315, 150, 330);
		
		g2.setColor(new Color(138, 93, 21));
		g2.fillRect(185, 330, 130, 310);
		
		g2.setColor(Color.white);
		g2.fillOval(285, 460, 20, 20);
		
		
		// Ventana
		
		g2.setColor(new Color(222, 24, 41));
		g2.fillRect(450, 325, 150, 150);
		
		g2.setColor(Color.white);
		g2.fillRect(460, 335, 60, 60);
		g2.fillRect(530, 335, 60, 60);
		g2.fillRect(460, 405, 60, 60);
		g2.fillRect(530, 405, 60, 60);
		
		g2.setColor(Color.darkGray);
		g2.fillRect(440, 470, 170, 20);
		
		// Suelo
		
		g2.setColor(Color.gray);
		g2.fillRect(125, 600, 550, 40);
		
		g2.setColor(new Color(13, 99, 21));
		g2.fillRect(0, 640, 800, 20);
		
		g2.setColor(new Color(22, 171, 36));
		g2.fillRect(0, 660, 800, 50);
		
		g2.setColor(new Color(237, 230, 135));
		g2.fillRect(0, 710, 800, 40);
		
		g2.setColor(new Color(82, 66, 35));
		g2.fillRect(0, 750, 800, 80);
		
		
		// Chimenea
		
		g2.setColor(Color.gray);
		g2.fillRect(525, 150, 80, 150);
		
		
		int [] sombraChimeneaX = {520, 605, 605};
		int [] sombraChimeneaY = {160, 160, 190};
		
		g2.setColor(Color.darkGray);
		g2.fillPolygon(sombraChimeneaX, sombraChimeneaY, 3);
		
		
		g2.setColor(new Color(102, 102, 102));
		g2.fillRect(512, 120, 105, 40);
		
		
		// Techo
		
		int [] techoX = {70, 300, 725};
		int [] techoY = {300, 50, 300};
		
		g2.setColor(Color.red);
		g2.fillPolygon(techoX, techoY, 3);
		
	}
	*/
}
