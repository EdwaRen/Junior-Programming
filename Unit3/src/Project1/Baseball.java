/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baseballvhj;

import javaInputLib.In;

class Baseballer {

    public static void main(String[] args) {
        int finalScore1 = 0;
        int finalScore2 = 0;
        int innings = 3;
        int choice = 0;
        int count = 0;
        int inningchangeCount = 0;
        boolean inninghome = false;

        System.out.println("Welcome to Eddies Baseball Game!");
        System.out.println("Mkay now I, Mr McKay will be your host for this fun and exciting baseball game");

        System.out.println("------------------------");
        System.out.println("So to view the 3+, 4, or 4+ projects, type a 1, 2, or a 3 respectively mkay?");
        System.out.println("The 4++ project is under the folder 'Project1' and is named 'BaseballPremiumEdition'");

        choice = In.getInt();

        while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
            System.out.println("You have entered an invalid choice, please enter another mkay?");
            choice = In.getInt();
        }
        if (choice == 1) {
            System.out.println("You have entered a 1 and are now viewing the 3+ project");
            System.out.println("------------------------");
            String team1;
            String team2;
            System.out.println("Please enter the home team's name");
            team1 = In.getString();
            System.out.println("Good, now enter the visiting team's name");

            team2 = In.getString();

            for (int i = 1; i <= innings; i++) {
                Integer score1 = 0;
                Integer score2 = 0;
                System.out.println("");

                System.out.println("It is now inning # " + i);
                System.out.println("-------------------------");

                if (i % 2 == 1) {
                    System.out.println("Enter the integer score for this inning for the home team " + team1);
                    score1 = In.getInt();
                    System.out.println(team1 + "'s integer score is " + score1);
                    System.out.println("");
                    System.out.println("M'kay now enter the integer score for this inning for the visiting team " + team2);
                    score2 = In.getInt();
                    System.out.println(team2 + "'s integer score is " + score2);
                    System.out.println("");
                } else {
                    System.out.println("Enter the integer score for this inning for the visiting team " + team1);
                    score2 = In.getInt();
                    System.out.println(team2 + "'s integer score is " + score2);
                    System.out.println("");
                    System.out.println("M'kay now enter the integer score for this inning for the home team " + team1);
                    score1 = In.getInt();
                    System.out.println(team1 + "'s integer score is " + score1);
                    System.out.println("");
                }

                if (score1 > score2) {
                    System.out.println("M'kay so the inning score was " + team1 + ": " + score1 + " and " + team2 + ": " + score2);
                    System.out.println("So now obviously " + team1 + " won that one, m'kay?");
                } else if (score2 > score1) {
                    System.out.println("Mkay so the inning score was " + team1 + ": " + score1 + " and " + team2 + ": " + score2);
                    System.out.println("So now obviously " + team2 + " won that one, m'kay?");
                } else if (score1 == score2) {
                    System.out.println("Mkay so the final score was " + team1 + ": " + score1 + " and " + team2 + ": " + score2);
                    System.out.println("So now obviously we have a tie here");
                }
                System.out.println("");
                finalScore1 = finalScore1 + score1;
                finalScore2 = finalScore2 + score2;
                System.out.println("Alrite, so the score as of now is " + team1 + ": " + finalScore1 + " and " + team2 + ": " + finalScore2);

                if (i == innings) {
                    if (finalScore1 == finalScore2) {
                        System.out.println("M'kay so the scores are now tied, and ties are not allowed in this game. Ever. So there will be an extra inning m'kay?");
                        System.out.println("");
                        innings = innings + 1;
                    } else if (finalScore1 > finalScore2) {
                        System.out.println("M'kay so the game has ended and " + team1 + " won");
                        finalScore1 = 0;
                        finalScore2 = 0;
                    } else if (finalScore1 < finalScore2) {
                        System.out.println("M'kay so the game has ended and " + team2 + " won");
                        finalScore1 = 0;
                        finalScore2 = 0;
                    }
                }
            }

        } else if (choice == 2) {
            System.out.println("You have entered a 2 and are now viewing the 4 project");
            System.out.println("------------------------");
            String team1;
            String team2;
            System.out.println("Please enter the home team's name");
            team1 = In.getString();
            System.out.println("Good, now enter the visiting team's name");

            team2 = In.getString();

            for (int i = 1; i <= innings; i++) {
                Integer score1 = 0;
                Integer score2 = 0;
                Integer out = 1;
                String result = "bob";
                System.out.println("");

                System.out.println("It is now inning # " + i);
                System.out.println("-------------------------");

                if (innings % 2 == 1) {
                    System.out.println("It is now the home team, " + team1 + " turn to bat.");
                    while (out <= 3) {
                        System.out.println("");

                        System.out.println("Enter a 'run' or a 'out' until there have been 3 outs m'kay?");
                        result = In.getString();

                        if (result.equals("run")) {
                            finalScore1 = finalScore1 + 1;
                        } else if (result.equals("out")) {
                            out = out + 1;
                        } else {
                            System.out.println("You have not entered a 'run' nor an 'out'. Please enter another value");
                        }
                    }
                    out = 1;
                    System.out.println("");
                    System.out.println("It is now the visiting team, " + team1 + " turn to bat.");
                    while (out <= 3) {
                        System.out.println("");

                        System.out.println("Enter a 'run' or a 'out' until there have been 3 outs m'kay?");
                        result = In.getString();

                        if (result.equals("run")) {
                            finalScore2 = finalScore2 + 1;
                        } else if (result.equals("out")) {
                            out = out + 1;
                        } else {
                            System.out.println("You have not entered a 'run' nor an 'out'. Please enter another value");
                        }
                    }
                } else {
                    System.out.println("It is now the visiting team, " + team1 + " turn to bat.");
                    while (out <= 3) {
                        System.out.println("");

                        System.out.println("Enter a 'run' or a 'out' until there have been 3 outs m'kay?");
                        result = In.getString();

                        if (result.equals("run")) {
                            finalScore2 = finalScore2 + 1;
                        } else if (result.equals("out")) {
                            out = out + 1;
                        } else {
                            System.out.println("You have not entered a 'run' nor an 'out'. Please enter another value");
                        }

                    }
                    out = 1;
                    System.out.println("");
                    System.out.println("It is now the home team, " + team1 + " turn to bat.");
                    while (out <= 3) {
                        System.out.println("");

                        System.out.println("Enter a 'run' or a 'out' until there have been 3 outs m'kay?");
                        result = In.getString();

                        if (result.equals("run")) {
                            finalScore1 = finalScore1 + 1;
                        } else if (result.equals("out")) {
                            out = out + 1;
                        } else {
                            System.out.println("You have not entered a 'run' nor an 'out'. Please enter another value");
                        }
                    }

                }

                System.out.println("");
                finalScore1 = finalScore1 + score1;
                finalScore2 = finalScore2 + score2;
                System.out.println("Alrite, so the score as of now is " + team1 + ": " + finalScore1 + " and " + team2 + ": " + finalScore2);

                if (i == innings) {
                    if (finalScore1 == finalScore2) {
                        System.out.println("M'kay so the scores are now tied, and ties are not allowed in this game. Ever. So there will be an extra inning m'kay?");
                        System.out.println("");
                        innings = innings + 1;
                    } else if (finalScore1 > finalScore2) {
                        System.out.println("M'kay so the game has ended and " + team1 + " won");
                        finalScore1 = 0;
                        finalScore2 = 0;
                    } else if (finalScore1 < finalScore2) {
                        System.out.println("M'kay so the game has ended and " + team2 + " won");
                        finalScore1 = 0;
                        finalScore2 = 0;
                    }
                }
            }

        } else if (choice == 3) {
            System.out.println("You have entered a 3 and are now viewing the 4+ project");
            System.out.println("------------------------");
            String team1;
            String team2;
            System.out.println("Please enter the home team's name");
            team1 = In.getString();
            System.out.println("Good, now enter the visiting team's name");
            int[] player = {0, 0, 0, 0, 0};
            boolean[] playerDone = {false, false, false, false, false};
            int xbase2 = -1;
            int xbase3 = -1;
            int xbase4 = -1;
            int next = 0;
            boolean dominant = false;
            boolean dominant2 = false;

            team2 = In.getString();

            for (int i = 1; i <= innings; i++) {
                Integer score1 = 0;
                Integer score2 = 0;
                Integer out = 1;
                String result = "bob";
                System.out.println("");

                System.out.println("It is now inning # " + i);
                System.out.println("-------------------------");
                inningchangeCount = 0;

                
                while (inningchangeCount <= 0) {
                    if (inninghome == true) {
                        inninghome = false;
                    } else {
                        inninghome = true;
                    }
                    System.out.println(inninghome);
                    System.out.println(inningchangeCount);
                    int finalScore = 0;
                    inningchangeCount++;
                    if (inninghome == true) {
                        System.out.println("It is now the home team, " + team1 + " turn to bat.");
                    } else {
                        System.out.println("It is now the visiting team, " + team2 + " turn to bat.");
                    }

                    while (out <= 3) {
                        for (int c = 0; c < playerDone.length; c++) {
                            playerDone[c] = false;
                        }

                        System.out.println("");
                        System.out.println("Enter a 'single', 'double', 'home' or a 'out' until there have been 3 outs m'kay?");
                        result = In.getString();
                        xbase4 = -1;
                        xbase2 = -1;
                        xbase3 = -1;
                        for (int x = 0; x < playerDone.length; x++) {
                            playerDone[x] = false;
                        }
                        if (result.equals("single")) {

                            dominant = false;
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] == 0 && dominant == false) {
                                    next = x;
                                    dominant = true;
                                }
                            }

                            player[next] = 1;

                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 1) {
                                        player[x] = player[x] + 1;
                                        xbase2 = x;
                                        System.out.println(xbase2);
                                        playerDone[1] = true;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 2 && x != xbase2 && playerDone[1] == true) {
                                        player[x] = player[x] + 1;
                                        System.out.println(xbase3);
                                        xbase3 = x;
                                        playerDone[2] = true;
                                    }
                                }
                            }
                            System.out.println(xbase3);
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next && playerDone[2] == true) {
                                    if (player[x] == 3 && x != xbase3) {
                                        player[x] = player[x] + 1;
                                        xbase4 = x;
                                        playerDone[3] = true;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1) {
                                    if (player[x] > 3 && playerDone[3] == true) {
                                        System.out.println(player[x]);
                                        System.out.println("Player" + x + " SCORE OMGOMGOMOMG SCORE!!!");
                                        player[x] = 0;
                                        finalScore++;
                                    }
                                }
                                System.out.println("Player" + x + " is now on base " + player[x]);
                            }

                        } else if (result.equals("double")) {
                            dominant = false;
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] == 0 && dominant == false) {
                                    next = x;
                                    dominant = true;
                                }
                            }

                            player[next] = 2;

                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 1) {
                                        playerDone[0] = true;
                                        player[x] = player[x] + 2;
                                        xbase2 = x;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 2 && x != xbase2) {
                                        if (playerDone[0] == false) {
                                            player[x] = player[x] + 1;
                                        } else if (playerDone[0] == true) {
                                            player[x] = player[x] + 2;
                                        }
                                        xbase3 = x;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 3 && x != xbase3 && x != xbase2) {
                                        player[x] = player[x] + 1;

                                        xbase4 = x;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1) {
                                    if (player[x] > 3) {
                                        System.out.println("Player " + x + "SCORE OMGOMGOMOMG SCORE!!! 3");
                                        player[x] = 0;
                                        finalScore++;
                                    }
                                }
                                System.out.println("Player" + x + " is now on base " + player[x]);

                            }

                        } else if (result.equals("triple")) {
                            dominant = false;
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] == 0 && dominant == false) {
                                    next = x;
                                    dominant = true;
                                }
                            }

                            player[next] = 3;

                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 1) {
                                        playerDone[0] = true;
                                        player[x] = player[x] + 3;
                                        xbase2 = x;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 2 && x != xbase2) {
                                        if (playerDone[0] == false) {
                                            player[x] = player[x] + 100;
                                        } else if (playerDone[0] == true) {
                                            player[x] = player[x] + 200;
                                        }
                                        xbase3 = x;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 3 && x != xbase3 && x != xbase2) {
                                        player[x] = player[x] + 100;

                                        xbase4 = x;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1) {
                                    if (player[x] > 3) {
                                        System.out.println("Player " + x + "SCORE OMGOMGOMOMG SCORE!!! 3");
                                        player[x] = 0;
                                        finalScore++;
                                    }
                                }
                                System.out.println("Player" + x + " is now on base " + player[x]);

                            }
                        } else if (result.equals("home")) {
                            dominant = false;
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] == 0 && dominant == false) {
                                    next = x;
                                    dominant = true;
                                }
                            }
                            player[next] = 1;
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1) {
                                    player[x] = 0;
                                    finalScore++;
                                    System.out.println("Player " + x + "SCORE OMGOMGOMOMG SCORE!!! 3");
                                }
                                System.out.println("Player" + x + " is now on base " + player[x]);

                            }

                        } else if (result.equals("out")) {
                            out = out + 1;
                        } else {
                            System.out.println("You have not entered a 'run' nor an 'out'. Please enter another value");
                        }
                    }
                    if (inninghome == true) {
                        finalScore1 = finalScore1 + finalScore;
                    } else {
                        finalScore2 = finalScore2 + finalScore;
                    }
                    out = 1;
                    finalScore = 0;
                    System.out.println("");
                    if (inninghome == true) {
                        System.out.println("It is now the visiting team, " + team2 + " turn to bat.");
                    } else {
                        System.out.println("It is now the home team, " + team1 + " turn to bat.");
                    }
                    for (int fart = 0; fart < player.length; fart++) {
                        player[fart] = 0;
                    }
                    while (out <= 3) {
                        System.out.println("");
                        System.out.println("Enter a 'single', 'double', 'home' or a 'out' until there have been 3 outs m'kay?");
                        result = In.getString();
                        xbase4 = -1;
                        xbase2 = -1;
                        xbase3 = -1;
                        for (int x = 0; x < playerDone.length; x++) {
                            playerDone[x] = false;
                        }
                        if (result.equals("single")) {

                            dominant = false;
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] == 0 && dominant == false) {
                                    next = x;
                                    dominant = true;
                                }
                            }

                            player[next] = 1;

                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 1) {
                                        player[x] = player[x] + 1;
                                        xbase2 = x;
                                        System.out.println(xbase2);
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 2 && x != xbase2) {
                                        player[x] = player[x] + 1;
                                        System.out.println(xbase3);
                                        xbase3 = x;
                                    }
                                }
                            }
                            System.out.println(xbase3);
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 3 && x != xbase3) {
                                        player[x] = player[x] + 1;
                                        xbase4 = x;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1) {
                                    if (player[x] > 3) {
                                        System.out.println(player[x]);
                                        System.out.println("Player" + x + " SCORE OMGOMGOMOMG SCORE!!!");
                                        player[x] = 0;
                                        finalScore++;
                                    }
                                }
                                System.out.println("Player" + x + " is now on base " + player[x]);
                            }

                        } else if (result.equals("double")) {
                            dominant = false;
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] == 0 && dominant == false) {
                                    next = x;
                                    dominant = true;
                                }
                            }

                            player[next] = 2;

                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 1) {
                                        playerDone[0] = true;
                                        player[x] = player[x] + 2;
                                        xbase2 = x;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 2 && x != xbase2) {
                                        if (playerDone[0] == false) {
                                            player[x] = player[x] + 1;
                                        } else if (playerDone[0] == true) {
                                            player[x] = player[x] + 2;
                                        }
                                        xbase3 = x;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 3 && x != xbase3 && x != xbase2) {
                                        player[x] = player[x] + 1;

                                        xbase4 = x;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1) {
                                    if (player[x] > 3) {
                                        System.out.println("Player " + x + "SCORE OMGOMGOMOMG SCORE!!! 3");
                                        player[x] = 0;
                                        finalScore++;
                                    }
                                }
                                System.out.println("Player" + x + " is now on base " + player[x]);

                            }

                        } else if (result.equals("triple")) {
                            dominant = false;
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] == 0 && dominant == false) {
                                    next = x;
                                    dominant = true;
                                }
                            }

                            player[next] = 3;

                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 1) {
                                        playerDone[0] = true;
                                        player[x] = player[x] + 3;
                                        xbase2 = x;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 2 && x != xbase2) {
                                        if (playerDone[0] == false) {
                                            player[x] = player[x] + 100;
                                        } else if (playerDone[0] == true) {
                                            player[x] = player[x] + 200;
                                        }
                                        xbase3 = x;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1 && x != next) {
                                    if (player[x] == 3 && x != xbase3 && x != xbase2) {
                                        player[x] = player[x] + 100;

                                        xbase4 = x;
                                    }
                                }
                            }
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1) {
                                    if (player[x] > 3) {
                                        System.out.println("Player " + x + "SCORE OMGOMGOMOMG SCORE!!! 3");
                                        player[x] = 0;
                                        finalScore++;
                                    }
                                }
                                System.out.println("Player" + x + " is now on base " + player[x]);

                            }
                        } else if (result.equals("home")) {
                            dominant = false;
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] == 0 && dominant == false) {
                                    next = x;
                                    dominant = true;
                                }
                            }
                            player[next] = 1;
                            for (int x = 0; x < player.length; x++) {
                                if (player[x] >= 1) {
                                    player[x] = 0;
                                    finalScore++;
                                    System.out.println("Player " + x + "SCORE OMGOMGOMOMG SCORE!!! 3");
                                }
                                System.out.println("Player" + x + " is now on base " + player[x]);

                            }

                        } else if (result.equals("out")) {
                            out = out + 1;
                        } else {
                            System.out.println("You have not entered a 'run' nor an 'out'. Please enter another value");
                        }

                    }
                    if (inninghome == true) {
                        finalScore2 = finalScore2 + finalScore;
                    } else {
                        finalScore1 = finalScore1 + finalScore;
                    }
                    for (int fart = 0; fart < player.length; fart++) {
                        player[fart] = 0;
                    }
                    out = 1;
                    System.out.println("");

                }

                System.out.println("");
                System.out.println("Alrite, so the score as of now is " + team1 + ": " + finalScore1 + " and " + team2 + ": " + finalScore2);

                if (i == innings) {
                    if (finalScore1 == finalScore2) {
                        System.out.println("M'kay so the scores are now tied, and ties are not allowed in this game. Ever. So there will be an extra inning m'kay?");
                        System.out.println("");
                        innings = innings + 1;
                    } else if (finalScore1 > finalScore2) {
                        System.out.println("M'kay so the game has ended and " + team1 + " won");
                        finalScore1 = 0;
                        finalScore2 = 0;
                    } else if (finalScore1 < finalScore2) {
                        System.out.println("M'kay so the game has ended and " + team2 + " won");
                        finalScore1 = 0;
                        finalScore2 = 0;
                    }
                }
            }

        } else if (choice == 4) {

        }

    }
}
