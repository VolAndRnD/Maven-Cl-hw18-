class Main {
    public static void main(String[] args) {
        GameManager gM = new GameManager( false,4);

    System.out.println("До какого раунда доживет игрок? - " + gM.isFailed(2));
    System.out.println("До какого раунда доживет игрок? - " + gM.round(new int[]{1, 2, 4,1,5})) ;
    }
}