public class Chap_9_JavaIf_Else {
    public static void main(String[] args) {
        short birthYear = 1997;
        if (birthYear >= 2000 && birthYear < 3000) {
            System.out.println("You're Twenty-First Century Boy / Girl");
            short age = (short) (2024 - birthYear);
            if (age > 18 && age <= 60) {
                System.out.println("Your age is: " + age + ", You can drive!");
            } else if (age > 60) {
                System.out.println("Your age is: " + age + ", You can't drive because you're a senior citizen");
            } else {
                System.out.println("Your age is: " + age + ", You can't drive because you're not an adult");
            }
        } else if (birthYear < 2000 && birthYear >= 1900) {
            System.out.println("You're Twentieth Century Boy / Girl");
            short age = (short) (2024 - birthYear);
            if (age > 18 && age <= 60) {
                System.out.println("Your age is: " + age + ", You can drive!");
            } else if (age > 60) {
                System.out.println("Your age is: " + age + ", You can't drive because you're a senior citizen");
            } else {
                System.out.println("Your age is: " + age + ", You can't drive because you're not an adult");
            }
        } else {
            System.out.println("You're a Primitive Person");
        }


        // Ternery Operator: Short-Hand If-Else Statement
        short age = (short) (2024 - birthYear);
        System.out.println((age>18 && age<=60?"You can drive":"You can't drive"));
    }
}