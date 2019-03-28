package bicycles.models;

import bicycles.*;

public  class RoadBike extends BicycleBase {

    public RoadBike( ) { }



    @Override
    public void accelerate() {
         speed +=11;
    }

    @Override
    public void brake() {
        this.speed -=4;
    }

    @Override
    public BicycleType getBicycleType( ) {
        return null;
    }




}
