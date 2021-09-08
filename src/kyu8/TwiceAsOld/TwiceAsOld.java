package kyu8.TwiceAsOld;

public class TwiceAsOld {
    /**
     * if error returns -1
     */
    public int calculate(int fathersAge, int sonsAge){
        if(sonsAge >= fathersAge) return -1;

        var yearsWhenFatherBeOlderTwice = fathersAge - sonsAge*2;

        return fathersAge + yearsWhenFatherBeOlderTwice;
    }
}
