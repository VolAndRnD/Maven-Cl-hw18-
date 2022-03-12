import java.util.Arrays;

class Main {
    public static void main (String[] args) {

        int[] speedOfPlayer = {5, 0, 2};

        Statistics.isGreenLight = false;
        System.out.println (" Количество выбывших: " + Statistics.alldroppedOut(speedOfPlayer));
        System.out.println( " Выбывшие: " + Arrays.toString(Statistics.droppedOut(speedOfPlayer)));
        System.out.println( " Выжившие: " + Arrays.toString(Statistics.remain(speedOfPlayer)));

        Statistics.isGreenLight = true;
        System.out.println (" Количество выбывших: " + Statistics.alldroppedOut(speedOfPlayer));
        System.out.println( " Выбывшие: " + Arrays.toString(Statistics.droppedOut(speedOfPlayer)));
        System.out.println( " Выжившие: " + Arrays.toString(Statistics.remain(speedOfPlayer)));

    }
}

