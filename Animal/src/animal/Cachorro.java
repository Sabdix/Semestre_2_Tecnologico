

package animal;


public class Cachorro extends Perro{
    //private String Nombre;
    
    public Cachorro(String N)
    {
        super(N);
    }
    
    public void Ladrar()
    {
        System.out.println("Guau Guau...");
    }
    
    public void Comer()
    {
        System.out.println("Chom Chom...");
    }
    
    public String Paternidad()
    {
        return super.DarNombre();
    }
}
