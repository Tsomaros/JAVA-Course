import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int elements = readInteger();
        System.out.println(elements);

        int[] temp = readElements(elements);
        System.out.println(Arrays.toString(temp));
    }

    private static int readInteger(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int elements = Integer.parseInt(scanner.nextLine());

        return elements;
    }

    private static int[] readElements(int num_elements){

        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[num_elements];

        while(i < elements.length){
            System.out.printf("Enter %d element : ", i);
            elements[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }

        return elements;
    }

    private static int findMin(int[] array){

        int min = Integer.MAX_VALUE;

        for (int el : array){
            if (el < min){
                min = el;
            }
        }

        return min;
    }

}
