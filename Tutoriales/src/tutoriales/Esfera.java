

package tutoriales;
import javax.swing.JOptionPane;

public class Esfera {
    private double Radio;
    private double Volumen;
    
    public Esfera()
    {
        Radio = Double.parseDouble(JOptionPane.showInputDialog("De el radio de la Esfera"));
    }
    
    public Esfera(double RE1, double RE2)
    {
        Radio = RE1 + RE2;
    }
    
    public void Volumen()
    {
        Volumen = (double) 3/4 * Math.PI * Math.pow(Radio, 3);
    }
    
    public double DarRadio()
    {
        return Radio;
    }
    
    public double DarVolumen()
    {
        return Volumen;
    }
}
