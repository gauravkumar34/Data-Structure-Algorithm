/* 1
  121
 12321
1234321 */
import java.util.*;
import java.lang.*;
import java.io.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int row = sc.nextInt();
        int i=1;
         
        while(i<=row){
            int k=1;
            while(k<row -i + 1){
              System.out.print(' '); 
              k++;
            }
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            int m=row;
            while( m < row + i - 1 ){
                System.out.print(i- m + row - 1);
                m++;
            }
            
		    System.out.println();
            i++;
        }
    }
}
