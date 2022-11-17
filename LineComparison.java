package com.bridgelabz.linecomparison;
import java.util.*;
import java.lang.Integer;

public class LineComparison 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        Integer lineOne;
        Integer lineTwo;
        
        System.out.println("Enter first co-ordinates(x1,y1):");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Enter second co-ordinate(x2,y2)");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        
        System.out.println("Enter first co-ordinates(a1,b1):");
        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        System.out.println("Enter second co-ordinate(a2,b2)");
        int a2 = scan.nextInt();
        int b2 = scan.nextInt();
        
        lineOne=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        lineTwo=(int)Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
        
        System.out.println("Length of line one: "+lineOne);
        System.out.println("Length of line two: "+lineTwo);
        
        System.out.println("Line one is equal to line two:"+ lineOne.equals(lineTwo));
        
        System.out.println("Comparison of line one to two (if equal(0),if short(-1), long(1): "+ lineOne.compareTo(lineTwo));
        
        
    }
}
