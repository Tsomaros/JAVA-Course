public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int number){

        if (number < 0){
            return -1;
        }

        int num = 0;
        int sum = 0;

        while (number != 0){

            int lastDigit = number % 10;
            mum = (num * 10) + lastDigit;
            number /= 10;

            if (lastDigit % 2 == 0){
                sum += lastDigit;
            }
        }

        return sum;
    }

}
