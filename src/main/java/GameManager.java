class GameManager extends SpeedyGame {
    public int maxSpeed;
    public boolean isGreenLight;

    public GameManager(boolean isGreenLight, int maxSpeed) {
        super(isGreenLight, maxSpeed);
        this.maxSpeed = maxSpeed;
        this.isGreenLight = isGreenLight;
    }


    public int round(int[]player) {


        int cnt = 0;
        for (int speed : player) {
            if (isGreenLight) {
                cnt++;
            } else {
                if (speed <= maxSpeed) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
