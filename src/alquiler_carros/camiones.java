package alquiler_carros;

public class camiones extends vehiculo{
	
	private int precio_fijo;

	public camiones(String placa, int peso, int dias_alquiler, int precio_base, int precio_fijo) 
	{
		super(placa, peso, dias_alquiler, precio_base);
		this.precio_fijo = precio_fijo = 120000;
		
	}

	@Override
	public int calc_precio_alquiler() {
		return precio_base + 120000; 
	}
	
	public String toString() {
		return "\n El vehiculo tiene las siguientes caracteristicas" +  
				" \n Placa= " + placa + " \n Peso=" + peso + " \n Dias de alquiler= " + dias_alquiler + 
				" \n Precio base= " + precio_base + " \n Precio total del alquiler= " + calc_precio_alquiler() + "$";
	}

}
