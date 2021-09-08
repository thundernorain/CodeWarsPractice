package kyu6.PlayingWithDigits;

public class PlayingWithDigits {
    public int digPow(int digit, int pow){
        int sum = 0;

        String digitStr = Integer.toString(digit);
        for(int i = 0; i < digitStr.length(); i++){
            var num = Character.getNumericValue(digitStr.charAt(i));

            sum += Math.pow(num, pow + i);
        }

        double result = (double)sum / (double)digit;

        return (result % 1 == 0)? (int)result : -1;
    }
}
