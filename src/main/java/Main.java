import java.util.Arrays;

class Main {
    public static void main (String[] args) {

        int[] speedOfPlayer = {5, 7, 2, 3, 1, 0};
        String[] nameSpeed = {"Ivan 5", "Anna 7", "Masha 2", "Misha 3", "Igor 1", "Julia 0"};


        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 3;

        System.out.println (" Количество выбывших: " + statistics.alldroppedOut(speedOfPlayer));
        System.out.println( " Выбывшие: " + Arrays.toString(statistics.droppedOut(speedOfPlayer)));
        System.out.println( " Выжившие, чья скорость была: " + Arrays.toString(statistics.remain(speedOfPlayer)));
        System.out.println( " Имена выживших: " + Arrays.toString(statistics.listName(nameSpeed)));
    }
}