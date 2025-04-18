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
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class VentanaTeclado extends JFrame implements KeyListener
{
	PaintPanel panelPintado = new PaintPanel();
	
	Player p = new Player(10, 50, 20, 20, Color.blue);
	Player metaEsp = new Player(1020, 920, 50, 40, Color.cyan);
	
	Timer timer, timer2, timer3;
	
	int lastKey = 0, lastKey2 = 0, lastKeyResp;
	boolean changeLastKey = true, m = true, dobleBool = true, reTecla = false;
	
	ArrayList<Player> obstaculos = new ArrayList<Player>();
	
	int milSec = 0, sec = 0, min = 0;
	
	String ceroMilSec = "", ceroSec = "", ceroMins = "";
	
	JLabel tiempo = new JLabel("00:00:00");
	
	FloatControl gain;
	
	ImageIcon player = new ImageIcon(getClass().getResource("images/spriteLaberinto/spritePlayer.png"));
	ImageIcon paredH = new ImageIcon(getClass().getResource("images/spriteLaberinto/bushH.png"));
	ImageIcon paredY = new ImageIcon(getClass().getResource("images/spriteLaberinto/bushY.png"));
	ImageIcon background = new ImageIcon(getClass().getResource("images/spriteLaberinto/bg.png"));

	public VentanaTeclado(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1085, 1035);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon(getClass().getResource("images/app.png")).getImage());
		
		this.setResizable(false);
		
		
		// Horizontal
		
		obstaculos.add(new Player(0, 80, 55, 10, Color.green));
		obstaculos.add(new Player(110, 80, 50, 10, Color.green));
		obstaculos.add(new Player(345, 80, 155, 10, Color.green));
		obstaculos.add(new Player(620, 80, 50, 10, Color.green));
		obstaculos.add(new Player(730, 80, 100, 10, Color.green));
		obstaculos.add(new Player(880, 80, 40, 10, Color.green));
		obstaculos.add(new Player(980, 80, 40, 10, Color.green));
		
		obstaculos.add(new Player(490, 120, 190, 10, Color.green));
		obstaculos.add(new Player(820, 130, 60, 10, Color.green));
		obstaculos.add(new Player(930, 120, 50, 10, Color.green));
		
		obstaculos.add(new Player(165, 130, 60, 10, Color.green));
		obstaculos.add(new Player(290, 130, 120, 10, Color.green));
		
		obstaculos.add(new Player(45, 170, 65, 10, Color.green));
		obstaculos.add(new Player(155, 170, 70, 10, Color.green));
		obstaculos.add(new Player(290, 170, 55, 10, Color.green));
		obstaculos.add(new Player(400, 170, 155, 10, Color.green));
		obstaculos.add(new Player(675, 170, 55, 10, Color.green));
		obstaculos.add(new Player(780, 170, 45, 10, Color.green));
		obstaculos.add(new Player(980, 170, 90, 10, Color.green));
		
		obstaculos.add(new Player(55, 220, 110, 10, Color.green));
		obstaculos.add(new Player(220, 220, 55, 10, Color.green));
		obstaculos.add(new Player(400, 220, 220, 10, Color.green));
		obstaculos.add(new Player(730, 220, 150, 10, Color.green));
		obstaculos.add(new Player(980, 230, 40, 10, Color.green));
		
		obstaculos.add(new Player(290, 270, 165, 10, Color.green));
		obstaculos.add(new Player(615, 270, 55, 10, Color.green));
		obstaculos.add(new Player(730, 270, 40, 10, Color.green));
		obstaculos.add(new Player(880, 270, 40, 10, Color.green));
		obstaculos.add(new Player(1030, 280, 40, 10, Color.green));
		
		obstaculos.add(new Player(0, 330, 500, 10, Color.green));
		obstaculos.add(new Player(675, 330, 55, 10, Color.green));
		obstaculos.add(new Player(820, 330, 60, 10, Color.green));
		obstaculos.add(new Player(930, 330, 100, 10, Color.green));
		
		obstaculos.add(new Player(45, 380, 55, 10, Color.green));
		obstaculos.add(new Player(155, 380, 345, 10, Color.green));
		obstaculos.add(new Player(565, 370, 55, 10, Color.green));
		obstaculos.add(new Player(720, 380, 55, 10, Color.green));
		obstaculos.add(new Player(880, 380, 90, 10, Color.green));
	
		obstaculos.add(new Player(110, 430, 335, 10, Color.green));
		obstaculos.add(new Player(500, 430, 225, 10, Color.green));
		obstaculos.add(new Player(780, 430, 100, 10, Color.green));
		obstaculos.add(new Player(920, 430, 110, 10, Color.green));
		
		obstaculos.add(new Player(110, 480, 110, 10, Color.green));
		obstaculos.add(new Player(340, 480, 55, 10, Color.green));
		obstaculos.add(new Player(610, 480, 60, 10, Color.green));
		obstaculos.add(new Player(830, 480, 100, 10, Color.green));
		obstaculos.add(new Player(980, 480, 100, 10, Color.green));
		
		obstaculos.add(new Player(155, 530, 135, 10, Color.green));
		obstaculos.add(new Player(400, 530, 100, 10, Color.green));
		obstaculos.add(new Player(555, 530, 55, 10, Color.green));
		obstaculos.add(new Player(670, 530, 155, 10, Color.green));
		obstaculos.add(new Player(880, 530, 150, 10, Color.green));
		
		obstaculos.add(new Player(290, 580, 50, 10, Color.green));
		obstaculos.add(new Player(610, 580, 160, 10, Color.green));
		obstaculos.add(new Player(930, 580, 100, 10, Color.green));
		
		obstaculos.add(new Player(45, 640, 180, 10, Color.green));
		obstaculos.add(new Player(500, 640, 170, 10, Color.green));
		obstaculos.add(new Player(735, 640, 80, 10, Color.green));
		obstaculos.add(new Player(870, 640, 100, 10, Color.green));
		obstaculos.add(new Player(1020, 640, 50, 10, Color.green));
		
		obstaculos.add(new Player(100, 700, 190, 10, Color.green));
		obstaculos.add(new Player(350, 700, 60, 10, Color.green));
		obstaculos.add(new Player(460, 700, 150, 10, Color.green));
		obstaculos.add(new Player(815, 700, 100, 10, Color.green));
		
		obstaculos.add(new Player(215, 750, 245, 10, Color.green));
		obstaculos.add(new Player(500, 750, 180, 10, Color.green));
		obstaculos.add(new Player(725, 750, 45, 10, Color.green));
		obstaculos.add(new Player(815, 750, 55, 10, Color.green));
		obstaculos.add(new Player(920, 750, 100, 10, Color.green));
		
		obstaculos.add(new Player(55, 810, 170, 10, Color.green));
		obstaculos.add(new Player(340, 810, 50, 10, Color.green));
		obstaculos.add(new Player(450, 810, 50, 10, Color.green));
		obstaculos.add(new Player(610, 810, 160, 10, Color.green));
		
		obstaculos.add(new Player(0, 860, 55, 10, Color.green));
		obstaculos.add(new Player(100, 860, 55, 10, Color.green));
		obstaculos.add(new Player(235, 860, 45, 10, Color.green));
		obstaculos.add(new Player(290, 860, 50, 10, Color.green));
		obstaculos.add(new Player(400, 860, 50, 10, Color.green));
		obstaculos.add(new Player(565, 860, 160, 10, Color.green));
		obstaculos.add(new Player(770, 860, 60, 10, Color.green));
		obstaculos.add(new Player(980, 860, 40, 10, Color.green));
		
		
		obstaculos.add(new Player(50, 910, 170, 10, Color.green));
		obstaculos.add(new Player(340, 910, 110, 10, Color.green));
		obstaculos.add(new Player(500, 910, 110, 10, Color.green));
		obstaculos.add(new Player(670, 910, 300, 10, Color.green));
		obstaculos.add(new Player(1020, 910, 50, 10, Color.green));
		
		
		// Vertical
		
		obstaculos.add(new Player(45, 90, 10, 40, Color.green));
		obstaculos.add(new Player(45, 180, 10, 100, Color.green));
		obstaculos.add(new Player(45, 390, 10, 210, Color.green));
		obstaculos.add(new Player(45, 650, 10, 210, Color.green));
		
		obstaculos.add(new Player(100, 30, 10, 140, Color.green));
		obstaculos.add(new Player(100, 280, 10, 50, Color.green));
		obstaculos.add(new Player(100, 380, 10, 60, Color.green));
		obstaculos.add(new Player(100, 480, 10, 160, Color.green));
		obstaculos.add(new Player(100, 710, 10, 40, Color.green));
		obstaculos.add(new Player(100, 870, 10, 40, Color.green));
		
		obstaculos.add(new Player(155, 230, 10, 50, Color.green));		
		obstaculos.add(new Player(155, 130, 10, 40, Color.green));
		obstaculos.add(new Player(155, 540, 10, 50, Color.green));
		obstaculos.add(new Player(155, 760, 10, 50, Color.green));
		
		obstaculos.add(new Player(215, 180, 10, 150, Color.green));
		obstaculos.add(new Player(215, 90, 10, 50, Color.green));
		obstaculos.add(new Player(215, 540, 10, 100, Color.green));
		obstaculos.add(new Player(215, 710, 10, 40, Color.green));
		obstaculos.add(new Player(215, 910, 10, 50, Color.green));
		
		obstaculos.add(new Player(225, 810, 10, 60, Color.green));
		
		obstaculos.add(new Player(280, 30, 10, 150, Color.green));
		obstaculos.add(new Player(280, 440, 10, 90, Color.green));
		obstaculos.add(new Player(280, 580, 10, 120, Color.green));
		obstaculos.add(new Player(280, 810, 10, 100, Color.green));
		
		obstaculos.add(new Player(335, 180, 10, 90, Color.green));
		
		obstaculos.add(new Player(340, 490, 10, 150, Color.green));
		obstaculos.add(new Player(340, 760, 10, 50, Color.green));
		obstaculos.add(new Player(340, 920, 10, 40, Color.green));
		
		obstaculos.add(new Player(390, 810, 10, 100, Color.green));
		
		obstaculos.add(new Player(400, 140, 10, 30, Color.green));
		obstaculos.add(new Player(400, 540, 10, 160, Color.green));
		
		obstaculos.add(new Player(445, 90, 10, 40, Color.green));
		obstaculos.add(new Player(445, 230, 10, 40, Color.green));
		obstaculos.add(new Player(445, 430, 10, 100, Color.green));
		obstaculos.add(new Player(450, 590, 10, 160, Color.green));
		obstaculos.add(new Player(450, 910, 10, 50, Color.green));
		
		obstaculos.add(new Player(490, 90, 10, 30, Color.green));
		
		obstaculos.add(new Player(500, 280, 10, 150, Color.green));
		obstaculos.add(new Player(500, 480, 10, 160, Color.green));
		obstaculos.add(new Player(500, 760, 10, 90, Color.green));
		obstaculos.add(new Player(500, 920, 10, 40, Color.green));
		
		obstaculos.add(new Player(555, 30, 10, 50, Color.green));
		obstaculos.add(new Player(555, 230, 10, 150, Color.green));
		obstaculos.add(new Player(555, 440, 10, 40, Color.green));
		obstaculos.add(new Player(555, 540, 10, 50, Color.green));
		obstaculos.add(new Player(555, 810, 10, 100, Color.green));
		
		obstaculos.add(new Player(610, 130, 10, 90, Color.green));
		obstaculos.add(new Player(610, 330, 10, 40, Color.green));
		obstaculos.add(new Player(610, 490, 10, 100, Color.green));
		obstaculos.add(new Player(610, 760, 10, 50, Color.green));
		obstaculos.add(new Player(610, 910, 10, 50, Color.green));
		
		obstaculos.add(new Player(670, 80, 10, 40, Color.green));
		obstaculos.add(new Player(670, 170, 10, 260, Color.green));
		obstaculos.add(new Player(670, 590, 10, 160, Color.green));
		obstaculos.add(new Player(670, 920, 10, 50, Color.green));
		
		obstaculos.add(new Player(715, 480, 10, 50, Color.green));
		
		obstaculos.add(new Player(720, 80, 10, 90, Color.green));
		obstaculos.add(new Player(720, 270, 10, 60, Color.green));
		
		obstaculos.add(new Player(725, 640, 10, 60, Color.green));
		
		obstaculos.add(new Player(770, 130, 10, 90, Color.green));
		obstaculos.add(new Player(770, 330, 10, 150, Color.green));
		obstaculos.add(new Player(770, 700, 10, 160, Color.green));
		
		obstaculos.add(new Player(815, 540, 10, 160, Color.green));
		
		obstaculos.add(new Player(820, 90, 10, 40, Color.green));
		obstaculos.add(new Player(820, 230, 10, 150, Color.green));
		obstaculos.add(new Player(820, 810, 10, 50, Color.green));
		
		obstaculos.add(new Player(870, 30, 10, 60, Color.green));
		obstaculos.add(new Player(870, 140, 10, 80, Color.green));
		obstaculos.add(new Player(870, 340, 10, 100, Color.green));
		obstaculos.add(new Player(870, 490, 10, 150, Color.green));
		obstaculos.add(new Player(870, 710, 10, 200, Color.green));
		
		obstaculos.add(new Player(920, 80, 10, 260, Color.green));
		obstaculos.add(new Player(920, 440, 10, 40, Color.green));
		obstaculos.add(new Player(920, 760, 10, 100, Color.green));
		
		obstaculos.add(new Player(970, 80, 10, 50, Color.green));
		obstaculos.add(new Player(970, 230, 10, 100, Color.green));
		obstaculos.add(new Player(970, 640, 10, 110, Color.green));
		obstaculos.add(new Player(970, 810, 10, 150, Color.green));
		
		obstaculos.add(new Player(1020, 130, 10, 50, Color.green));
		obstaculos.add(new Player(1020, 340, 10, 90, Color.green));
		obstaculos.add(new Player(1020, 590, 10, 50, Color.green));
		obstaculos.add(new Player(1020, 710, 10, 100, Color.green));
		
		
		
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
		
		try {
            File musicPath = new File("src/app/music/8bit.wav");
             if(musicPath.exists()){ 
                     AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                     Clip clip = AudioSystem.getClip();
                     clip.open(audioInput);
                     gain = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                     gain.setValue(-25);
                     clip.loop(clip.LOOP_CONTINUOUSLY);
                     clip.start();

              }
             else{
                      System.out.println("No hay archivo.");
                   }
	   }
	   catch (Exception ex){
	              ex.printStackTrace();
	        }
		
		
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
		panelArriba.setBackground(new Color(142, 250, 175));
		panelPintado.add(panelArriba, BorderLayout.NORTH);
		
		tiempo.setSize(50, 40);
		tiempo.setLocation(475, 20);
		tiempo.setFont(new Font("Aptos", Font.BOLD, 20));
		panelArriba.add(tiempo);
		
		JPanel panelAbajo = new JPanel();
		panelAbajo.setBackground(new Color(142, 250, 175));
		panelPintado.add(panelAbajo, BorderLayout.SOUTH);
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.setBackground(Color.white);
		reiniciar.setSize(50, 40);
		reiniciar.setLocation(350, 20);
		panelAbajo.add(reiniciar);
		
		reiniciar.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				reiniciar();
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
			
			g2.drawImage(background.getImage(), 0, 0, 1085, 960, null);
			
			g2.setColor(metaEsp.c);
			g2.fillRect(metaEsp.x, metaEsp.y, metaEsp.w, metaEsp.h);
			
			g2.drawImage(player.getImage(), p.x, p.y, 20, 20, null);
			
			for (Player pared : obstaculos) 
			{
				if (pared.w > 20)
					g2.drawImage(paredH.getImage(), pared.x, pared.y, pared.w, pared.h, null);
				else
					g2.drawImage(paredY.getImage(), pared.x, pared.y, pared.w, pared.h, null);
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
		m = true;
		int doble = 0;
		

		for (Player pared : obstaculos) 
		{
			if (p.colision(pared))
			{	
				doble++;
				m = false;
				changeLastKey = false;
				
			}
		}
		
		if (doble == 2)
		{
			if ((lastKey == 68 && lastKey2 == 87 && p.ultTecla == 65) ||
				(lastKey == 68 && lastKey2 == 83 && p.ultTecla == 65) ||
				(lastKey == 65 && lastKey2 == 87 && p.ultTecla == 68) ||
				(lastKey == 65 && lastKey2 == 83 && p.ultTecla == 68) ||
				(lastKey == 87 && lastKey2 == 68 && p.ultTecla == 83) ||
				(lastKey == 87 && lastKey2 == 65 && p.ultTecla == 83) ||
				(lastKey == 83 && lastKey2 == 68 && p.ultTecla == 87) ||
				(lastKey == 83 && lastKey2 == 65 && p.ultTecla == 87))
			{
				lastKeyResp = lastKey;
				lastKey = lastKey2;
				lastKey2 = lastKeyResp;
			}
		}
		
		if (changeLastKey || reTecla)
		{
			lastKey = p.ultTecla;
		}
		
		if (doble != 2 && !reTecla)
		{
			lastKey2 = p.ultTecla;
		}
		
		System.out.println(lastKey);
		System.out.println(lastKey2);
		System.out.println(p.ultTecla);
	
		
		if(p.ultTecla == 68 && p.x != 1050)
		{
			if (m || lastKey != 68)
			{			
				if (m || lastKey2 != 68 || doble != 2)
					p.x+= 5;
				else
					p.ultTecla = 0;
			}
			else
			{
				p.ultTecla = 0;
			}
		}
		
		if (p.ultTecla == 83 && p.y != 940)
		{
			if (m || lastKey != 83) 
			{
				if (m || lastKey2 != 83 || doble != 2)
					p.y+= 5;
				else
					p.ultTecla = 0;
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
				if (m || lastKey2 != 65 || doble != 2)
					p.x-= 5;
				else
					p.ultTecla = 0;
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
				if (m || lastKey2 != 87 || doble != 2)
					p.y-= 5;
				else
					p.ultTecla = 0;
			}
			else
			{
				p.ultTecla = 0;
			}
		}
		
		if (m)
		{
			changeLastKey = true;
		}
		
		panelPintado.repaint();
		
		if (p.meta(metaEsp))
		{
			timer.stop();
			JOptionPane.showMessageDialog(panelPintado, "Llegaste a la meta en " + tiempo.getText(), "Has ganado!", JOptionPane.INFORMATION_MESSAGE);
			reiniciar();
		}
	}
	
	public void reiniciar()
	{
		p.x = 10;
		p.y = 50;
		
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
			return (this.x - 5 < target.x + target.w &&
	                 this.x + 5 + this.w > target.x &&
	                 this.y - 5 < target.y + target.h &&
	                 this.y + 5 + this.h > target.y);
		}
		
		public Boolean meta(Player target)
		{
			return (this.x + 20 < target.x + target.w &&
	                 this.x - 20 + this.w > target.x &&
	                 this.y + 10 < target.y + target.h &&
	                 this.y - 10 + this.h > target.y);
		}
	}
}
