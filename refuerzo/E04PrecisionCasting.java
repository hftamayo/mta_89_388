package refuerzo;

public class E04PrecisionCasting {
    public static void main(String[] args) {
        /*CASTING CONVERSION:
        conversion de un float a int, sin el operador de casting
        (int) generaría un error
        */
        int i = (int)12.5f;

        // STRING CONVERSION: conversion automatica de int a string
        System.out.println("(int)12.5f==" + i);

        /*conversion de asignacion:
        de un entero a float
        */
        float f = i;

        // conversion de float a string
        System.out.println("de int a float: " + f);

        /*
        escalamiento o promocion a tipo float
        la operacion es float * float
        */
        System.out.print(f);
        f = f * i;

        // conversion de las 2 variables a string
        System.out.println("*" + i + "==" + f);

        /*
        conversion de invocacion:
        del tipo original(float) a doble
        en este caso fue necesario debido a que 
        la funcion Math.sin
        unicamente acepta valores dobles
        */
        double d = Math.sin(f);

        // conversion automatica a String
        System.out.println("Math.sin(" + f + ")==" + d);
    }
}
