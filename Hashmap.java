import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101,"Rahul");
        students.put(102, "Priya");
        students.put(103, "Amit");
        students.put(104, "Sneha");

        System.out.println("Student Database:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        int searchId = 102;
        if (students.containsKey(searchId)) {
            System.out.println("\nStudent found: " + students.get(searchId));
        } else {
            System.out.println("\nStudent not found!");
        }
        students.remove(103);

        System.out.println("\nAfter removing ID 103:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

