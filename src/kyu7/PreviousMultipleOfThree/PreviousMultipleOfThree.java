package kyu7.PreviousMultipleOfThree;

public class PreviousMultipleOfThree {
    public Integer find(int value){
        while( !(value % 3 == 0) ){
            value /= 10;

            if(value == 0) return null;
        }

        return value;
    }
}
