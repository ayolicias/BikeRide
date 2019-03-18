package bicycles.models;

import bicycles.*;


public class MountainBike implements Bicycle {

    private int speed;

    @Override
    public void accelerate() {

         this.speed +=5;
    }

    @Override
    public void brake() {
         this.speed -=3;
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
