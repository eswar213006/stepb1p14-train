import java.util.Set;
import java.util.HashSet;

public class TRAINCONSISTMANAGEMENTAPP {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet
        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // duplicate

        System.out.println("Unique Bogie IDs: " + bogieIds);
    }
}