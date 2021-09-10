package Task3;

public class BackspacesInString {
    public String execute(String string) {
        if (!string.contains("#")) return string;

        var result = new StringBuilder(string);

        int i = 0;
        while(i < result.length()){
            if(result.charAt(i) == '#'){
                result.deleteCharAt(i--);

                if(result.isEmpty()) break;

                if(i > -1) result.deleteCharAt(i--);
            }

            i++;
        }


        return result.toString();
    }
}
