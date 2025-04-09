package app;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class VentanaTeclado extends JFrame implements KeyListener
{
	PaintPanel panelPintado = new PaintPanel();
	
	Player p = new Player(480, 380, 30, 30, Color.blue);
	
	Timer timer, timer2;
	
	int lastKey = 0;
	boolean changeLastKey = true;
	
	ArrayList<Player> obstaculos = new ArrayList<Player>();
	
	int milSec = 0, sec = 0, min = 0;
	
	String ceroMilSec = "", ceroSec = "", ceroMins = "";
	
	JLabel tiempo = new JLabel("00:00:00");

	public VentanaTeclado(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 850);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon(getClass().getResource("images/app.png")).getImage());
		
		this.setResizable(false);
		
		obstaculos.add(new Player(50, 300, 200, 70, Color.green));
		obstaculos.add(new Player(250, 600, 200, 70, Color.green));
		
		ActionListener reloj = new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				milSec++;
				if (milSec == 10)
				{
					sec++;
					milSec = 0;
				}
				
				if (sec == 60)
				{
					min++;
					sec = 0;
				}
				
				if (min < 10)
					ceroMins = "0";
				else
					ceroMins = "";
				
				if (sec < 10)
					ceroSec = "0";
				else
					ceroSec = "";
				
				if (milSec < 10)
					ceroMilSec = "0";
				else
					ceroMilSec = "";
					
				tiempo.setText(ceroMins + min + ":" + ceroSec + sec + ":" + ceroMilSec + milSec);	
			}
			
		};
		timer = new Timer(100, reloj);
		
		ActionListener movimiento = new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				update();
			}
			
		};
		timer2 = new Timer(10, movimiento);
		
		
		// Añadimos el panel
		
		this.add(panel());
		this.repaint();
		this.setVisible(true);
		
		
	}
	
	public JPanel panel()
	{
		panelPintado.setLocation(0, 0);
		panelPintado.setSize(this.WIDTH, this.HEIGHT);
		panelPintado.setLayout(new BorderLayout());
		panelPintado.setBackground(Color.black);
		panelPintado.setOpaque(true);
		
		JPanel panelArriba = new JPanel();
		panelPintado.add(panelArriba, BorderLayout.NORTH);
		
		tiempo.setSize(50, 40);
		tiempo.setLocation(475, 20);
		tiempo.setFont(new Font("Aptos", Font.BOLD, 20));
		panelArriba.add(tiempo);
		
		JPanel panelAbajo = new JPanel();
		panelPintado.add(panelAbajo, BorderLayout.SOUTH);
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.setSize(50, 40);
		reiniciar.setLocation(350, 20);
		panelAbajo.add(reiniciar);
		
		reiniciar.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				p.x = 475;
				p.y = 375;
				
				timer.stop();
				timer2.stop();
				tiempo.setText("00:00:00");
				
				milSec = 0;
				sec = 0;
				min = 0;
				
				panelPintado.repaint();
				panelPintado.setFocusable(true);
				panelPintado.requestFocus();
			}
			
		});
		
		panelPintado.addKeyListener(this);
		panelPintado.setFocusable(true);
		
		return panelPintado;
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
			g2.setColor(Color.blue);
			g2.fillRect(p.x, p.y, p.w, p.h);
			
			for (Player pared : obstaculos) 
			{
				g2.setColor(pared.c);
				g2.fillRect(pared.x, pared.y, pared.w, pared.h);
			}
		}
	}


	@Override
	public void keyTyped(KeyEvent e) 
	{
		
		
	}


	@Override
	public void keyPressed(KeyEvent e) 
	{
		timer.start();
		timer2.start();
		
		p.ultTecla = e.getKeyCode();
	}
	
	public void update()
	{
		Boolean m = true;

		System.out.println(lastKey);
		for (Player pared : obstaculos) 
		{
			if (p.colision(pared))
			{
				m = false;
				
				if (changeLastKey)
				{
					lastKey = p.ultTecla;
					changeLastKey = false;
				}	
			}
		}
		
		if(p.ultTecla == 68 && p.x != 955)
		{
			if (m || lastKey != 68)
			{
				p.x+= 5;
			}
			else
			{
				p.ultTecla = 0;
			}
		}
		
		if (p.ultTecla == 83 && p.y != 745)
		{
			if (m || lastKey != 83) 
			{
				p.y+= 5;
			}
			else
			{
				p.ultTecla = 0;
			}
		}
		
		if (p.ultTecla == 65 && p.x != 0)
		{
			if (m || lastKey != 65)
			{
				p.x-= 5;
			}
			else
			{
				p.ultTecla = 0;
			}
		}
			
		if (p.ultTecla == 87 && p.y != 35)
		{
			if (m || lastKey != 87)
			{
				p.y-= 5;
			}
			else
			{
				p.ultTecla = 0;
			}
		}
		
		if (m)
			changeLastKey = true;
		
		panelPintado.repaint();
	}


	@Override
	public void keyReleased(KeyEvent e) 
	{
		
		
	}
	
	class Player 
	{
		int x, y, w, h, ultTecla;
		Color c;
		
		public Player(int x, int y, int w, int h, Color c)
		{
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			this.c = c;
		}
		
		public Boolean colision(Player target)
		{
			return (this.x -5 < target.x + target.w &&
	                 this.x + 5 + this.w > target.x &&
	                 this.y - 5 < target.y + target.h &&
	                 this.y + 5 + this.h > target.y);
		}
	}
}
