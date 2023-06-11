import ra.StopWatch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(100000);
        StopWatch stopwatch = new StopWatch();
        selectionSort(numbers);
        stopwatch.stop();
        System.out.println("Thời gian đã trôi: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    private static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    private static int[] generateRandomNumbers(int length) {
        int[] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt();
        }
        return numbers;
    }
}