

package appplantillas;

import javax.swing.JOptionPane;


public class AppPlantillas {

    
    public static void main(String[] args) {
        Fabricante cablesMexico = new Fabricante();
	cablesMexico.leer();    //Se lee un objeto de tipo Fabricante
 	
        /*Se crea a continuación un objeto de tipo Producto, reemplazando el tipo T por un objeto de tipo Fabricante.*/
	
        /*Producto <String> cableTel= new Producto <String>(1050,"Cable telefonico", 100, "cablesMexico");
	cableTel.imprime();*/
	
        Producto <String> Arreglo[] = new Producto[Integer.parseInt(JOptionPane.showInputDialog("De la cantidad de productos a colocar"))];
        
        for (int i = 0; i < Arreglo.length; i++)
        {
             Arreglo[i] = new Producto (1050,"Cable telefonico", 100, "cablesMexico");
             Arreglo[i].imprime();
        }
    }
    
}
