package bicycles.models;

import bicycles.*;

public class RoadBike implements Bicycle {

    private int speed;

    @Override
    public void accelerate() {
         speed +=11;
    }

    @Override
    public void brake() {
        this.speed -=4;
    }

    @Override
    public int currentSpeed() {
        return this.speed;
    }

    @Override
    public void stop( ) {
        this.speed=0;
    }

}
