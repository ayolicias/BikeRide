package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;


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

    @Override
    public BicycleType getBicycleType( ) {
        return this.getBicycleType();
    }
}

