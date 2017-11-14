

package appinforme;
import java.util.Scanner;


public class Empleados {
    private int Matriz[][];
    public Scanner Teclado = new Scanner (System.in);
    
    public void Inicializar ()
    {
        System.out.print("De la cantidad de empleados que son ");
        int n=Teclado.nextInt();
        Matriz= new int [n+1][4];
        
        for (int fila=0; fila < Matriz.length; fila++)
            for (int columna=0; columna < Matriz[fila].length-1; columna++)
                Matriz[fila][columna]=(int)(Math.random()*10000);
    }
    
    public void Ver ()
    {
        int n=1,mayor, columna,columnamayor,empleado=0;
        System.out.println("Empleado\tEnero\t\tFebrero\t\tMarzo\t\tMayor Salario");
        
        for (int fila=0; fila < Matriz.length-1; fila++)
        {
            columnamayor=0;
            mayor=0;
            for (columna=0; columna < Matriz[fila].length-1; columna++)
                if (Matriz[fila][columna] > mayor)
                {
                    mayor=Matriz[fila][columna];
                    columnamayor=columna+1;
                }
            Matriz[fila][3]=columnamayor;
            
            System.out.print(n+"\t\t");
            for (int col=0; col < Matriz[fila].length; col++)
            {
                System.out.print(Matriz[fila][col]+"\t\t");
            }
            System.out.println();
            n++;
        }
        
        System.out.print("Mayor Salario\t");
        for (int col=0; col < 3; col++)
        {
            mayor=0;
            n=1;
            for (int fila=0; fila < Matriz.length-1; fila++)
            {
                if (Matriz[fila][col] > mayor)
                {
                    mayor = Matriz[fila][col];
                    empleado=n;
                }
                n++;
            }
            Matriz[Matriz.length-1][col]=empleado;
            System.out.print(Matriz[Matriz.length-1][col]+"\t\t");
        }
            
    }
}
