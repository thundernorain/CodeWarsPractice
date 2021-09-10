package Task2;

/*
You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of
the integers to the left of N is equal to the sum of the integers to the right of N.
If there is no index that would make this happen, return -1.
 */

public class Program {
    public static void main(String[] args){
        var equalSidesOfAnArray = new EqualSidesOfAnArray();

        var array1 = new int[]{1,2,3,4,3,2,1};
        var array2 = new int[]{1,100,50,-51,1,1};
        var array3 = new int[]{20,10,-80,10,10,15,35};

        System.out.println("array1:\t" + equalSidesOfAnArray.findIndex(array1));
        System.out.println("array2:\t" + equalSidesOfAnArray.findIndex(array2));
        System.out.println("array3:\t" + equalSidesOfAnArray.findIndex(array3));
    }
}
