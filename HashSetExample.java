package as;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println(" 1. insert\n 2. delete \n 3. display \n 4. exit ");
            System.out.printf("Enter your Choice : ");
            int command = sc.nextInt();
            
            if (command==1) {
                System.out.println("Enter an element: ");
                String element = sc.nextLine();
                set.add(element);
                System.out.println("Inserted successfully.");
            }
            else if (command==2) {
                System.out.println("Enter an element: ");
                String element = sc.nextLine();
                if (set.contains(element)) {
                    set.remove(element);
                    System.out.println("Deleted successfully.");
                }
                else {
                    System.out.println("Element not found.");
                }
            }
            else if (command==3) {
                System.out.println("HashSet Contents:");
                for (String element : set) {
                    System.out.println(element);
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
