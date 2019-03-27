package bicycles.ride;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideFour implements BikeRide {

    private final bicycles.Bicycle bicycle;

    public BikeRideFour(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public  void ride( ) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
    }

    public int getcurrent(){
        return this.bicycle.currentSpeed();
    }
}
