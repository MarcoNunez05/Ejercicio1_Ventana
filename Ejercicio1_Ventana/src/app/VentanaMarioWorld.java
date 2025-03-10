package app;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaMarioWorld extends JFrame 
{
	public VentanaMarioWorld(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1350, 910);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon(getClass().getResource("images/app.png")).getImage());
		
		this.setMinimumSize(new Dimension(1350, 910));
		
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
		
		g2.setColor(new Color(6,101,192));
		g2.fillRect(0, 0, 1350, 910);
		
		
		// Colinas y nubes del fondo
		
		// Nubes
		
		g2.setColor(new Color(188,217,221));
		g2.fillRoundRect(1090, 312, 200, 50, 50, 200);
		g2.fillRoundRect(1010, 372, 200, 50, 50, 200);
		g2.fillRoundRect(430, 612, 200, 50, 50, 200);
		g2.fillRoundRect(230, 672, 360, 50, 50, 200);
		
		g2.setColor(new Color(237,242,254));
		g2.fillRoundRect(1090, 300, 200, 50, 50, 200);
		g2.fillRoundRect(1010, 360, 200, 50, 50, 200);
		g2.fillRoundRect(430, 600, 200, 50, 50, 200);
		g2.fillRoundRect(230, 660, 360, 50, 50, 200);
		
		
		g2.fillRoundRect(480, 725, 200, 75, 50, 200);
		
		
		// Colinas
		
		g2.setColor(new Color(159,193,191));
		g2.fillRoundRect(830, 150, 250, 800, 300, 250);
		g2.fillRoundRect(590, 275, 240, 800, 300, 250);
		g2.fillRoundRect(100, 275, 240, 800, 300, 250);
		
		g2.setColor(new Color(185,221,223));
		g2.fillRoundRect(833, 161, 220, 800, 300, 250);
		g2.fillRoundRect(593, 285, 210, 800, 300, 250);
		g2.fillRoundRect(103, 285, 210, 800, 300, 250);
		
		g2.setColor(new Color(198,227,231));
		g2.fillRoundRect(833, 161, 200, 800, 300, 250);
		g2.fillRoundRect(593, 285, 190, 800, 300, 250);
		g2.fillRoundRect(103, 285, 190, 800, 300, 250);
		
		
		// Decoración de colinas
		
		g2.setColor(new Color(239,243,255));
		g2.fillOval(960, 240, 32, 55);
		g2.fillOval(875, 350, 32, 55);
		
		g2.fillOval(625, 420, 32, 55);
		g2.fillOval(625, 550, 32, 55);
		g2.fillOval(720, 350, 32, 55);
		
		g2.fillOval(225, 350, 32, 55);
		g2.fillOval(225, 480, 32, 55);
		g2.fillOval(140, 550, 32, 55);
		
		
		// Colinas y nubes del frente
		
		// Nubes
		
		g2.setColor(new Color(188,217,221));
		g2.fillRoundRect(730, 557, 360, 50, 50, 200);
		g2.fillRoundRect(339, 492, 320, 50, 50, 200);
		g2.fillRoundRect(-30, 422, 290, 50, 50, 200);
		
		g2.setColor(new Color(237,242,254));
		g2.fillRoundRect(730, 545, 360, 50, 50, 200);
		g2.fillRoundRect(339, 480, 320, 50, 50, 200);
		g2.fillRoundRect(-30, 410, 290, 50, 50, 200);
		
		
		// Colinas
		
		g2.setColor(new Color(20,86,125));
		g2.fillRoundRect(-60, 600, 300, 400, 400, 300);
		g2.fillRoundRect(590, 600, 300, 400, 400, 300);
		g2.fillRoundRect(890, 450, 300, 500, 400, 300);
		g2.fillRoundRect(1275, 550, 300, 500, 400, 300);
		
		g2.setColor(new Color(62,127,164));
		g2.fillRoundRect(-60, 610, 270, 400, 400, 300);
		g2.fillRoundRect(595, 610, 270, 400, 400, 300);
		g2.fillRoundRect(895, 460, 270, 500, 400, 300);
		g2.fillRoundRect(1280, 560, 270, 500, 400, 300);
		
		g2.setColor(new Color(118,178,215));
		g2.fillRoundRect(-60, 610, 240, 400, 400, 300);
		g2.fillRoundRect(595, 610, 240, 400, 400, 300);
		g2.fillRoundRect(895, 460, 240, 500, 400, 300);
		g2.fillRoundRect(1280, 560, 240, 500, 400, 300);
		
		
		g2.setColor(new Color(237,242,254));
		g2.fillRoundRect(1040, 750, 300, 85, 125, 200);
		
		
		// Decoración de colinas
		
		g2.setColor(new Color(201,227,225));
		g2.fillOval(960, 525, 32, 55);
		g2.fillOval(1080, 685, 35, 60);
		
		
		// Bloques
		
		g2.setColor(new Color(19,1,0));
		g2.fillRoundRect(1179, 725, 70, 70, 20, 20);
		g2.fillRoundRect(1179, 655, 70, 70, 20, 20);
		g2.fillRoundRect(1179, 585, 70, 70, 20, 20);
		g2.fillRoundRect(1179, 515, 70, 70, 20, 20);
		g2.fillRoundRect(1249, 515, 70, 70, 20, 20);
		g2.fillRoundRect(1319, 515, 70, 70, 20, 20);
		
		g2.setColor(new Color(124,122,118));
		g2.fillRoundRect(1184, 730, 60, 60, 10, 10);
		g2.fillRoundRect(1184, 660, 60, 60, 10, 10);
		g2.fillRoundRect(1184, 590, 60, 60, 10, 10);
		g2.fillRoundRect(1184, 520, 60, 60, 10, 10);
		
		g2.setColor(new Color(203,199,207));
		g2.fillRoundRect(1184, 730, 50, 50, 10, 10);
		g2.fillRoundRect(1184, 660, 50, 50, 10, 10);
		g2.fillRoundRect(1184, 590, 50, 50, 10, 10);
		g2.fillRoundRect(1184, 520, 50, 50, 10, 10);
		
		
		g2.setColor(new Color(210,161,80));
		g2.fillRoundRect(1254, 520, 60, 60, 10, 10);
		g2.fillRoundRect(1324, 520, 60, 60, 10, 10);
		
		g2.setColor(new Color(252,221,29));
		g2.fillRoundRect(1254, 520, 55, 55, 10, 10);
		g2.fillRoundRect(1324, 520, 55, 55, 10, 10);
		
		g2.setColor(new Color(42,27,0));
		g2.fillRect(1270, 535, 5, 15);
		g2.fillRect(1293, 535, 5, 15);
		
		// Tubería
		
		g2.setColor(new Color(77,76,152));
		g2.fillRect(704, 590, 135, 210);
		
		
		g2.setStroke(new BasicStroke(5));
		
		g2.setColor(new Color(0,7,0));
		g2.drawRoundRect(701, 590, 140, 60, 10, 10);
		
		g2.drawLine(706, 645, 834, 645);
		g2.drawLine(705, 650, 705, 800);
		g2.drawLine(837, 598, 837, 645);
		
		
		g2.setStroke(new BasicStroke(10));
		
		g2.drawLine(835, 655, 835, 800);
		
		
		g2.setStroke(new BasicStroke(3));
		
		g2.setColor(new Color(129,132,184));
		g2.drawLine(706, 595, 834, 595);
		
		g2.setColor(new Color(227,233,240));
		g2.drawLine(725, 595, 785, 595);
		
		
		g2.setColor(new Color(119,116,194));
		g2.fillRect(715, 597, 15, 46);
		g2.fillRect(720, 653, 20, 250);
		
		g2.setColor(new Color(227,233,240));
		g2.fillRect(730, 597, 15, 46);
		g2.fillRect(740, 653, 15, 250);
		
		g2.setColor(new Color(136,133,207));
		g2.fillRect(745, 597, 40, 46);
		g2.fillRect(755, 653, 20, 250);
		
		g2.setColor(new Color(112,106,181));
		g2.fillRect(785, 597, 20, 46);
		g2.fillRect(775, 653, 20, 250);
		
		g2.fillRect(810, 597, 5, 46);
		g2.fillRect(800, 653, 5, 250);
		
		
		// Tubería chiquita
		
		g2.setColor(new Color(77,76,152));
		g2.fillRect(1254, 660, 135, 210);
		
		
		g2.setStroke(new BasicStroke(5));
		
		g2.setColor(new Color(0,7,0));
		g2.drawRoundRect(1251, 660, 140, 60, 10, 10);
		
		g2.drawLine(1256, 715, 1384, 715);
		g2.drawLine(1255, 720, 1255, 870);
		g2.drawLine(1387, 668, 1387, 715);
		
		
		g2.setStroke(new BasicStroke(10));
		
		g2.drawLine(1385, 725, 1335, 870);
		
		
		g2.setStroke(new BasicStroke(3));
		
		g2.setColor(new Color(129,132,184));
		g2.drawLine(1256, 665, 1384, 665);
		
		g2.setColor(new Color(227,233,240));
		g2.drawLine(1275, 665, 1335, 665);
		
		
		g2.setColor(new Color(119,116,194));
		g2.fillRect(1265, 667, 15, 46);
		g2.fillRect(1270, 723, 20, 250);
		
		g2.setColor(new Color(227,233,240));
		g2.fillRect(1280, 667, 15, 46);
		g2.fillRect(1290, 723, 15, 250);
		
		g2.setColor(new Color(136,133,207));
		g2.fillRect(1295, 667, 40, 46);
		g2.fillRect(1305, 723, 20, 250);
		
		g2.setColor(new Color(112,106,181));
		g2.fillRect(1335, 667, 20, 46);
		g2.fillRect(1325, 723, 20, 250);
		
		g2.fillRect(1360, 667, 5, 46);
		g2.fillRect(1350, 723, 5, 250);
		
		
		// Arbusto
		
		g2.setColor(new Color(0,11,0));
		g2.fillOval(315, 720, 130, 110);
		g2.fillOval(420, 700, 120, 110);
		
		g2.setColor(new Color(5,251,11));
		g2.fillOval(320, 725, 130, 105);
		g2.fillOval(425, 705, 110, 105);
		
		
		g2.setStroke(new BasicStroke(8));
		
		g2.setColor(new Color(226,239,239));
		g2.drawLine(350, 760, 360, 754);
		
		g2.setColor(new Color(183,181,81));
		g2.drawLine(460, 738, 470, 734);
		g2.drawLine(490, 792, 500, 784);
		
		// Suelo
		
		g2.setColor(new Color(206,156,92));
		g2.fillRect(0, 815, 1350, 100);
		
		g2.setColor(new Color(120,105,29));
		g2.fillRect(0, 815, 1350, 10);
		
		g2.setColor(new Color(14,23,0));
		g2.fillRect(0, 792, 1350, 26);
				
		g2.setColor(new Color(8,194,16));
		g2.fillRect(0, 795, 1350, 20);
		
		g2.setColor(new Color(18,106,33));
		g2.fillRect(0, 810, 1350, 5);
		
		
		// Sprites
		
		g2.drawImage(new ImageIcon(getClass().getResource("images/supermarioworld/superMarioW.png")).getImage(), 620, 675, 70, 120, null);
		
		g2.drawImage(new ImageIcon(getClass().getResource("images/supermarioworld/pirahnaPlantW.png")).getImage(), 735, 430, 70, 90, null);
		
	}
}
