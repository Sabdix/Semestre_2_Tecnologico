//Este codigo crea 5 numeros aleatoriamente del 1 al 5 sin repetir ninguno

package gerardo;


public class Gerardo {
    

    
    public static void main(String[] args) {
        int cont = 0, Arregloale[] = new int[5], num;
        boolean diferente = true;
        
        while(cont<5)
        {
            num = (int)(Math.random()*5+1);
            for (int comprobacion=0; comprobacion < Arregloale.length; comprobacion++)
            {
                if (num != Arregloale[comprobacion])
                {
                    diferente = true;
                } else 
                {
                    diferente = false;
                    break;
                }
            }
            if (diferente == true)
            {
                Arregloale[cont] = num;
                cont ++;
            }
        }
        for(int i=0; i<5; i++){
            System.out.println(Arregloale[i]);
        }
    }
    
}
