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
public class PassingParameters2 {

    public static void main(String[] args) {
        int numOfDie = 5;
        printRollDice(numOfDie);
        
    }

    public static void printRollDice(int numDice) {
        for (int x = 0;x< numDice;x++) {
            int fart = (int)(Math.random()*6 +1);
            System.out.println("You rolled a " + fart);
        }
        
    }

}
