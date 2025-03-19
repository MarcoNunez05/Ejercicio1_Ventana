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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaTicTacToe extends JFrame 
{
	Font fuente = new Font("Aptos", Font.BOLD, 30);
	String turno = "O";
	int turnos = 1;
	
	JPanel panel = new JPanel();
	
	JButton B11 = new JButton(" ");
	JButton B21 = new JButton("  ");
	JButton B31 = new JButton("   ");
	JButton B12 = new JButton("    ");
	JButton B22 = new JButton("     ");
	JButton B32 = new JButton("      ");
	JButton B13 = new JButton("       ");
	JButton B23 = new JButton("        ");
	JButton B33 = new JButton("         ");

	public VentanaTicTacToe(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
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
		panel.setLocation(0, 0);
		panel.setSize(this.WIDTH, this.HEIGHT);
		panel.setOpaque(true);
		panel.setLayout(new GridLayout(0, 3, 5, 5));
		panel.setBackground(Color.white);
		
		
		// JButton
		
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
					turno = "X";
				else
					turno = "O";
				
				B11.setText(turno);
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
					turno = "X";
				else
					turno = "O";
				
				B21.setText(turno);
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
					turno = "X";
				else
					turno = "O";
				
				B31.setText(turno);
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
					turno = "X";
				else
					turno = "O";
				
				B12.setText(turno);
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
					turno = "X";
				else
					turno = "O";
				
				B22.setText(turno);
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
					turno = "X";
				else
					turno = "O";
				
				B32.setText(turno);
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
					turno = "X";
				else
					turno = "O";
				
				B13.setText(turno);
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
					turno = "X";
				else
					turno = "O";
				
				B23.setText(turno);
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
					turno = "X";
				else
					turno = "O";
				
				B33.setText(turno);
				panel.repaint();
				B33.setEnabled(false);
				verificar();
			}
			
		});
		
		
		panel.revalidate();
		return panel;
	}
	
	public void verificar()
	{
		if ((B11.getText().equals(B21.getText()) && B21.getText().equals(B31.getText()))
			|| (B12.getText().equals(B22.getText()) && B22.getText().equals(B32.getText())) 
			|| (B13.getText().equals(B23.getText()) && B23.getText().equals(B33.getText()))
			|| (B11.getText().equals(B12.getText()) && B12.getText().equals(B13.getText())) 
			|| (B21.getText().equals(B22.getText()) && B22.getText().equals(B23.getText()))
			|| (B31.getText().equals(B32.getText()) && B32.getText().equals(B33.getText())) 
			|| (B11.getText().equals(B22.getText()) && B22.getText().equals(B33.getText()))
			|| (B13.getText().equals(B22.getText()) && B22.getText().equals(B31.getText())))
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
