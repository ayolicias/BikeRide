package bicycles.models;

import bicycles.BicycleBase;


public class Tandem extends BicycleBase {
    public Tandem( ) {
    }

    @Override
    public void accelerate( ) {
        speed += 12;
    }

    @Override
    public void brake( ) {
        this.speed -= 7;
    }
}
//
//    @Override
//    protected int changeSpeed( ) {
//        return changeSpeed;
//    }
//}
