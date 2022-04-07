class GameManager  {
    protected Game game;

    public GameManager(Game game) {
        this.game = game;
    }


    public int round(int[] player) {

        int cnt = 0;
        for (int speed : player) {
            if (!game.isFailed(speed)){cnt++;}

        }
        return cnt;
    }


       public int loser1(Movable p1, Movable p2, int rounds) {
        int loser = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i=0; i<rounds;i++)
            if (!game.isFailed(p1.getSpeed())){
                cnt1++;
            }

        for (int i=0; i<rounds;i++)
            if (!game.isFailed(p2.getSpeed())){
                cnt2++;
            }
        if (cnt1 == cnt2){loser = 0;}
        if (cnt1 > cnt2){loser = -1;}
        if (cnt1 < cnt2){loser = 1;}

        return loser;
    }
}