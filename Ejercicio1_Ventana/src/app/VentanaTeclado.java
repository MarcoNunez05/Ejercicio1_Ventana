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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaTeclado extends JFrame implements KeyListener
{
	PaintPanel panelPintado = new PaintPanel();
	
	int x = 475, y = 375;

	public VentanaTeclado(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 850);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon(getClass().getResource("images/app.png")).getImage());
		
		this.setResizable(false);
		
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
				x = 475;
				y = 375;
				
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
			
			g2.fillRect(x, y, 30, 30);
		}
	}


	@Override
	public void keyTyped(KeyEvent e) 
	{
		
		
	}


	@Override
	public void keyPressed(KeyEvent e) 
	{
		
		if(e.getKeyCode() == 68 && x != 955)
			x+= 5;
		
		if (e.getKeyCode() == 83 && y != 745)
			y+= 5;
		
		if (e.getKeyCode() == 65 && x != 0)
			x-= 5;
			
		if (e.getKeyCode() == 87 && y != 35)
			y-= 5;
		
		System.out.println(e);
		panelPintado.repaint();
	}


	@Override
	public void keyReleased(KeyEvent e) 
	{
		
		
	}
}
