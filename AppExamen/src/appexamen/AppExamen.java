

package appexamen;
import java.util.Scanner;

public class AppExamen {
    
    static long Convertidor (int numero, int base)
    {
        long resultado= 0l, digito, potencia= 1l;
        while (numero > 0)
        {
            digito = numero % 10;
            resultado += digito * potencia;
            numero /= 10;
            potencia *= base;
        }
        return resultado;
    }
    
    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        int numero, base;
        System.out.print("De el numero ");
        numero= Teclado.nextInt();
        System.out.print("De la base ");
        base=Teclado.nextInt();
        
        System.out.println(Convertidor(numero, base));
        
        
        
        
        
        
    }
    
}
