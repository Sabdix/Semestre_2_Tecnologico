

package appincersionordenada;
import java.util.Scanner;

public class AppIncersionOrdenada {
    
    
    
    

    
    public static void main(String[] args) {
       Scanner Teclado = new Scanner(System.in);
       
       int arreglo[];
       int elementos=0, numero=0, bandera=0;
       
       System.out.print("De la cantidad de elementos que va a introducir ");
       elementos = Teclado.nextInt();
       arreglo= new int [20];
       
       System.out.print("De el numero que desea introducir ");
       numero=Teclado.nextInt();
       
       arreglo[0]=numero;
       
       for(int cantidad=1; cantidad < elementos; cantidad++)
       {
           System.out.print("De el numero que desea introducir ");
           numero=Teclado.nextInt();
           
           bandera=0;
           for (int comprobar=0; comprobar <= cantidad; comprobar++)
           {
               if (arreglo[comprobar] > numero)
               {
                   bandera=1;
                   for (int cambio=cantidad; cambio > comprobar; cambio--)
                   {
                       arreglo[cambio]= arreglo[cambio-1];
                   }
                   arreglo[comprobar]=numero;
                   break;
               }
           }
           if (bandera == 0)
               arreglo[cantidad]=numero;
       }
       
        for (int impr=0; impr < arreglo.length; impr++)
            System.out.print("\t"+arreglo[impr]);
           
          
       
       
          
       
       
       
       
    }
    
}
