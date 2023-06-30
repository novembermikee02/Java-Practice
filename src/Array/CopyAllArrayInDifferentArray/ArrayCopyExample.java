package Array.CopyAllArrayInDifferentArray;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] destinationArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        // Printing the copied array
        for (int element : destinationArray) {
            System.out.println(element);
        }
    }
}
