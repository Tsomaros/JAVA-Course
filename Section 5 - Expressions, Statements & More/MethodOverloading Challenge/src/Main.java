public class Main {

    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimetres(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimetres(68) + "cm");
    }

    private static double convertToCentimetres(int inches) {

        return inches * 2.54;
    }

//    private static double convertToCentimetres(int feet, int inches) {
//
//        return ((feet * 12) + inches) * 2.54;
//    }

    private static double convertToCentimetres(int feet, int inches) {

        //return convertToCentimetres((feet * 12) + inches);
        int feeToInches = feet * 12;
        int totalInches = feeToInches + inches;
        double result = convertToCentimetres(totalInches);
        return result;
    }


}
