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
public class ReturnValue5 {

    public static void main(String[] args) {
        int high = 13000000;
        int min = 4000000;
        System.out.println("memes");
        gcd(high, min);
    }

    public static void gcd(int a, int b) {

        //int[] primeNumA = new int[number];
            //primeNumA[i] = i*count;
        //System.out.println(primeNumA);
        
        int small;
        int big;
        int gcd = 1;
        boolean fart = false;
        
        if (a>b) {
           big = a;
           small = b;
           
        } else {
            small = a;
            big = b;
        }
        
        for (int x = small + 1; x>=1;x=x-1){
            if (small%x==0 && big%x==0 && fart == false) {
                gcd = x;
                fart = true;
            }
        
        }
        System.out.println("The GCD is: " + gcd);
        
    }
}
