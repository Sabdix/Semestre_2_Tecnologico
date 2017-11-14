

package apppilaenlazada;
// T se sustituirá por lo que el usuario Indique
public class Nodo <T> {
    public T info;
    public Nodo Sig;
    
    public Nodo (T v)
    {
        info = v;
        Sig = null;
    }
}
