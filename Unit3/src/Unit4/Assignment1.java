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
public class Assignment1 {
    //Question1
    //The difference is that method definition means the code used to output certain information
    //when we need it by calling the associated method. Method invocation is the actual thing you call
    //to use a method

    //Question2
    /*
     class Song
     {
     public static void printChorus ()
     {
     System.out.println();
     System.out.println("Ee-igh, ee-igh, oh!"); //2 `
     System.out.println();
     }
     public static void main (String[] args)
     {
     System.out.println("Old McDonald had a farm"); //1
     printChorus();
     System.out.println("And on that farm he had a pig"); //3
     printChorus();
     }
     }
     */
    //Question 3
    /*
    public static void main (String[] args)
     {
    
     printGarbage();
     }
    public static void printGarbage ()
     {
         int[] die = { 1, 2, 3,4 ,5 , 6};
     int ChosenOne =(int) (Math.random()*6);
         System.out.println(die[ChosenOne]);
     }
    */
    //Question4
    static int[]die2 = {1, 2, 3,4 ,5 ,6 };
    static int[]die3 = {1, 2, 3,4 ,5 ,6 };
    static int MaleTribute;
    static int FemaleTribute;
    public static void main(String[] args) {
      MaleTribute =(int) (Math.random()*6);
     FemaleTribute =(int) (Math.random()*6);
     anotherMethod();
   }

    public static void anotherMethod(){
      System.out.println("You rolled a " + die2[MaleTribute]);
      System.out.println("You rolled a " + die3[FemaleTribute]);
      System.out.println("A total of " + (die2[MaleTribute] + die3[FemaleTribute]));

   }
}
