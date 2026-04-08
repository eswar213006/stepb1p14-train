import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TRAINCONSISTMANAGEMENTAPP {

    public static void main(String[] args) {

        // Step 1: Create HashMap to store bogie-capacity mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management System (UC6) ===");

        // Step 2: User input
        System.out.print("Enter number of bogies to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Step 3: Insert entries into HashMap
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter bogie name: ");
            String bogieName = scanner.nextLine();

            System.out.print("Enter capacity: ");
            int capacity = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // put() method to store key-value pair
            bogieCapacityMap.put(bogieName, capacity);
        }

        // Step 4: Display mapping using entrySet()
        System.out.println("\n=== Bogie Capacity Details ===");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Step 5: Example of fast lookup
        System.out.print("\nEnter bogie name to check capacity: ");
        String searchKey = scanner.nextLine();

        if (bogieCapacityMap.containsKey(searchKey)) {
            System.out.println("Capacity of " + searchKey + " is: "
                    + bogieCapacityMap.get(searchKey));
        } else {
            System.out.println("Bogie not found!");
        }

        scanner.close();
    }
}