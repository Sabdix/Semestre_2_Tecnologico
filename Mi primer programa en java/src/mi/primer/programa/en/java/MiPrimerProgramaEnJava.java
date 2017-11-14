
package mi.primer.programa.en.java;
import javax.swing.JOptionPane;

public class MiPrimerProgramaEnJava {
    
    public static boolean Palindromo(String Palabra)
    {
        for(int i = 0; i < Palabra.length(); i++)
        {
            if (Palabra.charAt(i) != Palabra.charAt(Palabra.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String Palabra = JOptionPane.showInputDialog("Ingrese la palabra a Verificar");
        
        if (Palindromo(Palabra) == true)
        {
            JOptionPane.showMessageDialog(null, "La frase \""+Palabra+"\" es un palindromo");
        } else
        {
            JOptionPane.showMessageDialog(null, "La frase \""+Palabra+"\" no es un palindromo");
        }
        
    }
}
