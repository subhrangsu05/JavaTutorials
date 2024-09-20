public class Chap_14_JavaMethodOverloading {
    private int num,num1,num2;
    public String mySum(){
        return "Please Enter the number";
    }
    public float mySum(int num){
        this.num = num;
        return 0+this.num;
    }
    public float mySum(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        return this.num1+this.num2;
    }
    public static void main(String[] args) {
        Chap_14_JavaMethodOverloading overLoadedObj = new Chap_14_JavaMethodOverloading();
        System.out.println(overLoadedObj.mySum());
        System.out.println(overLoadedObj.mySum(10));
        System.out.println(overLoadedObj.mySum(10,20));
    }
}
