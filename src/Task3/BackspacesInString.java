package Task3;

public class BackspacesInString {
    public String execute(String string) {
        if (!string.contains("#")) return string;

        var result = new StringBuilder(string);

        // While result string contains a sharp
        while (result.indexOf("#") != -1) {
            if (result.isEmpty()) break;

            var indexOfBackspace = result.indexOf("#");

            //  Deleting sharp
            result.deleteCharAt(indexOfBackspace);

            // Check if sharp is not the first char
            if (indexOfBackspace == 0) continue;

            //  Deleting char that was before sharp
            result.deleteCharAt(indexOfBackspace - 1);
        }

        return result.toString();
    }
}
