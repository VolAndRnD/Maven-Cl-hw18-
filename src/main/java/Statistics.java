import java.lang.reflect.Array;
import java.util.Arrays;

public class Statistics {

    public static int[] potentiallyDroppedOut(int[] speedOfPlayer) {
        int sum = 0;
        int cnt = 0;

        for (int speed : speedOfPlayer) {
            if (Main.greenLight()) {
                sum += 0;
            } else {
                if (speed > 0) {
                    System.out.println("Было замечено движение игрока со скоростью " + speed);
                    cnt++;
                }
            }
        }
        int[] ans = new int[cnt];

        int i = 0;
        for (int speed : speedOfPlayer) {
            if (Main.greenLight()) {
                sum += 0;
            } else {
                if (speed > 0) {
                    ans[i] = speed;
                    i++;
                }
            }
        }
        return ans;
    }

    public static int[] guaranteedRemain(int[] speedOfPlayer) {
        int sum = 0;
        int cnt = 0;

        for (int speed : speedOfPlayer) {
            if (Main.greenLight()) {
                sum += 0;
                System.out.println("Остаются игроки, чья скорость " + speed);
            } else {
                if (speed < 1) {
                    System.out.println("Есть игроки со скоростью " + speed);
                    cnt++;
                }
            }
        }
        int[] ans1 = new int[cnt];
        int i = 0;
        for (int speed : speedOfPlayer) {
            if (Main.greenLight()) {
                sum += 0;
            } else {
                if (speed < 1) {
                    ans1[i] = speed;
                    i++;
                }
            }
        }
        return ans1;
    }

    public static int[] MAX_SPEED(int[] speedOfPlayer) {
        int max_speed = Main.optionsMaxSpeed();
        int sum = 0;
        int cnt = 0;
        for (int speed : speedOfPlayer) {
            if (Main.greenLight()) {
                sum += 0;
            } else {
                if (speed > max_speed) {
                    cnt++;
                }
            }
        }
        int[] ans2 = new int[cnt];
        int i = 0;
        for (int speed : speedOfPlayer) {
            if (Main.greenLight()) {
                sum += 0;
            } else {
                if (speed > max_speed) {
                    ans2[i] = speed;
                    i++;
                }
            }
        }
        return ans2;
    }

    public static int notMaxSpeed(int[] speedOfPlayer) {
        int max_speed = Main.optionsMaxSpeed();
        int sum = 0;
        int cnt1 = 0;
        for (int speed : speedOfPlayer) {
            if (Main.greenLight()) {
                sum += 0;
            } else {
                if (speed > max_speed) {
                    System.out.println("Выбывает игрок, чья скорость " + speed);
                    cnt1++;
                }
            }
        }
        return cnt1;

    }

    public static int alldroppedOut(int[] speedOfPlayer) {
        int sumDroppedOut = 0;
        if (Main.greenLight()) {
            sumDroppedOut += 0;
            System.out.println("Выбывает всего игроков " + sumDroppedOut);
        } else {
            sumDroppedOut = notMaxSpeed(speedOfPlayer);
            System.out.println("Выбывает всего игроков " + sumDroppedOut);
        }
        return sumDroppedOut;
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

        int max_speed = Main.optionsMaxSpeed();
        int cnt2 = -1;
        int cnt3 = -1;


        int[] live = new int[size];
        for (String parts : numbers) { // числовой массив выживших
            int funny = Integer.parseInt(parts);
            if (Main.greenLight()) {
                cnt2++;
                live[cnt2] = funny;
            } else {
                cnt3++;
                if (funny <= max_speed) {
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
        System.out.println (Arrays.toString (listName));
        return listName;
    }
}








