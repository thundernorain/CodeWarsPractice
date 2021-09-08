package kyu7.PreviousMultipleOfThree;

public class PreviousMultipleOfThree {
    public Integer find(int value){
        if(value % 3 == 0) return value;

        var valueStr = new StringBuilder(Integer.toString(value));

        for(int i = valueStr.length()-1; i >= 0; i--){
            valueStr.deleteCharAt(i);

            if(valueStr.isEmpty()) break;

            var result = Integer.parseInt(valueStr.toString());

            if(result % 3 == 0) return result;
        }

        return null;
    }
}
