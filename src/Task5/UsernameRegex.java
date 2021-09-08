package Task5;

public class UsernameRegex {
    public boolean checkIsUsernameCorrect(String username){
        return username.matches("\\b_*[a-z][_a-z0-9]{4,16}\\b");
    }
}
