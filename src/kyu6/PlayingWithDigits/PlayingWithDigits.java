package kyu6.PlayingWithDigits;

public class PlayingWithDigits {
    public int digPow(int digit, int pow){
        int sum = 0;

        String digitStr = Integer.toString(digit);
        for(int i = 0; i < digitStr.length(); i++){
            var num = Character.getNumericValue(digitStr.charAt(i));

            sum += Math.pow(num, pow + i);
        }

        int result = sum / digit;

        return (result != 0)? result : -1;
    }
}
