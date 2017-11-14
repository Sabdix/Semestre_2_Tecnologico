

package applista;
import java.util.Scanner;
 
class Lista {
    Scanner flujo = new Scanner(System.in);
   
     public Lista(boolean pedir){
        if (!pedir)return;
        System.out.print("\nCuantos elementos son ");
        short ne = flujo.nextShort();
        ar = new int[ne];
        System.out.print("\nProporciona los elementos ");
        for (int i=0; i<ne; i++)
                ar[i] = flujo.nextInt();
    }
    public void invertir(Lista dos) {
        ar = new int[dos.ar.length];
        for (int i=0; i<ar.length; i++)
                ar[i] = dos.ar[ar.length-i-1];
    }
    
    public void insertar ()
    {
        System.out.print("\nCuantos elementos son ");
        short TE = flujo.nextShort();
        ar= new int [TE];
        
        System.out.print("\nProporciona los elementos ");
        for (int k=0; k < TE; k++){
            int valor;
            valor=flujo.nextInt();
            int i=0;
            while (i < ne && ar[i] < valor) i++;
            if (i < ne)
                for (int r= ne-1; r >= i; r--)
                    ar[r+1] = ar[r];
            ar[i] = valor;
            ne++;
            this.ver("Lista con Elemento"+valor);
        }
    }
    
    public void ver(String msg) {
        System.out.println("\n" + msg + "\n");
        for (int i=0; i<ar.length; i++)
            System.out.print(ar[i] + "  ");
         System.out.println();
    }
    
    public void eliminar ()
    {
        System.out.print("\nCuantos elementos eliminarás ");
        short TE = flujo.nextShort();
        
        System.out.print("\nProporciona los elementos a eliminar ");
        for (int k=0; k < TE; k++){
            int valor, contador=0;
            valor=flujo.nextInt();
            int i=0;
            while (i < ar.length && ar[i] != valor) 
                i++;
            if (i < ne){
                for (int r = i; r < ar.length-1; r++){
                    ar[r] = ar[r+1];
                }
                ne++;
                this.ver("Lista sin Elemento "+valor);
            }
            else
                System.out.print("El numero no se encontro");
            //ar[i] = valor;
            ar[(ar.length-1)-contador]=0;
            
        }
    }
    
    public void media ()
    {
        double suma=0;
        
        for (int contador = 0; contador < ar.length; contador++)
        {
            suma += ar[contador];
        }
        System.out.println("\nMedia= "+(suma/ar.length));
    }
    
    public void mediana ()
    {
        int promedio;
        if (ar.length % 2 == 0)
        {
            promedio=(ar[ar.length/2]+ar[(ar.length/2)-1])/2;
            System.out.println("\nMediana = "+promedio);
        } else
            System.out.println("\nMediana = "+ar[ar.length/2]);
    }
    
    public void moda ()
    {
        int Max=0, moda=0;
        
        for(int numero=0; numero < ar.length; numero++)
        {
            int Repeticion=0;
            
            for (int numero2=0; numero2 < ar.length; numero2++)
            {
                if (ar[numero] == ar[numero2])
                    Repeticion++;
            }
            System.out.print(ar[numero]+" = ");
            for (int asterisco=1; asterisco <= Repeticion*4; asterisco++)
                System.out.print("*");
            System.out.println();
            if (Repeticion > Max)
            {
                moda = ar[numero];
                Max = Repeticion;
            }
        }
        System.out.println("\nModa = "+moda);
    }
    
    public void union (Lista A, Lista B)
    {
        ar = new int[A.ar.length + B.ar.length];
        
        for (int copiaA=0; copiaA < A.ar.length; copiaA++)
            ar[copiaA] = A.ar[copiaA];
        int contador= A.ar.length;
        for (int copiaB=0; copiaB < B.ar.length; copiaB++)
        {
            ar[contador] = B.ar[copiaB];
            contador++;
        }
    }
    
    private int ar[];
    private short ne;
} 

    


public class AppLista {

    
    public static void main(String[] args) {
        Lista A = new Lista(false);
        A.insertar();
        
        Lista B = new Lista(false);
        B.insertar();
        
        Lista AB = new Lista(false);
        AB.union(A, B);
        AB.ver("Lista AB");
   
        
    }
    
}
