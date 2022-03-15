import java.util.Arrays;

class Main {
    public static void main (String[] args) {

        int[] speedOfPlayer = {5, 7, 2, 3, 1, 0};
        String[] nameSpeed = {"Ivan 5", "Anna 7", "Masha 2", "Misha 3", "Igor 1", "Julia 0"};


        Statistics.isGreenLight = false;
        System.out.println (" Количество выбывших: " + Statistics.alldroppedOut(speedOfPlayer));
        System.out.println( " Выбывшие: " + Arrays.toString(Statistics.droppedOut(speedOfPlayer)));
        System.out.println( " Выжившие, чья скорость была: " + Arrays.toString(Statistics.remain(speedOfPlayer)));
        System.out.println( " Имена выживших: " + Arrays.toString(Statistics.listName(nameSpeed)));

        Statistics.isGreenLight = true;
        System.out.println (" Количество выбывших: " + Statistics.alldroppedOut(speedOfPlayer));
        System.out.println( " Выбывшие: " + Arrays.toString(Statistics.droppedOut(speedOfPlayer)));
        System.out.println( " Выжившие, чья скорость была: " + Arrays.toString(Statistics.remain(speedOfPlayer)));
        System.out.println( " Имена выживших: " + Arrays.toString(Statistics.listName(nameSpeed)));

        }

}
















