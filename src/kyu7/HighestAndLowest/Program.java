package kyu7.HighestAndLowest;

/*
    Task: https://www.codewars.com/kata/554b4ac871d6813a03000035
 */
public class Program {
    public static void main(String[] args){
        var highestAndLowest = new HighestAndLowest();

        var strings = new String[]{
                "1 2 3 4 5",
                "1 2 -3 4 5",
                "1 9 3 4 -5",
                "3"
        };

        for(var str : strings)
            System.out.println(str + "\t-->\t" + highestAndLowest.find(str));
    }
}
