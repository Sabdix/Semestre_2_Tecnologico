package tutoriales;

public class Tutoriales {

    
    public static void main(String[] args) {
        Esfera CajaEsferas[] = new Esfera[3];
        
        for (int i = 0; i < CajaEsferas.length - 1; i++)
        {
            CajaEsferas[i] = new Esfera();
            CajaEsferas[i].Volumen();
        }
        
        CajaEsferas[2] = new Esfera(CajaEsferas[0].DarRadio(), CajaEsferas[1].DarRadio());
        CajaEsferas[2].Volumen();
        
        System.out.printf("%-10s %-10s %-10s%n", "Esfera", "Radio", "Volumen");
        
        for (int E = 0; E < CajaEsferas.length; E++)
        {
            System.out.printf("%-10d %-10f %-10f%n", (E + 1), CajaEsferas[E].DarRadio(), CajaEsferas[E].DarVolumen());
        }
        
    }
    
}
