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

    }
}

