

package examen2;
import java.util.Scanner;

public class Matriz {
    private int Matrix[][];
    private Scanner Teclado = new Scanner(System.in);
    
    public void Inicializar()
    {
        System.out.print("De el numero de filas y columnas ");
        Matrix = new int [Teclado.nextInt()][Teclado.nextInt()];
        
        for (int fila=0; fila < Matrix.length; fila++)
            for (int col=0; col < Matrix[fila].length; col++)
                Matrix[fila][col]=(int)(Math.random()*10);
    }
    
    public void Ver()
    {
        System.out.println();
        for (int fila=0; fila < Matrix.length; fila++)
        {
            for (int col=0; col < Matrix[fila].length; col++)
                System.out.print(Matrix[fila][col]+" ");
            System.out.println();
        }
    }
    
    public void Multiplicar (Matriz A, Matriz B)
    {
        Matrix = new int [A.Matrix.length][B.Matrix[0].length];
        System.out.println("---------Multiplicacion.------------");
        
        for (int fila=0; fila < A.Matrix.length; fila++)
            for (int col=0; col < B.Matrix[0].length; col++)
                for (int suma=0; suma < B.Matrix.length; suma++)
                {
                    Matrix[fila][col] += A.Matrix[fila][suma] * B.Matrix[suma][col];
                }
        
    }
    
    public void Sumar (Matriz A, Matriz B)
    {
        System.out.println("----------- SUMA ---------------");
        Matrix = new int [A.Matrix.length][B.Matrix[0].length];
        for (int fila=0; fila < Matrix.length; fila++)
            for (int col=0; col < Matrix[fila].length; col++)
                Matrix[fila][col]= A.Matrix[fila][col] + B.Matrix[fila][col];
    }
}
