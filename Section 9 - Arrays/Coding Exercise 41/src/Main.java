import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] integer = getIntegers();
        printArray(integer);
        int[] temp = sortIntegers(integer);
        printArray(temp);
    }

    public static int[] getIntegers(){

        Scanner scanner = new Scanner(System.in);
        int[] arrray = new int[5];
        int i = 0;
        while (i < 5){
            System.out.println("Enter Integer:");
            arrray[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        return arrray;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("Element %d contents %d \n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i =0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i + 1];
                    sortedArray[i + 1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
        }
        return sortedArray;
    }

}
