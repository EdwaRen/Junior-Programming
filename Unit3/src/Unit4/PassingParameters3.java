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
public class PassingParameters3 {

    public static void main(String[] args) {
        char element = '*';
        int width = 39;
        int height = 27;
        printRect2(element, width, height);

    }

    public static void printRect(char c, int width, int height) {

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                System.out.print(c);
            }
            System.out.println("");
        }

    }

    public static void printRect2(char c, int width, int height) {

        for (int x = 0; x < height; x++) {
            if (x == 0 || (x == (height - 1))) {
                for (int y = 0; y < width; y++) {
                    System.out.print(c);
                }
                System.out.println("");
            } else {
                for (int y = 0; y < width; y++) {
                    if (y==0||y==width-1){
                    System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                  
                }
                System.out.println("");
            }
        }

    }

}
