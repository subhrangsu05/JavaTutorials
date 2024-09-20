public class Chap_18_JavaAccessModifiers extends Thread{
        // public: The code is accessible for all classes
        // private: The code is only accessible within the declared class
        // default: The code is only accessible within the same packages
        // protected: The code is only accessible within the same package and subclasses
        // final: The class cannot be inheritated by the other classes or the class attribute cannot be overloaded
        // static: The class and method doesn't need create to any object
        // abstract: The class cannot be used to create objects
        
        // transient: Attributes and methods are skipped when serializing the object containing them
        // synchronized: Methods can only be accessed by one thread at a time
        // volatile: The value of an attribute is not cached thread-locally, and is always read from the "main memory"

        public String name = "Subhrangsu";
        private int age = 27;
        float weight = 54.25F;
        protected String city = "Kolkata";
        final String address = "Andul-Sarkar-Bagan";
        static String ofcName = "Cognizant";
        transient String ofcLocation = "Kolkata"; 
        volatile String state = "West Bengal";
        synchronized void greet1(){
            System.out.println("Good Morning!");
        }
        public void run(){
            new Chap_18_JavaAccessModifiers().greet1();
            System.out.println("State: "+new Chap_18_JavaAccessModifiers().state);
        }
    public static void main(String[] args) {
        Chap_18_JavaAccessModifiers obj1 = new Chap_18_JavaAccessModifiers();
        System.out.println("Name: "+obj1.name);
        System.out.println("Age: "+obj1.age);
        System.out.println("Weight: "+obj1.weight);
        System.out.println("City: "+obj1.city);
        // obj1.address = "311/1 Sarat Chatterjee Road"; ====> It throws error
        System.out.println("Address: "+obj1.address);
        System.out.println("Office Name: "+ofcName);
        System.out.println("Office Location: "+obj1.ofcLocation);
        Chap_18_JavaAccessModifiers obj2 = new Chap_18_JavaAccessModifiers();
        obj2.start();
    }
}
