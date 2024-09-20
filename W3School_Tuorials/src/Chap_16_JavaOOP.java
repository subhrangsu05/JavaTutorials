class MyClass {
    private final int age;
    private String name;

    public MyClass(int age) {
        this.age = age;
    }
    static String greet() {
        return "Hi, Good Morning!";
    }
    public String nameGreet(String name) {
        this.name = name;
        return "Hi " + name + ", Good Morning!";
    }
    public String toString() {
        return "Your age is: " + age;
    }
}

public class Chap_16_JavaOOP {
    private final int age = 27;

    static String greeting() {
        return "Hi, Good Night!";
    }
    public static void main(String[] args) {
        Chap_16_JavaOOP obj1 = new Chap_16_JavaOOP();
        System.out.println(obj1.age);

        MyClass obj2 = new MyClass(obj1.age);
        System.out.println(obj2);

        System.out.println(MyClass.greet()); // ---> Called static method from different class
        System.out.println(greeting()); // ---> Called static method from same class
        System.out.println(obj2.nameGreet("Subhrangsu")); // ---> Called public method from different class
    }
}
