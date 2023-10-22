public class Main {

    public static void main(String[] args) {

        System.out.println("0 is " + (isPrime(0) ? "" : "NOT PRIME") + "a prime number");
        System.out.println("8 is " + (isPrime(8) ? "" : "NOT PRIME") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT PRIME") + "a prime number");

        int count = 0;

        for (int i = 0; i <= 50; i++){
            if (isPrime(i)){
                System.out.println("number" + i + " is a prime number");
                count ++;
            }
        }


    }

    public static boolean isPrime(int wholeNumber){

        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
