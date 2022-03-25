class Main {
    public static void main(String[] args) {
        GameManager gM = new GameManager( new Game(false),4);

    System.out.println("Игрок выбывает? - " + gM.isFailed(2));
    System.out.println("До какого раунда доживет игрок? - " + gM.round(new int[]{1, 2, 4,1,5})) ;
    }
}