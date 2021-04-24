package modelo;

import processing.core.PApplet;
import processing.core.PImage;

public class Datos implements Comparable<Datos>{

	private int ID;
	private String nombre;
	private String fecha;
	private String raza;
	private PApplet app;
	private PImage img;
	private int x;
	private int y;
	
	
	
	public Datos(int iD, String nombre, String fecha, String raza, PApplet app, PImage img) {
		super();
		this.ID = iD;
		this.nombre = nombre;
		this.fecha = fecha;
		this.raza = raza;
		this.app = app;
		this.img = img;
	}

	public void pintar(int x, int y) {
		this.x = x;
		this.y = y;
		this.app.text(this.ID, x+50, y);
		this.app.text(this.nombre, x+125, y);
		if(this.raza!= null & this.fecha!=null) {
			this.app.text(this.raza, x+200, y);
			this.app.text(this.fecha, x+300, y);
		}
		
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

	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
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
