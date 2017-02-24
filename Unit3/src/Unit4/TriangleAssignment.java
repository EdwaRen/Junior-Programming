/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit4;

import javaInputLib.In;

/**
 *
 * @author s199741231
 */
public class TriangleAssignment {

    public static void main(String[] args) {
        //main method

        //This makes the while loop end
        boolean end = false;
        //These are the three sides
        double x;
        double y;
        double z;
        //int part;

        //Hello message for aesthetic appeasement for the user
        System.out.println(".__           .__  .__          ");
        System.out.println("|  |__   ____ |  | |  |   ____  ");
        System.out.println("|  |  \\_/ __ \\|  | |  |  /  _ \\ ");
        System.out.println("|   Y  \\  ___/|  |_|  |_(  <_> )");
        System.out.println("|___|  /\\___  >____/____/\\____/");
        System.out.println("     \\/     \\/           ");

        //main while loop that runs the program.
        while (end == false) {
            //Introductory blah blah
            System.out.println("Please enter an x, y and z value for the triangle");
            System.out.println("Always remember, no side of the triangle can be greater than the sum of the other two sides!");
            //Entering the three values for each side
            x = In.getDouble();
            y = In.getDouble();
            z = In.getDouble();
            System.out.println(" ");
            //Displaying each result
            System.out.println("Results: " + x + ", " + y + ", " + z);
            System.out.println(" ");

            //Nested if statement first tests if the data is valid
            if (isEnd(x, y, z)) {
                //Tests if the user wants to end the program with 0, 0, 0
                System.out.println("You have entered three zeros, program is ending :o");
                end = true;
            } else {
                if (isWork(x, y, z)) {
                    //Checks if the input has other 0s, negative values or impossibel data values
                    System.out.println("Error, these lengths cannot create a real triangle "
                            + "in the cartesian plane");
                    System.out.println("Please make sure that all sides are positive and tha each"
                            + " side is less than the sum of the other two sides. Please restart and try again");
                } else {
                    //Classifies triangle by side and by angle
                    sideClass(x, y, z);
                    isAngle(x, y, z);
                    
                    //finds perimeter
                    float p;
                    p = (float) (x + y + z);
                    System.out.println("The perimeter is: " + p);
                    
                    //finds semi-perimeter
                    float sp;
                    sp = p / 2;

                    //finds area
                    double area;
                    area = (double) (sp * (sp - x) * (sp - y) * (sp - z));
                    area = (double) Math.sqrt(area);
                    System.out.println("The area is: " + area);

                    //finds radius of circumscribed circle
                    double rcc;
                    rcc = (x * y * z) / (4 * area);
                    System.out.println("The radius of the circumscribed circle is: " + rcc);

                    //finds radius of inscribed circle
                    double ric;
                    ric = (2 * area) / p;
                    System.out.println("The radius of the inscribed circle is: " + ric);


                    System.out.println("");
                }

            }
            if (end == false) { //Makes sure the user has initiated program end yet
                //I prefer this feature because it helps me divide the code in parts
                System.out.println("Hit enter to try again");
                double fart;
                fart = In.getDouble();
            }

        }
    }

    public static void sideClass(double x, double y, double z) {
        //finds side lengths and classifies triangle as scalene, equilateral or isoceles
        

        if (x == y && y == z) { //checks if all sides are the same
            System.out.println("Equilateral - All sides are equal");
        } else if (x == y || y == z || z == x) { //checks if any two sides are the same
            System.out.println("Isoceles - Two sides are equal");
        } else { //Result if no two sides are the same
            System.out.println("Scalene - No sides are equal");
        }

    }

    public static void isAngle(double x, double y, double z) {
        //calculates angle stuff and classifies by obtuse, acute or right
        
        //each angle to be calculated
        double angleX;
        double angleY;
        double angleZ;
        //each angle to be rounded to a few decimal points
        double angleC2;
        double angleV2;
        double angleR2;


        //calculates the angle from side lenths using cosine law
        angleX = (((y * y) + (z * z) - (x * x)) / (2 * z * y));
        angleX = Math.acos(angleX) * (180 / Math.PI);
        //rounds the angle
        angleC2 = (double) (Math.round(angleX * 1000000)) / 1000000;

        angleY = (((x * x) + (z * z) - (y * y)) / (2 * z * x));
        angleY = Math.acos(angleY) * (180 / Math.PI);
        angleV2 = (double) (Math.round(angleY * 1000000)) / 1000000;

        angleZ = (((x * x) + (y * y) - (z * z)) / (2 * y * x));
        angleZ = Math.acos(angleZ) * (180 / Math.PI);
        angleR2 = (double) (Math.round(angleZ * 1000000)) / 1000000;

        //Slightly rounded values are used in angle calculations to improve accuracy
        if (angleC2 > 90 || angleV2 > 90 || angleR2 > 90) { //Detects if any angle is over 90 degrees (obtuse)
            System.out.println("Obtuse - The angles are " + angleC2 + ", " + angleV2 + ", " + angleR2);
        } else if (angleC2 == 90 || angleV2 == 90 || angleR2 == 90) { //Detects if any angle is 90 degrees (right)
            System.out.println("Right - The angles are " + angleC2 + ", " + angleV2 + ", " + angleR2);
        } else { //Angle must be under 90 degrees (acute)
            System.out.println("Acute - The angles are " + angleC2 + ", " + angleV2 + ", " + angleR2);
        }

    }

    public static boolean isEnd(double x, double y, double z) {
        //finds if user initiated end sequence
        
        if (x == 0 && y == 0 && z == 0) { //If all input vales are 0, then initiates program end
            return true;
        } else { //...Or not
            return false;
        }
    }

    public static boolean isWork(double x, double y, double z) { 
        //Finds if inputted values work

        if (x >= y + z || y >= x + z || z >= y + x) { //Detects impossible triangle, ie if one side is greater than or equal to the sum of the other two

            return true;

        } else if (x <= 0 || z <= 0 || y <= 0) { //Redundant stuff I am too lazy to remove

            return true;
        } else {
            return false;
        }
    }
}

// "No, it would go against my moral compass"
// "Your &%#$@! moral compass is a roulette wheel!"
