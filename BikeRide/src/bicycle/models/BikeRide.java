package bicycle.models;

import bicycle.bicycle;

    public class BikeRide extends Bicycle {
        private final Bicycle bicycle;


        public BikeRide(Bicycle bicycle){
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
