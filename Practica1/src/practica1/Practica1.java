

package practica1;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Practica1 {
    
     static long Octal(int n)
     {         
         long p=1l, nb = 0l;         
         int d = 0;         
         do         
         {             
             d = n%8;             
             n >>= 3;             
             nb += d*p;             
             p *= 10l;                 
         } while (n>0);         
         return nb;     
     } 

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in); //Crea el objeto Teclado
        int nd, ndF; //Crea variables: nd= numero decimal, ndF= numero decimal final.
        long no; //Crea variavble nb= numero binario
        
        String Entrada = JOptionPane.showInputDialog("Introduce el número límite");
        ndF= Integer.parseInt(Entrada);
        
        System.out.print("Decimal \tOctal ");
        
        String Entrada2 = JOptionPane.showInputDialog("Introduce el número con que quieres Iniciar");
        
        for (nd= Integer.parseInt(Entrada2); nd <= ndF; nd++) //Pide el valor de donde vamos a partir a contar y ademas cicla
        {
            no=Octal(nd);
            System.out.println("\n"+nd+"\t\t"+no);
        }
    }
    
}
