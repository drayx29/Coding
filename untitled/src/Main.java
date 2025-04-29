import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Create an array of int called ages
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // a. Subtract first element from last element
        System.out.println(ages[ages.length - 1] - ages[0]);

        // b. Create a new array ages2 with 9 elements
        int[] ages2 = {5, 12, 19, 33, 45, 60, 72, 85, 99};

        // i. Subtract first element from last element dynamically
        System.out.println(ages2[ages2.length - 1] - ages2[0]);

        // c. Calculate average age
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        System.out.println("Average age: " + (sum / (double) ages.length));

        // 2. Create an array of String called names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // a. Calculate the average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        System.out.println("Average letters per name: " + (totalLetters / (double) names.length));

        // b. Concatenate all names separated by spaces
        String concatenatedNames = String.join(" ", names);
        System.out.println(concatenatedNames);

        // 3. Accessing last element of an array
        System.out.println("Last element of names array: " + names[names.length - 1]);

        // 4. Accessing first element of an array
        System.out.println("First element of names array: " + names[0]);

        // 5. Create nameLengths array
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        System.out.println(Arrays.toString(nameLengths));

        // 6. Sum of all elements in nameLengths array
        int totalLengthSum = 0;
        for (int length : nameLengths) {
            totalLengthSum += length;
        }
        System.out.println("Total sum of name lengths: " + totalLengthSum);

        // 7. Concatenate word n times
        System.out.println(repeatWord("Hello", 3));

        // 8. Create full name
        System.out.println(fullName("John", "Doe"));

        // 9. Check if sum of array is greater than 100
        System.out.println(isSumGreaterThan100(ages));

        // 10. Calculate average of double array
        double[] values = {10.5, 20.3, 30.2, 40.1};
        System.out.println(arrayAverage(values));

        // 11. Compare averages of two arrays
        double[] values2 = {5.5, 10.2, 15.8};
        System.out.println(isFirstAverageGreater(values, values2));

        // 12. Determine if a drink should be bought
        System.out.println(willBuyDrink(true, 11.00));

        // 13. Custom method example
        System.out.println(isEven(42));
    }

    // 7. Method to repeat a word n times
    public static String repeatWord(String word, int n) {
        return word.repeat(n);
    }

    // 8. Method to return full name
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 9. Method to check if sum of array elements is greater than 100
    public static boolean isSumGreaterThan100(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum > 100;
    }

    // 10. Method to return average of double array
    public static double arrayAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // 11. Method to compare averages of two arrays
    public static boolean isFirstAverageGreater(double[] arr1, double[] arr2) {
        return arrayAverage(arr1) > arrayAverage(arr2);
    }

    // 12. Method to determine if a drink should be bought
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    // 13. Custom method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
