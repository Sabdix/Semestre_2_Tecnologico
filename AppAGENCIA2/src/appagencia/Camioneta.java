
package appagencia;

import java.util.Scanner;

public class Camioneta extends Vehiculo implements Transporte {
    private short carga;
    
    public Camioneta() {    }
    
    public Camioneta(Scanner flujo)
    {
        super(flujo);
        carga = flujo.nextShort();
    }
    
    public String toString()
    {
        return super.toString()+Util.formato(carga, ANCHO1);
    }

}
