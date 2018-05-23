package view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaTienda extends JFrame {

	public JLabel etiquetaResultado;
	public JLabel etiquetaImei;
	public JLabel etiquetaMarca;
	public JLabel etiquetaModelo;
	public JLabel etiquetaNumero;
	public JLabel etiquetaCosto;
	public JLabel etiquetaBuscar;
	public JLabel etiquetaRango;

	public JTextField campoTextoImei;
	public JTextField campoTextoMarca;
	public JTextField campoTextoModelo;
	public JTextField campoTextoNumero;
	public JTextField campoTextoCosto;
	public JTextField campoTextoBuscar;
	public JTextField campoMinimo;
	public JTextField campoMaximo;
	
	
	

	public JButton botonRegistrar;
	public JButton botonListaDeCelulares;
	public JButton botonCantidadCelulares;
	public JButton botonNuevaVentana;
	public JButton botonBuscarMarca;
	public JButton botonBuscarRango;
	public JButton botonVentanaRango;
	
	public JDialog dialog;
	public JDialog dialog2;
	public JPanel panel3;
	public JPanel panel2;

	public VistaTienda() {

		JFrame ventana = new JFrame("Formulario");
		JPanel panel = new JPanel();

		// Definimos las variables para las etiquetas
		etiquetaImei = new JLabel("Imei: ");
		etiquetaMarca = new JLabel("Marca: ");
		etiquetaModelo = new JLabel("Modelo: ");
		etiquetaNumero = new JLabel("Numero: ");
		etiquetaCosto = new JLabel("Costo: ");

		// Definimos las variables para los cuadros de texto
		campoTextoImei = new JTextField(20);
		campoTextoMarca = new JTextField(20);
		campoTextoModelo = new JTextField(20);
		campoTextoNumero = new JTextField(20);
		campoTextoCosto = new JTextField(20);

		// Agregamos los componentes

		panel.add(etiquetaImei);
		panel.add(campoTextoImei);
		panel.add(etiquetaMarca);
		panel.add(campoTextoMarca);
		panel.add(etiquetaModelo);
		panel.add(campoTextoModelo);
		panel.add(etiquetaNumero);
		panel.add(campoTextoNumero);
		panel.add(etiquetaCosto);
		panel.add(campoTextoCosto);

		botonRegistrar = new JButton("Registrar");
		etiquetaResultado = new JLabel();

		botonCantidadCelulares = new JButton("Cantidad de Celulares");
		botonCantidadCelulares.setEnabled(false);
		
		botonNuevaVentana = new JButton("Buscar por marca");
		botonNuevaVentana.setEnabled(false);

		botonListaDeCelulares = new JButton("Mostrar Información");
		botonListaDeCelulares.setEnabled(false);
		
		botonVentanaRango = new JButton("Buscar por rango de precios");
		botonVentanaRango.setEnabled(false);
		
		panel.add(etiquetaResultado);

		panel.add(botonRegistrar);
		panel.add(botonCantidadCelulares);
		panel.add(botonListaDeCelulares);
		panel.add(botonNuevaVentana);
		panel.add(botonVentanaRango);

		ventana.setContentPane(panel);
		ventana.setVisible(true);
		ventana.setSize(200, 200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		botonBuscarMarca = new JButton("Buscar");
		botonBuscarRango = new JButton("Buscar Rango");
		
		etiquetaBuscar = new JLabel("Ingrese la marca a buscar");
		campoTextoBuscar = new JTextField(20);
		etiquetaRango = new JLabel("Ingrese el campo minimo y maximo");
		campoMinimo = new JTextField(20);
		campoMaximo = new JTextField(20);
		
		
		
		
		dialog = new JDialog();
		panel2 = new JPanel();
		panel2.add(etiquetaBuscar);
		panel2.add(campoTextoBuscar);
		panel2.add(botonBuscarMarca);
		dialog.setContentPane(panel2);
		dialog.setSize(200, 200);
		
		
		dialog2 = new JDialog();
		panel3 = new JPanel();
		panel3.add(etiquetaRango);
		panel3.add(campoMinimo);
		panel3.add(campoMaximo);
		panel3.add(botonBuscarRango);
		dialog2.setContentPane(panel3);
		dialog2.setSize(200, 200);
		
		
		
		
		

	}

	public void mostrarMensajes(String men) {
		JOptionPane.showMessageDialog(null, men);
	}
}
