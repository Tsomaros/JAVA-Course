public class DecimalComparator {

    public static void main(String[] args) {

    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second){

        int a = (int) (first * 1000);
        int b = (int) (second * 1000);

        if(a == b){
            return true;
        }else {
            return false;
        }

    }

}
