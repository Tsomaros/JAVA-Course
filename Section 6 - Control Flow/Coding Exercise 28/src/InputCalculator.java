import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        int loopCount = 0;
        int numbers = 0;

        while(loop){
            try{
                int number = Integer.parseInt(scanner.nextLine());
                numbers += number;
                loopCount++;
            }catch (NumberFormatException nfe){
                loop = false;
            }
        }

        if (loopCount == 0){
            System.out.println("SUM = "+ 0 + " AVG = " + 0);
        }else {
            int Avg = Math.round((float) numbers / loopCount);
            System.out.println("SUM = " + numbers + " AVG = " + Avg);
        }

    }

}
