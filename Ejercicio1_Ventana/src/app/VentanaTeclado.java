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

public class VentanaTeclado extends JFrame implements KeyListener
{
	PaintPanel panelPintado = new PaintPanel();
	
	Player p = new Player(480, 380, 30, 30, Color.blue);
	
	ArrayList<Player> obstaculos = new ArrayList<Player>();

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
		
		JLabel tiempo = new JLabel("0:00");
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
		Boolean m = true;

		for (Player pared : obstaculos) 
		{
			if (p.colision(pared))
			{
				m = false;
				System.out.println("Colisión");
			}
		}
		
		if(e.getKeyCode() == 68 && p.x != 955)
		{
			if (m || p.ultTecla != 68)
			{
				p.x+= 5;
				
				if (m)
					p.ultTecla = 68;
			}
			else
			{
				p.x-= 5;
			}
		}
		
		if (e.getKeyCode() == 83 && p.y != 745)
		{
			if (m || p.ultTecla != 83) 
			{
				p.y+= 5;
				
				if (m)
					p.ultTecla = 83;
			}
			else
			{
				p.y-= 5;
			}
		}
		
		if (e.getKeyCode() == 65 && p.x != 0)
		{
			if (m || p.ultTecla != 65)
			{
				p.x-= 5;
				
				if (m)
					p.ultTecla = 65;
			}
			else
			{
				p.x+= 5;
			}
		}
			
		if (e.getKeyCode() == 87 && p.y != 35)
		{
			if (m || p.ultTecla != 87)
			{
				p.y-= 5;
				
				if (m)
					p.ultTecla = 87;
			}
			else
			{
				p.y+= 5;
			}
		}
		
		System.out.println(e);
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
