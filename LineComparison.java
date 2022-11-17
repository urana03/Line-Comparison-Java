package com.bridgelabz.linecomparison;
import java.util.*;

public class LineComparison 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double lineOne;
        
        System.out.println("Enter first co-ordinates(x1,y1):");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Enter second co-ordinate(x2,y2)");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        
        lineOne=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Length of line: "+lineOne);
    }
}
