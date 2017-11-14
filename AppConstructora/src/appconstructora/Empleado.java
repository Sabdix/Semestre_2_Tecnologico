
package appconstructora;
import java.util.Scanner;
import javax.swing.JTextArea;

public abstract class Empleado {
    private String nombre;
    private String actividad;
    private double bono;
    private double sueldo;
    
    Empleado(){}
    
    public void pedirDatos(Scanner flujo)
    {
        nombre = flujo.next();
        actividad = flujo.next();
    }
    public void ver(JTextArea areaSalida)
    {
        String salida = String.format("%20s%20s", nombre, actividad); 
        areaSalida.append(salida);
    }
    abstract double calcularBono();
    abstract double calcularSueldo();
    abstract void verF(JTextArea areaSalida);
    abstract double Descuento();
}
