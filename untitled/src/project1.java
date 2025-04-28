public class project1 {
    import java.util.Arrays;public class Main {
        public static void main(String[] args) {
            // 1. Create an array of int called ages
            int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};        // a. Subtract first element from last element
            System.out.println(ages[ages.length - 1] - ages[0]);        // b. Create a new array ages2 with 9 elements
            int[] ages2 = {5, 12, 19, 33, 45, 60, 72, 85, 99};        // i. Subtract first element from last element dynamically
            System.out.println(ages2[ages2.length - 1] - ages2[0]);        // c. Calculate average age
            int sum = 0;
            for (int age : ages) {
                sum += age;
            }
            System.out.println("Average age: " + (sum / (double) ages.length));        // 2. Create an array of String called names
            String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};        // a. Calculate the average number of letters per name
            int totalLetters = 0;
            for (String name : names) {
                totalLetters += name.length();
            }
            System.out.println("Average letters per name: " + (totalLetters / (double) names.length));        // b. Concatenate all names separated by spaces
            String concatenatedNames = String.join(" ", names);
            System.out.println(concatenatedNames);        // 3. Accessing last element of an array
            System.out.println("Last element of names array: " + names[names.length - 1]);        // 4. Accessing first element of an array
            System.out.println("First element of names array: " + names[0]);        // 5. Create nameLengths array
            int[] nameLengths = new int[names.length];
            for (int i = 0; i < names.length; i++) {
                nameLengths[i] = names[i].length();
            }
}
