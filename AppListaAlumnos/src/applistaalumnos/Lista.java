package applistaalumnos;
import java.util.Scanner;
public class Lista 
{
    Scanner Teclado = new Scanner(System.in);
    
    public Lista(boolean pedir)
    {
        if (!pedir)return;
        System.out.print("\nCuantas calificaciones son ");
        short ne = Teclado.nextShort();
        ar = new int[ne];
        al = new String[ne];
        for (int i=0; i<ne; i++)
        {
                System.out.print("\nDe el nombre del alumno ");
                al[i] = Teclado.next();
                System.out.print("\nProporciona la calificacion ");
                ar[i] = Teclado.nextInt();
        }
    }
    
    public void ver(String msg) 
    {
        System.out.println("\n" + msg + "\n");
        for (int i=0; i<ar.length; i++)
            if (ar[i] >= 70)
                System.out.println(al[i]+"= "+ar[i]+"\t APROBADO");
            else
                System.out.println(al[i]+"= "+ar[i]+"\t REPROBADO O NP (NO HAY PEDO)");
    }
    
    public void promedio ()
    {
        double suma=0;
        System.out.println("\n--------PROMEDIO ARITMETICO---------\n");
        for (int contador = 0; contador < ar.length; contador++)
        {
            suma += ar[contador];
        }
        System.out.println("\nPromedio Aritmético= "+(suma/ar.length)+"\n");
    }
    
    public void altos ()
    {
        int Mayor= ar[0];
        System.out.println("\n-----------MEJORES CALIFICACIONES------------");
        for (int checador=0; checador < ar.length; checador++)
            if (ar[checador] > Mayor)
                Mayor = ar[checador];
        for (int checa=0; checa < ar.length; checa++)
            if (Mayor == ar[checa])
            {
                System.out.print(al[checa]+"= ");
                System.out.println(ar[checa]);
            }
    }
    
    public void porcentajes ()
    {
        int Aprobados=0, Reprobados=0;
        System.out.println("\n---------PORCENTAJES------------\n");
        for (int checador=0; checador < ar.length; checador++)
            if (ar[checador] >= 70)
                Aprobados++;
            else
                Reprobados++;
        System.out.println("\nEl porcentaje de aprobados es "+(Aprobados*100)/ar.length+"%");
        System.out.println("\nEl porcentaje de reprobados es "+(Reprobados*100)/ar.length+"%");
    }
    
    public void histograma()
    {
        int rango1=1, rango2=10;
        System.out.println("\n--------HISTOGRAMA---------\n");
        for (int contador=1; contador <= 10; contador++)
        {
            int cuenta=0;
            for (int histo=0; histo < ar.length; histo++)
            {
                if (ar[histo] >= rango1 && ar[histo] <= rango2)
                {
                    cuenta++;
                }
            }
            System.out.print("\n"+rango1+"/"+rango2+"= ");
            for (int asterisco=1; asterisco <= cuenta; asterisco++)
                System.out.print("*");
            rango1+=10;
            rango2+=10;
        }
        System.out.println();
    }
    
    private int ar[];
    private String al[];
    private short ne;
    
}
