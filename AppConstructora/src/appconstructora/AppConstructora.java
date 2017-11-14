

package appconstructora;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class AppConstructora {

    
    public static void main(String[] args) throws FileNotFoundException {
       JOptionPane.showMessageDialog(null, "Lectura de datos desde el archivo: datos.txt");
       File archivo = new File("datos.txt");
       File archivo2 = new File("tipos.txt");
       Scanner flujo2 = new Scanner(archivo2);
       Scanner flujo = new Scanner(archivo);
       JTextArea areaSalida = new JTextArea(25, 50);
       JScrollPane areaScroll = new JScrollPane(areaSalida);
       Constructora objeto = new Constructora(flujo, flujo2);
       objeto.ver(areaSalida);
       objeto.verFaltantes(areaSalida);
       JOptionPane.showMessageDialog(null,areaScroll,"Resultados", JOptionPane.INFORMATION_MESSAGE);   
    }
    
}
