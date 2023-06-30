package Array.CopyAllArrayInDifferentArray;

public class ArraySimpleCopy {
    public static void main(String[] args) {
        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] destinationArray = new int[sourceArray.length];

        destinationArray = sourceArray;
        // Copying elements using array assignment
        // for (int i = 0; i < sourceArray.length; i++) {
        // destinationArray[i] = sourceArray[i];
        // }

        // Printing the copied array
        for (int element : destinationArray) {
            System.out.println(element);
        }
    }

    // public static void main(String[] args) {
    // int[] sourceArray = {1, 2, 3, 4, 5};

    // int[] destinationArray = Arrays.stream(sourceArray).toArray();

    // // Printing the copied array
    // for (int element : destinationArray) {
    // System.out.println(element);
    // }
    // }
}
