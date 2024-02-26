package alquiler_carros;

public class microbuses extends vehiculo{

	private int cupo_bus;
	
	public microbuses(String placa, int peso, int dias_alquiler, int precio_base, int cupo_bus) 
	{
		super(placa, peso, dias_alquiler, precio_base);
		this.cupo_bus = cupo_bus;
	}

	@Override
	public int calc_precio_alquiler() {
		return precio_base * dias_alquiler + (8000 * cupo_bus); 
	}
	
	public String toString() {
		return "\n El vehiculo tiene las siguientes caracteristicas \n Cupo del auto= " + cupo_bus + 
				" \n Placa= " + placa + " \n Peso=" + peso + " \n Dias de alquiler= " + dias_alquiler + 
				" \n Precio base= " + precio_base + " \n Precio total del alquiler= " + calc_precio_alquiler() + "$";
	}
}
