
class Main {

    public static void main(String[] args) {


            int[] speedOfPlayer = {5, 0, 2, 10, 3, 1};
            int alldropped = Statistics.alldroppedOut(speedOfPlayer);
            int[] dropped = Statistics.potentiallyDroppedOut(speedOfPlayer);
            int[] allremain = Statistics.guaranteedRemain(speedOfPlayer);
            int[] maxSpeed = Statistics.MAX_SPEED(speedOfPlayer);
        String[] nameSpeed = {"Ivan 5", "Anna 7", "Masha 2", "Alina 3", "Andrew 1", "Kolya 0"};
        String[] listNameRemain = Statistics.listName(nameSpeed);

        }
        public static int optionsMaxSpeed () {
            int maxSpeed = 3;
            return maxSpeed;
        }
        public static boolean greenLight() {
            boolean isGreenlight = false;
            return isGreenlight;
        }





}










