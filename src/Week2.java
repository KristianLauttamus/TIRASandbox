public class Week2 {
    public static int kerrat = 1;
    
    // Tehtävä 1
    public void tehtava1(){
        long start = System.nanoTime();
        System.out.println(tehtava1Part1(4,2));
        long now = System.nanoTime();
        System.out.println("Elapsed: " + (now-start));
        
        start = System.nanoTime();
        System.out.println(tehtava1Part2(4,2));
        now = System.nanoTime();
        System.out.println("Elapsed: " + (now-start));
    }
    public int tehtava1Part1(int n, int k){
        int summa = 0;
        
        if(k == 0 || k == n){
            return 1;
        }
        
        if(n > 0 && k > 0 && k >= 1 && k <= n-1){
            summa += tehtava1Part1(n-1,k-1);
            summa += tehtava1Part1(n-1,k);
        }
        
        return summa;
    }
    public int tehtava1Part2(int n, int k){
        return tehtava1Part2Kerroin(n)/(tehtava1Part2Kerroin(n-k)*tehtava1Part2Kerroin(k));
    }
    public int tehtava1Part2Kerroin(int num){
        int sum = 1;
        
        for(int i = 1; i <= num; i++){
            sum *= i;
        }
        
        return sum;
    }
    
    // Tehtävä 2
    public void tehtava2(){
        System.out.println(tehtava2(2, 10));
    }
    public int tehtava2(int x, int n){
        if(n == 0){
            return 1;
        }
        
        int puolikas = tehtava2(x, n/2);
        if(n > 0 && n % 2 == 0){
            return puolikas * puolikas;
        } else {
            return x * puolikas * puolikas;
        }
    }
    
    // Tehtävä 3
    public void tehtava3(){
        tehtava3Part3(3);
    }
    public void tehtava3Part1(int maara){
        for(int i = 0; i < maara; i++){
            System.out.print('*');
        }
        
        if(maara > 0){
            System.out.println("");
            tehtava3Part1(maara-1);
        }   
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
