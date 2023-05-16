package interface1;


public class AbcRoadBuilder implements RoadConstruction{
    private String roadSpecs;
    private String location;
    private String vender;
    private String name;

    public AbcRoadBuilder(String name) {
        this.name = name;
    }
    @Override
    public String experience() {
        return "10 Road ";
    }

    @Override
    public float budget() {
        return 4000000.00f;
    }

    @Override
    public void takeRoadSpecs(String specs) {

    }

    @Override
    public void setLocation(String location) {

    }

    @Override
    public String getProgress() {
        return "700 km completed";
    }

    @Override
    public String toString() {
        return "AbcRoadBuilder{" +
                "roadSpecs='" + roadSpecs + '\'' +
                ", location='" + location + '\'' +
                ", vender='" + vender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
