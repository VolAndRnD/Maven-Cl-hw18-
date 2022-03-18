class SpeedyGame extends Game {
        public int maxSpeed;


    public SpeedyGame(boolean isGreenLight, int maxSpeed) {
        super(isGreenLight);
        this.maxSpeed = maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed(int maxSpeed) {
        return maxSpeed;
    }
}
