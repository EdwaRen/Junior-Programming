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
public class ReturnValue8 {
     public static void main(String[] args) {
        String first = "j";
        double second = 123786;
        
        if (isChar(first)) {
            System.out.println("it is a char");
            
        } else {
            System.out.println("it is not a char");
        }
    }

    public static boolean isChar(String a) {
        
        char letter2;
        if (a.length() >1) {
            return false;
        } else {
            letter2 = a.charAt(0);
            if (Character.isLetter(letter2)) {
                
            return true;
            } else {
                return false;
            }
        }
        
        
    }
}
