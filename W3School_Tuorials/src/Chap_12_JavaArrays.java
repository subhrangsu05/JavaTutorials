public class Chap_12_JavaArrays {
    public static void main(String[] args) {
        String[] car = { "BMW", "AUDI", "McLaren", "Lamborgini" };
        // Modern Approach:
        for (String i : car) {
            System.out.println(i);
        }
        // Classic For Loop:
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
        // Define Array Size:
        String[] vehicles = new String[5];
        String[] existingVehicles = { "Bus", "Car", "Cycle", "Bike" };
        for (int i = 0; i < existingVehicles.length; i++) {
            vehicles[i] = existingVehicles[i];
        }
        for (String i : vehicles) {
            if (i == null) {
                break;
            }
            System.out.println(i);
        }

        // Multi-Dimensional Array:
        String[][] wheelers = { { "Commercial Flights", "Private Jeet", "Air Bus" },
                { "Commercial Car", "Private Car", "Bus" },
                { "Motor Bike", "Cycle" }
        };
        for (int i = 0; i < wheelers.length; i++) {
            System.out.print("[");
            for (int j = 0; j < wheelers[i].length; j++) {
                System.out.print(wheelers[i][j]);
                if (j < wheelers[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
