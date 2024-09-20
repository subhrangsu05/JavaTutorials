public class Chap_4_JavaVariables {
    public static void main(String[] args) {
        // Primitive DataType: byte, short, int, long, float, double, char, boolean
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        float e =   12.1245467F;
        double f = 12.124545747554485445D;
        char g = 'S';
        boolean h = true;
        char i = 65;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        // Non-Primitive DataType: Array, String, Integer, Float, Class
        int[]number = {1,2,3,4,5};
        String name = "Subhrangsu";
        Integer carPrice = 1000000;
        Float weight = 25.148945F;
        class MyClass {
            public MyClass(){}
            @Override
            public String toString(){
                return "Calling from class";
            }
        }
        String myName = null;
        System.out.println(number);
        System.out.println(name);
        System.out.println(carPrice);
        System.out.println(weight);
        System.out.println(new MyClass());
        System.out.println(myName);

        // Final Variable: variables can't be mutable
        final int num = 30;
       // num = 25;  ---> It throws error
        
    }
}
