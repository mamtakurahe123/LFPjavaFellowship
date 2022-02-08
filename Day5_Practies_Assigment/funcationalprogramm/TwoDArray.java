package funcationalprogramm;

import java.util.Scanner;  

public class TwoDArray {  
public static void main(String[] args) {  
    int[][] arr = new int[2][2];  
    Scanner sc = new Scanner(System.in);  
    for (int i =0;i<2;i++)  
    {  
        for(int j=0;j<2;j++)  
        {  
            System.out.print("Enter Element");  
            arr[i][j]=sc.nextInt();  
            System.out.println();  
        }  
    }  
    System.out.println("Printing Elements...");  
    for(int i=0;i<2;i++)  
    {   
        System.out.println();  
        for(int j=0;j<2;j++)  
        {  
            System.out.print(arr[i][j]+"\t");  
        }  
    }  
}  
} 
