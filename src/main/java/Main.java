class Main {

    public static void main(String[] args) {

        int[] speedOfPlayer = {5, 0, 2, 10, 3, 1};
        int alldropped = Statistics.alldroppedOut(speedOfPlayer);
        int[] dropped = Statistics.potentiallyDroppedOut(speedOfPlayer);
        int[] allremain = Statistics.guaranteedRemain(speedOfPlayer);
        int[] maxSpeed = Statistics.MAX_SPEED(speedOfPlayer);

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