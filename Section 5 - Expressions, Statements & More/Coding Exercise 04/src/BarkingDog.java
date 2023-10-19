public class BarkingDog {

    public static void main(String[] args) {
        shouldWakeUp(true, 1);
    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

        if (barking == true && ((0 < hourOfDay && hourOfDay > 22) || (hourOfDay > 22 && hourOfDay < 23))) {
            return true;
        } else {
            return false;
        }
    }
    
}
