class Game {
    public boolean isGreenLight;

    public Game (boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }


    public void setLight (boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public boolean getLight () {
        return isGreenLight;
    }

    public boolean  isFailed(int speed) {
        if (isGreenLight) { return false;}
        else { return speed != 0;}

    }
}