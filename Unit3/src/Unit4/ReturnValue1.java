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
public class ReturnValue1 {

    public static void main(String[] args) {
        randomNumber();
        int high = 145;
        randomNumber2(high);
        int min = 13;
        randomNumber3(min, high);
        int step = 5;
        randomNumber4(min, high, step);
    }

    public static void randomNumber() {
        int fart = (int) (Math.random() * 6 + 1);
        System.out.println(fart);
    }

    public static void randomNumber2(int high) {
        int fart = (int) (Math.random() * high + 1);
        System.out.println(fart);
    }

    public static void randomNumber3(int low, int high) {
        int fart = (int) (Math.random() * (high - low + 1) + low);
        System.out.println(fart);
    }

    public static void randomNumber4(int low, int high, int step) {
        boolean nicefart = false;
        int fart =  low;
        while (nicefart == false) {
            int randomfart = (int) (Math.random() * ((high - low) / step));
            int newfart = fart + (randomfart * step);
            if (fart + (randomfart * step) <= high) {
                System.out.println(newfart);
                nicefart = true;

            }
        }

    }
}
