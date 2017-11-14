

package apppila;


public class Lista {
    private Nodo le;
    
    private void Test(final Nodo ele)
    {
	if (ele == null) 
        {
            System.out.println("\nfallo de memoria");
            System.exit(1);
	}
    }



    public  Lista() { le = null; }

    public void finalize()
    {
        System.out.println("\nLiberando memoria de los elementos :\n");
        int valor;
        while (le != null)
        {
            valor = Del();
            System.out.println("   " + valor);
        }
    }
    
    public void Ins(int v)
    {
	Nodo nvo = new Nodo(v);
	Test(nvo);
	nvo.sig = le;
	le = nvo;
    }
    public int Del()
    {
        int valor = le.info;
        Nodo sale = le;
        le = le.sig;
        sale.sig = null;
        return valor;
    }
    
    public void Ver()
    {
        System.out.println("\nLa lista es : ");
        Nodo tmp = le;
        while (tmp != null) 
        {
            System.out.println("    " + tmp.info);
            tmp = tmp.sig;
        }
    }
}
