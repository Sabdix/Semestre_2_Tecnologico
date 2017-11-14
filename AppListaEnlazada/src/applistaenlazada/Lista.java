

package applistaenlazada;


public class Lista {
    private Nodo le,temp;
    
    private void Test (final Nodo ele)
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
        int valor;
        while (le != null)
        {
            valor = Del();
            System.out.println(" "+valor);
        }
    }
    
    public void Ins (int v) 
    {
        Nodo nvo = new Nodo(v);
        Test(nvo);
        temp=le;
        if(le==null){
            le=nvo;
            
        }
        
        else{
            while(temp.Sig!=null)
                temp=temp.Sig;  
        
        temp.Sig=nvo;
        //le=temp;
        //temp=le;
        }
        //nvo.Sig = le;
        //le = nvo;
    }
    
    public int Del ()
    {
        int valor = le.info;
        Nodo sale = le;
        le = le.Sig;
        sale.Sig = null;
        return valor;
    }
    
    public void Ver()
    {
        System.out.println("\nLa lista es: ");
        temp = le;
        while(temp != null)
        {
            System.out.println(" "+temp.info);
            temp = temp.Sig;
        }
    }
}
