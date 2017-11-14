

package apppilaenlazada;


public class AppPilaEnlazada {

    
    public static void main(String[] args) {
        Lista <Libro> le = new Lista <Libro>();
        le.Ins(new Libro("Harry Potter"));
        le.Ins(new Libro("Caballo de Troya"));
        le.Ins(new Libro("Halo"));
        le.Ver();
        Libro sale = le.Del();
        System.out.println("\nSale "+sale);
        le.finalize();
    }
    
}
