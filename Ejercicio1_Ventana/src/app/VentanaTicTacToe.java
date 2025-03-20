package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaTicTacToe extends JFrame 
{
	Font fuente = new Font("Aptos", Font.BOLD, 30);
	
	String turno = "O";
	
	String T1 = " ";
	String T2 = "  ";
	String T3 = "   ";
	String T4 = "    ";
	String T5 = "     ";
	String T6 = "      ";
	String T7 = "       ";
	String T8 = "        ";
	String T9 = "         ";
	
	int turnos = 1;
	int puntosO = 0;
	int puntosX = 0;
	
	JPanel panelAfuera = new JPanel();
	JPanel panel = new JPanel();
	
	JLabel labelPuntos = new JLabel("O: " + puntosO + "           X: " + puntosX);
	
	JButton B11 = new JButton();
	JButton B21 = new JButton();
	JButton B31 = new JButton();
	JButton B12 = new JButton();
	JButton B22 = new JButton();
	JButton B32 = new JButton();
	JButton B13 = new JButton();
	JButton B23 = new JButton();
	JButton B33 = new JButton();

	public VentanaTicTacToe(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 520);
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
		panelAfuera.setBackground(Color.white);
		panelAfuera.setOpaque(true);
		
		panel.setLocation(0, 30);
		panel.setSize(500, 400);
		panel.setOpaque(true);
		panel.setBackground(new Color(142, 237, 206));
		panel.setLayout(new GridLayout(0, 3, 5, 5));
		panel.setBackground(Color.white);
		panelAfuera.add(panel);
		
		
		// JlLabels
		
		labelPuntos.setLocation(0, 0);
		labelPuntos.setSize(500, 30);
		labelPuntos.setBackground(new Color(171, 235, 234));
		labelPuntos.setForeground(Color.black);
		labelPuntos.setOpaque(true);
		labelPuntos.setHorizontalAlignment(JLabel.CENTER);
		panelAfuera.add(labelPuntos);
		
		
		// JButton
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.setLocation(0,430);
		reiniciar.setSize(500, 55);
		reiniciar.setBackground(new Color(171, 235, 207));
		reiniciar.setForeground(Color.black);
		reiniciar.setOpaque(true);
		panelAfuera.add(reiniciar);
		
		reiniciar.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				B11.setIcon(null);
				B21.setIcon(null);
				B31.setIcon(null);
				B12.setIcon(null);
				B22.setIcon(null);
				B32.setIcon(null);
				B13.setIcon(null);
				B23.setIcon(null);
				B33.setIcon(null);

				T1 = " ";
				T2 = "  ";
				T3 = "   ";
				T4 = "    ";
				T5 = "     ";
				T6 = "      ";
				T7 = "       ";
				T8 = "        ";
				T9 = "         ";
				
				B11.setEnabled(true);
				B21.setEnabled(true);
				B31.setEnabled(true);
				B12.setEnabled(true);
				B22.setEnabled(true);
				B32.setEnabled(true);
				B13.setEnabled(true);
				B23.setEnabled(true);
				B33.setEnabled(true);
				
				turnos = 1;
				turno = "O";
				
				panel.revalidate();
				panel.repaint();
			}
			
		});
		
		
		B11.setFont(fuente);
		B11.setForeground(Color.black);
		B11.setBackground(Color.white);
		panel.add(B11);
		
		B11.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if (turno.equals("O"))
				{
					turno = "X";
					B11.setIcon(new ImageIcon(getClass().getResource("images/x.png")));
				}
				else
				{
					turno = "O";
					B11.setIcon(new ImageIcon(getClass().getResource("images/o.png")));
				}
				
				T1 = turno;
				panel.repaint();
				B11.setEnabled(false);
				verificar();
			}
			
		});
		
		B21.setFont(fuente);
		B21.setForeground(Color.black);
		B21.setBackground(Color.white);
		panel.add(B21);
		
		B21.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if (turno.equals("O"))
				{
					turno = "X";
					B21.setIcon(new ImageIcon(getClass().getResource("images/x.png")));
				}
				else
				{
					turno = "O";
					B21.setIcon(new ImageIcon(getClass().getResource("images/o.png")));
				}
			
				T2 = turno;
				panel.repaint();
				B21.setEnabled(false);
				verificar();
			}
			
		});
		
		B31.setFont(fuente);
		B31.setForeground(Color.black);
		B31.setBackground(Color.white);
		panel.add(B31);
		
		B31.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if (turno.equals("O"))
				{
					turno = "X";
					B31.setIcon(new ImageIcon(getClass().getResource("images/x.png")));
				}
				else
				{
					turno = "O";
					B31.setIcon(new ImageIcon(getClass().getResource("images/o.png")));
				}
				
				T3 = turno;
				panel.repaint();
				B31.setEnabled(false);
				verificar();
			}
			
		});
		
		B12.setFont(fuente);
		B12.setForeground(Color.black);
		B12.setBackground(Color.white);
		panel.add(B12);
		
		B12.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if (turno.equals("O"))
				{
					turno = "X";
					B12.setIcon(new ImageIcon(getClass().getResource("images/x.png")));
				}
				else
				{
					turno = "O";
					B12.setIcon(new ImageIcon(getClass().getResource("images/o.png")));
				}
				
				T4 = turno;
				panel.repaint();
				B12.setEnabled(false);
				verificar();
			}
			
		});
		
		B22.setFont(fuente);
		B22.setForeground(Color.black);
		B22.setBackground(Color.white);
		panel.add(B22);
		
		B22.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if (turno.equals("O"))
				{
					turno = "X";
					B22.setIcon(new ImageIcon(getClass().getResource("images/x.png")));
				}
				else
				{
					turno = "O";
					B22.setIcon(new ImageIcon(getClass().getResource("images/o.png")));
				}
				
				T5 = turno;
				panel.repaint();
				B22.setEnabled(false);
				verificar();
			}
			
		});
		
		B32.setFont(fuente);
		B32.setForeground(Color.black);
		B32.setBackground(Color.white);
		panel.add(B32);
		
		B32.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if (turno.equals("O"))
				{
					turno = "X";
					B32.setIcon(new ImageIcon(getClass().getResource("images/x.png")));
				}
				else
				{
					turno = "O";
					B32.setIcon(new ImageIcon(getClass().getResource("images/o.png")));
				}
				
				T6 = turno;
				panel.repaint();
				B32.setEnabled(false);
				verificar();
			}
			
		});
		
		B13.setFont(fuente);
		B13.setForeground(Color.black);
		B13.setBackground(Color.white);
		panel.add(B13);
		
		B13.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if (turno.equals("O"))
				{
					turno = "X";
					B13.setIcon(new ImageIcon(getClass().getResource("images/x.png")));
				}
				else
				{
					turno = "O";
					B13.setIcon(new ImageIcon(getClass().getResource("images/o.png")));
				}
				
				T7 = turno;
				panel.repaint();
				B13.setEnabled(false);
				verificar();
			}
			
		});
		
		B23.setFont(fuente);
		B23.setForeground(Color.black);
		B23.setBackground(Color.white);
		panel.add(B23);
		
		B23.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if (turno.equals("O"))
				{
					turno = "X";
					B23.setIcon(new ImageIcon(getClass().getResource("images/x.png")));
				}
				else
				{
					turno = "O";
					B23.setIcon(new ImageIcon(getClass().getResource("images/o.png")));
				}
				
				T8 = turno;
				panel.repaint();
				B23.setEnabled(false);
				verificar();
			}
			
		});
		
		B33.setFont(fuente);
		B33.setForeground(Color.black);
		B33.setBackground(Color.white);
		panel.add(B33);
		
		B33.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if (turno.equals("O"))
				{
					turno = "X";
					B33.setIcon(new ImageIcon(getClass().getResource("images/x.png")));
				}
				else
				{
					turno = "O";
					B33.setIcon(new ImageIcon(getClass().getResource("images/o.png")));
				}
				
				T9 = turno;
				panel.repaint();
				B33.setEnabled(false);
				verificar();
			}
			
		});
		
		
		panel.revalidate();
		panelAfuera.revalidate();
		
		return panelAfuera;
	}
	
	public void verificar()
	{
		if ((T1.equals(T2) && T2.equals(T3))
			|| (T4.equals(T5) && T5.equals(T6)) 
			|| (T7.equals(T8) && T8.equals(T9))
			|| (T1.equals(T4) && T4.equals(T7)) 
			|| (T2.equals(T5) && T5.equals(T8))
			|| (T3.equals(T6) && T6.equals(T9)) 
			|| (T1.equals(T5) && T5.equals(T9))
			|| (T3.equals(T5) && T5.equals(T7)))
		{
			JOptionPane.showMessageDialog(panel, "Ha ganado " + turno, "Ganador!", JOptionPane.INFORMATION_MESSAGE);
			B11.setEnabled(false);
			B21.setEnabled(false);
			B31.setEnabled(false);
			B12.setEnabled(false);
			B22.setEnabled(false);
			B32.setEnabled(false);
			B13.setEnabled(false);
			B23.setEnabled(false);
			B33.setEnabled(false);
			
			if (turno.equals("O"))
				puntosO++;
			else
				puntosX++;
			
			labelPuntos.setText(("O: " + puntosO + "           X: " + puntosX));
			
			panelAfuera.revalidate();
			panelAfuera.repaint();
		}
		else if (turnos == 9)
		{
			JOptionPane.showMessageDialog(panel, "No ha ganado nadie", "Sin ganador", JOptionPane.INFORMATION_MESSAGE);
			B11.setEnabled(false);
			B21.setEnabled(false);
			B31.setEnabled(false);
			B12.setEnabled(false);
			B22.setEnabled(false);
			B32.setEnabled(false);
			B13.setEnabled(false);
			B23.setEnabled(false);
			B33.setEnabled(false);
		}
		else
			turnos++;
		
	}
	
}
