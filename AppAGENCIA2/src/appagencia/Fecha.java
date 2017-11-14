

package appagencia;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Fecha {
    private int dia, mes, anio;
    
    Fecha()
    {
        dia = 1; mes = 1; anio = 2000;
    }
    
    public Fecha(byte dia, byte mes, short anio)
    {
        this.dia = dia;        
        this.mes = mes;        
        this.anio = anio;
    }
    
    public Fecha(Scanner flujo) 
    {
        dia = flujo.nextByte();
        mes = flujo.nextByte();
        anio= flujo.nextShort();
    } 
   
    public String toString()
    {
        DecimalFormat fto= new DecimalFormat("00");
        return ""+fto.format(dia)+"/"+fto.format(mes)+"/"+fto.format(anio);    
    }
}
