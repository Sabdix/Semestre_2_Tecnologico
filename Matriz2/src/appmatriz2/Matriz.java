

package appmatriz2;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Matriz {
    public File archivo = new File("File.txt");
    public Scanner Teclado=new Scanner(archivo);
    private int arreglo[][];
    private int n;
    
    public Matriz (boolean desicion) throws FileNotFoundException
    {
        if (desicion)
        {
            //System.out.print("De la longitud del arreglo (el valor generara el numero de columnas y de filas) ");
            
            n=Teclado.nextInt();
            arreglo=new int [n] [n];
            
            for (int fila=0; fila < arreglo.length; fila++)
                for (int columna=0; columna < arreglo[fila].length; columna++)
                    arreglo[fila][columna] = Teclado.nextInt();
        }
    }
    
    public void transpuesta(Matriz M)
    {
        n=M.n;
        arreglo = new int[n][n];
        for (int fila=0; fila < n; fila++)
            for (int columna=0; columna < n; columna++)
            {
                arreglo[columna][fila]= M.arreglo[fila][columna];
            }
    }
    
    public void suma ()
    {
        int suma=0;
        for (int fila=0; fila < n; fila++)
                suma+=arreglo[fila][fila];
        System.out.println("\n\nLa Suma es "+suma+"\n");
    }
    
    public void ver ()
    {
        for (int fila=0; fila < n; fila++)
        {
            for (int columna=0; columna < n; columna++)
                System.out.print(arreglo[fila][columna]+" ");
            System.out.println();
        }
    }
}
