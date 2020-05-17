package com.company;

public class Calculator {


    public int add(int primulNumar, int alDoileaNumar) {

        return primulNumar + alDoileaNumar;

}
    public int add(int primulNumar, int alDoileaNumar, int alTreileaNumar) {

        return primulNumar + alDoileaNumar+alTreileaNumar;

    }
    public float add(double primulNumar, int alDorileaNumar){
        return (float) (primulNumar + alDorileaNumar);
    }





    public int subtraction(int primulNumar, int alDoileaNumar) {

        return primulNumar - alDoileaNumar;
    }


    public int subtraction(int primulNumar, int alDoileaNumar, int alTreileaNumar) {

        return primulNumar - alDoileaNumar - alTreileaNumar;
    }

    public double subtraction(double primulNumar, double alDoileaNumar, int alTreileaNumar) {

        return primulNumar - alDoileaNumar - alTreileaNumar;
    }




    public int multiplication(int primulNumar, int alDoileaNumar) {

        return primulNumar * alDoileaNumar;

    }

    public double multiplication(int primulNumar, double alDoileaNumar) {

        return primulNumar * alDoileaNumar;

    }

    public float multiplication(float primulNumar, double alDoileaNumar) {

        return (float) (primulNumar * alDoileaNumar);

    }


    public double division(double primulNumar, double alDoileaNumar) {

        return primulNumar / alDoileaNumar;

    }

    public int division(int primulNumar, double alDoileaNumar) {

        return (int) (primulNumar / alDoileaNumar);

    }
    public float division(float primulNumar, double alDoileaNumar) {

        return (float) (primulNumar / alDoileaNumar);

    }
}
