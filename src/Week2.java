public class Week2 {
    public void tehtava2(){
        tehtava2Part2(3);
    }
    
    public void tehtava2Part1(int maara){
        for(int i = 0; i < maara; i++){
            System.out.print('*');
        }
    }
    
    public void tehtava2Part2(int rivit){
        for(int i = rivit; 0 < i; i--){
            this.tehtava2Part1(i);
            System.out.println("");
        }
    }
}
