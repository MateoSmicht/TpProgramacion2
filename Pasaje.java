package bondiJet;



public class Pasaje {
	private int asientoAsignado;
    private Vuelo vueloAsignado;
    private Cliente cliente;
    private int seccionAsiento; // Representa la sección del asiento (ej. 0 para Turista, 1 para Ejecutiva)

    // Constructor
    public Pasaje(int asientoAsignado, Vuelo vueloAsignado, Cliente cliente) {
        this.asientoAsignado = asientoAsignado;
        this.vueloAsignado = vueloAsignado;
        this.cliente = cliente;
        this.seccionAsiento = 0; // Inicialización predeterminada, si es necesario ajustarlo se puede modificar
    }

    public Pasaje(int asientoAsignado, Vuelo vueloAsignado, Cliente cliente, int seccionAsiento) {
        this.asientoAsignado = asientoAsignado;
        this.vueloAsignado = vueloAsignado;
        this.cliente = cliente;
        this.seccionAsiento = seccionAsiento;
    }

    // Getters
    public Cliente getCliente() {
        return cliente;
    }

    public int getAsientoAsignado() {
        return asientoAsignado;
    }

    public Vuelo getVueloAsignado() {
        return vueloAsignado;
    }

    public int getSeccionASiento() {
        return seccionAsiento;
    }
    
    public String verDatos() { 
    	StringBuilder datos = new StringBuilder();
    	datos.append("Pasaje:\n");
    	datos.append("Asiento Asignado: ").append(asientoAsignado).append("\n");
    	datos.append("Código de Vuelo: ").append(getVueloAsignado()).append("\n");
    	datos.append("DNI Cliente: ").append(cliente.getDni()).append("\n");
    	return datos.toString(); }
    
  
}