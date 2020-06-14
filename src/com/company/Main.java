package com.company;

public class Main {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();
        /*   op.operatii(88);
        System.out.println("Ex 2");
        op.operatii2(-78);
        System.out.println("Ex 3");
        op.numaratoare(1, 6);
        System.out.println("Ex 4");
        op.numaratoare2(9,5);
        System.out.println("Ex 5");
        op.nrpar();
        System.out.println("Ex 6");
        op.nrimpar();
        System.out.println("Ex 7");
        op.adunare(94);
        System.out.println("Ex 8");
        op.medienr(99);
        System.out.println("Ex 9");
        op.star("*");
        System.out.println();
        System.out.println("Ex 1");
        op.displayHundred(95);
        System.out.println("Ex 2");
        op.displayHundred2(-98);

        System.out.println("Ex 3");
        op.displayNumaratoare(8, 15);
        System.out.println("Ex 4");
        op.comparing3(5, 8);

        System.out.println("Ex 5");
        op.par2();

        System.out.println("Ex 6");
        op.impar2();

        System.out.println("Ex 7");
        op.average2();

        System.out.println("Ex 8");
        op.seven();

        System.out.println("Ex 9");
        op.fibonacci();
        System.out.println();
        System.out.println("Ex 10");
        op.wozaCozaLoza();



        Calculator calc = new Calculator();
        System.out.println();
        System.out.println("Rezultatul adunarii este: " + calc.add(5, 3));
        System.out.println("Rezultatul adunarii cu trei variabile de tip int este: " + calc.add(5,2, 7));
        System.out.println("Rezultatul adunarii varianta trei este:" + calc.add(3.5, 12));

        System.out.println("Rezultatul scaderii este: " + calc.substraction(5, 3));
        System.out.println("Rezultatul scaderii (metoda2) este: "+calc.substraction(15,4,2));
        System.out.println("Rezultatul scaderii (metoda3) este: "+calc.substraction(22.5,14.5,12));

        System.out.println("Rezultatul inmultirii este: " + calc.multiplication(5, 3));
        System.out.println("Rezultatul inmultirii(metoda2) este:"+calc.multiplication(4,4.4));
        System.out.println("Rezultatul inmultirii(metoda3) este: "+calc.multiplication(10, 22.3));

        System.out.println("Rezultatul impartirii este: " + calc.division(5, 3));
        System.out.println("Rezultatul impartirii(metoda2) este: " +calc.division(10.5, 5));
        System.out.println("Rezultatul impartirii(metoda3) este:" +calc.division(25,4.5));


        int[] myArray = op.write();
        op.printArray(myArray);


        int[] evenArrays = op.evenNumber (new int[50]);
        op.printArray(evenArrays);

        op.arraySum();
        op.checkString();
        op.checkNumber();
        op.grille();
        System.out.println();
        op.displayWithoutNumber();
        op.secondSmallerNumber();
        op.copyArray();
        op.addElement();
        op.minMax();

        List<Integer> myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        op.printList(myList);
        op.addToList(myList, 5);
        op.printlistfromy(myList,2);
        op.printListReverse(myList);
        op.addFirst(myList,3);
        op.printPosition(myList);
        System.out.println("Max: " + op.maxNumber(myList));

        List<String> myList2 = new ArrayList();
        myList2.add("a");
        myList2.add("b");
        myList2.add("c");
        myList2.add("d");

        op.addString(myList2,4,"b");




        int biggest = op.checkBiggerNumber(7,9);
        System.out.println("The bigger number is: " + biggest);
        String text = "FastTrackIT";
        System.out.println(op.checkText(text));
        System.out.println(op.checkTextNumber("FastTrackIT",3));
        System.out.println(op.checkSnow(7));
        System.out.println(op.multipleChecks(4));
        System.out.println(op.switchCase(5));
        System.out.println(op.isNumberEven(8));
        System.out.println(op.isEligibleToVote(18));
        System.out.println(op.threeNumbers(8,9,6));




         printJava();
        printModel();
        System.out.println("Media numerelor este: " + mediaNumerelor(5, 3, 8));
        System.out.println("Restul impartirii este: " + printRest(9, 4));
        System.out.println("Temperatura in grade celsius este: " + temperatura(45));
        System.out.println("Distanta in metrii este: " + distanta(65));
        System.out.println("Viteza este: " + viteza(2, 20, 57, 100));
        printMyName();
        printSum();
        printHi();
        printOp();


    }

    //Exercitiul 1
    public static void printMyName() {
        System.out.println("Hello world");
        System.out.println("Hello \n Alexandru");

    }


    public static void printSum() {
        int a, b;
        a = 5;
        b = 10;
        int sum = a + b;
        System.out.println();
        System.out.println("Suma numerelor 5 si 10 este: " + sum);

    }

    public static void printHi() {
        double c, d;
        c = 10;
        d = 3;
        double rez = c / d;
        System.out.println();
        System.out.println("Rezultatul impartirii numarului 10 la 3 este: " + rez);

    }

    public static void printOp() {
        System.out.println();
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        float e, f, g, h;
        e = 20;
        f = -3;
        g = 5;
        h = 8;
        float rezultat = ((e + (f * g) / h));
        System.out.println(+rezultat);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    // Exercitiul 3
    public static void printJava() {
        System.out.println("   J    a   V     V   a");
        System.out.println("   J   a a   V   V   a a");
        System.out.println("J  J  aaaaa   V V   aaaaa");
        System.out.println(" JJ  a     a   V   a     a");
    }

    // Exercitiul 4
    public static double mediaNumerelor(double primulNumar, double alDoileaNumar, double alTreileaNumar) {

        double media = (primulNumar + alDoileaNumar + alTreileaNumar) / 3;

        return media;

    }

    // Exercitiul 5
    public static void printModel() {
        System.out.println();
        System.out.println("  +'''''+ ");
        System.out.println(" [| o o |] ");
        System.out.println("  |  ⌃  |)  ");
        System.out.println("  | '-' |   ");
        System.out.println("  +-----+   ");
    }

    // Exercitiul 6
    public static int printRest(int primulNumar, int alDoileaNumar) {
        int rest=primulNumar% alDoileaNumar;
        return rest;
    }

    // Exercitiul 7
    public static double temperatura(double grade) {
       double c = ((grade - 32)*5)/9;
       return c;

    }

    // Exercitiul 8
    public static double distanta(double inch) {
        double m = inch/39.370;
        return m;

    }

    // Exercitiul 9
    public static double viteza(double ore, double minute, double secunde, double metrii) {
        double rezultat = (metrii / (secunde + minute * 60.0 + ore * 3600.0));
        System.out.println("Viteza in m/s:" +rezultat);
        rezultat = ((metrii / (secunde + minute  * 60.0 + ore * 3600.0)) *3.6);
        System.out.println("Viteza in km/h:" +rezultat);
        rezultat = ((metrii / (secunde + minute  * 60.0 + ore * 3600.0)) *2.237);
        System.out.println("Viteza in mile/h:" +rezultat);
        return rezultat;

    }

*/
        Read read = new Read();
        read.readNumber();
        read.readNumberDouble();
    }
}