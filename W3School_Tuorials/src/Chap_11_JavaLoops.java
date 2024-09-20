public class Chap_11_JavaLoops {
    public static void main(String[] args) {
        byte constant = 10;
        byte count =0;
        // While Loop: First check the condition
        while(count<=constant){
            System.out.println(count);
            count++;
        }
        // Do-While Loop: Atleast It will run for one time and then will the check the condition
        do{
            System.out.println(count);
            count++;
        }while(count<=constant);
        // For Loop: It will execute intialize, validate and increment in a single line
        for(count =0;count<=constant;count++){
            System.out.println(count);
        }
        // For-Each Loop: Enhanced version of the for loop for arrays
        String[] name = {"suvo","subhrangsu"};
        for(String obj : name){
            System.out.println(obj);
        }
        String name1 = "Subhrangsu Sinha";
        for(char obj : name1.toCharArray()){
            System.out.println(obj);
        }
    }
}
