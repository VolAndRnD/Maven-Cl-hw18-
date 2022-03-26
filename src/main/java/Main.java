class Main {
    public static void main (String[] args) {
        SpeedyGame sG = new SpeedyGame( true, 3);
        System.out.println( "Игрок со скоростью 4 выбывет? - " +  sG.isFailed(4) );
    }
}

