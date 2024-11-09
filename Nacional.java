package bondiJet;

import java.util.HashMap;

public class Nacional extends Publico {
	private double refrigerio;
	
	public Nacional (double refrigerio, String identificacion, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoDestino, String fecha, int [] cantidadAsientos, int cantidadTripulantes, double[] precio) {
	super( identificacion,  aeropuertoSalida,  aeropuertoDestino,  fecha,  cantidadAsientos,  cantidadTripulantes, precio);
	this.refrigerio= refrigerio;
}
	@Override
	public double valorPasaje(int seccionAsiento) {
		double costo= (super.valorPasaje(seccionAsiento)+this.refrigerio) * 0.20; //agregamos el %20 de impuertos
    	return costo;
    }
	
	public boolean elVueloEsNacional(HashMap<String, Aeropuerto> aeropuertos,String origen, String destino,int []cantAsientos, double [] precios) {
		if (aeropuertos.get(destino).getPais().equals("Argentina") && aeropuertos.get(origen).getPais().equals("Argentina")) {
			if (aeropuertos.get(destino).getPais().equals("Argentina") && aeropuertos.get(origen).getPais().equals("Argentina")) {
				if (cantAsientos.length == 2 && precios.length == 2 ) {
					return true;
				}
			}		
	}
		return false;
	}
	 @Override
	    public String verDatos() {
	    	return super.verDatos() + ", valor refrigerio:"+this.refrigerio;
	    }
	    
}