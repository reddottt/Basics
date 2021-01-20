package first_task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinMaxAverage {

    private static Scanner scanner = new Scanner(System.in);
    public static int[] array = new int[arraySize()];
    private static Random random = new Random();

    public static void main(String[] args){
        MinMaxAverage mma = new MinMaxAverage();
        mma.generateArrayValues();
        mma.findMinValue();
        mma.findMaxValue();
        mma.findAverageValue();
    }

    public static int arraySize(){
        System.out.println("Enter array size:");
        return scanner.nextInt();
    }
    public void generateArrayValues(){
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));
    }

    public void findMinValue(){
        int min = array[0];

        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Min value of array: " + min);
    }
    public void findMaxValue(){
        int max = array[0];

        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Max value of array: " + max);

    }
    public void findAverageValue(){
        double amount =0;
        double average;

        for (int i : array) {
            amount += i;
        }
        average = amount / array.length;
        System.out.println("Average value of array: " + average);
    }

}
