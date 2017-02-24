/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

import javaInputLib.In;
import java.util.Arrays;

class Yahtzee {

    public static void main(String[] args) {

        int choice = 0;

        System.out.println("Welcome to Eddies Yahtzeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee Game!");
        System.out.println("Mkay now I, Mr McKay will be your host for this fun and exciting Yacht game");

        System.out.println("------------------------");
        System.out.println("So to play this game yourself, enter a 1, to see the computer play this game, enter a 2");
        choice = In.getInt();
        while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
            System.out.println("You have entered an invalid choice, please enter another mkay?");
            choice = In.getInt();
        }
        if (choice == 1) {
            boolean finish = false;

            int[] die = {0, 0, 0, 0, 0};
            int[] dieFH = {0, 0, 0, 0, 0};
            boolean yahtzee = false;
            boolean straight = false;
            boolean fullHouse = false;
            int straightCount = 0;
            int straightCount2 = 0;

            int roll = 0;

            for (int x = 0; x <= 4; x++) {
                die[x] = (int) (Math.random() * 6) + 1;
                System.out.println("die " + (x + 1) + " = " + die[x]);
            }

            while (finish == false) {
                roll++;
                int straight1[] = {1, 2, 3, 4, 5};
                String rerollDie;

                int straight2[] = {2, 3, 4, 5, 6};
                int randomcrap = 0;

                //Yahtzee Finder
                if (die[0] == die[1] && die[1] == die[2] && die[2] == die[3] && die[3] == die[4]) {
                    System.out.println("YAHTZEE");
                    yahtzee = true;
                }
                //Straight Finder
                for (int x = 0; x <= 4; x++) {
                    boolean straightbool = false;
                    boolean straightbool2 = false;

                    for (int c = 0; c <= 4; c++) {
                        if (die[x] == (straight1[c]) && straightbool == false) {
                            straightbool = true;
                            straightCount++;
                            straight1[c] = 0;
                        }
                        if (die[x] == (straight2[c]) && straightbool2 == false) {
                            straightbool2 = true;
                            straightCount2++;
                            straight2[c] = 0;
                        }
                    }

                }

                //Full House Finder
                for (int x = 0; x <= 4; x++) {
                    dieFH[x] = die[x];
                }
                Arrays.sort(dieFH);
                if (dieFH[0] == dieFH[1] && dieFH[1] == dieFH[2]) {
                    if (dieFH[3] == dieFH[4] && dieFH[3] != dieFH[0]) {
                        System.out.println("FULL HOUSE");
                        fullHouse = true;
                    }
                } else if (dieFH[2] == dieFH[3] && dieFH[3] == dieFH[4]) {
                    if (dieFH[0] == dieFH[1] && dieFH[0] != dieFH[2]) {
                        System.out.println("FULL HOUSE");
                        fullHouse = true;

                    }
                } else if (dieFH[2] == dieFH[3] && dieFH[3] == dieFH[1]) {
                    if (dieFH[0] == dieFH[4] && dieFH[0] != dieFH[2]) {
                        System.out.println("FULL HOUSE");
                        fullHouse = true;

                    }
                }

                if (straightCount == 5 || straightCount2 == 5) {
                    System.out.println("STRAIGHT");
                    straight = true;
                }
                straightCount2 = 0;
                straightCount = 0;

                if (yahtzee == true && straight == true && fullHouse == true) {
                    System.out.println("There were " + roll + " rolls for a straight, yahtzee and full house");
                    finish = true;
                    System.out.println("yay, you win");
                } else {
                    System.out.println("It is turn #" + roll + ", roll again");

                    //Choose dice to re-roll
                    System.out.println("Enter the number of the die to be rerolled: ie enter 2415 for those die to be rerolled");
                    rerollDie = In.getString();
                    int rerollDie2 = Integer.parseInt(rerollDie);
                    int[] digits = Integer.toString(rerollDie2).chars().map(c -> c -= '0').toArray();

                    for (int x = 0; x <= (digits.length - 1); x++) {
                        if (digits[x] == 5 || digits[x] == 1 || digits[x] == 2 || digits[x] == 3 || digits[x] == 4) {
                            int whydoesntthiscrapnotwork = (digits[x] - 1);
                            System.out.println(digits[x] - 1);
                            die[whydoesntthiscrapnotwork] = (int) (Math.random() * 6) + 1;
                            System.out.println("die " + (whydoesntthiscrapnotwork + 1) + " has been rerolled");
                        }
                    }
                    for (int x = 0; x <= 4; x++) {
                        System.out.println("die " + (x + 1) + " = " + die[x]);
                    }
                }

            }
        } else if (choice == 2) {
            boolean finish = false;

            int[] die = {0, 0, 0, 0, 0};
            boolean yahtzee = false;
            boolean straight = false;
            boolean fullHouse = false;
            int straightCount = 0;
            int straightCount2 = 0;

            int roll = 0;

            for (int x = 0; x <= 4; x++) {
                die[x] = (int) (Math.random() * 6) + 1;
                System.out.println("die " + (x + 1) + " = " + die[x]);
            }

            while (finish == false) {
                roll++;
                int straight1[] = {1, 2, 3, 4, 5};
                String rerollDie;

                int straight2[] = {2, 3, 4, 5, 6};
                int randomcrap = 0;

                //Yahtzee Finder
                if (die[0] == die[1] && die[1] == die[2] && die[2] == die[3] && die[3] == die[4]) {
                    System.out.println("YAHTZEE");
                    yahtzee = true;
                }
                //Straight Finder
                for (int x = 0; x <= 4; x++) {
                    boolean straightbool = false;
                    boolean straightbool2 = false;

                    for (int c = 0; c <= 4; c++) {
                        if (die[x] == (straight1[c]) && straightbool == false) {
                            straightbool = true;
                            straightCount++;
                            straight1[c] = 0;
                        }
                        if (die[x] == (straight2[c]) && straightbool2 == false) {
                            straightbool2 = true;
                            straightCount2++;
                            straight2[c] = 0;
                        }
                    }

                }
                int[] dieFH = {0, 0, 0, 0, 0};

                //Full House Finder
                for (int x = 0; x <= 4; x++) {
                    dieFH[x] = die[x];
                }
                Arrays.sort(dieFH);
                System.out.println(Arrays.toString(dieFH));

                if (dieFH[0] == dieFH[1] && dieFH[1] == dieFH[2]) {
                    if (dieFH[3] == dieFH[4] && dieFH[3] != dieFH[0]) {
                        System.out.println("FULL HOUSE");
                        fullHouse = true;
                    }
                } else if (dieFH[2] == dieFH[3] && dieFH[3] == dieFH[4]) {
                    if (dieFH[0] == dieFH[1] && dieFH[0] != dieFH[2]) {
                        System.out.println("FULL HOUSE");
                        fullHouse = true;
                    }
                }

                if (straightCount == 5 || straightCount2 == 5) {
                    System.out.println("STRAIGHT");
                    straight = true;
                }
                straightCount2 = 0;
                straightCount = 0;

                if (yahtzee == true && straight == true && fullHouse == true) {
                    System.out.println("There were " + roll + " rolls for a straight, yahtzee and full house");
                    finish = true;
                    System.out.println("yay, you win");
                } else {
                    System.out.println("It is turn #" + roll + ", roll again");
                }
                //AI reroll dice
                //Fullhouse First
                if (straight == false) {
                    Boolean oneOnly = false;
                    int[] toChange = {-1, -1, -1, -1, -1, -1, -1, -1, -1};
                    int changeCount = 0;
                    for (int x = 0; x <= 4; x++) {

                        if (die[x] == 6) {
                            System.out.println("6 legit randomized");
                            toChange[changeCount] = x;
                            changeCount++;
                        }

                        for (int c = 0; c <= 4; c++) {
                            if (die[x] == die[c] && x != c) {
                                toChange[changeCount] = x;
                                changeCount++;
                                for (int i = 0; i <= 4; i++) {
                                    if (toChange[i] == c && i != x) {
                                        changeCount = changeCount - 1;
                                        toChange[changeCount] = -1;
                                        changeCount = changeCount + 1;
                                    }
                                }

                            }
                        }

                    }
                    boolean awCrap = false;
                    for (int x = 0; x <= 7; x++) {
                            for (int c = 0; c <= 7; c++) {
                                if (toChange[x] == toChange[c] && x != c && x > c) {
                                    toChange[x] = -1;
                                }

                            }
                        if (toChange[x] > -1) {
                            System.out.println(die[toChange[x]] + " randomized");
                            die[toChange[x]] = (int) (Math.random() * 6) + 1;
                        }

                    }
                    System.out.println(Arrays.toString(toChange));
                } else if (fullHouse == false) {
                    System.out.println("Solving full house");
                    //AI automatically solves FullHouse second
                    for (int x = 0; x <= 4; x++) {
                        dieFH[x] = die[x];
                    }
                    Arrays.sort(dieFH);
                    if ((dieFH[0] == dieFH[1] && dieFH[1] == dieFH[2]) || (dieFH[2] == dieFH[3] && dieFH[3] == dieFH[4]) || (dieFH[2] == dieFH[3] && dieFH[3] == dieFH[1])) {
                        System.out.println("3 same detected");
                        int dieCount = 0;
                        for (int i = 0; i <= 4; i++) {
                            if (die[i] != dieFH[2]) {
                                System.out.println(die[i] + " is randomized");
                                dieCount++;
                                die[i] = (int) (Math.random() * 6) + 1;

                            }
                        }
                        if (dieCount != 2) {
                            System.out.println("dieCount!=2");
                            if (die[0] == dieFH[2]) {
                                System.out.println("dieCount!=2 original");
                                System.out.println(die[0] + "is randomized");
                                die[0] = (int) (Math.random() * 6) + 1;
                            } else {
                                System.out.println("dieCount!=2 backup");
                                System.out.println(die[1] + "is randomized");
                                die[1] = (int) (Math.random() * 6) + 1;
                            }
                        }

                    } else {
                        System.out.println("2 same detected");
                        boolean pair = false;
                        for (int x = 0; x <= 4; x++) {
                            for (int c = 0; x <= 4; x++) {
                                if (die[x] == die[c] && pair == false && x != c) {
                                    pair = true;
                                    for (int i = 0; i <= 4; i++) {
                                        System.out.println("Changing others");
                                        if (die[i] != die[x]) {
                                            System.out.println("Changing others2");

                                            die[i] = (int) (Math.random() * 6) + 1;
                                        }
                                    }
                                }
                            }
                        }
                        if (pair == false) {
                            for (int c = 0; c <= 4; c++) {
                                die[c] = (int) (Math.random() * 6) + 1;
                            }
                        }

                    }
                } else if (yahtzee == false) {
                    //AI to get Yahtzee
                    for (int x = 0; x <= 4; x++) {
                        dieFH[x] = die[x];
                    }
                    Arrays.sort(dieFH);
                    if ((dieFH[0] == dieFH[1] && dieFH[1] == dieFH[2]) || (dieFH[2] == dieFH[3] && dieFH[3] == dieFH[4]) || (dieFH[2] == dieFH[3] && dieFH[3] == dieFH[1])) {
                        System.out.println("3 same detected");
                        int dieCount = 0;
                        for (int i = 0; i <= 4; i++) {
                            if (die[i] != dieFH[2]) {
                                System.out.println(die[i] + " is randomized");
                                dieCount++;
                                die[i] = (int) (Math.random() * 6) + 1;

                            }
                        }

                    }
                    
                }

                for (int x = 0; x <= 4; x++) {
                    System.out.println("die " + (x + 1) + " = " + die[x]);
                }

            }

        }// else if choice 3

    }
}
