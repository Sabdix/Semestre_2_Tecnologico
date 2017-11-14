

package animal;


public class Perro implements Comportamiento {
    private String Nombre;
    
    public Perro(String N)
    {
        Nombre = N;
    }
    
    public void Ladrar()
    {
        System.out.println("ROF ROF...");
    }
    
    public void Comer()
    {
        System.out.println("Snob Snob...");
    }
    
    public String DarNombre()
    {
        return Nombre;
    }
}
