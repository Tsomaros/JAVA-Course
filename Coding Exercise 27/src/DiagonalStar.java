public class DiagonalStar {

    public static void main(String[] args) {

        printSquareStar(2);
    }

    public static void printSquareStar(int number){

        if (number < 5){
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++){ // row

            if (i != 1){
                System.out.println();
            }

            for (int j = 1; j <= number; j++){ // collumn

                if (i == 1 || i == number || j == 1 || j == number || i == j || j == (number - i + 1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
        }

    }
}
