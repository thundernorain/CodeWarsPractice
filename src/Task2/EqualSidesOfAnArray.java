package Task2;

public class EqualSidesOfAnArray {
    public int findIndex(int[] array){
        if(array.length == 0) return 0;

        int sumOfAll = 0;
        for(int val : array)
            sumOfAll += val;

        for(int i = 0; i < array.length; i++){
            int sumLeftSide = 0;

            for(int j = 0; j < i; j++){
                sumLeftSide += array[j];
            }

            if(sumLeftSide == (sumOfAll - array[i] - sumLeftSide) )
                return i;
        }

        return -1;
    }
}
