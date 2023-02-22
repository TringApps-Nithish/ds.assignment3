package as;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println(" 1. insert\n 2. delete \n 3. display \n 4. exit ");
            System.out.printf("Enter your Choice : ");
            int command = sc.nextInt();
            
            if (command==1) {
                System.out.print("Enter a key: ");
                String key = sc.next();
                System.out.print("Enter a value: ");
                int value = sc.nextInt();
                map.put(key, value);
                sc.nextLine(); // consume the newline character left by nextInt()
                System.out.println("Inserted successfully.");
            }
            else if (command==2) {
                System.out.print("Enter a key: ");
                String key = sc.next();
                if (map.containsKey(key)) {
                    map.remove(key);
                    System.out.println("Deleted successfully.");
                }
                else {
                    System.out.println("Key not found.");
                }
            }
            else if (command==3) {
                System.out.println("HashMap Contents:");
                for (String key : map.keySet()) {
                    System.out.println(key + " : " + map.get(key));
                }
            }
            else if (command==4) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid command.");
            }
        }
        
        sc.close();
    }
}

