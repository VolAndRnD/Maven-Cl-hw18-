class ConstantPlayer implements Movable {
    protected int speed;

    public ConstantPlayer(int speed) {

        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }


}