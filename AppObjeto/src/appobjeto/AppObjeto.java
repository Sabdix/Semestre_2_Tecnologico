

package appobjeto;
import java.util.Scanner;

class Perro {
    private String nombre = "William";
    
    public void Ladrar (){
        System.out.println("\nGuau... Guau...");
    }
    
    public void Comer (){
        System.out.println("\nChomm... Chomm...");
    }
    
    public void Cagar (){
        System.out.println("\nSprrrrfff... Sprrrrffff...");
    }
    
    public void Dormir (){
        System.out.println("\nZZZZzzzzzz... ZZZZzzzzz...");
    }
    
    public String Nombre(){return nombre;}
}

public class AppObjeto {

    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Perro Mascota= new Perro();
        String accion="entrar";
        
        while (accion != "salir")
        {
            System.out.print("¿Cual accion desea que realice William? ");
            accion= Teclado.next();
            switch (accion)
            {
                case "ladrar":
                    Mascota.Ladrar();
                    break;
                case "comer":
                    Mascota.Comer();
                    break;
                case "cagar":
                    Mascota.Cagar();
                    break;
                case "dormir":
                    Mascota.Dormir();
                    break;
                case "salir":
                    accion="salir";
                    break;
                case "nombre":
                    System.out.println("William");
                    break;
            }
        }
        
    }
    
}
