public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(1440);
    }

    public static void printYearsAndDays(long minutes){

        if (minutes <= 0){

            System.out.println("Invalid Value");
        }else {

            long hours = minutes / 60;
            long day = hours / 24 ;
            long years = day / 365 ;
            long remainingDays = day % 365 ;

//            System.out.println(hours + " hours");
//            System.out.println(day + " days");
//            System.out.println(years + " years");

            System.out.println(minutes + "  min = " + years + " y " + remainingDays + " d ");
        }

    }

}
