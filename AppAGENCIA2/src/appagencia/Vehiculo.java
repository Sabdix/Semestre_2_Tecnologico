

package appagencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Vehiculo implements Transporte {
    private String marca, modelo;
    private Fecha fabricacion;	// composición
    private double costo;
    
    public Vehiculo() { }
    
    public Vehiculo(Scanner flujo) throws InputMismatchException
    {
        marca = flujo.next();        
        modelo = flujo.next();
        fabricacion = new Fecha(flujo);        
        costo = flujo.nextDouble();
    }
    
    public double devolverCosto() { return costo; }
    
    public double calcularPrecio()
    {
        double ganancia = costo*UTILIDAD;
        double precio = (costo+ganancia)*(1.0 + IVA);
        return precio;
    }
    
    public String toString()
    {
        return Util.formato(marca,ANCHO2)+Util.formato(modelo, ANCHO2)+
               Util.formato(fabricacion, ANCHO2)+Util.formato(costo, ANCHO3)+
               Util.formato(calcularPrecio(), ANCHO3);
    }

}
