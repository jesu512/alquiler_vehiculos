package alquiler_carros;
import java.util.ArrayList;
import java.util.Scanner;

//INTEGRANTES: ELI ALFONSO LORA PICON, JESUS MANUEL SALAZAR BRUZON

public class root_alquiler_carros {
	
	static int i=0;

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);
    	
		//var locales
		int opc, opcC, peso, dias_alquiler, precio_base = 100000, cupo_auto = 0, cupo_bus = 0, precio_fijo = 120000; 
		String placa, placa_u;
		
		//inicializacion subclases
    	autos as= null;
    	microbuses ms= null;
    	furgoneta_carga fca= null;
        camiones cs= null;
        
        ArrayList<autos> lista_as = new ArrayList();
        ArrayList<microbuses> lista_ms= new ArrayList();
        ArrayList<furgoneta_carga> lista_fca = new ArrayList();
        ArrayList<camiones> lista_cs = new ArrayList();  	
    	
    	do{
    	
    	System.out.println ("\n Seleccione" + "\n1. Agregar auto" +
    		"\n2. Agregar microbus" + "\n3. Agregar furgoneta de carga"
    				+ " \n4. Agregar camion"+ "\n5. Calcular precio del alquiler "
    					+ "\n6. Listar vehiculos "+ "\n7. Consultar vehiculo" 
    						+ "\n8. Salir");
    				opc=ent.nextInt();
    	
    		
    		switch(opc)
			{
    			case 1: 
    				System.out.println ("Ingrese la placa del auto");
    				placa = ent.next();
    				System.out.println ("Ingrese el peso del auto en toneladas");
    				peso = ent.nextInt();
    				System.out.println ("Ingrese los dias a alquilar el auto");
    				dias_alquiler = ent.nextInt();
    				System.out.println ("Ingrese el cupo del auto");
    				cupo_auto = ent.nextInt();
    				
    				as = new autos (placa, peso, dias_alquiler, precio_base, cupo_auto);
    				lista_as.add(as);
			    	break;
			    	
    			case 2:				    	
    				System.out.println ("Ingrese la placa del microbus");
    				placa = ent.next();
    				System.out.println ("Ingrese el peso del microbus en toneladas");
    				peso = ent.nextInt();
    				System.out.println ("Ingrese los dias a alquilar el microbus");
    				dias_alquiler = ent.nextInt();
    				System.out.println ("Ingrese el cupo del auto");
    				cupo_bus = ent.nextInt();
    				
    				ms = new microbuses (placa, peso, dias_alquiler, precio_base, cupo_bus);
    				lista_ms.add(ms);
			    	break;
			    	
    			case 3: 
    				System.out.println ("Ingrese la placa del furgoneta");
    				placa = ent.next();
    				System.out.println ("Ingrese el peso del furgoneta en toneladas");
    				peso = ent.nextInt();
    				System.out.println ("Ingrese los dias a alquilar la furgoneta");
    				dias_alquiler = ent.nextInt();
 
    				fca = new furgoneta_carga (placa, peso, dias_alquiler, precio_base);
    				lista_fca.add(fca);
			    	break;
			    	
    			case 4:
    				System.out.println ("Ingrese la placa del camion");
    				placa = ent.next();
    				System.out.println ("Ingrese el peso del camion en toneladas");
    				peso = ent.nextInt();
    				System.out.println ("Ingrese los dias a alquilar el camion");
    				dias_alquiler = ent.nextInt();
 
    				cs = new camiones (placa, peso, dias_alquiler, precio_base, precio_fijo);
    				lista_cs.add(cs);
			    	break;
			    	
			    	
			    	//for (cueta_corriente cc1: listacc)
                    //System.out.println(cc1.toString());
    			case 5: 
    				for (autos cl_as: lista_as)
    				{
    					System.out.println("El precio del alquiler para el auto con placa " + cl_as.placa + " es de " + cl_as.calc_precio_alquiler() + "$");
    				}
					
    				
    				for (microbuses cl_ms: lista_ms)
    				{
    					System.out.println("El precio del alquiler para el microbus con placa " + cl_ms.placa + " es de " + cl_ms.calc_precio_alquiler() + "$");
    				}
					
					
			    	
    				for (furgoneta_carga cl_fca: lista_fca)
    				{
    					System.out.println("El precio del alquiler parala fugroneta de carga con placa " + cl_fca.placa + " es de " + cl_fca.calc_precio_alquiler() + "$");
    				}
			    	
					for (camiones cl_cs: lista_cs)
					{
						System.out.println("El precio del alquiler para el camion con placa " + cl_cs.placa + " es de " + cl_cs.calc_precio_alquiler() + "$");
					}
			    	break;
			    	
    			case 6:				    	
    				System.out.println("¿Que tipo de vehiculo quieres ver?");
			    	System.out.println("1. Autos");
			    	System.out.println("2. Microbuses");
			    	System.out.println("3. Furgones de carga");
			    	System.out.println("4. Camiones");
			    	opcC=ent.nextInt();
 
			    	if (opcC == 1)
			    	{
			    		for (autos cl_as: lista_as)
	    				{
	    					System.out.println(cl_as.toString());
	    				}
			    	}
			    	
			    	else if (opcC == 2)
			    	{
			    		for (microbuses cl_ms: lista_ms)
				    	{	    			

			    			System.out.println(cl_ms.toString());
				    	}
			    	}
			    	
			    	else if (opcC == 3)
			    	{
			    		for (furgoneta_carga cl_fca: lista_fca)
				    	{
			    			System.out.println(cl_fca.toString());
				    	}
			    	}
			    	
			    	else if (opcC == 4)
			    	{
			    		for (camiones cl_cs: lista_cs)
				    	{
			    			System.out.println(cl_cs.toString());
				    	}
			    	}
			    	break;
			    	
    			case 7: 
    				System.out.println("¿Que tipo de vehiculo quieres buscar?");
			    	System.out.println("1. Autos");
			    	System.out.println("2. Microbuses");
			    	System.out.println("3. Furgones de carga");
			    	System.out.println("4. Camiones");
			    	opcC=ent.nextInt();
 
			    	if (opcC == 1)
			    	{
			    		for (autos cl_as: lista_as)
	    				{
			    			System.out.println("\n Escriba la placa a buscar");
			    			placa_u=ent.next();
			    			if (cl_as.getPlaca().equalsIgnoreCase(placa_u)) 
			    			{
			    				System.out.println(cl_as.toString());	
			    			} 
			    			else
			    			{
			    				System.out.println("No hay autos con esa placa");
			    			}
	    				}
			    	}
			    	
			    	else if (opcC == 2)
			    	{
			    		for (microbuses cl_ms: lista_ms)
				    	{	    			
			    			System.out.println("\n Escriba la placa a buscar");
			    			placa_u=ent.next();
			    			if (cl_ms.getPlaca().equalsIgnoreCase(placa_u)) 
			    			{
			    				System.out.println(cl_ms.toString());	
			    			}
			    			else
			    			{
			    				System.out.println("No hay microbuses con esa placa");
			    			}
				    	}
			    	}
			    	
			    	else if (opcC == 3)
			    	{
			    		for (furgoneta_carga cl_fca: lista_fca)
				    	{
			    			System.out.println("\n Escriba la placa a buscar");
			    			placa_u=ent.next();
			    			if (cl_fca.getPlaca().equalsIgnoreCase(placa_u)) 
			    			{
			    				System.out.println(cl_fca.toString());
			    			}		
			    			else
			    			{
			    				System.out.println("No hay furgoneta con esa placa");
			    			}
				    	}
			    	}
			    	
			    	else if (opcC == 4)
			    	{
			    		for (camiones cl_cs: lista_cs)
				    	{
			    			System.out.println("\n Escriba la placa a buscar");
			    			placa_u=ent.next();
			    			if (cl_cs.getPlaca().equalsIgnoreCase(placa_u)) 
			    			{
			    				System.out.println(cl_cs.toString());	
			    			}
			    			else
			    			{
			    				System.out.println("No hay camion con esa placa");
			    			}
				    	}
			    	}
			    	break;			    	
			}

    	}while(opc!=8);

    }
}
