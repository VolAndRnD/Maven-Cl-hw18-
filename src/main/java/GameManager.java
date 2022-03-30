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

    public int loser(Movable p1, Movable p2, int rounds) {
        int loser = 0;
        int i = 0;

            if (sG.isFailed(p1.getSpeed()) == false && sG.isFailed(p2.getSpeed()) == false && rounds != 4) {
                loser = 0;
                }
            else{
            if (sG.isFailed(p1.getSpeed()) != false && sG.isFailed(p2.getSpeed()) == false && rounds != 4 ) {
                loser = -1;
                i++;}
            if (sG.isFailed(p2.getSpeed()) != false && sG.isFailed(p1.getSpeed()) == false && rounds != 4 ) {
                loser = 1;
                i++;}
            }


    return loser;
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