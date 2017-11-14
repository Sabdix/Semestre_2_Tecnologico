

package appagencia;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Auto {
    private String Marca; //Marca del Carro
    private String Modelo; //Modelos del Carro
    private double CU; //Costo Unitario del Carro
    private int Existencia; //Cantidad de carros en el garage
    
    public Auto(Scanner Teclado) throws IOException //Constructor
    {
        Marca = Teclado.next();//JOptionPane.showInputDialog("De la Marca del Carro");
        Modelo = Teclado.next();//JOptionPane.showInputDialog("De el Modelo del Automóvil");
        CU = Teclado.nextDouble();//Integer.parseInt(JOptionPane.showInputDialog("De el costo unitario de este vehiculo"));
        Existencia = Teclado.nextInt();//Integer.parseInt(JOptionPane.showInputDialog("De la cantidad coches de este tipo que hay en el garage"));
    }
    
    public double CostoT() //Costo Total
    {
        return CU * Existencia;
    }
    
    public String DarMarca()
    {
        return Marca;
    }
    
    public String DarModelo()
    {
        return Modelo;
    }
    
    public double DarCosto()
    {
        return CU;
    }
    
    public int DarEx()
    {
        return Existencia;
    }
    
    public void Modificar()
    {
        CU = CU - (CU * 0.05d);
    }
}
