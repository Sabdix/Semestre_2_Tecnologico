package appagencia;

import java.util.Scanner;

public class Agencia implements Transporte {
    private String nombre;
    private Vehiculo vehiculos[] = new Vehiculo[5];

    public Agencia() {    }
    
    public Agencia(Scanner flujo)
    {
        nombre = flujo.next();
        for (int i = 0 ; flujo.hasNext(); i++)
        {
            String tipo = flujo.next();
            try 
            {
            	if (tipo.compareToIgnoreCase("A")==0)
                    vehiculos[i] = new Auto(flujo);
            	else
                    vehiculos[i] = new Camioneta(flujo);
            }
            catch (ArrayIndexOutOfBoundsException err)
            {
                System.out.println("\nError: Desbordamiento del arreglo de vehiculos "+err);
            } //….
    	}
    }
    
    public double calcularPrecio() { return costearInventario();  }
    
    public void informe()
    {
        System.out.println("\nAgencia automotriz "+nombre+"\n");        
        mostrarVehiculos();
        System.out.println("\n\nCosto total del inventario "+
        Util.formato(costearInventario(), ANCHO3));
    }
    
    public void informeA()
    {
        System.out.println("\nAutos\n");
        mostrarAutos();
        System.out.println("\n\nCosto total de los Autos "+
        Util.formato(costearInventarioA(), ANCHO3));
    }
    
    public void informeC()
    {
        System.out.println("\nCamionetas\n");
        mostrarCamionetas();
        System.out.println("\n\nCosto total de las Camionetas "+
        Util.formato(costearInventarioC(), ANCHO3));
    }
    
    public double costearInventarioC()
    {
        double costoTotal = 0.0;
        for (int i = 0 ; i < vehiculos.length; i++)
        {
            if (vehiculos[i] instanceof Camioneta)
            {
                costoTotal += vehiculos[i].devolverCosto();
            }
        }
        return costoTotal;
    }
    
    public double costearInventarioA()
    {
        double costoTotal = 0.0;
        for (int i = 0 ; i < vehiculos.length; i++)
        {
            if (vehiculos[i] instanceof Auto)
            {
                costoTotal += vehiculos[i].devolverCosto();
            }
        }
        return costoTotal;
    }
	
    public double costearInventario()
    {
        double costoTotal = 0.0;
        for (int i = 0 ; i < vehiculos.length; i++) costoTotal += vehiculos[i].devolverCosto();
        return costoTotal;
    }
    	
    public void mostrarVehiculos()
    {
        String tipo;	
        System.out.println("\nVehiculos\n");
	for (int i = 0 ; i < vehiculos.length; i++)
        {
            if (vehiculos[i] instanceof Auto)
                tipo = "Automovil";
            else 
                tipo = "Camioneta";
            System.out.println(Util.formato(tipo, ANCHO1)+vehiculos[i]);
        }
    }
    
    public void mostrarAutos()
    {
        String tipo = "Automovil";
        for(int i = 0; i < vehiculos.length; i++)
        {
            if (vehiculos[i] instanceof Auto)
                System.out.println(Util.formato(tipo, ANCHO1)+vehiculos[i]);
        }
    }
    
    public void mostrarCamionetas()
    {
        String tipo = "Camionetas";
        for(int i = 0; i < vehiculos.length; i++)
        {
            if (vehiculos[i] instanceof Camioneta)
                System.out.println(Util.formato(tipo, ANCHO1)+vehiculos[i]);
        }
    }
}


