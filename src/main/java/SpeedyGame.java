class SpeedyGame extends Game {
    protected int maxSpeed;
    protected boolean isGreenLight;

    public SpeedyGame( boolean isGreenLight, int maxSpeed) {
        super(isGreenLight);
        this.isGreenLight = isGreenLight;
        this.maxSpeed = maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed(int maxSpeed) {
        return maxSpeed;
    }

    public boolean isFailed(int speed) {
        if (getLight()) {
            return false;
        } else {
            return speed > maxSpeed;
        }

    }
}
