package Task5;

/*
Write a simple regex to validate a username. Allowed characters are:
lowercase letters,
numbers,
underscore.

Length should be between 4 and 16 characters (both included).
 */

public class Program {
    public static void main(String[] args){
        var usernameRegex = new UsernameRegex();

        var usernames = new String[]{
                "lala_09",
                "qwertyuioas112__",
                "Abbc_11",
                "yyiiOO_001",
                "jhajfhkjghjhhhdkhs___1",
                "___________________________________"
        };

        for(String str : usernames)
            System.out.println(str + "\t-->\t" + usernameRegex.checkIsUsernameCorrect(str));
    }
}
