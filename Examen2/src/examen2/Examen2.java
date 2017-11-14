

package examen2;


public class Examen2 {

    
    public static void main(String[] args) {
        Matriz A = new Matriz();
        A.Inicializar();
        A.Ver();
        
        Matriz B = new Matriz();
        B.Inicializar();
        B.Ver();
        
        Matriz C = new Matriz();
        C.Sumar(A, B);
        C.Ver();
        
        Matriz AB = new Matriz();
        AB.Multiplicar(A, B);
        
        AB.Ver();
    }
    
}
