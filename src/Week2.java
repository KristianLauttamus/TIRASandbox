public class Week2 {
    public static int kerrat = 0;
    
    public void tehtava3(){
        tehtava3Part3(3);
    }
    
    public void tehtava3Part1(int maara){
        for(int i = 0; i < maara; i++){
            System.out.print('*');
        }
        System.out.println("");
        
        if(maara > 0)
            tehtava3Part1(maara-1);
    }
    
    public void tehtava3Part2(int maara){
        if(maara > 1)
            tehtava3Part2(maara-1);
                    
        for(int i = 0; i < maara; i++){
            System.out.print("*");
        }
        
        System.out.println("");
    }
    
    public void tehtava3Part3(int maara){
        int toistoKerta = kerrat++;
        
        if(maara > 1)
            tehtava3Part3(maara-1);
        
        for(int i = 0; i < maara; i++){
            System.out.print("*");
        }
        System.out.println(" " + toistoKerta);
        
        if(maara > 1)
            tehtava3Part3(maara-1);
    }
}
