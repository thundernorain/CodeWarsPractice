package kyu7.PreviousMultipleOfThree;

/*
    Task: https://www.codewars.com/kata/61123a6f2446320021db987d
 */
public class Program {
    public static void main(String[] args){
        var previousMultipleOfThree = new PreviousMultipleOfThree();

        var nums = new int[]{1, 25, 36, 1244, 952406};

        for(var num : nums)
            System.out.println(num + "\t-->\t" + previousMultipleOfThree.find(num));
    }
}
