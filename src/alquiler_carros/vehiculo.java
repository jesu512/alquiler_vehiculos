package alquiler_carros;
import java.util.Scanner;
//INTEGRANTES: ELI ALFONSO LORA PICON, JESUS MANUEL SALAZAR BRUZON

public abstract class vehiculo 
{
	Scanner lea= new Scanner(System.in);
	
	protected String placa;
	protected int peso, dias_alquiler, precio_base;
		
	public vehiculo (String placa, int peso, int dias_alquiler, int precio_base)
	{
		this.placa = placa;
		this.peso = peso;
		this.dias_alquiler = dias_alquiler;
		this.precio_base = precio_base = 100000;
	}
	
	public abstract int calc_precio_alquiler ();

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getDias_alquiler() {
		return dias_alquiler;
	}

	public void setDias_alquiler(int dias_alquiler) {
		this.dias_alquiler = dias_alquiler;
	}

	public int getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(int precio_base) {
		this.precio_base = precio_base;
	}

	@Override
	public String toString() {
		return "vehiculo [placa=" + placa + ", peso=" + peso + ", dias_alquiler=" + dias_alquiler + ", precio_base="
				+ precio_base + "]";
	}
	
	
	
}

