package entity;

/**
 * Esta clase describe la tienda de celulares
 */

public class Tienda {
	// -----------------------------------------------------
	// Constantes
	// -----------------------------------------------------

	static final int CAPACIDAD = 5; // Constante utilizada para determinar la
									// capacidad del Arreglo
	private int cantidadCelulares; // Variable utilizada para almacenar la
									// cantidad de celulares que se encuentran
									// almacenados en el arreglo
	private Celular celulares[] = new Celular[CAPACIDAD]; // Arreglo de objetos
															// <Celular>

	public Tienda() {
		// En este constructor, lo que se hace es inicializar en <null> cada
		// posición del arreglo
		for (int i = 0; i < CAPACIDAD; i++) {
			celulares[i] = null;
		}
		cantidadCelulares = 0;
	}

	public int getCantidadCelulares() {
		return cantidadCelulares;
	}

	public void setCantidadCelulares(int cantidadCelulares) {
		this.cantidadCelulares = cantidadCelulares;
	}

	public Celular[] getCelular() {
		return celulares;
	}

	public void setCelular(Celular[] celular) {
		this.celulares = celular;
	}

	// Este método devuelve <true> si el arreglo está completamente lleno.
	// Devuelve <false> en caso contrario
	public boolean verificaCapacidad() {

		return cantidadCelulares == CAPACIDAD;

	}

	public String agregarCelular(Celular pCelular) {
		String resultado = "";
		// Para agregar el objeto tipo <celular> primero se verifica si hay
		// disponibilidad en el arreglo
		if (!this.verificaCapacidad()) {
			celulares[cantidadCelulares] = pCelular; // Aqui se almacena el
														// objeto
			// <celular> en una casilla del
			// arreglo
			cantidadCelulares = cantidadCelulares + 1;
			resultado = "Se ha registrado un nuevo Celular....En total tenemos: " + cantidadCelulares;
		}

		return resultado;

	}

	public String mostrarInformacionDeCelulares() {
		String listadoCelulares = "*** LISTA DE CELULARES ***\n\nMarca ---- Modelo ---- Precio De Venta\n";
		listadoCelulares += "---------------------------------------------------\n";
		for (int i = 0; i < CAPACIDAD && celulares[i] != null; i++) {
			listadoCelulares = listadoCelulares + celulares[i].getMarca() + " ----- " + celulares[i].getModelo() + " ----- "
					+ celulares[i].getCosto() + " \n";
		}
		return listadoCelulares;
	}
	
	
	public String mostrarInformacionDeCelularesMarca(String pMarca) {
		String listadoCelulares = "*** LISTA DE CELULARES ***\n\nMarca ---- Modelo ---- Precio De Venta\n";
		listadoCelulares += "---------------------------------------------------\n";
		for (int i = 0; i < CAPACIDAD && celulares[i] != null; i++) {
			if(celulares[i].getMarca().equals(pMarca)) {
			listadoCelulares = listadoCelulares + celulares[i].getMarca() + " ----- " + celulares[i].getModelo() + " ----- "
					+ celulares[i].getCosto() + " \n";
			}
		}
		return listadoCelulares;
	}
	
	
	public boolean repetido(String pImei) {
		for (int i = 0; i < CAPACIDAD && celulares[i] != null; i++) {
			if(celulares[i].getImei().equals(pImei)) {
			return true;
			}
		}
		return false;
	}
	
	
	public String mostrarRango(String pMinimo,String pMaximo) {
		int minimo = Integer.parseInt(pMinimo);
		int maximo = Integer.parseInt(pMaximo);
		
		String listadoCelulares = "*** LISTA DE CELULARES ***\n\nMarca ---- Modelo ---- Precio De Venta\n";
		listadoCelulares += "---------------------------------------------------\n";
		
		for (int i = 0; i < CAPACIDAD && celulares[i] != null; i++) {
		if(celulares[i].getCosto() >= minimo && celulares[i].getCosto() <= maximo) {
			listadoCelulares = listadoCelulares + celulares[i].getMarca() + " ----- " + celulares[i].getModelo() + " ----- "
					+ celulares[i].getCosto() + " \n";
		}
		
		
		
		}
		
		return listadoCelulares;
	}
	
	
	
	
}
