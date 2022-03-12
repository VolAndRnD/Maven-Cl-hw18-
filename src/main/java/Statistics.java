public class Statistics {

    static int maxSpeed = 3;

    public static int alldroppedOut( int[] speedOfPlayer) { // количество выбывающих
        int sumDroppedOut = 0;

        for (int speed : speedOfPlayer) {
            if (Main.greenLight()) {
                sumDroppedOut += 0;
            } else {
                if (speed > maxSpeed) {
                    sumDroppedOut++;


                }
            }
        }
        return sumDroppedOut;
    }


    public static int[] droppedOut( int[] speedOfPlayer) {
        int cnt = 0;
        for (int speed : speedOfPlayer) { // счетчик размера массива
            if (Main.greenLight()) {
            } else {
                if (speed > maxSpeed) {
                    cnt++;
                }
            }
        }

        int[] ans = new int[cnt];
        int i = 0;
        for (int speed : speedOfPlayer) { //массив выбывающих
            if (Main.greenLight()) {
            } else {
                if (speed > maxSpeed) {
                    ans[i] = speed;
                    i++;
                }
            }
        }
        return ans;
    }

    public static int[] remain( int[] speedOfPlayer) {
        int cnt = 0;
        for (int speed : speedOfPlayer) { // счетчик для массива
            if (Main.greenLight()) {
                cnt++;
            } else {
                if (speed <= maxSpeed) {
                    cnt++;
                }
            }
        }

        int[] ans1 = new int[cnt];
        int ii = 0;
        for (int speed : speedOfPlayer) { //массив выживших
            if (Main.greenLight()) {
                ans1[ii]=speed;
                ii++;
            } else {
                if (speed <= maxSpeed) {
                    ans1[ii] = speed;
                    ii++;
                }
            }
        }
        return ans1;
    }
}