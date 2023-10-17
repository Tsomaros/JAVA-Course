public class FirstClass {

    public static void main(String[] args) {

        System.out.println("Hello World");

        boolean isAlien = false;

        if( isAlien == false ) {
            System.out.println("It is not an alien");
        }

        int topScore = 80;

        if( topScore <= 100 ){
            System.out.println("You got the high score");
        }

        int secondScore = 80;
        
        if( topScore > secondScore && topScore < 100 ){
            System.out.println("Greater than second and less than 100");
        }

    }

}
