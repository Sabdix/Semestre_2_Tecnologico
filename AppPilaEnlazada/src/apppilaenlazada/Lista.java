

package apppilaenlazada;


public class Lista <T> {
    private Nodo <T> le;
    
    private void Test (final Nodo <T> ele)
    {
        if (ele == null)
        {
            System.out.println("\nFALLO DE MEMORIA\n");
            System.exit(1);
        }
    }
    
    public Lista () 
    {
        le = null;
    }
    
    public void finalize ()
    {
        System.out.println("\nLiberando memoria de los elementos :\n");
        T valor;
        while (le != null)
        {
            valor = Del();
            System.out.println(" "+valor);
        }
    }
    
    public void Ins (T v) 
    {
        Nodo <T> nvo = new Nodo <T>(v);
        Test(nvo);
        nvo.Sig = le;
        le = nvo;
    }
    
    public T Del ()
    {
        T valor = le.info;
        Nodo <T> sale = le;
        le = le.Sig;
        sale.Sig = null;
        return valor;
    }
    
    public void Ver()
    {
        System.out.println("\nLa lista es: ");
        Nodo <T> temp = le;
        while(temp != null)
        {
            System.out.println(" "+temp.info);
            temp = temp.Sig;
        }
    }
}
