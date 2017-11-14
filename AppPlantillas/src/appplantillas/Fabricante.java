

package appplantillas;

import java.util.Scanner;


public class Fabricante {
    private Scanner stdin = new Scanner(System.in);
    private String  nombre, domicilio, telefono;
    
    public Fabricante() { }
    
    public Fabricante(String nombre, String domicilio, String telefono) 
    {  
	this.nombre = nombre;    
        this.domicilio = domicilio;    
        this.telefono = telefono;
    }
    
    public void cambiaDomic(String domicilio)
    {    
        this.domicilio= domicilio;   
    }
    
    public void cambiaTelef(String telefono)
    {        
        this.telefono = telefono;    
    }
    
    public void leer() 
    {
	System.out.println("\nIngrese nombre del fabricante:  "); 
        nombre = stdin.next();
	System.out.println("\nIngrese domicilio del fabricante:  ");	
        domicilio = stdin.next();
	System.out.println("\nIngrese telefono del fabricante:  ");	
        telefono = stdin.next();
    }
    
    public String toString() 
    {
        String regresa = new String("\nDatos del fabricante  ");
	regresa+=("\nNombre:  "+nombre);	
        regresa+=("\nDomicilio:  "+domicilio);
	regresa+=("\nTelefono:  "+telefono);        
        return regresa;
    } 
}
