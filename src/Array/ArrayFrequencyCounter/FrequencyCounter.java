package Array.ArrayFrequencyCounter;

public class FrequencyCounter {
    public static void findFrequency(int[] arr) {
        int n = arr.length;
        int[] frequency = new int[n];

        for (int i = 0; i < n; i++) {
            if (frequency[i] != -1) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        frequency[j] = -1;
                    }
                }
                frequency[i] = count;
            }
        }

        for (int i = 0; i < n; i++) {
            if (frequency[i] != -1) {
                System.out.println("The frequency of " + arr[i] + " is " + frequency[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 1, 2, 1, 4, 5, 4, 2 };
        findFrequency(array);
    }
}
