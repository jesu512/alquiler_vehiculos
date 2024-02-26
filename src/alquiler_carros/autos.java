package alquiler_carros;

public class autos extends vehiculo{
	
	private int cupo_auto;

	public autos(String placa, int peso, int dias_alquiler, int precio_base, int cupo_auto) 
	{
		super(placa, peso, dias_alquiler, precio_base);
		this.cupo_auto = cupo_auto;

		
	}

	@Override
	public int calc_precio_alquiler() {
		return precio_base * dias_alquiler + (4300 * cupo_auto) + (4300 * dias_alquiler); 
		 
	}

	@Override
	public String toString() {
		return "\n El vehiculo tiene las siguientes caracteristicas \n Cupo del auto= " + cupo_auto + 
				" \n Placa= " + placa + " \n Peso=" + peso + " \n Dias de alquiler= " + dias_alquiler + 
				" \n Precio base= " + precio_base + " \n Precio total del alquiler= " + calc_precio_alquiler() + "$";
	}
	
	

}
