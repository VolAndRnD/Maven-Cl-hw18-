class GameManager extends SpeedyGame {
    protected int maxSpeed;
    public Game game;

    public GameManager(Game game, int maxSpeed) {
        super(game.isGreenLight, maxSpeed);
        this.maxSpeed = maxSpeed;
        this.game = game;
    }


    public int round(int[] player) {


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

    public int loser(Movable p1, Movable p2, int round) {
        int loser = 0;
        if (isGreenLight) {
        } else {
            if (p1.getSpeed() <= maxSpeed && p2.getSpeed() <= maxSpeed) {loser = 0;return loser;}
            if (p1.getSpeed() > maxSpeed && p2.getSpeed() <= maxSpeed) {loser = -1;return loser;}
            if (p2.getSpeed() > maxSpeed && p1.getSpeed() <= maxSpeed) {loser = 1;return loser;}


        }
        return loser;
    }
}

