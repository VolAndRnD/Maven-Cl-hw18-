class GameManager  {
    protected SpeedyGame sG;

    public GameManager(SpeedyGame sG) {
        this.sG = sG;
    }


    public int round(int[] player) {

        int cnt = 0;
        for (int speed : player) {
            if (sG.isGreenLight) {
                cnt++;
            } else {
                if (speed <= sG.maxSpeed) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}