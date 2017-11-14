package tutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;

    
       abstract class Empleado {

	protected String nombre;
	private String actividad;
	private String tipo;
	private float bono;
	private float sueldo;

	public static final int ANCHO = 12;
	
	public void pedirDatos(Scanner flujo){
	nombre=flujo.next();
        actividad=flujo.next();
        
}
       public void Empleado(String tipo){
	this.tipo=tipo;
}
       public final String verTipo(){
	return tipo;
}
       public final void ver(String datos){
	datos+= nombre + "\t" + actividad;
       System.out.println(nombre + "\t" + actividad);
}
	
	abstract void verA(String   a);
	abstract float calcularBono();	// función virtual pura
	abstract float calcularSueldo();
}
//____________________________________________________________________________________________
class EmpleadoBase extends Empleado {

	private int faltas;		// Especialización
	private float sueldoBase;

        public  EmpleadoBase(String tipo) {
            super.Empleado(tipo); 
        }
	
	public void pedirDatos(Scanner flujo){
           super.pedirDatos(flujo);
	faltas=flujo.nextInt();	sueldoBase=flujo.nextInt();
}
        
	//~EmpleadoBase(void);Garbage Collector
        public void verA(String b){
	//Empleado::ver(flujo);
	b+= faltas+"\t" ;
        b+= sueldoBase +"\t" ;
        b+=calcularBono()+"\t";
        b+=calcularSueldo() +"\n";
        System.out.println(faltas+"\t"+sueldoBase+"\t"+calcularBono()+"\t"+calcularSueldo());
}
       
	public float calcularBono() {
            if ( faltas == 0) return 200.0f;  else return 0.0f;
        }
	public float calcularSueldo(){
            return sueldoBase - ( sueldoBase / 6) * faltas + calcularBono();
        }
}
//__________________________________________________________________________________
class EmpleadoEventual extends Empleado {

	private int horas;		// Especialización
	private float pagoHora;

	public EmpleadoEventual(String tipo){ super.Empleado(tipo); }
        public void pedirDatos(Scanner flujo){
	super.pedirDatos(flujo);
	horas=flujo.nextInt();	pagoHora=flujo.nextInt();
}
	
	//~EmpleadoEventual(void);Garbage Collector
	public void verA(String b){
            b+= nombre+"\t" ;
        b+= pagoHora +"\t" ;
        b+=calcularBono()+"\t";
        b+=calcularSueldo() +"\n";
        System.out.println(horas+"\t"+pagoHora+"\t"+calcularBono()+"\t"+calcularSueldo());
        }
	public float calcularBono(){
	if ( horas > 30) return (horas-30)*50f;  else return 0.0f;
}
	public float calcularSueldo(){
            return horas * pagoHora + calcularBono();
        }       
}
//_________________________________________________________________________________________________________________________
class Constructora {
	private int noEmpleados;
	private Empleado empleados[];		// Composición

   /* Constructora(Scanner flujo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
        
public  Constructora()throws FileNotFoundException{
    File archivo1 = new File("1.txt");
    Scanner flujo1 = new Scanner(archivo1);
	String tipo;
        File archivo = new File("datos.txt");
    Scanner flujo = new Scanner(archivo);
    File archivo2 = new File("tipos.txt");
    Scanner flujo2 = new Scanner(archivo2);
        noEmpleados=flujo1.nextInt();
	empleados= new Empleado[noEmpleados];
	for (int i = 0; i < noEmpleados; i++){
		 tipo=flujo2.next();
                         if (tipo.compareToIgnoreCase("E")==1)empleados[i] = new EmpleadoEventual(tipo);
		else empleados[i]= new EmpleadoBase(tipo);
		empleados[i].pedirDatos(flujo);
	}
}
	
	void ver(String b){
             b+= "\nNomina semanal de la Constructora Siglo XXI\n";
        System.out.println("\nNomina semanal de la Constructora Siglo XXI\n") ;
	this.verBase(b);
	verEventual( b);
	verTotal(b);
	percepcionMayor(b);	
        }
	
        public void verBase(String b){
	b+="\nTrabajadores de Base\n";
	b+= "Nombre        Puesto      Faltas  SueldoBase        Bono      Sueldo\n";
       System.out.println( "\nTrabajadores de Base\n");;
	System.out.println( "Nombre        Puesto      Faltas  SueldoBase        Bono      Sueldo\n");
	float sumaBonos=0f, sumaSueldos = 0.0f;
	for (int i = 0; i < noEmpleados; i++){
		if (empleados[i] instanceof EmpleadoBase ){
			empleados[i].verA(b);
			sumaBonos += empleados[i].calcularBono();
			sumaSueldos += empleados[i].calcularSueldo();
		}
              b+= "\n";  
	}
	b+="                                   Totales :         " + sumaBonos + "        " + sumaSueldos + "\n\n";
       System.out.println( "                                   Totales :         " + sumaBonos + "        " + sumaSueldos + "\n\n");
}
       public void  verEventual(String b){
	b+="\nTrabajadores Eventuales\n";
        System.out.println("\nTrabajadores Eventuales\n");
	// Terminar la implementación del método
        b+="Nombre        Oficio       Hrs/trab   $/hora        Bono      Sueldo\n";
        System.out.println("\nTrabajadores Eventuales\n");
       
	// Terminar la implementación del método
       System.out.println ("Nombre        Oficio       Hrs/trab   $/hora        Bono      Sueldo\n");
       b+="Nombre        Oficio       Hrs/trab   $/hora        Bono      Sueldo\n";
        float sumaBonos=0f, sumaSueldos = 0.0f;
	for (int i = 0; i < noEmpleados; i++){
		if (empleados[i] instanceof EmpleadoEventual){
			empleados[i].ver(b);
			sumaBonos += empleados[i].calcularBono();
			sumaSueldos += empleados[i].calcularSueldo();
		}
                b+="\n";
	}
	b+= "                                   Totales :         " + sumaBonos + "        " + sumaSueldos + "\n\n";
        System.out.println( "                                   Totales :         " + sumaBonos + "        " + sumaSueldos + "\n\n");
}
public void verTotal(String b) {
	float sumaBonos=0f, sumaSueldos = 0.0f;
	for (int i = 0; i < noEmpleados; i++){
			sumaBonos += empleados[i].calcularBono();
			sumaSueldos += empleados[i].calcularSueldo();
	}
	b+= "\n                                Gran Total :         " + sumaBonos + "        " + sumaSueldos +"\n";
        System.out.println( "\n                                Gran Total :         " + sumaBonos + "        " + sumaSueldos + "\n");

}
public void percepcionMayor(String b) {
	float sueldoMayor = 0.0f;
	for (int i = 0; i < noEmpleados; i++)
		if(empleados[i].calcularSueldo() > sueldoMayor)
			sueldoMayor = empleados[i].calcularSueldo();
	b+= "\nLa percepcion mas alta la tienen los empleados:\n";
        System.out.println("\nLa percepcion mas alta la tienen los empleados:\n");
	// Mostrar los Empleados con la percepción más alta
        for (int i = 0; i < noEmpleados; i++)
		if(empleados[i].calcularSueldo() == sueldoMayor)
                    empleados[i].verA(b);			
}
}


public class Tutorial {

    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Lectura de datos desde archivo: datos.txt\n") ;
   System.out.println( "            Informe en archivo: Informe.txt\n");
   System.out.println( "Pulsa cualquier tecla para terminar\n");
   
   String salida="";
   //ofstream salida("Informe.txt"); 
   Constructora objeto= new Constructora();
   objeto.ver(salida);
  // char espera;
  // cin >> espera;
    }
    
}
