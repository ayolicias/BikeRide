package bicycles;

import bicycles.models.BicycleType;

public abstract class  BicycleBase implements Bicycle {

    public int speed;


    protected void changeSpeed( int speed ) {
        this.speed += speed;
    }

    //    protected BicycleBase( ) {
//        this.speed = speed;
//
//    }
    public int currentSpeed( ) {
        return this.speed;
    }


    public void stop( ) {
        this.speed = 0;
    }

    public BicycleType getBicycleType( BicycleType bicycleType ) {
        return bicycleType;
    }
}


