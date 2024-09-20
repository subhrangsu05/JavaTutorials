class CarModel{
    private final int modelYear;
    private final String modelName;
    public CarModel(String modelName, int modelYear){
        this.modelName = modelName;
        this.modelYear = modelYear;
    }
    public String toString(){
        return "{\n\tModel Year: "+modelYear+",\n\tModel Name: "+modelName+"\n}";
    }
}
public class Chap_17_JavaConstructor {
    public static void main(String[] args) {
        String[] modelNames = {"BMW","AUDI","MARCEDES"};
        int[] modelYear = {1969,1970,1920};
        CarModel[] obj = new CarModel[modelNames.length];
        for(int i=0;i<obj.length;i++){
            obj[i] = new CarModel(modelNames[i], modelYear[i]);
        }
        for(CarModel car : obj){
            System.out.println(car);
        }
    }
}