package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import entity.Tienda;
import entity.Celular;
import view.VistaTienda;

public class ControllerCelular implements ActionListener {

	Tienda tienda = null;
	VistaTienda vistaTienda = null;

	public ControllerCelular(Tienda tienda, VistaTienda vistaTienda) {
		this.tienda = tienda;
		this.vistaTienda = vistaTienda;
		actionListener(this);
	}

	public void actionListener(ActionListener escuchador) {
		vistaTienda.botonRegistrar.addActionListener(escuchador);
		vistaTienda.botonCantidadCelulares.addActionListener(escuchador);
		vistaTienda.botonListaDeCelulares.addActionListener(escuchador);
		
		
		
		vistaTienda.botonNuevaVentana.addActionListener(escuchador);
		vistaTienda.botonBuscarMarca.addActionListener(escuchador);
		vistaTienda.botonVentanaRango.addActionListener(escuchador);
		vistaTienda.botonBuscarRango.addActionListener(escuchador);
		
	}

	@Override
	public void actionPerformed(ActionEvent objEvento) {
		if (vistaTienda.botonRegistrar == objEvento.getSource()) {
			if (!"".equals(vistaTienda.campoTextoImei.getText())
					&& (!"".equals(vistaTienda.campoTextoMarca.getText()))) {
				try {
					String pImei = vistaTienda.campoTextoImei.getText();
					String pMarca = vistaTienda.campoTextoMarca.getText();
					String pModelo = vistaTienda.campoTextoModelo.getText();
					String pNumero = vistaTienda.campoTextoNumero.getText();

					int pCosto = Integer.parseInt(vistaTienda.campoTextoCosto.getText());
					// Creamos el objeto
					Celular celular = new Celular(pImei, pMarca, pModelo, pNumero, pCosto);

					// Antes de agregar verificar si están las casillas del
					// arreglo llenas
					String mensaje = "";
					if (!this.tienda.verificaCapacidad() && !this.tienda.repetido(pImei)) {
						this.tienda.agregarCelular(celular);
						mensaje = "Se ha agregado un celular";
					} else {
						mensaje = "No se puede agregar un celular";
					}

					//
					vistaTienda.etiquetaResultado.setText(mensaje);
					vistaTienda.botonCantidadCelulares.setEnabled(true);
					vistaTienda.botonListaDeCelulares.setEnabled(true);
					vistaTienda.botonNuevaVentana.setEnabled(true);
					vistaTienda.botonVentanaRango.setEnabled(true);
					// Limpiamos los cuadros de texto
					vistaTienda.campoTextoImei.setText("");
					vistaTienda.campoTextoMarca.setText("");
					vistaTienda.campoTextoModelo.setText("");
					vistaTienda.campoTextoNumero.setText("");
					vistaTienda.campoTextoCosto.setText("");

				} catch (NumberFormatException e) {
					vistaTienda.etiquetaResultado.setText("Se ha presentado un error....");
					vistaTienda.campoTextoImei.setText("");
					vistaTienda.campoTextoMarca.setText("");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Todos los campos son  requeridos", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		} else if (vistaTienda.botonCantidadCelulares == objEvento.getSource()) {
			try {
				Integer cantidadCelulares = this.tienda.getCantidadCelulares();
				vistaTienda.mostrarMensajes(cantidadCelulares.toString());
			} catch (NumberFormatException e) {
				vistaTienda.etiquetaResultado.setText("Se ha presentado un error....");
			}
		} else if (vistaTienda.botonListaDeCelulares == objEvento.getSource()) {
			String resultado = this.tienda.mostrarInformacionDeCelulares();
			vistaTienda.mostrarMensajes(resultado);
			
		} else if (vistaTienda.botonNuevaVentana == objEvento.getSource()) {
			vistaTienda.dialog.setVisible(true);
			
		} else if (vistaTienda.botonBuscarMarca == objEvento.getSource()) {
			String pMarca = vistaTienda.campoTextoBuscar.getText();
			String resultado = this.tienda.mostrarInformacionDeCelularesMarca(pMarca);
			vistaTienda.mostrarMensajes(resultado);
			
		} else if (vistaTienda.botonVentanaRango == objEvento.getSource()) {
			vistaTienda.dialog2.setVisible(true);

		} else if (vistaTienda.botonBuscarRango == objEvento.getSource()) {
			String pMinimo = vistaTienda.campoMinimo.getText();
			String pMaximo = vistaTienda.campoMaximo.getText();
			String resultado = this.tienda.mostrarRango(pMinimo,pMaximo);
			vistaTienda.mostrarMensajes(resultado);
			
		}
	}

}
