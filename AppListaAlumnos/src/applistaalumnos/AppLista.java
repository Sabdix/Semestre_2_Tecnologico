
package applistaalumnos;
public class AppLista 
{   
    public static void main(String[] args) 
    {
       Lista GrupoA = new Lista(true);
       GrupoA.promedio();
       GrupoA.altos();
       GrupoA.porcentajes();
       GrupoA.ver("------------Lista de Alumnos del Grupo A-------------------");
       GrupoA.histograma();
    }
    
}