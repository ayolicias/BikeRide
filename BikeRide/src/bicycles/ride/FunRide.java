package bicycles.ride;

import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
//    int counter;

    public static int maximum;


    public FunRide( int maximum ) {

        FunRide.maximum = maximum;
    }

    private  List< Bicycle > bikes = new ArrayList< Bicycle >();

    public  void accept( Bicycle bicycle ) {

        if (maximum > bikes.size()) {
            bikes.add(bicycle);
            System.out.println("bike accepted");
        } else if (maximum <= bikes.size()) {
            System.out.println("maximum is reached");
        }
    }

    public  int getCountForType( BicycleType bicycleType ) {
//        return getCountForType;
        int funCounter = 0;

        for (Bicycle i : bikes) {
            if (i.getBicycleType() == bicycleType) {
                funCounter++;
            }
        }
        return funCounter;
    }
}




