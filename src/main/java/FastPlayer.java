
public class FastPlayer implements Movable {
    protected int startSpeed;
    protected int speedStep;




    public FastPlayer ( int startSpeed, int speedStep){

        this.startSpeed = startSpeed;
        this.speedStep =  speedStep;

    }


    @Override
    public int getSpeed (){
        this.startSpeed = this.startSpeed + speedStep;
            return startSpeed;}
    }


