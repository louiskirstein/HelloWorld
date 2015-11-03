/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author LK 
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //doSomething();
        int sum = addThreeIntegers(6, 5);
        System.out.println("the sum is "  + sum);

        sum = addThreeIntegers(0, Integer.MAX_VALUE);
        System.out.println("the sum is "  + sum);
        
        sum = addThreeIntegers(5, Integer.MAX_VALUE);
        System.out.println("the sum is "  + sum);
        
        double summ = addTwoDoubles(25.8, 65.9);
        System.out.printf("The sum of the doubles is %.1f \n", summ);
        
        sum = addTwoIntegers(7, 3) ;
        System.out.println("the sum is "   + sum);
        
        sum = divideIntegers(10, 2) ;
        System.out.println("the sum is "    + sum);
        
        summ = divideDoubles(10.0, 2.0) ;
        System.out.printf("the sum of the doubles is "    + summ);
    }

    private static void doSomething() {
        System.out.println("What´ up");
    }
    
    public static int addThreeIntegers(int x, int y) {
        int add = x + y;
        return add;
    }
    
 public static double addTwoDoubles(double d1, double d2){
     double result = d1 - d2;
     return result;
     
     
    }
    
    public static int addTwoIntegers(int n1, int n2) {
        
        int add = n1 * n2;
        return add;
    }  
    
    public static int divideIntegers(int d1, int d2)  {
        
        int add = d1 / d2; 
        return add; 
    }
    
    public static double divideDoubles(double z1, double z2)   {
        
        double result = z1 / z2;
        return result; 
    }
    
    
    
    
    
    
    
}
