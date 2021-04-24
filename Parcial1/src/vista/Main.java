package vista;

import java.util.Iterator;

import controlador.Controlador;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	Controlador control;
	
	public void settings() {
		
		size(1080, 720 );
		
	} 
	
	public void setup() {
		control = new Controlador(this);
		
	}
	
	
	
	public void draw() {
		background(255);
		fill(0);
		for(int i= 0; i< control.getModel().getDatos().size(); i++) {
			control.getModel().getDatos().get(i).pintar(100, (i*50)+100);
		}
	}
	
	public void keyPressed() {
		control.getModel().Comparaciones(key);
	}

}
