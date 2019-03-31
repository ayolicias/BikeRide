package bicycles.ride;

import bicycles.Bicycle;

public class BikeRideTwo implements BikeRide {

    private final bicycles.Bicycle bicycle;

    public BikeRideTwo(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public  void ride( ) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();


    }



    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }
}
