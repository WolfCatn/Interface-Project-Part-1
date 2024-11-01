import java.util.ArrayList;
import java.util.Collections;

public class Wolf implements Comparable<Wolf> {
    private String name;
    private int strength;

    public Wolf(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public int compareTo(Wolf other) {
        return Integer.compare(this.strength, other.strength);
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                '}';
    }

    public static void main(String[] args) {
        // Create an ArrayList of Wolf objects
        ArrayList<Wolf> wolves = new ArrayList<>();
        wolves.add(new Wolf("Luna", 10));
        wolves.add(new Wolf("Zephyr", 7));
        wolves.add(new Wolf("Alphie", 8));
        wolves.add(new Wolf("Ragnar", 5));
        wolves.add(new Wolf("Nymeria", 2));
        wolves.add(new Wolf("Ashen", 6));
        wolves.add(new Wolf("Frost", 9));
        wolves.add(new Wolf("Lyra", 10));
        wolves.add(new Wolf("Riven", 4));
        wolves.add(new Wolf("Ember", 8));

        // Print the list before sorting
        System.out.println("Before sorting:");
        for (Wolf wolf : wolves) {
            System.out.println(wolf);
        }

        // Sort the list using Collections.sort
        Collections.sort(wolves);

        // Print the list after sorting
        System.out.println("\nAfter sorting:");
        for (Wolf wolf : wolves) {
            System.out.println(wolf);
        }
    }
}