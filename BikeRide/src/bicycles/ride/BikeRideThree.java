package bicycles.ride;

import bicycles.Bicycle;

public class BikeRideThree implements BikeRide {
    private final bicycles.Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle)
    {
        this.bicycle = bicycle;
    }

    public  void ride( ) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
    }

    public int getcurrent(){
        return this.bicycle.currentSpeed();
    }
}
