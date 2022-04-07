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
}