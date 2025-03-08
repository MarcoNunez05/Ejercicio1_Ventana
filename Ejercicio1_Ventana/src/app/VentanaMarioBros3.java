package app;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class VentanaMarioBros3 extends JFrame 
{
	
	public VentanaMarioBros3(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1150, 710);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon(getClass().getResource("images/app.png")).getImage());
		
		this.setMinimumSize(new Dimension(1150, 710));
		
		this.repaint();
		this.setVisible(true);
		
		// Esto es para arreglar el parpadeo en el JFrame
		Toolkit.getDefaultToolkit().setDynamicLayout(false);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		
		// Cielo
		
		g2.setColor(new Color(179,238,254));
		g2.fillRect(0, 0, 1200, 730);
		
		
		// Rectangulos y sus sombras
		
		// Azul
		
		g2.setColor(new Color(7, 5, 10));
		g2.fillRoundRect(490, 338, 100, 347, 30, 15);
		
		g2.setColor(new Color(0,12,20));
		g2.fillRoundRect(344, 295, 210, 357, 30, 15);
		
		g2.setColor(new Color(132,192,255));
		g2.fillRoundRect(350, 298, 200, 347, 30, 15);
		
		g2.setColor(new Color(22,143,224));
		g2.fillRoundRect(540, 299, 10, 346, 2, 2);
		
		g2.setColor(new Color(50,135,200));
		g2.fillRoundRect(341, 636, 200, 9, 2, 2);
		
		
		// Rosa
		
		g2.setColor(new Color(7, 5, 10));
		g2.fillRoundRect(250, 480, 200, 200, 30, 15);
		
		g2.setColor(new Color(0,12,20));
		g2.fillRoundRect(205, 440, 210, 210, 30, 15);
		
		g2.setColor(new Color(255,195,184));
		g2.fillRoundRect(210, 445, 200, 200, 30, 15);
		
		g2.setColor(new Color(240,149,105));
		g2.fillRoundRect(400, 446, 10, 199, 2, 2);
		
		g2.setColor(new Color(223,161,136));
		g2.fillRoundRect(210, 636, 191, 9, 2, 2);
		
		
		// Verde
		
		g2.setColor(new Color(0,12,20));
		g2.fillRoundRect(944, 440, 315, 210, 30, 15);
		
		g2.setColor(new Color(83,218,98));
		g2.fillRoundRect(950, 445, 300, 200, 30, 15);
		
		g2.setColor(new Color(43,119,45));
		g2.fillRoundRect(950, 636, 250, 9, 2, 2);
		
		
		// Tuercas
		
		// Azul
		
		g2.setStroke(new BasicStroke(3));
		
		g2.setColor(new Color(0,4,40));
		g2.fillOval(516, 304, 29, 29);
		
		g2.setColor(new Color(199,231,244));
		g2.fillOval(520, 308, 20, 20);
		
		g2.setColor(new Color(1,33,44));
		g2.drawLine(520, 327, 540, 309);
		
		
		g2.setColor(new Color(0,4,40));
		g2.fillOval(353, 304, 29, 29);
		
		g2.setColor(new Color(199,231,244));
		g2.fillOval(357, 308, 20, 20);
		
		g2.setColor(new Color(1,33,44));
		g2.drawLine(357, 327, 376, 309);
		
		
		g2.setColor(new Color(0,4,40));
		g2.fillOval(516, 611, 29, 29);
		
		g2.setColor(new Color(199,231,244));
		g2.fillOval(520, 615, 20, 20);
		
		g2.setColor(new Color(1,33,44));
		g2.drawLine(520, 634, 540, 616);
		
		
		// Rosa
		
		g2.setColor(new Color(0,4,40));
		g2.fillOval(376, 451, 29, 29);
		
		g2.setColor(new Color(199,231,244));
		g2.fillOval(380, 455, 20, 20);
		
		g2.setColor(new Color(1,33,44));
		g2.drawLine(380, 474, 399, 456);
		
		
		g2.setColor(new Color(0,4,40));
		g2.fillOval(213, 451, 29, 29);
		
		g2.setColor(new Color(199,231,244));
		g2.fillOval(217, 455, 20, 20);
		
		g2.setColor(new Color(1,33,44));
		g2.drawLine(217, 474, 236, 456);
		
		
		g2.setColor(new Color(0,4,40));
		g2.fillOval(376, 611, 29, 29);
		
		g2.setColor(new Color(199,231,244));
		g2.fillOval(380, 615, 20, 20);
		
		g2.setColor(new Color(1,33,44));
		g2.drawLine(380, 634, 399, 616);
		
		
		g2.setColor(new Color(0,4,40));
		g2.fillOval(213, 611, 29, 29);
		
		g2.setColor(new Color(199,231,244));
		g2.fillOval(217, 615, 20, 20);
		
		g2.setColor(new Color(1,33,44));
		g2.drawLine(217, 634, 236, 616);
		
		
		// Verde
		
		g2.setColor(new Color(0,4,40));
		g2.fillOval(953, 451, 29, 29);
		
		g2.setColor(new Color(199,231,244));
		g2.fillOval(957, 455, 20, 20);
		
		g2.setColor(new Color(1,33,44));
		g2.drawLine(957, 474, 976, 456);
		
		
		g2.setColor(new Color(0,4,40));
		g2.fillOval(953, 611, 29, 29);
		
		g2.setColor(new Color(199,231,244));
		g2.fillOval(957, 615, 20, 20);
		
		g2.setColor(new Color(1,33,44));
		g2.drawLine(957, 634, 976, 616);
		
		
		// Bloques
		
		g2.setColor(new Color(19,1,0));
		g2.fillRect(-5, 375, 70, 70);
		
		g2.setColor(new Color(255,144,99));
		g2.fillRect(0, 380, 60, 60);
		
		g2.setColor(new Color(19,1,0));
		g2.fillRect(7, 387, 5, 5);
		
		g2.fillRect(7, 429, 5, 5);
		
		g2.fillRect(48, 387, 5, 5);
		
		g2.fillRect(48, 429, 5, 5);
		
		
		g2.fillRect(205, 155, 70, 70);
		
		g2.setColor(new Color(255,144,99));
		g2.fillRect(210, 160, 60, 60);
		
		g2.setColor(new Color(19,1,0));
		g2.fillRect(217, 167, 5, 5);
		
		g2.fillRect(217, 209, 5, 5);
		
		g2.fillRect(258, 167, 5, 5);
	
		g2.fillRect(258, 209, 5, 5);
		
		
		g2.fillRect(135, 155, 70, 70);
		
		g2.setColor(new Color(255,144,99));
		g2.fillRect(140, 160, 60, 60);
		
		g2.setColor(new Color(19,1,0));
		g2.fillRect(147, 167, 5, 5);
		
		g2.fillRect(147, 209, 5, 5);
		
		g2.fillRect(188, 167, 5, 5);
		
		g2.fillRect(188, 209, 5, 5);
		
		
		g2.fillRect(1035, 225, 70, 70);
		
		g2.setColor(new Color(255,144,99));
		g2.fillRect(1040, 230, 60, 60);
		
		g2.setColor(new Color(19,1,0));
		g2.fillRect(1047, 237, 5, 5);
		
		g2.fillRect(1047, 279, 5, 5);
		
		g2.fillRect(1088, 237, 5, 5);
		
		g2.fillRect(1088, 279, 5, 5);
		
		
		g2.setColor(new Color(19,1,0));
		g2.fillOval(140, 176, 20, 20);
		g2.fillOval(187, 174, 14, 15);
		
		g2.setColor(new Color(241,199,190));
		g2.fillOval(138, 175, 18, 18);
		g2.fillOval(186, 171, 15, 14);
		
		g2.setColor(new Color(19,1,0));
		g2.fillOval(1039, 246, 20, 20);
		g2.fillOval(1086, 244, 14, 15);
		
		g2.setColor(new Color(241,199,190));
		g2.fillOval(1037, 245, 18, 18);
		g2.fillOval(1085, 241, 15, 14);
	
		
		// Tubería
		
		g2.setColor(new Color(23,136,18));
		g2.fillRect(725, 440, 125, 210);
		
		
		g2.setStroke(new BasicStroke(5));
		
		g2.setColor(new Color(0,7,0));
		g2.drawRect(721, 440, 130, 60);
		
		g2.setStroke(new BasicStroke(5));
		
		g2.drawLine(725, 440, 725, 650);
		
		g2.setStroke(new BasicStroke(10));
		
		g2.drawLine(848, 450, 848, 495);
		g2.drawLine(845, 505, 845, 650);
		
		
		g2.setColor(new Color(83,218,97));
		g2.fillRect(733, 445, 7, 53);
		g2.fillRect(740, 504, 3, 150);
		
		g2.fillRect(745, 445, 10, 53);
		g2.fillRect(748, 504, 10, 150);
		
		g2.fillRect(765, 445, 4, 53);
		g2.fillRect(769, 504, 4, 150);
		
		g2.fillRect(800, 445, 5, 53);
		g2.fillRect(794, 504, 6, 150);
		
		
		g2.setColor(new Color(0,15,0));
		g2.fillRect(806, 445, 5, 53);
		g2.fillRect(803, 504, 5, 150);
		
		g2.fillRect(815, 445, 4, 53);
		g2.fillRect(812, 504, 4, 150);
		
		g2.fillRect(825, 445, 16, 53);
		g2.fillRect(818, 504, 20, 150);
		
		
		g2.setStroke(new BasicStroke(6));
		g2.setColor(new Color(0,7,0));
		g2.drawLine(722, 506, 851, 506);
		
		
		g2.setStroke(new BasicStroke(3));
		
		g2.setColor(new Color(119,194,127));
		g2.drawLine(729, 445, 846, 445);
		
		
		// Arbusto
		
		g2.setColor(new Color(11,39,30));
		g2.fillOval(15, 600, 60, 110);
		g2.fillOval(40, 580, 60, 100);
		
		g2.setColor(new Color(86,208,110));
		g2.fillOval(20, 605, 50, 105);
		g2.fillOval(45, 585, 50, 105);
		
		
		// Suelo
		
		g2.setColor(new Color(237,157,142));
		g2.fillRect(0, 660, 1200, 80);
				
		g2.setColor(new Color(54, 60, 61));
		g2.fillRect(0, 648, 1200, 24);
				
		g2.setColor(new Color(250, 201, 182));
		g2.fillRect(0, 650, 1200, 20);
		
		g2.setStroke(new BasicStroke(4));
		g2.setColor(new Color(46,11,5));
		g2.drawLine(0, 672, 60, 710);
		g2.drawLine(50, 672, 110, 710);
		g2.drawLine(100, 672, 160, 710);
		g2.drawLine(150, 672, 210, 710);
		g2.drawLine(200, 672, 260, 710);
		g2.drawLine(250, 672, 310, 710);
		g2.drawLine(300, 672, 360, 710);
		g2.drawLine(350, 672, 410, 710);
		g2.drawLine(400, 672, 460, 710);
		g2.drawLine(450, 672, 510, 710);
		g2.drawLine(500, 672, 560, 710);
		g2.drawLine(550, 672, 610, 710);
		g2.drawLine(600, 672, 660, 710);
		g2.drawLine(650, 672, 710, 710);
		g2.drawLine(700, 672, 760, 710);
		g2.drawLine(750, 672, 810, 710);
		g2.drawLine(800, 672, 860, 710);
		g2.drawLine(850, 672, 910, 710);
		g2.drawLine(900, 672, 960, 710);
		g2.drawLine(950, 672, 1010, 710);
		g2.drawLine(1000, 672, 1060, 710);
		g2.drawLine(1050, 672, 1110, 710);
		g2.drawLine(1100, 672, 1160, 710);
		
		// Sprites
		
		g2.drawImage(new ImageIcon(getClass().getResource("images/supermariobros3/superMario.png")).getImage(), 520, 530, 60, 120, null);
		
		g2.drawImage(new ImageIcon(getClass().getResource("images/supermariobros3/pirahnaPlant.png")).getImage(), 735, 330, 90, 110, null);
		
		g2.drawImage(new ImageIcon(getClass().getResource("images/supermariobros3/fireball.png")).getImage(), 640, 430, 30, 30, null);
	}
		
}
