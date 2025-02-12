package app;
import javax.swing.JFrame;

public class VentanaExtendida extends JFrame 
{
	public VentanaExtendida(String title)
	{
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
	}
	
}
