public class Chap_15_JavaRecursion {
    private int lengthOfNumber;

    public int returnSum(int lengthOfNumber) {
        this.lengthOfNumber = lengthOfNumber;
        if (lengthOfNumber == 0 || lengthOfNumber < 1) {
            return 0;
        }
        return returnSum(this.lengthOfNumber - 1) + lengthOfNumber;
    }
    public static void main(String[] args) {
        // Recursion: A function is called/ iterated itself
        Chap_15_JavaRecursion objOfRecursion = new Chap_15_JavaRecursion();
        objOfRecursion.lengthOfNumber = 10;
        System.out.println("The sum of first " + objOfRecursion.lengthOfNumber + " natural number is: "
                + new Chap_15_JavaRecursion().returnSum(objOfRecursion.lengthOfNumber));
    }
}
