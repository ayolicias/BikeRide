package bicycles;

public class BikeRide {


    private final bicycles.Bicycle bicycle;

    public BikeRide(Bicycle bicycle) {
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

//    public int accelarate(){
//        return this.bicycle.accelarate();
//    }


}


