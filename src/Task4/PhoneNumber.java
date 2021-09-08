package Task4;

public class PhoneNumber {
    public String formIntArray(int[] array){
        if(array.length != 10) return null;

        var phoneNumber = new StringBuilder("(");
        for(int i = 0; i < array.length; i++){
            phoneNumber.append(array[i]);

            if(i == 2) phoneNumber.append(") ");
            if(i == 5) phoneNumber.append("-");
        }

        return phoneNumber.toString();
    }
}
