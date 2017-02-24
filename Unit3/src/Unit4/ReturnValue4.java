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
public class ReturnValue4 {
    
    public static void main(String[] args) {
        double high = 13;
        double min = 13;
        double mid = 13;
        
        Largest(high, min, mid);
    }

    public static void Largest(double a, double b, double c) {
        if (a>=b&&a>=c) {
            if (b>c) {
                System.out.println("Order: " + a + ", " + b + ", " + c);
            } else  {
                System.out.println("Order: " + a + ", " + c + ", " + b);
            }
        } else if (b>=a && b>=c) {
            if (a>c) {
                System.out.println("Order: " + b + ", " + a + ", " + c);
            } else {
                System.out.println("Order: " + b + ", " + c + ", " + a);
            }
        } else if (c>=a && c>=b) {
            if (a>b) {
                System.out.println("Order: " + c + ", " + a + ", " + b);
            } else {
                System.out.println("Order: " + c + ", " + b + ", " + a);
            }
        }
    }
    
}
