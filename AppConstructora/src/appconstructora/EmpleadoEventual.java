

package appconstructora;

import java.util.Scanner;
import javax.swing.JTextArea;


public class EmpleadoEventual extends Empleado{
    private int horas; //Especializacion
    private double pagoHora;
    
    EmpleadoEventual(){}
    
    public void pedirDatos(Scanner flujo)
    {
        super.pedirDatos(flujo);
        horas = flujo.nextInt();
        pagoHora = flujo.nextDouble();
    }
    
    public void ver(JTextArea areaSalida)
    {
        super.ver(areaSalida);
        String salida = String.format("%20d%25.1f%25.1f%20.1f", horas, pagoHora, calcularBono(), this.calcularSueldo());
        areaSalida.append(salida + "\n");
    }
    
    public double calcularBono()
    {
        if (horas > 35)
            return (horas -35) * pagoHora;
        else
            return 0.0;
    }
    
    public double calcularSueldo()
    {
        return horas * pagoHora + calcularBono();
    }
    
    public void verF(JTextArea areaSalida){}
    
    public double Descuento (){return 0;}
}
