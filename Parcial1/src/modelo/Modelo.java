package modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import processing.core.PApplet;

public class Modelo {

	private PApplet app;
	private String[] txt1;
	private String[] txt2;
	private ArrayList<Datos> datos;
	private CompararFecha compFecha;
	private CompararNombre compNombre;
	private CompararRaza compRaza;

	public Modelo(PApplet app) {
		super();
		this.app = app;
		txt1 = this.app.loadStrings("./../Parcial1/data/import/txt1");
		txt2 = this.app.loadStrings("./../Parcial1/data/import/txt2");
		datos = new ArrayList<>();
		compFecha = new CompararFecha();
		compNombre = new CompararNombre();
		compRaza = new CompararRaza();
		for (int i = 0; i < txt1.length; i++) {
			String[] infoProcesada = txt1[i].split(" ");

			datos.add(new Datos(Integer.parseInt(infoProcesada[0]), infoProcesada[1], null, null, this.app));

		}

		for (int i = 0; i < txt2.length; i++) {
			String[] infoProcesada = txt2[i].split(" ");
			for (int j = 0; j < datos.size(); j++) {
				if (infoProcesada[0].equals(Integer.toString(datos.get(j).getID()))) {
					datos.get(j).setFecha(infoProcesada[2]);
					datos.get(j).setRaza(infoProcesada[1]);
				}
			}

		}
	}

	public void Comparaciones(char key) {
		switch (key) {
		case 'a':
			// ordenamiento natural
			Collections.sort(datos);
			
			saveTxt("ID");
			break;
		case 's':
			// ordenamiento parcial por nombre
			Collections.sort(datos, compNombre);
			
			saveTxt("Nombre");
			break;
		case 'd':
			// ordenamiento parcial por raza
			Collections.sort(datos, compRaza);
			
			saveTxt("Raza");
			break;
		case 'f':

			// ordenamiento parcial por raza
			Collections.sort(datos, compFecha);
			
			saveTxt("Fecha");
			break;

		default:
			break;
		}
	}
	
	public void saveTxt( String name) {
		String nametxt = name;
		String [] guardarTxt = new String[5];
		for(int i=0; i<datos.size(); i++) {
			
			guardarTxt[i] = datos.get(i).getNombre().toLowerCase() + "," + datos.get(i).getID() + "," + datos.get(i).getRaza().toLowerCase() + "," + datos.get(i).getFecha();
			
			if(i==datos.size()-1) {
				this.app.saveStrings("./data/export/save"+nametxt+".txt", guardarTxt);
				System.out.println("funciono");
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
