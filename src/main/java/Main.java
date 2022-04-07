class Main {
    public static void main (String[] args) {
        GameManager gM = new GameManager( new SpeedyGame(false,3));
        System.out.println( "Игрок со скоростью 4 выбывет? - " +  gM.game.isFailed(4) );
        System.out.println("До какого раунда доживет игрок? - " + gM.round(new int[]{1, 2, 4,1,5})) ;
    }
}

