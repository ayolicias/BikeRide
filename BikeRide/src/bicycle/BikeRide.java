package bicycle;


public abstract class BikeRide extends bicycle {
    private final bicycle bicycle;


        public BikeRide(bicycle bicycle){
            this.bicycle=bicycle;

        }

//System.out.println(bikeRide.currentSpeed());

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }


}
