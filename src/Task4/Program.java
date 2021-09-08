package Task4;

/*
Write a function that accepts an array of 10 integers (between 0 and 9),
that returns a string of those numbers in the form of a phone number.
Example: "(123) 456-7890"
 */

public class Program {
    public static void main(String[] args){
        var phoneNumber = new PhoneNumber();

        var stringPhoneNumber = phoneNumber.formIntArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});

        if(stringPhoneNumber != null)
            System.out.println(stringPhoneNumber);
    }
}
