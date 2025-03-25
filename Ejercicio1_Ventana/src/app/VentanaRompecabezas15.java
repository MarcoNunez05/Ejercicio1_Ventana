package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class VentanaRompecabezas15 extends JFrame 
{
	Font fuente = new Font("Aptos", Font.BOLD, 40);
	
	JPanel panelAfuera = new JPanel();
	JPanel panel = new JPanel();
	
	JButton B1 = new JButton();
	JButton B2 = new JButton();
	JButton B3 = new JButton();
	JButton B4 = new JButton();
	JButton B5 = new JButton();
	JButton B6 = new JButton();
	JButton B7 = new JButton();
	JButton B8 = new JButton();
	JButton B9 = new JButton();
	JButton B10 = new JButton();
	JButton B11 = new JButton();
	JButton B12 = new JButton();
	JButton B13 = new JButton();
	JButton B14 = new JButton();
	JButton B15 = new JButton();
	JButton B16 = new JButton();
	
	JButton iniciar = new JButton("Iniciar");
	JButton pausar = new JButton("Pausar");
	JButton reiniciar = new JButton("Reiniciar");
	
	int botonViejo = 16;
	
	
	public VentanaRompecabezas15(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(750, 850);
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
		
		
		// JLabel
		
		JLabel titulo = new JLabel("Rompecabezas de 15 números");
		titulo.setLocation(185, 5);
		titulo.setSize(400, 50);
		titulo.setForeground(Color.black);
		titulo.setFont(new Font("Aptos", Font.BOLD, 25));
		panelAfuera.add(titulo);
		
		// JButton
		
		iniciar.setLocation(75, 640);
		iniciar.setSize(175, 50);
		iniciar.setForeground(Color.black);
		iniciar.setBackground(Color.white);
		iniciar.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		iniciar.setFont(new Font("Aptos", Font.BOLD, 20));
 		panelAfuera.add(iniciar);
		
		pausar.setLocation(285, 640);
		pausar.setSize(175, 50);
		pausar.setForeground(Color.black);
		pausar.setBackground(Color.white);
		pausar.setBorder(BorderFactory.createLineBorder(Color.black, 3));
 		pausar.setFont(new Font("Aptos", Font.BOLD, 20));
 		panelAfuera.add(pausar);
		
		reiniciar.setLocation(490, 640);
 		reiniciar.setSize(175, 50);
 		reiniciar.setForeground(Color.black);
 		reiniciar.setBackground(Color.white);
 		reiniciar.setBorder(BorderFactory.createLineBorder(Color.black, 3));
 		reiniciar.setFont(new Font("Aptos", Font.BOLD, 20));
 		panelAfuera.add(reiniciar);
		
		numRandom();
		
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
				viejo().setText(B1.getText());
				B1.setText("");
				validacion();
				botonViejo = 1;
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
				viejo().setText(B2.getText());
				B2.setText("");
				validacion();
				botonViejo = 2;
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
				viejo().setText(B3.getText());
				B3.setText("");
				validacion();
				botonViejo = 3;
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
				viejo().setText(B4.getText());
				B4.setText("");
				validacion();
				botonViejo = 4;
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
				viejo().setText(B5.getText());
				B5.setText("");
				validacion();
				botonViejo = 5;
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
				viejo().setText(B6.getText());
				B6.setText("");
				validacion();
				botonViejo = 6;
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
				viejo().setText(B7.getText());
				B7.setText("");
				validacion();
				botonViejo = 7;
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
				viejo().setText(B8.getText());
				B8.setText("");
				validacion();
				botonViejo = 8;
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
				viejo().setText(B9.getText());
				B9.setText("");
				validacion();
				botonViejo = 9;
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
				viejo().setText(B10.getText());
				B10.setText("");
				validacion();
				botonViejo = 10;
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
				viejo().setText(B11.getText());
				B11.setText("");
				validacion();
				botonViejo = 11;
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
				viejo().setText(B12.getText());
				B12.setText("");
				validacion();
				botonViejo = 12;
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
				viejo().setText(B13.getText());
				B13.setText("");
				validacion();
				botonViejo = 13;
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
				viejo().setText(B14.getText());
				B14.setText("");
				validacion();
				botonViejo = 14;
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
				viejo().setText(B15.getText());
				B15.setText("");
				validacion();
				botonViejo = 15;
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
				viejo().setText(B16.getText());
				B16.setText("");
				validacion();
				botonViejo = 16;
			}
			
		});
		
		
		validacion();
		
		panel.revalidate();
		
		panelAfuera.revalidate();
		return panelAfuera;
	}
	
	public void numRandom()
	{
		ArrayList<Integer> numRand = new ArrayList<Integer>();
		
		for (int i = 1; i < 16; i++) 
			numRand.add(i);
		
		Collections.shuffle(numRand);
		
		B1.setText(numRand.get(0).toString());
		B2.setText(numRand.get(1).toString());
		B3.setText(numRand.get(2).toString());
		B4.setText(numRand.get(3).toString());
		B5.setText(numRand.get(4).toString());
		B6.setText(numRand.get(5).toString());
		B7.setText(numRand.get(6).toString());
		B8.setText(numRand.get(7).toString());
		B9.setText(numRand.get(8).toString());
		B10.setText(numRand.get(9).toString());
		B11.setText(numRand.get(10).toString());
		B12.setText(numRand.get(11).toString());
		B13.setText(numRand.get(12).toString());
		B14.setText(numRand.get(13).toString());
		B15.setText(numRand.get(14).toString());
		B16.setText("");
		
		botonViejo = 16;
	}
	
	public void validacion()
	{
		B1.setEnabled(false);
		B2.setEnabled(false);
		B3.setEnabled(false);
		B4.setEnabled(false);
		B5.setEnabled(false);
		B6.setEnabled(false);
		B7.setEnabled(false);
		B8.setEnabled(false);
		B9.setEnabled(false);
		B10.setEnabled(false);
		B11.setEnabled(false);
		B12.setEnabled(false);
		B13.setEnabled(false);
		B14.setEnabled(false);
		B15.setEnabled(false);
		B16.setEnabled(false);
		
		
		if (B1.getText().equals("")) 
		{
			B2.setEnabled(true);
			B5.setEnabled(true);
		}
		
		if (B2.getText().equals("")) 
		{
			B1.setEnabled(true);
			B3.setEnabled(true);
			B6.setEnabled(true);
		}
		
		if (B3.getText().equals("")) 
		{
			B2.setEnabled(true);
			B4.setEnabled(true);
			B7.setEnabled(true);
		}
		
		if (B4.getText().equals("")) 
		{
			B3.setEnabled(true);
			B8.setEnabled(true);
		}
		
		if (B5.getText().equals("")) 
		{
			B1.setEnabled(true);
			B6.setEnabled(true);
			B9.setEnabled(true);
		}
		
		if (B6.getText().equals("")) 
		{
			B2.setEnabled(true);
			B5.setEnabled(true);
			B7.setEnabled(true);
			B10.setEnabled(true);
		}
		
		if (B7.getText().equals("")) 
		{
			B3.setEnabled(true);
			B6.setEnabled(true);
			B8.setEnabled(true);
			B11.setEnabled(true);
		}
		
		if (B8.getText().equals("")) 
		{
			B4.setEnabled(true);
			B7.setEnabled(true);
			B12.setEnabled(true);
		}
		
		if (B9.getText().equals("")) 
		{
			B5.setEnabled(true);
			B10.setEnabled(true);
			B13.setEnabled(true);
		}
		
		if (B10.getText().equals("")) 
		{
			B6.setEnabled(true);
			B9.setEnabled(true);
			B11.setEnabled(true);
			B14.setEnabled(true);
		}
		
		if (B11.getText().equals("")) 
		{
			B7.setEnabled(true);
			B10.setEnabled(true);
			B12.setEnabled(true);
			B15.setEnabled(true);
		}
		
		if (B12.getText().equals("")) 
		{
			B8.setEnabled(true);
			B11.setEnabled(true);
			B16.setEnabled(true);
		}
		
		if (B13.getText().equals("")) 
		{
			B9.setEnabled(true);
			B14.setEnabled(true);
		}
		
		if (B14.getText().equals("")) 
		{
			B10.setEnabled(true);
			B13.setEnabled(true);
			B15.setEnabled(true);
		}
		
		if (B15.getText().equals("")) 
		{
			B11.setEnabled(true);
			B14.setEnabled(true);
			B16.setEnabled(true);
		}
		
		if (B16.getText().equals("")) 
		{
			B12.setEnabled(true);
			B15.setEnabled(true);
		}
	}
	
	public JButton viejo()
	{
		switch(botonViejo)
		{	
			case 1:
				return B1;
			case 2:
				return B2;
			case 3:
				return B3;
			case 4:
				return B4;
			case 5:
				return B5;
			case 6:
				return B6;
			case 7:
				return B7;
			case 8:
				return B8;
			case 9:
				return B9;
			case 10:
				return B10;
			case 11:
				return B11;
			case 12:
				return B12;
			case 13:
				return B13;
			case 14:
				return B14;
			case 15:
				return B15;
			case 16:
				return B16;			
		}
		
		return null;
	}
	
	public void ganador()
	{
		if (B1.getText().equals("1") && B2.getText().equals("2") && B3.getText().equals("3") && B4.getText().equals("4") 
				&& B5.getText().equals("5") && B6.getText().equals("6") && B7.getText().equals("7") && B8.getText().equals("8")
				&& B9.getText().equals("9") && B10.getText().equals("10") && B11.getText().equals("11") && B12.getText().equals("12") 
				&& B13.getText().equals("13") && B14.getText().equals("14") && B15.getText().equals("15") && B16.getText().equals(""))
			JOptionPane.showMessageDialog(panel, "Has ganado!", "Ganador!", JOptionPane.INFORMATION_MESSAGE);
	}
}
