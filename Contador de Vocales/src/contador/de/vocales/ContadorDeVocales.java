

package contador.de.vocales;
import java.util.Scanner;

public class ContadorDeVocales {

    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        String Palabra;
        int a=0, e=0, i=0, o=0, u=0;
        System.out.print("Escriba la palabra ");
        Palabra=Teclado.nextLine();
        
        for (int letra=0; letra < Palabra.length(); letra++)
        {
            if (Palabra.charAt(letra) == 'a' || Palabra.charAt(letra) == 'A')
                a++;
            else
                if (Palabra.charAt(letra) == 'e' || Palabra.charAt(letra) == 'E')
                    e++;
                else
                    if (Palabra.charAt(letra) == 'i' || Palabra.charAt(letra) == 'I')
                        i++;
                    else
                        if (Palabra.charAt(letra) == 'o' || Palabra.charAt(letra) == 'O')
                            o++;
                        else
                            if (Palabra.charAt(letra) == 'u' || Palabra.charAt(letra) == 'U')
                                u++;
        }
        System.out.println("Aa= "+a);
        System.out.println("Ee= "+e);
        System.out.println("Ii= "+i);
        System.out.println("Oo= "+o);
        System.out.println("Uu= "+u);
        
    }
    
}
