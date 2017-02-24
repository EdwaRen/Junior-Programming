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
public class ReturnValues7 {
    
     public static void main(String[] args) {
        double first = 59059;
        
        if (isPrime(first)) {
            System.out.println("It is prime");
        } else {
            System.out.println("It is not prime");
        }
        
    }

    public static boolean isPrime(double a) {
        boolean fart = false;
        for (int x = 2;x<=((int)(a/2));x++) {
            
            if (a%x == 0) {
                fart = true;
                
            } else {
            }
                
        }
        if (fart == true ){
            return false;
        } else {
            return true;
        }
        
    }

    
}
