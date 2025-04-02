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
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

public class VentanaPaint extends JFrame implements MouseListener, MouseMotionListener
{
	Font fuente = new Font("Aptos", Font.BOLD, 20);
	
	int grosorI = 12, grosor = 12, tool = 1;
	
	Color color = Color.black;
	
	PaintPanel panelDibujo = new PaintPanel();
	
	ArrayList<Point> puntos = new ArrayList<Point>();
	List <List <Point>> listaPuntos = new ArrayList<>();
	
	private ArrayList<Figura> figuras = new ArrayList<Figura>();
	
	// Creamos listas para que haya un historial del grosor y el color
	List<Integer> listaGrosor = new ArrayList<>();
	List<Color> listaColores = new ArrayList<>();
	
	int x, y;
	
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
		
		pincel.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				tool = 1;		
			}
			
		});
		
		
		JButton borrador = new JButton("  Borrador  ");
		borrador.setBackground(Color.white);
		borrador.setForeground(Color.black);
		borrador.setFont(fuente);
		borrador.setBorder(new LineBorder(Color.black, 3));
		panelHerramientas.add(borrador);
		
		borrador.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				tool = 2;		
			}
			
		});
		
		
		// JSpinner
		
		JSpinner tGrosor = new JSpinner(new SpinnerNumberModel(grosorI, grosorI - 11, grosorI + 88, 1));
		tGrosor.setBorder(new LineBorder(Color.black, 3));
		tGrosor.setFont(fuente);
		panelHerramientas.add(tGrosor);
		
		tGrosor.addChangeListener(new ChangeListener()
		{
			@Override
			public void stateChanged(ChangeEvent e) 
			{
				grosor = (Integer) tGrosor.getValue();			
			}
			
		});
		
		
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
		
		circulo.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				tool = 3;		
			}
			
		});
		
		
		JButton cuadrado = new JButton();
		cuadrado.setBackground(Color.white);
		cuadrado.setForeground(Color.black);
		cuadrado.setFont(fuente);
		cuadrado.setIcon(new ImageIcon(getClass().getResource("images/square.png")));
		panelFiguras.add(cuadrado);
		
		cuadrado.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				tool = 4;		
			}
			
		});
		
		
		JButton triangulo = new JButton();
		triangulo.setBackground(Color.white);
		triangulo.setForeground(Color.black);
		triangulo.setFont(fuente);
		triangulo.setIcon(new ImageIcon(getClass().getResource("images/triangle.png")));
		panelFiguras.add(triangulo);
		
		triangulo.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				tool = 5;		
			}
			
		});
		
		
		JButton linea = new JButton();
		linea.setBackground(Color.white);
		linea.setForeground(Color.black);
		linea.setFont(fuente);
		linea.setIcon(new ImageIcon(getClass().getResource("images/line.png")));
		panelFiguras.add(linea);
		
		linea.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				tool = 6;		
			}
			
		});
		
		
		// JButton para limpiar
		
		JButton limpiar = new JButton("   Limpiar   ");
		limpiar.setBackground(Color.white);
		limpiar.setForeground(Color.black);
		limpiar.setFont(fuente);
		limpiar.setBorder(new LineBorder(Color.black, 3));
		panelHerramientas.add(limpiar);
		
		limpiar.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				puntos.clear();
				listaPuntos.clear();
				figuras.clear();
				panelDibujo.repaint();
			}
			
		});
		
		
		// JButton para colores
		
		panelColores.add(new JLabel(""));
		
		JButton blanco = new JButton("                                  ");
		blanco.setBackground(Color.white);
		blanco.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(blanco);
		
		blanco.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				color = Color.white;		
			}
			
		});
		
		
		JButton negro = new JButton();
		negro.setBackground(Color.black);
		negro.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(negro);
		
		negro.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				color = Color.black;		
			}
			
		});
		
		
		JButton gris = new JButton();
		gris.setBackground(Color.gray);
		gris.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(gris);
		
		gris.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				color = Color.gray;		
			}
			
		});
		
		
		JButton azul = new JButton();
		azul.setBackground(Color.blue);
		azul.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(azul);
		
		azul.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				color = Color.blue;		
			}
			
		});
		
		
		JButton rojo = new JButton();
		rojo.setBackground(Color.red);
		rojo.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(rojo);
		
		rojo.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				color = Color.red;		
			}
			
		});
		
		
		JButton verde = new JButton();
		verde.setBackground(Color.green);
		verde.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(verde);
		
		verde.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				color = Color.green;		
			}
			
		});
		
		
		// JLabel y JTextField y JButton de color RGB
		
		panelColores.add(new JLabel(""));
		
		JLabel labelRGB = new JLabel("Custom (RGB)");
		labelRGB.setFont(new Font("Aptos", Font.BOLD, 15));
		labelRGB.setForeground(Color.black);
		labelRGB.setHorizontalAlignment(JLabel.CENTER);
		panelColores.add(labelRGB);
		
		JPanel panelRGB = new JPanel();
		panelRGB.setLayout(new GridLayout(1, 3));
		panelRGB.setBorder(new LineBorder(Color.black, 2));
		panelColores.add(panelRGB);
		
		JTextField rgb1 = new JTextField("0");
		panelRGB.add(rgb1);
		
		JTextField rgb2 = new JTextField("0");
		panelRGB.add(rgb2);
		
		JTextField rgb3 = new JTextField("0");
		panelRGB.add(rgb3);
		
		
		JButton aplicar = new JButton("Aplicar");
		aplicar.setFont(new Font("Aptos", Font.BOLD, 15));
		aplicar.setBackground(Color.white);
		aplicar.setBorder(new LineBorder(Color.black, 3));
		panelColores.add(aplicar);
		
		aplicar.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// Seleccionamos el color RGB dependiendo de lo que escriba el usuario
				int rojoRGB = Integer.parseInt(rgb1.getText()), verdeRGB = Integer.parseInt(rgb2.getText()), azulRGB = Integer.parseInt(rgb3.getText());
				if (rojoRGB >= 0 && rojoRGB <= 255 && verdeRGB >= 0 && verdeRGB <= 255 && azulRGB >= 0 && azulRGB <= 255)
					color = new Color(rojoRGB, verdeRGB, azulRGB);
			}
			
		});
		
		
		panelColores.add(new JLabel(""));
		
		panelDibujo.addMouseListener(this);
		panelDibujo.addMouseMotionListener(this);
		
		
		panelHerramientas.revalidate();
		
		panelAfuera.revalidate();
		return panelAfuera;
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		if (tool == 3)
		{
			figuras.add(new Figura(e.getX(), e.getY(), grosor, grosor, color, 0, grosor));
		}
		
		if (tool == 4)
		{
			figuras.add(new Figura(e.getX(), e.getY(), grosor, grosor, color, 1, grosor));
		}	
		
		panelDibujo.repaint();
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		if (tool == 3)
		{
			figuras.add(new Figura(e.getX(), e.getY(), grosor, grosor, color, 0, grosor));
		}
		
		if (tool == 4)
		{
			figuras.add(new Figura(e.getX(), e.getY(), grosor, grosor, color, 1, grosor));
		}
		
		if (tool == 6)
		{
			x = e.getX();
			y = e.getY();
		}
		
		panelDibujo.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{	
		if (tool == 1)
		{
			ArrayList puntosResp = (ArrayList)puntos.clone();
			
			listaGrosor.add(grosor);
			listaColores.add(color);
			listaPuntos.add(puntosResp);
			puntos.clear();
		}
		
		if (tool == 6)
		{
			figuras.add(new Figura(x, y, e.getX(), e.getY(), color, 2, grosor));
		}
		
		panelDibujo.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{	
		
	}

	@Override
	public void mouseDragged(MouseEvent e) 
	{
		if (tool == 1)
		{
			puntos.add(e.getPoint());
		}
		
		if (tool == 2)
		{
			figuras.add(new Figura(e.getX(), e.getY(), grosor*2, grosor*2, Color.white, 4, grosor));
		}
		
		panelDibujo.repaint();
	
	}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
		panelDibujo.repaint();
	}
	
	class PaintPanel extends JPanel 
	{
		public PaintPanel()
		{
			this.setBackground(Color.white);
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			Graphics2D g2 = (Graphics2D) g;
			
			// Contador para identificar el grosor y el color adecuado
			int contador = 0;
			for (Iterator iterator = listaPuntos.iterator(); iterator.hasNext();) 
			{
				List<Point> trazo = (List<Point>) iterator.next();
				g2.setStroke(new BasicStroke(listaGrosor.get(contador)));
				g2.setColor(listaColores.get(contador));
				
				if (trazo.size()> 1)
				{
					for (int i = 1; i < trazo.size(); i++) 
					{
						Point p1 = trazo.get(i - 1);
						Point p2 = trazo.get(i);
						
						g2.drawLine(p1.x, p1.y, p2.x, p2.y);
					}
				}
				contador++;
			}
			
			if (figuras.size()>= 1)
			{
				for (int i = 0; i < figuras.size(); i++) 
				{
					Figura f = figuras.get(i);
					g2.setColor(f.color);
					g2.setStroke(new BasicStroke(f.grosor));
					
					if (f.fig == 0)
						g2.drawOval(f.x, f.y, f.w, f.h);
					
					if (f.fig == 1)
						g2.drawRect(f.x, f.y, f.w, f.h);
					
					if (f.fig == 2)
						g2.drawLine(f.x, f.y, f.w, f.h);
					
					if (f.fig == 4)
						g2.clearRect(f.x, f.y, f.w, f.h);
				}
			}
			
			g2.setColor(color);
			g2.setStroke(new BasicStroke(grosor));
			
			if (puntos.size()> 1)
			{
				for (int i = 1; i < puntos.size(); i++) 
				{
					Point p1 = puntos.get(i - 1);
					Point p2 = puntos.get(i);
					
					g2.drawLine(p1.x, p1.y, p2.x, p2.y);
				}
			}
		}
	}
	
	class Figura
	{
		public int x,y,w,h,fig,grosor;
		public Color color;
		
		public Figura(int x, int y, int w, int h, Color color, int fig, int grosor)
		{
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			this.color = color;
			this.fig = fig;
			this.grosor = grosor;
		}
	}
}
