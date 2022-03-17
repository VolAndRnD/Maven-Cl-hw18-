class Main {
    public static void main (String[] args) {
        SpeedyGame sG = new SpeedyGame( false, 3);
        System.out.println( "Игрок со скоростью 2 выбывет? - " +  sG.isFailed(2) );
    }
}

