

package appplantillas;


public class Producto <T> {
    private int clave;
    private String nombre;
    private float precio;
    private T seCompraA; //Proveedor de Cualquier Tipo
    
    public Producto() {}
    
    public Producto(int Cla, String Nom, float Pre, T Provee)
    {
        clave = Cla;
        nombre = Nom;
        precio = Pre;
        seCompraA = Provee;
    }
    
    public void imprime()
    {
        System.out.println("\nDatos del producto");
	System.out.println("\nClave: "+clave);
        System.out.println("\nNombre: "+nombre);
	System.out.println("\nPrecio: "+precio);
	System.out.println("\nProvisto por: "+seCompraA);
    }
}
