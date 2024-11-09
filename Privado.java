package bondiJet;

public class Privado extends Vuelo {
	private int dniComprador;
	private int [] acompaniantes;
	private int tripulantes;
	private double precio;
	private int cantidadJets;
	public Privado(int dniComprador , int [] acompaniantes, int tripulantes, double precio, int cantidadJets, String identificacion, Aeropuerto aeropuertoSalida, Aeropuerto  aeropuertoDestino, String fecha ) {
	super(identificacion,  aeropuertoSalida,  aeropuertoDestino, fecha);
		this.dniComprador= dniComprador;
		this.acompaniantes= acompaniantes;
		this.tripulantes=tripulantes;
		this.precio=precio;
		this.cantidadJets= cantidadJets;
	}
	
	@Override
	public String generarCodigoVuelo(int tamañoDeHashMapVuelos) {
    	StringBuilder codigoVuelo = new StringBuilder();
    	codigoVuelo.append(super.generarCodigoVuelo(tamañoDeHashMapVuelos)).append("-PRI");
    	String resultado = codigoVuelo.toString();
    	return resultado;
    	}
	
	public  int calcularJetsNecesarios(int [] acompaniantes) {
    	int capacidad =15;
    	int cantidadAcompaniantes = acompaniantes.length; // el +1 es para contar al comprador del pasaje
    	int seNecesita=(int) Math.ceil((double) cantidadAcompaniantes+1 / capacidad);
        return seNecesita;
    }
	public double calcularPrecioFinal (int cantidadJetsNecesarios) {
		double precioJets = this.precio;
		double total= (precioJets*cantidadJetsNecesarios);
		return total * 0.30; //agregamos el %30 de impuertos
	}


	    
	    public int getCantidadJets() {
	        return cantidadJets;
	    }

	    public double getPrecio() {
	        return precio;
	    }
	    @Override
	    public String verDatos() {
	    	return super.verDatos() + toString();
	    }
	    @Override
	    public String toString() {
	    	return "Dni comprador:" + this.dniComprador + ",Pasajeros acompañantes:" +  this.acompaniantes +  ", precio vuelo" + this.precio + ", cantidad jets necesarios:" +  this.cantidadJets;
	    }
}

	    
	



