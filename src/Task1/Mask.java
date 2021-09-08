package Task1;

public class Mask {
    public String maskify(String str){
        if(str.length() <= 4) return str;

        StringBuilder result = new StringBuilder(str);
        for(int i = result.length() - 5; i >= 0; i--){
            result.setCharAt(i, '#');
        }
        return result.toString();
    }
}
