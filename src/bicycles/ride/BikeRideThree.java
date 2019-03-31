package bicycles.ride;

import bicycles.Bicycle;

//package bicycles.Bicycle.;

public class BikeRideThree implements BikeRide {


    private final Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle ) {
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
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
    }



    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }


}
