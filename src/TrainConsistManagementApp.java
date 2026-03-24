import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Create LinkedHashSet to maintain order + uniqueness
        Set<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate intentionally
        train.add("Sleeper"); // duplicate (will be ignored)

        // Display final train formation
        System.out.println("Final Train Formation:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}