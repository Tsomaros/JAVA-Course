public class AreaCalculator {

    public static void main(String[] args) {

        System.out.println(area(-1));
        System.out.println(area(-1.0, 5.0));
    }

    public static double area(double radius){

        if (radius <= -1){

            return -1;
        }else {

            return area(radius, radius) * 3.14159;
        }

    }

    public static double area(double x, double y){

        if((x <= -1.0) || (y <= -1.0)){

            return -1;
        }else {

            return x * y;
        }
    }

}
