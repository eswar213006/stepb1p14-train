import java.util.ArrayList;
import java.util.List;

public class TRAINCONSISTMANAGEMENTAPP{

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");


        List<String> passengerBogies = new ArrayList<>();


        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");


        System.out.println("\nPassenger Bogies after adding:");
        System.out.println(passengerBogies);


        passengerBogies.remove("AC Chair");


        System.out.println("\nPassenger Bogies after removal:");
        System.out.println(passengerBogies);


        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper bogie exist? " + exists);


        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);
    }
}