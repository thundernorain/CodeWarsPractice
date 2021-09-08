package Task3;

/*
Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"
Your task is to process a string with "#" symbols.
 */

public class Program {
    public static void main(String[] args){
        var backspacesInString = new BackspacesInString();

        var strings = new String[]{
            "abc#d##c", "abc##d######", "#######", "", "abb#a#a#a#a#c"
        };

        for(var str : strings){
            System.out.println(str + "\t-->\t" + backspacesInString.execute(str));
        }
    }
}
