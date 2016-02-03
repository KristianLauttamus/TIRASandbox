
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Week3 {
    public static void tehtava1(){
        // a) 9.21
        // b) 92103.40
        // c) 100000000
        // d) 8.44
    }
    
    public static void tehtava4(){
        int[] array = new int[]{2, 3, 3, 4, 4, 4, 5};
        System.out.println(tehtava4(array, 4));
    }
    
    public static int tehtava4(int[] array, int lasketaan){
        int index = tehtava4BinarySearch(array, 0, array.length-1, lasketaan);
        int loydetty = 1;
        int alin = index-1;
        int ylin = index+1;
        
        while(array[alin] == lasketaan || array[ylin] == lasketaan){
            if(array[alin] == lasketaan){
                loydetty++;
                alin--;
            }
            if(array[ylin] == lasketaan){
                loydetty++;
                ylin++;
            }
        }
        
        return loydetty;
    }
    
    public static int tehtava4BinarySearch(int[] array, int lowerbound, int upperbound, int key){
        int position;
        int comparisonCount = 1;    // counting the number of comparisons (optional)

        // To start, find the subscript of the middle position.
        position = ( lowerbound + upperbound) / 2;

        while((array[position] != key) && (lowerbound <= upperbound))
        {
          comparisonCount++;
          if (array[position] > key)             // If the number is > key, ..
          {                                              // decrease position by one. 
               upperbound = position - 1;   
          }                                                             
               else                                                   
         {                                                        
               lowerbound = position + 1;    // Else, increase position by one. 
         }
        position = (lowerbound + upperbound) / 2;
        }
        if (lowerbound <= upperbound)
        {
            return position;
        }
        else{
            return -1;
        }
    }
    
    public static void tehtava5(){
        tehtava5Part1();
        tehtava5Part2();
    }
    
    public static void tehtava5Part1() { // n. 106675 ja 696870911
        int howMany = 106675;
        int min = 1;
        int max = 100;
        int[] array = new int[howMany];
        
        for(int i = 0; i < array.length; i++){
            array[i] = min + (int)(Math.random() * max); ;
        }
        
        // Insertion Sort
        long now = System.nanoTime();
        InsertionSort(array);
        long elapsed = System.nanoTime() - now;
        
        double seconds = (double)elapsed / 1000000000.0;
        System.out.println("Took: " + seconds);
        
        // Java's Array Sort
        howMany = 696870911;
        array = new int[howMany];
        
        now = System.nanoTime();
        Arrays.sort(array);
        elapsed = System.nanoTime() - now;
        
        seconds = (double)elapsed / 1000000000.0;
        System.out.println("Took: " + seconds);
    }
    
    public static void tehtava5Part2() { // n. 126.25622821 ja NegativeArraySizeException...
        int howMany = 106676*10;
        int min = 1;
        int max = 100;
        int[] array = new int[howMany];
        
        for(int i = 0; i < array.length; i++){
            array[i] = min + (int)(Math.random() * max); ;
        }
        
        // Insertion Sort
        long now = System.nanoTime();
        InsertionSort(array);
        long elapsed = System.nanoTime() - now;
        
        double seconds = (double)elapsed / 1000000000.0;
        System.out.println("Took: " + seconds);
        
        // Java's Array Sort
        howMany = 696870911*10;
        array = new int[howMany];
        
        now = System.nanoTime();
        Arrays.sort(array);
        elapsed = System.nanoTime() - now;
        
        seconds = (double)elapsed / 1000000000.0;
        System.out.println("Took: " + seconds);
    }
    
    public static void InsertionSort( int [ ] num)
    {
        int j;
        int key;
        int i;  

        for (j = 1; j < num.length; j++)
        {
            key = num[ j ];
            for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)
            {
                num[ i+1 ] = num[ i ];
            }
            num[ i+1 ] = key;
        }
    }
}
