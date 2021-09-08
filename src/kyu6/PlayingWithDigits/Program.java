package kyu6.PlayingWithDigits;

/*
    Task: https://www.codewars.com/kata/5552101f47fc5178b1000050
 */
public class Program {
    public static void main(String[] args){
        var playingWithDigits = new PlayingWithDigits();

        System.out.println(playingWithDigits.digPow(89,1));
        System.out.println(playingWithDigits.digPow(92,1));
        System.out.println(playingWithDigits.digPow(695,2));
        System.out.println(playingWithDigits.digPow(46288,3));
    }
}
