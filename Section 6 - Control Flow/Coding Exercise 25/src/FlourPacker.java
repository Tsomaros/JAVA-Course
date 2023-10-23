public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack(0 ,5, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int total) {

        if (bigCount < 0 || smallCount < 0 || total < 0) {
            return false;
        }


        for (int i = 1; i <= bigCount ; i++){
            if (total - 5 > 0){
                total = total - 5;
            } else if (total - 5 == 0) {
                return true;
            }
        }

        System.out.println(total);

        for (int j = 1; j <= smallCount; j++){
            if (total - 1 == 0){
                return true;
            }else {
                total = total - 1;
            }
        }

        return false;
    }


}
