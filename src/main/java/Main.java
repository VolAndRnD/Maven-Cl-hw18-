class Main {
    public static void main (String[] args) {
        GameManager gM = new GameManager( new SpeedyGame(false,6));
        Movable p1 = new ConstantPlayer( 5);
        Movable p2 = new FastPlayer( 1, 2);
        System.out.println( "Проигрывает игрок: " + gM.loser1(p1,p2,5));
    }
}

