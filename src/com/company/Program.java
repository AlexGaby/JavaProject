package com.company;

public class Program {
    private ReadProgram read = new ReadProgram();
    private Calculator calc = new Calculator();
    private LogicalOp op = new LogicalOp();

    public void startProgram() {

        boolean repeatProgram;
        do {
            repeatProgram = executeProgram();
        } while (repeatProgram);


    }

    private boolean executeProgram() {
        printMenu();
        int number = read.getInt();
        switch (number) {
            case 1:
                doSum();
                break;
            case 2:
                doSubstract();
                break;
            case 3:
                doMultiplication();
                break;
            case 4:
                doDivision();
                break;
            case 5:
                printHigherNumber();
                break;
            case 6:
                checkText();
                break;
            case 7:
                checkTextNumber();
                break;
            case 8:
                checkSnow();
                break;
            case 9:
                multipleChecks();
                break;
            case 10:
                isNumberEven();
                break;
            case 11:
                isEligibleToVote();
                break;
            case 0:
                System.out.println("Bye bye!");
                return false;


            default:
                printMenu();
        }
        return true;
    }


    private void printMenu() {
        System.out.println(
                "Hello!\n" +
                        "Choose an option:\n" +
                        "1. Sum\n" +
                        "2. Substraction\n" +
                        "3. Multiplication\n" +
                        "4. Division\n" +
                        "5. Get higher number\n" +
                        "6. Check text FastTrack\n" +
                        "7. Check text FastTrack and a number\n" +
                        "8. Check a number\n" +
                        "9. Multiple check\n" +
                        "10. Check if a number is even\n" +
                        "11. Check if a person is eligible to vote\n" +
                        "0. EXIT"

        );
    }

    private void doSum() {
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The sum is: " + calc.add(first, second));
    }

    private void doSubstract() {
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The result is: " + calc.substraction(first, second));
    }

    private void doMultiplication() {
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The result is: " + calc.multiplication(first, second));
    }

    private void doDivision() {
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The result is: " + calc.division(first, second));
    }


    private void printHigherNumber() {
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("the higher number is: " +
                op. checkBiggerNumber(first, second));
    }

    private void checkText() {
        System.out.print("Enter text:");
        String text = read.getString();
        System.out.println(op.checkText(text));
    }

    private void checkTextNumber() {
        System.out.print("Enter text:");
        String text = read.getString();
        int first = read.getInt();
        System.out.println(op.checkTextNumber(text, 3));
    }

    private void checkSnow() {
        System.out.println(op.checkSnow(3));
    }

    private void multipleChecks() {
        System.out.println(op.multipleChecks(4));
    }

    private void  isNumberEven() {
        System.out.println(op.isNumberEven(4));
    }

    private void  isEligibleToVote() {
        System.out.println(op.isEligibleToVote(21));
    }



    private void sortList() {
//        List<Integer> list = read.getList();
//        System.out.println(op.sortList(list));
    }
}
