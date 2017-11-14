

package appmatriz2;
import java.io.FileNotFoundException;

public class Matriz2 {

    
    public static void main(String[] args) throws FileNotFoundException {
       Matriz A = new Matriz(true);
       A.ver();
       A.suma();
       Matriz AT = new Matriz(false);
       AT.transpuesta(A);
       AT.ver();
       
       AT.suma();
    }
    
}
