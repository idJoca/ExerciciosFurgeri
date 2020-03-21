/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciofurgeri;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao
 */
public class ExerciciosTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exercicio exercicio = new Exercicio();
        printLetters(exercicio);
        System.out.println("=========");
        printMultiplicationTable(exercicio);
        System.out.println("=========");
        printFiveRandomNumbersBetweenOneAndOneThousand(exercicio);
        System.out.println("=========");
        printDayOfWeek(exercicio);
        System.out.println("=========");
        printNames(exercicio);
        System.out.println("=========");
        System.out.println(getEvenNumbers(exercicio));
        System.out.println("=========");
        System.out.println(sumElements(exercicio));
        System.out.println("=========");
        System.out.println(getArithmeticAverage(exercicio));
        System.out.println("=========");
        System.out.println(getIntegersBetween(exercicio));
        System.out.println("=========");
        System.out.println(validateCPF(exercicio));
    }

    private static void printLetters(Exercicio exercicio) {
        exercicio.printLetters("Palavra");
    }

    private static void printMultiplicationTable(Exercicio exercicio) {
        exercicio.printMultiplicationTable(4);
    }

    private static void printFiveRandomNumbersBetweenOneAndOneThousand(Exercicio exercicio) {
        exercicio.printFiveRandomNumbersBetweenOneAndOneThousand();
    }

    private static void printDayOfWeek(Exercicio exercicio) {
        exercicio.printDayOfWeek(3);
    }

    private static void printNames(Exercicio exercicio) {
        List<String> names;
        names = new ArrayList<String>();

        names.add("João");
        names.add("José");
        names.add("Jorge");

        exercicio.printNames(names);
    }

    private static Boolean getEvenNumbers(Exercicio exercicio) {
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        return exercicio.getEvenNumbers(numbers) == 4;
    }

    private static Boolean sumElements(Exercicio exercicio) {
        Integer[] numbers = {4, 4, 4, 4, 4};

        return exercicio.sumElements(numbers) == 20;
    }

    private static Boolean getArithmeticAverage(Exercicio exercicio) {
        List<Double> grades = new ArrayList<Double>();

        grades.add(1.0d);
        grades.add(10.0d);
        grades.add(4.0d);

        return exercicio.getArithmeticAverage(grades) == 5.0d;
    }

    private static Boolean getIntegersBetween(Exercicio exercicio) {
        return exercicio.getIntegersBetween(4, 20).length == 4;
    }

    private static Boolean validateCPF(Exercicio exercicio) {
        return exercicio.validateCPF("123.123.123/12") && !exercicio.validateCPF("12.12.12/123");
    }
}
