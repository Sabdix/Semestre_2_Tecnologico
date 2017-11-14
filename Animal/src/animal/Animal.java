

package animal;


public class Animal {

    
    public static void main(String[] args) {
        Perro Can = new Perro("Ron");
        Can.Ladrar();
        Can.Comer();
        
        Cachorro Cancito = new Cachorro("Roncito");
        Cancito.Ladrar();
        Cancito.Comer();
        
        System.out.println(Cancito.DarNombre() +" es hijo de "+Can.DarNombre());
    }
    
}
