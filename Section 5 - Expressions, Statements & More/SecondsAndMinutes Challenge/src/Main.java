public class Main {

    public static void main(String[] args) {

        System.out.println(getDuration(3945));
        System.out.println(getDuration(65, 45));
    }

    public static String getDuration(int seconds){

        int minutes = seconds / 60;
//        int hours = minutes / 60;
//
//        int remainingMinutes = minutes % 60;
//        int remainingSeconds = seconds % 60;
//        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";

        return getDuration(minutes, seconds);
    }

    public static String getDuration(int minutes, int seconds){

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";

    }

}
