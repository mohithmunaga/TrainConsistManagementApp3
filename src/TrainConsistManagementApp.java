import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp  {
    public static void main(String[] args) {

        // Create HashMap to store bogie and its capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie-capacity mapping
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display bogie and capacity
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}