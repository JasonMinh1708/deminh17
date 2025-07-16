// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Table {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int s;
        int t;
        System.out.println("Number of students: ");
        s = cin.nextInt();
        System.out.println("Number of tests: ");
        t = cin.nextInt();
        double[][] a = new double[s][t];
        for(int i=0; i<s; i++)
        {
            System.out.println("Enter marks for Student "+(i+1) +"("+ t + " Tests - separate by spaces)");
            for(int j=0; j<t; j++)
            {
                a[i][j] = cin.nextDouble();
            }
        }
        for(int i = 0 ; i<s; i++)
        {
            double k=0;
            for(int j = 0; j < t; j++)
            {
                k+=a[i][j];
            }
            System.out.println("Average mark for student "+ (i+1) + ": " + k/t);
        }
        
         for(int j = 0 ; j<t; j++)
        {
            double k=0;
            for(int i = 0; i < s; i++)
            {
                k+=a[i][j];
            }
            System.out.println("Average mark for Test "+ (j+1) + ": " + k/s);
        }
        
    }
}