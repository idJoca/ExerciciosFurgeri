/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciofurgeri;

import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

/**
 *
 * @author joao
 */
public class Exercicio {

    public void printLetters(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }

    public void printMultiplicationTable(Integer number) {
        if (number < 1 || number > 10) {
            System.out.println("Número Inválido");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
    }

    public void printFiveRandomNumbersBetweenOneAndOneThousand() {
        final Integer max = 1000, min = 1;

        for (int i = 0; i < 5; i++) {
            Integer randomInteger = (int) (Math.random() * ((max - min) + 1)) + min;
            System.out.println(randomInteger);
        }
    }

    public void printDayOfWeek(Integer number) {
        String dayOfWeek = "Inexistente";
        switch (number) {
            case 1:
                dayOfWeek = "Domingo";
                break;
            case 2:
                dayOfWeek = "Segunda";
                break;
            case 3:
                dayOfWeek = "Terça";
                break;
            case 4:
                dayOfWeek = "Quarta";
                break;
            case 5:
                dayOfWeek = "Quinta";
                break;
            case 6:
                dayOfWeek = "Sexta";
                break;
            case 7:
                dayOfWeek = "Sábado";
                break;
        }

        System.out.println(dayOfWeek);
    }

    public void printNames(List<String> names) {
        names.forEach((name) -> {
            System.out.println(name);
        });
    }

    public Integer getEvenNumbers(List<Integer> numbers) {
        return (int) numbers.stream().filter((number) -> (number % 2 == 0)).count();
    }

    public Integer sumElements(Integer[] numbers) {
        Integer sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        return sum;
    }

    public Double getArithmeticAverage(List<Double> grades) {
        Double sum = 0d;
        return grades.stream().reduce(sum, Double::sum) / grades.size();
    }

    public Integer[] getIntegersBetween(Integer amount, Integer endPoint) {
        Integer[] numbers = new Integer[amount];
        for (int i = 0; i < amount; i++) {
            numbers[i] = (int) (Math.random() * ((endPoint) + 1));
        }

        return numbers;
    }

    public Boolean validateCPF(String CPF) {
        String cpfPattern = "([0-9]{3}\\.){2}[0-9]{3}\\/[0-9]{2}";
        return CPF.matches(cpfPattern);
    }
}
