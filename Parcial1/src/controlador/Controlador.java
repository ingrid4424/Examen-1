package controlador;

import modelo.Modelo;
import processing.core.PApplet;

public class Controlador {
	private PApplet app;
	private Modelo model;
	
	public Controlador(PApplet app) {
		super();
		this.app = app;
		this.model = new Modelo(this.app);
	}

	public Modelo getModel() {
		return model;
	}

	public void setModel(Modelo model) {
		this.model = model;
	}
	
	
	
	
	
}
