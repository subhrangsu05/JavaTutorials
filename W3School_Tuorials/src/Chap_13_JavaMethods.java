public class Chap_13_JavaMethods {
    String name;
    public Chap_13_JavaMethods(String name){ // ---> Parameters : copy of the arguments
        this.name = name;
    }
    public String returnStatement1(){
        return "My name is "+name;
    }
    public static void main(String[] args) {
        Chap_13_JavaMethods methodObj1 = new Chap_13_JavaMethods("Subhrangsu"); // --> Arguments
        System.out.println(methodObj1.returnStatement1());
    }
}
