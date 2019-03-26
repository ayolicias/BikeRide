package bicycles;

import bicycles.models.BicycleType;

public class BicycleSpecification {

        private int accelerationSpeed;
        // add a variable for brakeSpeed
        private int brakeSpeed;
        private BicycleType bicycleType;



        public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
            this.accelerationSpeed = accelerationSpeed;
            // initialize brakeSpeed private variable
            this.brakeSpeed = brakeSpeed;
//            this.bicycleType = bicycleType;

        }

        public int getAccelerationSpeed(){
            return accelerationSpeed;
        }
        // add getters for brakeSpeed
        public int getBrakeSpeed(){
            return brakeSpeed;
        }

    public BicycleType getBicycleType(){
        return bicycleType;
    }

}
