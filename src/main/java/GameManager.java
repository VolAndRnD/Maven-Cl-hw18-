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

       public int loser1(Movable p1, Movable p2, int rounds) {
        int loser = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i=0; i<rounds;i++)
            if (sG.isFailed(p1.getSpeed())){
                cnt1++;
            }

        for (int i=0; i<rounds;i++)
            if (sG.isFailed(p2.getSpeed())){
                cnt2++;
            }
        if (cnt1 == cnt2){loser = 0;}
        if (cnt1 > cnt2){loser = -1;}
        if (cnt1 < cnt2){loser = 1;}

        return loser;
    }
}