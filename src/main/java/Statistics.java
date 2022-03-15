import java.lang.reflect.Array;
import java.util.Arrays;

public class Statistics {
    static boolean isGreenLight = false;
    static int maxSpeed = 3;

    public static int alldroppedOut(int[] speedOfPlayer) { // количество выбывающих
        int sumDroppedOut = 0;

        for (int speed : speedOfPlayer) {
            if (isGreenLight) {
                sumDroppedOut += 0;
            } else {
                if (speed > maxSpeed) {
                    sumDroppedOut++;


                }
            }
        }
        return sumDroppedOut;
    }


    public static int[] droppedOut(int[] speedOfPlayer) {
        int cnt = 0;
        for (int speed : speedOfPlayer) { // счетчик размера массива
            if (isGreenLight) {
            } else {
                if (speed > maxSpeed) {
                    cnt++;
                }
            }
        }

        int[] ans = new int[cnt];
        int i = 0;
        for (int speed : speedOfPlayer) { //массив выбывающих
            if (isGreenLight) {
            } else {
                if (speed > maxSpeed) {
                    ans[i] = speed;
                    i++;
                }
            }
        }
        return ans;
    }

    public static int[] remain(int[] speedOfPlayer) {
        int cnt = 0;
        for (int speed : speedOfPlayer) { // счетчик для массива
            if (isGreenLight) {
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
            if (isGreenLight) {
                ans1[ii] = speed;
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


    public static String[] listName(String[] nameSpeed) {

        int a = 0;
        int cnt = -1;
        int cnt2 = 0;
        for (String part : nameSpeed) {
            a++;}

        String[] names = new String[a];
        String[] positions = new String[a];
        int [] live = new int[a];



        for (String part : nameSpeed) {
            String[] list = part.split(" ");
            positions[cnt2] = list[1]; // массив для сверки позиций
            cnt2++;
            int speed = Integer.parseInt(list[1]);
            cnt++;
            if (isGreenLight) {
                live[cnt] = speed;

            } else {
                if (speed <= maxSpeed) {
                    live[cnt] = speed;// интовой массив выжыивших
                }
            }
        }

        int cnt3=0;

        for (String part : nameSpeed) { // массив имен
            String[] list = part.split(" ");
            String name = list[0];
            names [cnt3] = name;
            cnt3++;}

        int cnt4 = 0;// строковый массив выживших
        String[] remain = new String[a];
        for (int happy : live) {
            String part1 = Integer.toString(happy);
            remain[cnt4] = part1;
            cnt4++;
        }
        int cnt5 = 0;
        int cnt6 = 0;
        for (int i2 = 0; i2 < live.length; i2++) { //счетчик для сверки массивов
            if (positions[i2].equals(remain[i2])) {
                cnt5++;

            }
        }
        String[] listName = new String[cnt5]; // сравненние строк массивов скоростей, для заполнения массива имен выживших
        for (int i3 = 0; i3 < live.length; i3++) {
            if (positions[i3].equals(remain[i3])) {
                listName[cnt6] = names[i3];
                cnt6++;
            }
        }
        return listName;
    }
}







