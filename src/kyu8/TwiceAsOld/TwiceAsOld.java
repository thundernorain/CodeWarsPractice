package kyu8.TwiceAsOld;

public class TwiceAsOld {
    /**
     * if error returns null
     */
    public String calculate(int fathersAge, int sonsAge) {
        if (sonsAge >= fathersAge) return null;

        var yearsWhenFatherBeOlderTwice = fathersAge - sonsAge * 2;

        return (yearsWhenFatherBeOlderTwice > 0)
                ? "Father be twice older in " + yearsWhenFatherBeOlderTwice + " years"
                : "Father was twice older " + Math.abs(yearsWhenFatherBeOlderTwice) + " years ago";
    }
}
