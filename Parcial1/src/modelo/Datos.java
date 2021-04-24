package modelo;

import processing.core.PApplet;
import processing.core.PImage;

public class Datos implements Comparable<Datos>{

	private int ID;
	private String nombre;
	private int fecha;
	private String raza;
	private PApplet app;
	private PImage img;
	
	
	
	
	public Datos(int iD, String nombre, int fecha, String raza, PApplet app, PImage img) {
		super();
		this.ID = iD;
		this.nombre = nombre;
		this.fecha = fecha;
		this.raza = raza;
		this.app = app;
		this.img = img;
	}

	



	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFecha() {
		return fecha;
	}


	public void setFecha(int fecha) {
		this.fecha = fecha;
	}



	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}




	@Override
	public int compareTo(Datos o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
