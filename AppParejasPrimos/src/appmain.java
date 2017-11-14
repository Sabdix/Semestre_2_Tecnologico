public class appmain {
    
    static int Primo (int n)
    {
        int con, band=1;
        
        for(con = 2; con <= Math.sqrt(n) && band == 1; con++)
            if (n % con == 0)
                band=0;
        return band;
    }

    
    public static void main(String[] args) {
        
        for (int n=2; n <= 500; n++)
        {
            if (Primo(n)==1 && Primo(n+2)==1)
                System.out.println(n+"\t"+(n+2));
        }
    }
    
}
