
import java.util.*;
import java.lang.*;
import java.io.*;
/**
   1234554321
   1234**4321
   123****321
   12******21
   1********1
   
 */
public class AdvPattern {
    public static void main(String[] args) {
		// your code goes here
		 Scanner sc = new Scanner(System.in); 
        int row = sc.nextInt();
        int i=1;
         
        while(i<=row){
            int k=1;
            while(k<=row -i + 1){
              System.out.print(k); 
              k++;
            }
            int j=1;
            while(j<i){
                System.out.print('*');
                j++;
            }
            int m=1;
            while( m <= i - 1){
                System.out.print('*');
                m++;
            }
            int n = 1;
            int z = row+1;
            while(n <= row - i + 1 ){
              System.out.print(z - i); 
              n++;
              z--;
             
            }
		    System.out.println();
            i++;
        }
	}
}
