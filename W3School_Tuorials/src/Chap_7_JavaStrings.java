import java.util.Arrays;
public class Chap_7_JavaStrings {
    public static void main(String[] args) {
        String name = "Subhrangsu";
        System.out.println(name);
        String last_name = "Sinha";
        System.out.println(name+" ".concat(last_name));

        // String Methods --->
        System.out.println((name+" ".concat(last_name)).length());
        System.out.println((name+" ".concat(last_name)).toUpperCase());
        System.out.println((name+" ".concat(last_name)).toLowerCase());
        System.out.println((name+" ".concat(last_name)).indexOf("bh"));
        System.out.println((name+" ".concat(last_name)).charAt(5));
        System.out.println((name+" ".concat(last_name)).replace("Subhrangsu","Suvo"));
        System.out.println((name+" ".concat(last_name)).equals("Subhrangsu Sinha"));
        System.out.println((name+" ".concat(last_name)).equalsIgnoreCase("subhrangsu sinha"));
        System.out.println((name+" ".concat(last_name)).startsWith("Su"));
        System.out.println((name+" ".concat(last_name)).endsWith("ha"));
        Arrays.stream((name+" ".concat(last_name)).split(" "))
              .forEach(System.out::println);
        System.out.println(Arrays.toString((name+" ".concat(last_name)).split(" ")));
        System.out.println((name+" ".concat(last_name)).substring(2,13));
        System.out.println(("     ".concat(name)+" ".concat(last_name)+"   ").trim());
        System.out.println((name+" ".concat(last_name)).contains(last_name));
        System.out.println("We are the so-called\r \"Vikings\"\rfrom the north");
    }
}
