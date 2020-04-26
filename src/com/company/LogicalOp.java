package com.company;

public class LogicalOp {


    // Exercitiul 3

    public int checkBiggerNumber(int first, int second) {

        if (first > second) {

            return first;

        } else {

            return second;

        }
    }

    //Exercitiul 4

    public String checkText(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "got to try some more";
        }
    }

    //Exercitiul 5

    public String checkTextNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return "Learning text comparison" + "\t" + number;
        } else {
            return number + "\t" + "got to try some more";
        }
    }

    //Exercitiul 6

    public String checkSnow(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm):" + "\t" + number;
        } else {
            return "The forecast snow is(cm): " + "\t" + number;
        }

    }

    // Exercitiul 7 -in enuntul problemei numarul 3 nu este inclus in nici una dintre conditii

    public String multipleChecks(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4.";
        } else if (number == 4) {
            return
                    "The number is equal to 4.";
        } else {
            if (number < 3)
                return "The number is lower than 3";
        }

        return null;
    }

    //Exercitiul 8

    public String switchCase(int nr) {
        switch (nr) {
            case 1:
                return "Numarul este 1.";
            case 2:
                return "Numarul este 2";
            case 3:
                return "Numarul este 3";
            case 4:
                return "Numarul este 4";
            case 5:
                return "Numarul este 5";
            case 6:
                return "Numarul este 6";
            case 7:
                return "Numarul este 7";
            default:
                return "Mai incearca, numarul este cuprins intre 1 si 7 ";
        }

    }

    //Exercitiul 9

    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    //Exercitiul 10

    public boolean isEligibleToVote(int number) {
        if (number >=18) {
            return true;
        }
        return false;
    }

    //Exercitiul 11
    public int threeNumbers (int number, int numberTwo, int numberThree) {
        if (number > numberTwo && number > numberThree) {
            return number;
        } else if (numberTwo > number && numberTwo > numberThree)
            return numberTwo;
        return numberThree;
    }

}
