package modelo;

import java.util.ArrayList;
import java.util.Iterator;

import processing.core.PApplet;

public class Modelo {
	
	private PApplet app;
	private String[] txt1;
	private String[] txt2;
	private ArrayList<Datos> datos;
	
	public Modelo(PApplet app) {
		super();
		this.app = app;
		txt1 = this.app.loadStrings("./../Parcial1/data/import/txt1");
		txt2 = this.app.loadStrings("./../Parcial1/data/import/txt2");
		datos = new ArrayList<>();
		for (int i=0; i< txt1.length; i++) {
			String [] infoProcesada = txt1[i].split(" ");			
			
			datos.add(new Datos(Integer.parseInt(infoProcesada[0]), infoProcesada[1], null, null, this.app, null));
			
		}
		
		for( int i=0; i<txt2.length; i++) {
			String [] infoProcesada = txt2[i].split(" ");
			for (int j= 0;j<  datos.size(); j++) {
				if(infoProcesada[0].equals (Integer.toString(datos.get(j).getID()) )) {
					datos.get(j).setFecha(infoProcesada[2]);
					datos.get(j).setRaza(infoProcesada[1]);
				}
			}
			
		}
	}

	public ArrayList<Datos> getDatos() {
		return datos;
	}

	public void setDatos(ArrayList<Datos> datos) {
		this.datos = datos;
	}
	
	
	
}
