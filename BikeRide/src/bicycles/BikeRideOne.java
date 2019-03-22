package bicycles;

public class BikeRideOne implements BikeRide {


    private final bicycles.Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public  void ride( ) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public int getcurrent(){
        return this.bicycle.currentSpeed();
    }




}


