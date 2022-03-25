class Main {
    public static void main(String[] args) {
        GameManager gM = new GameManager( new Game(false),6);

        Movable p1 = new ConstantPlayer( 5);
        Movable p2 = new FastPlayer( 1, 2);

        System.out.println( gM.loser(p1,p2,1));
        System.out.println( gM.loser(p1,p2,2));
        System.out.println( gM.loser(p1,p2,3));

    }
}