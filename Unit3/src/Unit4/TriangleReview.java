/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit4;

import javaInputLib.In;

/**
 * import javaInputLib.In;
 *
 *
 * @author s199741231
 */
public class TriangleReview {

    public static void main(String[] args) {
        double x;
        double y;
        double z;
        int part;

        System.out.println(".__           .__  .__          ");
        System.out.println("|  |__   ____ |  | |  |   ____  ");
        System.out.println("|  |  \\_/ __ \\|  | |  |  /  _ \\ ");
        System.out.println("|   Y  \\  ___/|  |_|  |_(  <_> )");
        System.out.println("|___|  /\\___  >____/____/\\____/");
        System.out.println("     \\/     \\/           ");

        System.out.println("Hello There!, please enter an x, y and z value for the triangle");
        System.out.println("Always remember, no side of the triangle can be greater than the sum of the other two sides!");
        x = In.getDouble();
        System.out.println("You entered a " + x);
        y = In.getDouble();
        System.out.println("You entered a " + y);
        z = In.getDouble();
        System.out.println("You entered a " + z);
        System.out.println(" ");
        System.out.println("Results: " + x + ", " + y + ", " + z);
        System.out.println(" ");

        System.out.println("M'kay, now type in a number to see what you want to calculate");
        System.out.println("1 = Perimeter");
        System.out.println("2 = Semi-Perimeter");
        System.out.println("3 = Area");
        System.out.println("4 = Radius of Circumscribed Circle");
        System.out.println("5 = Radius of Inscribed Circle");
        System.out.println("6 = Angles of each vertex");

        part = In.getInt();

        boolean partbool = false;

        do {
            if (part == 1) {
                partbool = false;
                PerimeterCalc(x, y, z);
                
            } else if (part == 2) {
                partbool = false;
                AreaCalc(x, y, z);

            } else if (part == 3) {
                partbool = false;
                PerimeterCalc(x, y, z);

            } else if (part == 4) {
                partbool = false;
                RadiusCCalc(x, y, z);

            } else if (part == 5) {
                partbool = false;
                RadiusSCCalc(x, y, z);

            } else if (part == 6) {
                partbool = false;
                AnglesCalc(x, y, z);

            } else {
                System.out.println("YOU HAD ONE JOB, ENTER A NUMBER BETWEEN 1 AND 6");
                System.out.println("...Shame on you");
                partbool = true;
            }
            
        } while (partbool == true);
        
    }
    public static void PerimeterCalc(double a, double b, double c) {
        float p;
        p = (float) (a + b + c);
        System.out.println("The perimeter is: " + p);
    }
    public static void SPerimeterCalc(double a, double b, double c) {
        float sp;
        float p = (float) (a + b + c);

        sp = p / 2;
        System.out.println("The semi-perimeter is: " + sp);
    }
    public static void AreaCalc(double a, double b, double c) {
        float sp;
        float p = (float) (a + b + c);

        sp = p / 2;
        double area;
        area = (double) (sp * (sp - a) * (sp - b) * (sp - c));
        area = (double) Math.sqrt(area);
        System.out.println("The area is: " + area);
        
    }
    public static void RadiusCCalc(double a, double b, double c) {
        double rcc;
        float sp;
        float p = (float) (a + b + c);

        sp = p / 2;
        double area;
        area = (double) (sp * (sp - a) * (sp - b) * (sp - c));
        area = (double) Math.sqrt(area);
        rcc = (a * b * c) / (4 * area);
        System.out.println("The radius of the circumscribed circle is: " + rcc);
        
    }
    public static void RadiusSCCalc(double a, double b, double c) {
        double rcc;
        float sp;
        float p = (float) (a + b + c);

        sp = p / 2;
        double area;
        area = (double) (sp * (sp - a) * (sp - b) * (sp - c));
        area = (double) Math.sqrt(area);
        double ric;
        ric = (2 * area) / p;
        System.out.println("The radius of the inscribed circle is: " + ric);
        
    }
    public static void AnglesCalc(double x, double y, double z) {
        double angleX;
        double angleY;
        double angleZ;

        System.out.println(" ");

        angleX = (((y * y) + (z * z) - (x * x)) / (2 * z * y));
        angleX = Math.acos(angleX) * (180 / Math.PI);
        System.out.println("AngleX is: " + angleX);

        angleY = (((x * x) + (z * z) - (y * y)) / (2 * z * x));
        angleY = Math.acos(angleY) * (180 / Math.PI);
        System.out.println("AngleY is: " + angleY);

        angleZ = (((x * x) + (y * y) - (z * z)) / (2 * y * x));
        angleZ = Math.acos(angleZ) * (180 / Math.PI);
        System.out.println("AngleZ is: " + angleZ);

        if (x >= y + z || y >= x + z || z >= y + x) {

            System.out.println("Error, these lengths cannot create a real triangle "
                    + "in the cartesian plane");
            System.out.println("Please make sure that all sides are positive and tha each"
                    + " side is less than the sum of the other two sides. Please restart and try again");

        } else if (x < 0 || z < 0 || y < 0) {
            System.out.println("Error, these lengths cannot create a real triangle "
                    + "in the cartesian plane");
            System.out.println("Please make sure that all sides are positive and tha each"
                    + " side is less than the sum of the other two sides. Please restart and try again");
        }
        
    }

}
