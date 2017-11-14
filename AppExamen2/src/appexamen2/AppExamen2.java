
package appexamen2;
import java.util.Scanner;

public class AppExamen2 {
    
    static void Inicializar (int arreglo[], int base)
    {
        int potencia=1;
        
        for (int contador=0; contador < arreglo.length; contador++)
        {
            arreglo[contador]=potencia;
            potencia *= base;
        }
    }
    static int Convertidor (int arreglo[], int numero)
    {
        int resultado=0, digito, potencia=0;
        while (numero > 0)
        {
            digito = numero % 10;
            resultado += digito * arreglo[potencia];
            numero /= 10;
            potencia++;
        }
        return resultado;
    }

    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int arreglo[]= new int [15], numero, base, nuevon;
        
        System.out.print("De el número ");
        numero = Teclado.nextInt();
        System.out.print("De la base ");
        base = Teclado.nextInt();
        
        Inicializar(arreglo,base);
        nuevon = Convertidor(arreglo,numero);
        System.out.println(nuevon);
    }
    
}
