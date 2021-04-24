package vista;

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
		size(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
	} 
	
	public void setup() {
		logic = new Modelo(this);
		System.out.println(logic.getDatos().size());
		
	}
	
	
	
	public void draw() {
		
	}
	
	public void keyPressed() {
		
	}

}
