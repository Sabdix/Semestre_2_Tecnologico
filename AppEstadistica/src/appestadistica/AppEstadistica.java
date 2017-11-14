

package appestadistica;
import java.util.Scanner;

public class AppEstadistica {
    static Scanner Teclado=new Scanner(System.in);
    
    static void Inicializar (int arreglo[])
    {
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            System.out.print("De el valor a guardar ");
            arreglo[contador]=Teclado.nextInt();
        }
    }
    
    static void Ordenar(int arreglo[])
    {
        int aux;
        boolean cambios;
        
        while (true)
        {
            cambios = false;
            for(int i = 1; i < arreglo.length; i++)
            {
                if(arreglo[i] < arreglo[i-1])
                {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[i-1];
                    arreglo[i-1] = aux;
                    cambios = true;
                }
            }
            if (cambios == false)
            {
                break;
            }
        }
    }
    
    static void Media (int arreglo[])
    {
        int suma=0;
        
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            suma += arreglo[contador];
        }
        System.out.println("\nMedia= "+(suma/arreglo.length));
    }
    
    static void Mediana (int arreglo[])
    {
        int promedio;
        if (arreglo.length % 2 == 0)
        {
            promedio=(arreglo[arreglo.length/2]+arreglo[(arreglo.length/2)-1])/2;
            System.out.println("\nMediana = "+promedio);
        } else
            System.out.println("\nMediana = "+arreglo[arreglo.length/2]);
    }
    
    static void Moda (int arreglo[])
    {
        int Max=0, moda=0;
        
        for(int numero=0; numero < arreglo.length; numero++)
        {
            int Repeticion=0;
            
            for (int numero2=0; numero2 < arreglo.length; numero2++)
            {
                if (arreglo[numero] == arreglo[numero2])
                    Repeticion++;
            }
            if (Repeticion > Max)
            {
                moda = arreglo[numero];
                Max = Repeticion;
            }
        }
        System.out.println("\nModa = "+moda);
    }
    
    public static void main(String[] args) {
        int arreglo[], longitud;
        
        System.out.print("De la cantidad de números que colocará ");
        longitud=Teclado.nextInt();
        arreglo= new int [longitud];
        
        Inicializar(arreglo);
        
        Ordenar(arreglo);
        
        Media(arreglo);
        
        Mediana(arreglo);
        
        Moda(arreglo);
    }
    
}
