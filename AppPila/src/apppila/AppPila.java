

package apppila;


public class AppPila {

    
    public static void main(String[] args) {
        Lista le = new Lista();
	le.Ins(3);
	le.Ins(5);
	le.Ins(7);
	le.Ver();
	int sale = le.Del();
	System.out.println("\nSale " + sale);
        le.finalize();
    }
    
}
