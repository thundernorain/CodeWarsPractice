package kyu7.HighestAndLowest;

public class HighestAndLowest {
    public String find(String str){
        if(str.length() == 0) return str;

        var splitStrings = str.split(" ");

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (String splitString : splitStrings) {
            var digit = Integer.parseInt(splitString);

            if (digit > highest) highest = digit;
            if (digit < lowest) lowest = digit;
        }

        return highest + " " + lowest;
    }
}
