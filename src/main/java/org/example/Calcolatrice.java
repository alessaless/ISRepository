package org.example;

public class Calcolatrice {

    public static double getSomma(double operando1, double operando2){
        return operando1 + operando2;
    }

    public static double getSottrazione(double operando1, double operando2){
        return operando1 - operando2;
    }

    public static double getMoltiplicazione(double operando1, double operando2){
        return operando1 * operando2;
    }

    public static double getDivisione(double operando1, double operando2){
        if(operando2 != 0){
            return operando1 / operando2;
        }
        return 999999999;
    }

}
