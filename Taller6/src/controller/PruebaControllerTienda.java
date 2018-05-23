package controller;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import entity.Tienda;
import view.VistaTienda;

public class PruebaControllerTienda {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		}
		Tienda tienda = new Tienda();
		VistaTienda vistaTienda = new VistaTienda();
		ControllerCelular controlador = new ControllerCelular(tienda, vistaTienda);
	}
}