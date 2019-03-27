package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleSpecification;

public class BicycleFromSpec extends BicycleBase {

    private final BicycleSpecification bicycleSpecification;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification){
    this.bicycleSpecification = bicycleSpecification;
}
    @Override
    public void accelerate( ) {
        changeSpeed(this.bicycleSpecification.getAccelerationSpeed());
    }

    @Override
    public void brake( ) {

    }

    @Override
    public BicycleType getBicycleType( ) {
       // System.out.println(this.bicycleSpecification.getBicycleType());
        return this.getBicycleType(this.bicycleSpecification.getBicycleType());
    }
}
