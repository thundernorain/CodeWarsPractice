package Task4;

public class PhoneNumber {
    public String formIntArray(Integer[] array){
        if(array.length != 10) return null;

        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", (Object[]) array);
    }
}
