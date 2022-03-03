public class Statistics {

    public static int[] potentiallyDroppedOut( int[] speedOfPlayer) {
        int sum = 0;
        int cnt = 0;

        for (int speed : speedOfPlayer) {
            if (Main.greenLight()) {
                sum+= 0;
            }
            else {
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
    public static int[] guaranteedRemain( int[] speedOfPlayer) {
        int sum = 0;
        int cnt = 0;

        for (int speed : speedOfPlayer) {
            if (Main.greenLight()) {
                sum += 0;
                System.out.println( "Остаются игроки, чья скорость " + speed);
            }
            else {
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
    public static int[] MAX_SPEED (int[] speedOfPlayer) {
        int max_speed = 3;
        int sum = 0;
        int cnt = 0;
        for ( int speed: speedOfPlayer) {
            if (Main.greenLight()) {
                sum += 0;
            }
            else {
                if ( speed > max_speed) {
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

    public static int notMaxSpeed (int[] speedOfPlayer) {
        int max_speed = Main.optionsMaxSpeed();
        int sum = 0;
        int cnt1 = 0;
        for ( int speed: speedOfPlayer) {
            if (Main.greenLight()) {
                sum += 0;
            }
            else {
                if ( speed > max_speed) {
                    System.out.println("Выбывает игрок, чья скорость " + speed);
                    cnt1++;
                }
            }
        }
        return cnt1;

    }

    public static int alldroppedOut( int[] speedOfPlayer) {
        int sumDroppedOut = 0;
        if (Main.greenLight()) {
            sumDroppedOut += 0;
            System.out.println("Выбывает всего игроков " + sumDroppedOut);
        }
        else {
            sumDroppedOut = notMaxSpeed(speedOfPlayer);
            System.out.println("Выбывает всего игроков " + sumDroppedOut);
        }
                return sumDroppedOut;
    }
}
