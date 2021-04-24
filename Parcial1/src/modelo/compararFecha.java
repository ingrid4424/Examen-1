package modelo;

import java.util.Comparator;

public class compararFecha implements Comparator<Datos>{

	@Override
	public int compare(Datos o1, Datos o2) {
		// TODO Auto-generated method stub
		return o1.getFecha().compareTo(o2.getFecha());
	}

}
