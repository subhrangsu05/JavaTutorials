public class Chap_11_JavaContinueBreakStatement {
    public static void main(String[] args) {
        // Continue
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        // break
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
    }
}
