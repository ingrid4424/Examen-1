package vista;

import java.util.Iterator;

import modelo.Modelo;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	Modelo logic;
	
	public void settings() {
		//cuanto es el tamaño?
		size(1080, 720 );
		
	} 
	
	public void setup() {
		logic = new Modelo(this);
		System.out.println(logic.getDatos().size());
		
	}
	
	
	
	public void draw() {
		background(255);
		fill(0);
		for(int i= 0; i< logic.getDatos().size(); i++) {
			logic.getDatos().get(i).pintar(100, (i*50)+100);
		}
	}
	
	public void keyPressed() {
		
	}

}
