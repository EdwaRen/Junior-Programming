/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit4;

/**
 *
 * @author s199741231
 */
public class ReturnValue6 {
            public static boolean divisible = false;

     public static void main(String[] args) {
        double first = 130;
        double second = 123786;
        
        isDivisible(first, second);
        if (divisible == true) {
            System.out.println("Is divisible");
            
        } else {
            System.out.println("Is not disivible");
        }
    }

    public static void isDivisible(double a, double b) {
    
        if (a%b==0) {
             divisible = true;
            //return divisible;
        }
        
    }
    
}
