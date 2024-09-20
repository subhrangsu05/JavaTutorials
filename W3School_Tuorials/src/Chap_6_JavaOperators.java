public class Chap_6_JavaOperators {
    public static void main(String[] args) {
        // Arithmetic Operator:
        System.out.println(20+20);
        System.out.println(20-20);
        System.out.println(20*20);
        System.out.println(20/20);
        System.out.println(20%20);
        byte a = 10;
        System.out.println(++a);
        System.out.println(--a);
        // Assignment Operator:
        byte b = 100;
        System.out.println(b);
        System.out.println(b+=1);
        System.out.println(b-=1);
        System.out.println(b*=2);
        System.out.println(b/=2);
        // Comparison Operator:
        System.out.println(100>1);
        System.out.println(100<1);
        System.out.println(100>=1);
        System.out.println(100<=100);
        System.out.println(100==100);
        System.out.println(100!=100);
        System.out.println("Subhrangsu".equals("Subhrangsu"));
        // Logical Operator:
        System.out.println(100<=200 || 100>=200);
        System.out.println(100<=200 && 100>=200);
        System.out.println(!(100<=200 && 100>=200));

        // Bitwise Operator:
    }   
}