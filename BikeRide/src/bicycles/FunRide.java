package bicycles;

import bicycles.models.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    private int funBikes;
    public static int maximum;


    public FunRide( int maximum ) {

        FunRide.maximum = maximum;
    }

    private List< Bicycle > bikes = new ArrayList< Bicycle >();

    public void accept( Bicycle bicycle ) {

        if (maximum < bikes.size()) {
            bikes.add(bicycle);

        } else if (maximum >= bikes.size()) {
            System.out.println("maximum is reached");
        }
    }

    public int getCountForType( BicycleType bicycleType ) {
//        return getCountForType;

        for (Bicycle i : bikes) {
            if (i.getBicycleType() == bicycleType) {
                funBikes++;
            }
        }
        return funBikes;
    }
}




