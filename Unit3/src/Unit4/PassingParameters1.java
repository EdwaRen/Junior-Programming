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
public class PassingParameters1 {

    public static void main(String[] args) {
        int i;
        int j;
        i = 7;
        j = 3;
        swap(i, j);
        System.out.println("i = " + i + " and j = " + j);
    }

    public static void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }
    //This output does not change because the variables haven't been passed from method to method
    // m and n got swapped, but the changed values were never passed along to the main method

}
