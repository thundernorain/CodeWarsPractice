package kyu8.TwiceAsOld;

/*
    Task: https://www.codewars.com/kata/5b853229cfde412a470000d0
 */

public class Program {
    public static void main(String[] args){
        var twiceAsOld = new TwiceAsOld();

        System.out.println(twiceAsOld.calculate(30, 16));
        System.out.println(twiceAsOld.calculate(32, 14));
    }
}
