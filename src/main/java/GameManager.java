class GameManager extends SpeedyGame {
    protected SpeedyGame sG;

    public GameManager(SpeedyGame sG) {
        super(sG.isGreenLight, sG.maxSpeed);
       this.sG = sG;
    }


    public int round(int[] player) {


        int cnt = 0;
        for (int speed : player) {
            if (getLight()) {
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