package Task2;

public class EqualSidesOfAnArray {
    public int findIndex(int[] array){
        if(array.length == 0) return 0;

        int sumOfRight = 0;
        int sumOfLeft = 0;

        for(int val : array)
            sumOfRight += val;

        for(int i = 0; i < array.length; i++){
                if(sumOfLeft == (sumOfRight - array[i])) return i;

                sumOfLeft += array[i];
                sumOfRight -= array[i];
        }

        return -1;
    }
}
