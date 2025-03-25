package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class VentanaRompecabezas15 extends JFrame 
{
	Font fuente = new Font("Aptos", Font.BOLD, 20);
	
	JPanel panelAfuera = new JPanel();
	JPanel panel = new JPanel();
	
	JButton B1 = new JButton("1");
	JButton B2 = new JButton("2");
	JButton B3 = new JButton("3");
	JButton B4 = new JButton("4");
	JButton B5 = new JButton("5");
	JButton B6 = new JButton("6");
	JButton B7 = new JButton("7");
	JButton B8 = new JButton("8");
	JButton B9 = new JButton("9");
	JButton B10 = new JButton("10");
	JButton B11 = new JButton("11");
	JButton B12 = new JButton("12");
	JButton B13 = new JButton("13");
	JButton B14 = new JButton("14");
	JButton B15 = new JButton("15");
	JButton B16 = new JButton("");
	JButton reiniciar = new JButton("Reiniciar");
	
	
	public VentanaRompecabezas15(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(750, 750);
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
		panelAfuera.setLocation(0, 0);
		panelAfuera.setSize(this.WIDTH, this.HEIGHT);
		panelAfuera.setLayout(null);
		panelAfuera.setBackground(new Color(232, 67, 56));
		panelAfuera.setOpaque(true);
		
		panel.setLocation(70, 60);
		panel.setSize(600, 550);
		panel.setOpaque(true);
		panel.setBackground(new Color(232, 67, 56));
		panel.setLayout(new GridLayout(0, 4, 10, 10));
		panelAfuera.add(panel);
		
		
		// JButton
		
		reiniciar.setLocation(318, 645);
		reiniciar.setSize(100, 30);
		reiniciar.setForeground(Color.black);
		reiniciar.setBackground(Color.white);
		reiniciar.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		reiniciar.setFont(new Font("Aptos", Font.BOLD, 15));
		panelAfuera.add(reiniciar);
		
		
		B1.setForeground(Color.black);
		B1.setBackground(Color.white);
		B1.setFont(fuente);
		B1.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B1);
		
		B1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B1.getText());
				
			}
			
		});
		
		
		B2.setForeground(Color.black);
		B2.setBackground(Color.white);
		B2.setFont(fuente);
		B2.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B2);
		
		B2.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B2.getText());
				
			}
			
		});
		
		
		B3.setForeground(Color.black);
		B3.setBackground(Color.white);
		B3.setFont(fuente);
		B3.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B3);
		
		B3.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B3.getText());
				
			}
			
		});
		
		
		B4.setForeground(Color.black);
		B4.setBackground(Color.white);
		B4.setFont(fuente);
		B4.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B4);
		
		B4.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B4.getText());
				
			}
			
		});
		
		
		B5.setForeground(Color.black);
		B5.setBackground(Color.white);
		B5.setFont(fuente);
		B5.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B5);
		
		B5.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B5.getText());
				
			}
			
		});
		
		
		B6.setForeground(Color.black);
		B6.setBackground(Color.white);
		B6.setFont(fuente);
		B6.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B6);
		
		B6.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B6.getText());
				
			}
			
		});
		
		
		B7.setForeground(Color.black);
		B7.setBackground(Color.white);
		B7.setFont(fuente);
		B7.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B7);
		
		B7.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B7.getText());
				
			}
			
		});
		
		
		B8.setForeground(Color.black);
		B8.setBackground(Color.white);
		B8.setFont(fuente);
		B8.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B8);
		
		B8.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B8.getText());
				
			}
			
		});
		
		
		B9.setForeground(Color.black);
		B9.setBackground(Color.white);
		B9.setFont(fuente);
		B9.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B9);
		
		B9.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B9.getText());
				
			}
			
		});
		
		
		B10.setForeground(Color.black);
		B10.setBackground(Color.white);
		B10.setFont(fuente);
		B10.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B10);
		
		B10.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B10.getText());
				
			}
			
		});
		
		
		B11.setForeground(Color.black);
		B11.setBackground(Color.white);
		B11.setFont(fuente);
		B11.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B11);
		
		B11.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B11.getText());
				
			}
			
		});
		
		
		B12.setForeground(Color.black);
		B12.setBackground(Color.white);
		B12.setFont(fuente);
		B12.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B12);
		
		B12.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B12.getText());
				
			}
			
		});
		
		
		B13.setForeground(Color.black);
		B13.setBackground(Color.white);
		B13.setFont(fuente);
		B13.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B13);
		
		B13.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B13.getText());
				
			}
			
		});
		
		
		B14.setForeground(Color.black);
		B14.setBackground(Color.white);
		B14.setFont(fuente);
		B14.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B14);
		
		B14.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B14.getText());
				
			}
			
		});
		
		
		B15.setForeground(Color.black);
		B15.setBackground(Color.white);
		B15.setFont(fuente);
		B15.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B15);
		
		B15.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B15.getText());
			
			}
			
		});
		
		
		B16.setForeground(Color.black);
		B16.setBackground(Color.white);
		B16.setFont(fuente);
		B16.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		panel.add(B16);
		
		B16.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println(B16.getText());
				
			}
			
		});

		
		panel.revalidate();
		
		panelAfuera.revalidate();
		return panelAfuera;
	}
	
}