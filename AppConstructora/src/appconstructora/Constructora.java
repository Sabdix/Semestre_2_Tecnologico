
package appconstructora;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTextArea;


public class Constructora {
    private ArrayList <Empleado> Empleados = new ArrayList <Empleado>(); //Composicion
    
    private void verBase(JTextArea areaSalida)
    {
        String salida = "\nTrabajadores de Base\n";
        salida += String.format("%20s%20s%20s%20s%20s%20s\n", "Nombre", "Puesto", "Faltas", "Sueldo Base", "Bono", "Sueldo");
        areaSalida.append(salida);
        double sumaBonos = 0, sumaSueldos= 0.0;
        for (Empleado i : Empleados)
        {
            if (i instanceof EmpleadoBase)
            {
               i.ver(areaSalida);
               sumaBonos += i.calcularBono();
               sumaSueldos += i.calcularSueldo();
            }
        }
        salida = String.format("%105s%20.1f%20.1f\n", "Totales:", sumaBonos, sumaSueldos);
        areaSalida.append(salida);
    }
    
    private void verEventual(JTextArea areaSalida)
    {
        String salida = "\nTrabajadores Eventuales\n";
        salida += String.format("%20s%20s%20s%20s%20s%20s\n", "Nombre", "Oficio", "Horas Trab", "$/hora", "Bono", "Sueldo");
        areaSalida.append(salida);
        double sumaBonos = 0, sumaSueldos= 0.0;
        for (Empleado i : Empleados)
        {
            if (i instanceof EmpleadoEventual)
            {
               i.ver(areaSalida);
               sumaBonos += i.calcularBono();
               sumaSueldos += i.calcularSueldo();
            }
        }
        salida = String.format("%100s%20.2f%20.2f\n", "Totales:", sumaBonos, sumaSueldos);
        areaSalida.append(salida);
    }
    
    private void verTotal(JTextArea areaSalida)
    {
        double sumaBonos = 0, sumaSueldos= 0.0;
        for (Empleado i : Empleados)
        {
            sumaBonos += i.calcularBono();
            sumaSueldos += i.calcularSueldo();
        }
        String salida = String.format("\n%100s%20.1f%20.1f\n", "Gran Total:", sumaBonos, sumaSueldos);
        areaSalida.append(salida);
    }
    
    Constructora(Scanner flujo, Scanner flujo2)
    {
        for (int i = 0; flujo2.hasNext(); i++)
        {
            String tipo = flujo2.next();
            if (tipo.compareToIgnoreCase("E") == 0)
                Empleados.add(new EmpleadoEventual());
            else
                Empleados.add(new EmpleadoBase());
        }
        for (Empleado i : Empleados)
        {
            i.pedirDatos(flujo);
        }
    }
    
    public void ver(JTextArea areaSalida)
    {
        String salida = "\nNomina semanal de la Constructora Siglo XXI\n";
        areaSalida.append(salida);
        this.verBase(areaSalida);
        verEventual(areaSalida);
        verTotal(areaSalida);
        percepcionMayor(areaSalida);
    }
    
    public void percepcionMayor(JTextArea areaSalida)
    {
        double sueldoMayor = 0.0;
        for (Empleado i : Empleados)
            if (i.calcularSueldo() > sueldoMayor)
                sueldoMayor = i.calcularSueldo();
        String salida = "\nLa perceocion mas alta la tienen los empleados: \n";
        areaSalida.append(salida);
        for (Empleado i : Empleados)
            if (i.calcularSueldo() == sueldoMayor)
                i.ver(areaSalida);
    }
    
    public void verFaltantes(JTextArea areaSalida)
    {
        String salida = "\nTrabajadores que Faltaron :(\n";
        salida += String.format("%20s%20s%20s%20s\n", "Nombre", "Puesto", "Faltas", "Descuento");
        areaSalida.append(salida);
        double sumaDescuentos = 0.0;
        for (Empleado i : Empleados)
        {
            if (i instanceof EmpleadoBase)
            {
               i.verF(areaSalida);
               sumaDescuentos += i.Descuento();
            }
        }
        salida = String.format("%105s%20.1f\n", "Total Descuento:", sumaDescuentos);
        areaSalida.append(salida);
    }
}
