package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class VentanaExamen2 extends JFrame 
{
	Font plain = new Font("Aptos", Font.PLAIN, 12);
	
	public VentanaExamen2(String title)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 700);
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		
		this.setMinimumSize(new Dimension(400, 400));
		
		
		// Añadimos el panel
		
		this.add(examen());
		this.repaint();
		this.setVisible(true);
	}
	
	public JPanel examen()
	{
		
		JPanel panelAfuera = new JPanel();
		panelAfuera.setLocation(0, 0);
		panelAfuera.setSize(this.WIDTH, this.HEIGHT);
		panelAfuera.setOpaque(true);
		panelAfuera.setBackground(new Color(0,102,153));
		panelAfuera.setLayout(null);
		
		JPanel panelAdentro = new JPanel();
		panelAdentro.setLocation(0, 80);
		panelAdentro.setSize(690, 565);
		panelAdentro.setOpaque(true);
		panelAdentro.setLayout(null);
		panelAdentro.setBackground(Color.white);
		panelAdentro.setBorder(new LineBorder(Color.gray, 1));
		
		JPanel panelDatosCliente = new JPanel();
		panelDatosCliente.setLocation(25, 20);
		panelDatosCliente.setSize(625, 100);
		panelDatosCliente.setOpaque(true);
		panelDatosCliente.setLayout(null);
		panelDatosCliente.setBackground(Color.white);
		panelDatosCliente.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.gray, 1), "Datos del cliente"));
		
		JPanel panelDatosFactura = new JPanel();
		panelDatosFactura.setLocation(25, 125);
		panelDatosFactura.setSize(625, 65);
		panelDatosFactura.setOpaque(true);
		panelDatosFactura.setLayout(null);
		panelDatosFactura.setBackground(Color.white);
		panelDatosFactura.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.gray, 1), "Datos de factura"));
		
		JPanel panelBotonesTabla = new JPanel();
		panelBotonesTabla.setLocation(20, 195);
		panelBotonesTabla.setSize(635, 50);
		panelBotonesTabla.setOpaque(true);
		panelBotonesTabla.setLayout(null);
		panelBotonesTabla.setBackground(Color.white);
		panelBotonesTabla.setBorder(new LineBorder(Color.gray, 1));
		
		// JLabels
		
		JLabel titulo = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		titulo.setSize(500, 40);
		titulo.setLocation(35, 10);
		titulo.setForeground(Color.white);
		titulo.setOpaque(false);
		titulo.setFont(new Font("Calibri", Font.BOLD, 20));
		titulo.setHorizontalAlignment(JLabel.LEFT);
		panelAfuera.add(titulo);
		
		JLabel subtitulo = new JLabel("[Sin Base de datos]");
		subtitulo.setSize(500, 40);
		subtitulo.setLocation(40, 32);
		subtitulo.setForeground(Color.white);
		subtitulo.setOpaque(false);
		subtitulo.setFont(new Font("Calibri", Font.PLAIN, 14));
		subtitulo.setHorizontalAlignment(JLabel.LEFT);
		panelAfuera.add(subtitulo);
		
		// Datos del cliente
		
		JLabel labelDocumento = new JLabel("Documento:");
		labelDocumento.setSize(75, 20);
		labelDocumento.setLocation(20, 25);
		labelDocumento.setForeground(Color.black);
		labelDocumento.setOpaque(false);
		labelDocumento.setFont(plain);
		labelDocumento.setHorizontalAlignment(JLabel.LEFT);
		panelDatosCliente.add(labelDocumento);
		
		JLabel labelDireccion = new JLabel("Dirección:");
		labelDireccion.setSize(75, 20);
		labelDireccion.setLocation(20, 60);
		labelDireccion.setForeground(Color.black);
		labelDireccion.setOpaque(false);
		labelDireccion.setFont(plain);
		labelDireccion.setHorizontalAlignment(JLabel.LEFT);
		panelDatosCliente.add(labelDireccion);
		
		JLabel labelNombres = new JLabel("Nombres:");
		labelNombres.setSize(75, 20);
		labelNombres.setLocation(300, 25);
		labelNombres.setForeground(Color.black);
		labelNombres.setOpaque(false);
		labelNombres.setFont(plain);
		labelNombres.setHorizontalAlignment(JLabel.LEFT);
		panelDatosCliente.add(labelNombres);
		
		JLabel labelTelefono = new JLabel("Teléfono:");
		labelTelefono.setSize(75, 20);
		labelTelefono.setLocation(300, 60);
		labelTelefono.setForeground(Color.black);
		labelTelefono.setOpaque(false);
		labelTelefono.setFont(plain);
		labelTelefono.setHorizontalAlignment(JLabel.LEFT);
		panelDatosCliente.add(labelTelefono);
		
		// Datos de factura
		
		JLabel labelFacturas = new JLabel("Nº Factura:");
		labelFacturas.setSize(75, 20);
		labelFacturas.setLocation(20, 25);
		labelFacturas.setForeground(Color.black);
		labelFacturas.setOpaque(false);
		labelFacturas.setFont(plain);
		labelFacturas.setHorizontalAlignment(JLabel.LEFT);
		panelDatosFactura.add(labelFacturas);
		
		JLabel labelFecha = new JLabel("Fecha:");
		labelFecha.setSize(75, 20);
		labelFecha.setLocation(300, 25);
		labelFecha.setForeground(Color.black);
		labelFecha.setOpaque(false);
		labelFecha.setFont(plain);
		labelFecha.setHorizontalAlignment(JLabel.LEFT);
		panelDatosFactura.add(labelFecha);
		
		JLabel facturas = new JLabel("1");
		facturas.setSize(90, 20);
		facturas.setLocation(110, 25);
		facturas.setForeground(Color.black);
		facturas.setOpaque(false);
		facturas.setHorizontalAlignment(JLabel.LEFT);
		panelDatosFactura.add(facturas);
		
		JLabel fecha = new JLabel("2021/50/21");
		fecha.setSize(75, 20);
		fecha.setLocation(390, 25);
		fecha.setForeground(Color.black);
		fecha.setOpaque(false);
		fecha.setHorizontalAlignment(JLabel.LEFT);
		panelDatosFactura.add(fecha);
		
		// Otra información
		
		JLabel labelSubtotal = new JLabel("SubTotal:");
		labelSubtotal.setSize(75, 20);
		labelSubtotal.setLocation(40, 400);
		labelSubtotal.setForeground(Color.black);
		labelSubtotal.setOpaque(false);
		labelSubtotal.setFont(plain);
		labelSubtotal.setHorizontalAlignment(JLabel.LEFT);
		panelAdentro.add(labelSubtotal);
		
		JLabel subtotal = new JLabel("6600.0");
		subtotal.setSize(75, 20);
		subtotal.setLocation(150, 403);
		subtotal.setForeground(Color.black);
		subtotal.setFont(new Font("Calibri", Font.BOLD, 14));
		subtotal.setOpaque(false);
		subtotal.setHorizontalAlignment(JLabel.LEFT);
		panelAdentro.add(subtotal);
		
		
		JLabel labelDescuento = new JLabel("% Descuento:");
		labelDescuento.setSize(100, 20);
		labelDescuento.setLocation(40, 430);
		labelDescuento.setForeground(Color.black);
		labelDescuento.setOpaque(false);
		labelDescuento.setFont(plain);
		labelDescuento.setHorizontalAlignment(JLabel.LEFT);
		panelAdentro.add(labelDescuento);
		
		
		JLabel labelIVA = new JLabel("IVA 19%:");
		labelIVA.setSize(100, 20);
		labelIVA.setLocation(40, 460);
		labelIVA.setForeground(Color.black);
		labelIVA.setOpaque(false);
		labelIVA.setFont(plain);
		labelIVA.setHorizontalAlignment(JLabel.LEFT);
		panelAdentro.add(labelIVA);
		
		JLabel IVA = new JLabel("1254.0");
		IVA.setSize(75, 20);
		IVA.setLocation(150, 463);
		IVA.setForeground(Color.black);
		IVA.setFont(new Font("Calibri", Font.BOLD, 14));
		IVA.setOpaque(false);
		IVA.setHorizontalAlignment(JLabel.LEFT);
		panelAdentro.add(IVA);
		
		
		JLabel labelTotal = new JLabel("Total Factura:");
		labelTotal.setSize(100, 20);
		labelTotal.setLocation(40, 490);
		labelTotal.setForeground(Color.black);
		labelTotal.setOpaque(false);
		labelTotal.setFont(plain);
		labelTotal.setHorizontalAlignment(JLabel.LEFT);
		panelAdentro.add(labelTotal);
		
		JLabel factura = new JLabel("7524.0");
		factura.setSize(75, 20);
		factura.setLocation(150, 493);
		factura.setForeground(Color.black);
		factura.setFont(new Font("Calibri", Font.BOLD, 14));
		factura.setOpaque(false);
		factura.setHorizontalAlignment(JLabel.LEFT);
		panelAdentro.add(factura);
		
		
		JLabel labelDescontado = new JLabel("Total descontado:");
		labelDescontado.setSize(150, 20);
		labelDescontado.setLocation(260, 430);
		labelDescontado.setForeground(Color.black);
		labelDescontado.setOpaque(false);
		labelDescontado.setFont(plain);
		labelDescontado.setHorizontalAlignment(JLabel.LEFT);
		panelAdentro.add(labelDescontado);
		
		JLabel descontado = new JLabel("330.0");
		descontado.setSize(75, 20);
		descontado.setLocation(380, 433);
		descontado.setForeground(Color.black);
		descontado.setFont(new Font("Calibri", Font.BOLD, 14));
		descontado.setOpaque(false);
		descontado.setHorizontalAlignment(JLabel.LEFT);
		panelAdentro.add(descontado);
		
		// JTextField
		
		JTextField documento = new JTextField();
		documento.setSize(150, 25);
		documento.setLocation(110, 25);
		documento.setLayout(null);
		panelDatosCliente.add(documento);
		
		JTextField direccion = new JTextField();
		direccion.setSize(150, 25);
		direccion.setLocation(110, 60);
		direccion.setLayout(null);
		panelDatosCliente.add(direccion);
		
		JTextField nombres = new JTextField();
		nombres.setSize(200, 25);
		nombres.setLocation(390, 25);
		nombres.setLayout(null);
		panelDatosCliente.add(nombres);
		
		JTextField telefono = new JTextField();
		telefono.setSize(200, 25);
		telefono.setLocation(390, 60);
		telefono.setLayout(null);
		panelDatosCliente.add(telefono);
		
		
		JTextField descuento = new JTextField();
		descuento.setSize(50, 25);
		descuento.setLocation(150, 430);
		descuento.setLayout(null);
		panelAdentro.add(descuento);
		
		
		// JButtons
		
		JButton listado = new JButton("Ver listado de facturas");
		listado.setSize(175, 30);
		listado.setLocation(10, 10);
		listado.setBackground(Color.white);
		listado.setLayout(null);
		listado.setBorder(new LineBorder(Color.white, 1, true));
		listado.setIcon(new ImageIcon(getClass().getResource("images/list.png")));
		panelBotonesTabla.add(listado);
		
		JButton insertar = new JButton("Añadir");
		insertar.setSize(75, 30);
		insertar.setLocation(425, 10);
		insertar.setBackground(Color.white);
		insertar.setLayout(null);
		insertar.setBorder(new LineBorder(Color.white, 1, true));
		insertar.setIcon(new ImageIcon(getClass().getResource("images/add.png")));
		panelBotonesTabla.add(insertar);
		
		JButton eliminar = new JButton("Eliminar");
		eliminar.setSize(90, 30);
		eliminar.setLocation(525, 10);
		eliminar.setBackground(Color.white);
		eliminar.setLayout(null);
		eliminar.setBorder(new LineBorder(Color.white, 1, true));
		eliminar.setIcon(new ImageIcon(getClass().getResource("images/cancel.png")));
		panelBotonesTabla.add(eliminar);
		
		

		JButton finalizar = new JButton("Finalizar factura");
		finalizar.setSize(125, 25);
		finalizar.setLocation(425, 525);
		finalizar.setLayout(null);
		panelAdentro.add(finalizar);
		
		JButton limpiar = new JButton("Limpiar");
		limpiar.setSize(80, 25);
		limpiar.setLocation(565, 525);
		limpiar.setLayout(null);
		panelAdentro.add(limpiar);
		
		
		// JCheckBox
		
		JCheckBox checkDescuento = new JCheckBox("");
		checkDescuento.setSize(40, 20);
		checkDescuento.setLocation(210, 430);
		checkDescuento.setOpaque(false);
		checkDescuento.setLayout(null);
		panelAdentro.add(checkDescuento);
		
		
		// JTable
		
		String[] nombreColumnas = {
				"Producto",
				"Cantidad",
				"Valor",
				"Sub Total",
				};
		
		Object[][] datos = {
				{"Agua", "2", "500", "1000.0"},
				{"Cereal", "5", "1000", "5000.0"},
				{"Leche", "2", "300", "600.0"}};
		
		JTable tabla = new JTable(datos, nombreColumnas);
		tabla.getTableHeader().setOpaque(false);
		tabla.getTableHeader().setBackground(Color.white);
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setLocation(20, 250);
		scrollPane.setSize(635, 125);
		panelAdentro.add(scrollPane);
		
		panelDatosCliente.revalidate();
		panelDatosFactura.revalidate();
		panelBotonesTabla.revalidate();
		
		panelAdentro.add(panelDatosFactura);
		panelAdentro.add(panelDatosCliente);
		panelAdentro.add(panelBotonesTabla);
		panelAdentro.revalidate();
		
		panelAfuera.add(panelAdentro);
		
		panelAfuera.revalidate();
		return panelAfuera;
		
	}
}
