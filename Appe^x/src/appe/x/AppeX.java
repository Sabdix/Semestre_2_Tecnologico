
package appe.x;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AppeX {

    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        double x, contador=1;
        double e=1, aprox, Factorial= 1;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("De el valor de x"));
        aprox = Double.parseDouble(JOptionPane.showInputDialog("De el valor de aproximación"));
        
        do
        {
            Factorial *=contador;
            e+= (Math.pow(x, contador))/Factorial;
            contador++;
        } while (Math.pow(x,contador)/Factorial > aprox);
        
        System.out.println(e);
        
        
    }
    
}
