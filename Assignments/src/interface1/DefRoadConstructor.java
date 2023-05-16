package interface1;

public class DefRoadConstructor implements RoadConstruction {

    private String roadSpecs;
    private String location;
    private String vender;
    private String name;

    public DefRoadConstructor(String name) {
        this.name = name;
    }
    @Override
    public String experience() {
        return "55roads";
    }

    @Override
    public float budget() {
        return 5000000.15f;
    }

    @Override
    public void takeRoadSpecs(String specs) {

    }

    @Override
    public void setLocation(String location) {

    }

    @Override
    public String getProgress() {
        return "1055KM";
    }

    @Override
    public String toString() {
        return "DefRoadConstructor{" +
                "roadSpecs='" + roadSpecs + '\'' +
                ", location='" + location + '\'' +
                ", vender='" + vender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
