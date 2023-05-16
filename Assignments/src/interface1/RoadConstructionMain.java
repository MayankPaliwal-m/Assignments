package interface1;

public class RoadConstructionMain {
    public static void main(String[] args) {
        RoadConstruction selectedVender = releseTenderAndSelectContractor();


    }

    public static RoadConstruction releseTenderAndSelectContractor() {
        RoadConstruction vender1 = new DefRoadConstructor("Ghochu Builders");
        return vender1;
    }

}

//    Experience is constructed 10 roads
//        budget is 2.0E7
//        AbcLtdRoadBuilder{roadSpec='length=10km, width = 5m', location='location', vender='null', name='Abc limited'}