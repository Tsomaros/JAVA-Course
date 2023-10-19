public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(1.25);
    }

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1;
        }else{

            double temp = kilometersPerHour / 1.609;
            long MilesPerHour = Math.round(temp);

            return MilesPerHour;
        }

    }

    public static void printConversion (double kilometersPerHour) {

       long temp = toMilesPerHour(kilometersPerHour);

       if (kilometersPerHour < 0){
           System.out.println("Invalid Value");
       }else {
           System.out.println(kilometersPerHour + " km/h = " + temp + " mi/h");
       }

    }

}
