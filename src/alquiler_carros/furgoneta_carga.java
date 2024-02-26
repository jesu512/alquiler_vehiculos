package alquiler_carros;

public class furgoneta_carga extends vehiculo{

	public furgoneta_carga(String placa, int peso, int dias_alquiler, int precio_base) 
	{
		super(placa, peso, dias_alquiler, precio_base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calc_precio_alquiler() {
		return precio_base * dias_alquiler + 80000 * peso; 
	}

	public String toString() {
		return "\n El vehiculo tiene las siguientes caracteristicas " + 
				" \n Placa= " + placa + " \n Peso=" + peso + " \n Dias de alquiler= " + dias_alquiler + 
				" \n Precio base= " + precio_base + " \n Precio total del alquiler= " + calc_precio_alquiler() + "$";
	}

}
