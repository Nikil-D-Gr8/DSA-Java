import java.util.Arrays;

public class UtilityMethodsArray {

    public static void main(String[] args) {
        // Example array for demonstration
        int[] numbers = {3, 1, 4, 1, 5, 9};

        // 1. Arrays.toString()
        // Converts the array to a string representation.
        // Useful for displaying array contents easily.
        System.out.println("Array as String: " + Arrays.toString(numbers));

        // 2. Arrays.sort()
        // Sorts the specified array into ascending order.
        // The sort operation is performed in-place.
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // 3. Arrays.binarySearch()
        // Searches the sorted array for a specified value using the binary search algorithm.
        // Returns the index of the value if found; otherwise, returns a negative value.
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("Index of 4: " + index); // Outputs index of 4

        // 4. Arrays.equals()
        // Compares two arrays for equality.
        // Returns true if both arrays are of the same length and contain the same elements in the same order.
        int[] otherNumbers = {1, 3, 4, 5, 9};
        boolean isEqual = Arrays.equals(numbers, otherNumbers);
        System.out.println("Are arrays equal? " + isEqual);

        // 5. Arrays.fill()
        // Fills the specified array with the specified value.
        // This can be used to initialize or reset the values of an array.
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10); // Fills filledArray with the value 10
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // 6. Arrays.copyOf()
        // Copies the specified array, truncating or padding with zeros to obtain the specified length.
        // Useful for creating a new array with a subset of elements or changing the size.
        int[] copiedArray = Arrays.copyOf(numbers, 3); // Copy first 3 elements
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // 7. Arrays.asList()
        // Converts an array into a fixed-size List.
        // The returned list is backed by the original array, so changes to the list affect the array.
        String[] stringArray = {"Java", "Python", "C++"};
        System.out.println("List from Array: " + Arrays.asList(stringArray));

        // 8. Arrays.parallelSort()
        // Sorts the specified array in parallel using multiple threads for improved performance.
        // This is particularly useful for large arrays.
        int[] parallelSortArray = {5, 3, 6, 2, 1};
        Arrays.parallelSort(parallelSortArray);
        System.out.println("Parallel Sorted Array: " + Arrays.toString(parallelSortArray));
    }
}
