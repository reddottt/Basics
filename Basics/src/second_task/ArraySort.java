package second_task;

import first_task.MinMaxAverage;

import java.util.Arrays;

public class ArraySort extends MinMaxAverage {
    public static void main(String[] args) {
        ArraySort as = new ArraySort();
        as.generateArrayValues();
        as.sort();
        System.out.println(Arrays.toString(array));
    }
    public void sort(){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
