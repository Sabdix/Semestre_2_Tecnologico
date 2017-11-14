

package appagencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AppAGENCIA {

    
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File ("AgenciaHer.txt");
       	Scanner flujo = new Scanner(archivo);
        Agencia obj = new Agencia(flujo);
       	obj.informe();
        obj.informeA();
        obj.informeC();

    }
    
}
