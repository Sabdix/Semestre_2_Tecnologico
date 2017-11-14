
package appconstructora;

import java.util.Scanner;
import javax.swing.JTextArea;


public class EmpleadoBase extends Empleado {
    private int faltas; //Especializacion
    private double sueldoBase;
    private double Descuento;
    
    EmpleadoBase(){}
    
    public void pedirDatos(Scanner flujo)
    {
        super.pedirDatos(flujo);
        faltas = flujo.nextInt();
        sueldoBase = flujo.nextDouble();
    }
    
    public void ver(JTextArea areaSalida)
    {
        super.ver(areaSalida);
        String salida = String.format("%22d%25.1f%25.1f%24.1f", faltas, sueldoBase, calcularBono(), this.calcularSueldo());
        areaSalida.append(salida + "\n");
        
    }
    public double calcularBono()
    {
        if (faltas == 0)
            return 200.0;
        else
            return 0.0d;
    }
    public double calcularSueldo()
    {
        Descuento = (sueldoBase / 6) * faltas;
        return sueldoBase - Descuento + calcularBono();
    }
    
    public void verF(JTextArea areaSalida)
    {
        if (faltas > 0)
        {
            super.ver(areaSalida);
            String salida = String.format("%22d%25.1f", faltas, (sueldoBase / 6) * faltas);
            areaSalida.append(salida + "\n");
        }
    }
    
    public double Descuento ()
    {
        return Descuento;
    }
}
