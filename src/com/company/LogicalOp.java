package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    //Exercitiul 1 for
    public void operatii (int number){
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }

    }
    //Exercitiul 2 for
    public void operatii2 (int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }
    //Exercitiul 3 for
    public void numaratoare (int number,int number2) {
        for (int i = number; i <= number2; i++) {
            System.out.println(i);
        }
    }
    //Exercitiul 4 for
    public void numaratoare2 (int number,int number2) {
       if (number < number2) {
           for (int i = number; i <= number2; i++)
            System.out.println(i);
        }
       else
           if(number2 < number)
        {
            for (int i = number2; i <= number; i++)
            System.out.println(i);
        }
    }
    //Exercitiul 5 for
    public void nrpar () {
           for ( int i = 1; i <= 100; i++){
               if (i%2==0)
            System.out.println(i);
        }
    }
    //Exercitiul 6 for
    public void nrimpar () {
        for ( int i = 1; i <= 100; i++){
            if (i%2!=0)
                System.out.println(i);
        }
    }
    //Exercitiul 7 for
    public void adunare (int number) {
        int sum =0;
        for ( int i=number ; i <= 100; i++) {
            sum = sum + i;
        }
                System.out.println(sum);

    }
    //Exercitiul 8 for
    public void medienr (int number) {
        float sum = 0;
        int contor = 0;
        float media = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
            contor++;
            media = sum / contor;
        }
        System.out.println(media);

    }

        //Exercitiul 9 for
        public void star (String n){
            n = "*";
            for (int i = 7; i >= 1; i--) {
                System.out.println();
                {
                    for (int j = 1; j <= 7; j++)
                        System.out.print("*");

                }
            }
        }



        //Execitiul 1 while

    public void displayHundred(int p) {

        while (p <= 100) {
            System.out.println(p);
            p++;
        }

    }
    //Execitiul 2 while

    public void displayHundred2(int p) {

        while (p >= -100) {
            System.out.println(p);
            p--;
        }

    }
    //Execitiul 3 while

    public void displayNumaratoare (int numarunu, int numardoi) {

        while (numarunu <=numardoi) {
            System.out.println(numarunu);
            numarunu++;
        }

    }

         //Exercitiul 4 while
    public void comparing3(int number, int numbertwo) {

        if (number < numbertwo) {
            while(number<=numbertwo) {
                System.out.println(number);
                number ++;
            }

        } else if (numbertwo < number) {
            while(numbertwo<=number) {
                System.out.println(number);
                number++;
            }

        }

    }


    //Exercitiul 5 while
    public void par2() {
        int n=1;
        while (n<=100) {
            if (n % 2 == 0)
                System.out.println(n);
            n++;
        }
    }

    //Exercitiul 6 while
    public void impar2() {
        int n=1;
        while (n<=100) {
            if (n % 2 != 0)
                System.out.println(n);
            n++;
        }
    }

    //Exercitiul 7 while

    public void average2() {
        int n=111;
        float sum = 0;
        float average=0;
        int count = 0;

        while(n<=8899) {
            sum = sum + n;
            n++;
            count ++;
        }
        average = sum/count;
        System.out.println(sum);
        System.out.println(average);

    }
    //Exercitiul 8 while

    public void seven() {
       int k=7;
        int l=70;

        float sum = 0;
        float average=0;
        int count = 0;

        while(k<=l) {
            if (k%7 == 0)
            sum = sum + k;
            k++;
            count ++;
        }
        average = sum/count;
        System.out.println(average);

    }


    // Exercitiul 9 Fibonacci

    public void fibonacci() {
        int n=20;
        int first = 0,next = 1;
        int i = 0;
        System.out.print(first+" "+next);
        while (i<=n)
        {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
            i++;
        }
    }



    //Exercitiul 10 while

    public void wozaCozaLoza() {

        int i = 1;

        while (i <= 110) {

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {

                System.out.print("CozaLozaWoza ");

            } else if (i % 5 == 0 && i % 7 == 0) {

                System.out.print("WozaLoza ");

            } else if (i % 3 == 0 && i % 7 == 0) {

                System.out.print("CozaWoza ");

            } else if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("CozaLoza ");

            } else if (i % 7 == 0) {

                System.out.print("Woza ");

            } else if (i % 5 == 0) {

                System.out.print("Loza ");

            } else if (i % 3 == 0) {

                System.out.print("Coza ");

            } else {

                System.out.print(i + " ");

            }

            if (i % 11 == 0) {

                System.out.println();

            }

            i++;

        }

    }

    public int[] write() {
        int[] array = new int[100];
        for (int i = 1; i <= 100; i++) {
            array[i - 1] = i;
        }
        return array;
    }



        public int[] evenNumber(int[] evenArray) {
        int j=0;

            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    evenArray[j] = i;
                    j++;
                }
            }
            return evenArray;
        }

        public void arraySum() {
            int[] s = {4, 6, 8, 9, 12, 20};
            float sum = 0;
            for (int i = 0; i < s.length; i++) {
                sum += s[i];
            }
            System.out.println("Sum of given array is " + sum);
            float average = sum / s.length;
            System.out.println("Average of given array is " + average);
        }


        public void checkString() {
            String[] s = {"a", "b", "c", "d", "e", "r"};
            String n = "e";
            for (int i = 0; i < s.length; i++) {
                if (s[i] == n)
                    System.out.println(s[i] + " = " + true);
                else
                    System.out.println(s[i] + " = " + false);
            }

        }

        public void checkNumber() {
            int[] m = {4, 5, 8, 10, 6};
            int n = 6;
            int index = 0;
            for (int i = 0; i < m.length; i++) {
                if (m[i] == n) {
                    index = i;
                    System.out.println("Pozitia pe care se afla numarul este: " + index);
                }
            }
        }

        public void grille() {
            String[] n = {"-"};
            for (int i = 10; i >= 1; i--) {
                System.out.println();
                {
                    for (int j = 1; j <= 10; j++)
                        System.out.print("-");

                }
            }
        }

        public void displayWithoutNumber() {
            int[] m = {4, 5, 8, 10, 6};
            int n = 8;
            int index = 0;
            for (int i = 0; i < m.length; i++) {
                if (m[i] != n) {
                    index = i;
                    System.out.println(m[i]);
                }
            }

        }

        public void secondSmallerNumber() {
            int[] arr = {1, 5, 8, 10, 6, 2};
            int first, second, arr_size = arr.length;
            first = second = Integer.MAX_VALUE;
            for (int i = 0; i < arr_size; i++) {
                if (arr[i] < first) {
                    second = first;
                    first = arr[i];
                }

                else if (arr[i] < second && arr[i] != first)
                    second = arr[i];
            }
            System.out.println("The second Smallest element is " + second);
        }

        public void copyArray(){
            int [] a={6,8,10, 12, 20};
            int b[] = new int[a.length];
            b = a;
            b[0]++;

            System.out.println("\n\nValorile primului array sunt: ");
            for (int i=0; i<a.length; i++)
                System.out.print(a[i] + " ");

            System.out.println("\n\nValorile celui de-al doilea array sunt: ");
            for (int i=0; i<b.length; i++)
                System.out.print(b[i] + " ");
        }

        //Tema optional

    public static void addElement()
    {
        int arr[] = {8, 2, 6, 4, 5, 6, 7, 12, 9, 10};
        int x = 20;
        int[] newarr;
        newarr = new int[arr.length + 1];
        newarr=arr;
        int i;

        System.out.println("\n\nValorile primului array sunt: ");
        for (i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");


        newarr[5] = x;

        System.out.println("\n\nValorile celui de-al doilea array sunt: ");
        for (i=0; i<newarr.length; i++)
            System.out.print(newarr[i] + " ");

    }

    public static void minMax(){

        int arr[] = {8, 2, 6, 25, 5, 6, 20, 12, 9, 10};
        int min = arr[0];
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]<=min)
                min=arr[i];
            if(arr[i]>=max)
                max=arr[i];
        }
        System.out.print("\n Minimul este: "+ min);
        System.out.print("\n Maximul este: "+ max);
    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }


    public void printList(List<Integer> list){
        for (int x : list){
            System.out.println(x);
        }
    }

    public void addToList(List<Integer> myList, int x){
        myList.add(x);
        System.out.println(myList);
    }

    public void printlistfromy(List<Integer> myList, int y){

        for (int i = y; i < myList.size(); i++){
          System.out.println(myList.get(i));
       }
    }

    public void printListReverse(List<Integer> mylist){
        Collections.reverse(mylist);
        System.out.println("Modified List: " + mylist);
    }

    public void addString(List<String> myList, int y, String z){
        myList.add(y, z);
        System.out.println(myList);
    }

    public void addFirst(List<Integer>myList, int x){
       myList.add(0,x);
       System.out.println(myList);
    }

    public void printPosition(List<Integer> list){
        System.out.println("List: " + list);
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            System.out.println("Pe pozitia " + i + " valoarea este " + element);
        }
    }

    public int maxNumber(List<Integer> list){
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(sortedlist.size() - 1);
    }
}


