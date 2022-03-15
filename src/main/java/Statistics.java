import java.lang.reflect.Array;
import java.util.Arrays;

public class Statistics {
    static boolean isGreenLight = false;
    static int maxSpeed = 3;

    public static int alldroppedOut( int[] speedOfPlayer) { // количество выбывающих
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


    public static int[] droppedOut( int[] speedOfPlayer) {
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

    public static int[] remain( int[] speedOfPlayer) {
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


    public static String[] listName(String[] nameSpeed) {
        int size = 0;
        int ii = 0;
        for (int i = 0; i < nameSpeed.length; i++) { // счетчик размеров
            size++;
        }
        String[] numbers = new String[size];

        for (String name : nameSpeed) { // строковый массив скоростей всех игроков
            int start = name.indexOf(" ");
            int finish = name.lastIndexOf("");
            String substr = name.substring(start, finish);
            String part = substr.trim();
            numbers[ii] = part;
            ii = ii + 1;
        }


        int cnt2 = -1;
        int cnt3 = -1;


        int[] live = new int[size];
        for (String parts : numbers) { // числовой массив выживших
            int funny = Integer.parseInt(parts);
            if (isGreenLight) {
                cnt2++;
                live[cnt2] = funny;
            } else {
                cnt3++;
                if (funny <= maxSpeed) {
                    live[cnt3] = funny;

                }
            }
        }

        int cnt4 = 0;// строковый массив выживших
        String[] remain = new String[size];
        for (int happy : live) {
            String part1 = Integer.toString(happy);
            remain[cnt4] = part1;
            cnt4++;
        }

        String[] names = new String[size]; // массив всех имен игроков
        int iii = 0;
        for (String name : nameSpeed) {
            int start = name.indexOf("");
            int finish = name.lastIndexOf(" ");
            String substr = name.substring(start, finish);
            names[iii] = substr;
            iii++;
        }
        int cnt5 = 0;
        int cnt6 = 0;
        for (int i3 = 0; i3 < numbers.length; i3++) { //счетчик для сверки массивов
            if (numbers[i3].equals(remain[i3])) {
                cnt5++;

            }
        }
        String[] listName = new String[cnt5]; // сравненние строк массивов скоростей, для заполнения массива имен выживших
        for (int i3 = 0; i3 < numbers.length; i3++) {
            if (numbers[i3].equals(remain[i3])) {
                listName[cnt6] = names[i3];
                cnt6++;
            }
        }
        return listName;
    }
}








