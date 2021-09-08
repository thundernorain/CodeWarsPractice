package kyu8.WhatIsBetween;

/*
    Task: https://www.codewars.com/kata/55ecd718f46fba02e5000029
 */

public class Program {
    public static void main(String[] args){
        var whatIsBetween = new WhatIsBetween();

        var resultArray = whatIsBetween.find(3, 10);

        for(var num : resultArray)
            System.out.print(num + "\t");
    }
}
