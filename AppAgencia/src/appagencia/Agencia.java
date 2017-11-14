

package appagencia;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Agencia {
    private String Nombre = "AGENCIA VOCHITO"; //Nombre de la Agencia
    private Auto Garage[]; //Garage
    
    public Agencia() throws IOException //Constructor
    {
        File Archivo = new File("Documento.txt");
        Scanner Teclado = new Scanner(Archivo);
        Garage = new Auto[Teclado.nextInt()];
        
        for (int creador=0; creador < Garage.length; creador++)
            Garage[creador] = new Auto(Teclado);
    }
    
    public void InventarioT ()
    {
        int Total=0;
        for (int indice=0; indice < Garage.length; indice++)
            Total += Garage[indice].CostoT();
        System.out.println("\n\nCosto Total enInventario: $"+Total);
    }
    
    public void Ver()
    {
        System.out.println("-----------------------------------------------"+Nombre+"-----------------------------------------------");
        System.out.printf("%-25s%-25s%-25s%-25s%-25s%n", "Marca", "Modelo", "Costo Unitario", "Existencia", "Costo Total");
        
        for (int imprimir=0; imprimir < Garage.length; imprimir++)
        {
            System.out.printf("%-25s%-25s", Garage[imprimir].DarMarca(), Garage[imprimir].DarModelo());
            System.out.printf("$%-25f%-25d$%-25f%n", Garage[imprimir].DarCosto(), Garage[imprimir].DarEx(), Garage[imprimir].CostoT());
        }
        
    }
    
    public void Caro()
    {
        double mayor = 0d;
        String Carro="Null";
        for (int carro=0; carro < Garage.length; carro++)
            if (Garage[carro].DarCosto() > mayor)
            {
                mayor = Garage[carro].DarCosto();
                Carro = Garage[carro].DarMarca();
            }
        System.out.printf("\nEl Carro más caro es %s con un precio de $%f%n", Carro, mayor);
    }
    
    public void VerificarBMW()
    {
        for (int carro=0; carro < Garage.length; carro++)
        {
            if (Garage[carro].DarMarca().equals("BMW") == true )
            {
                Garage[carro].Modificar();
            }
        }
    }
    
}
