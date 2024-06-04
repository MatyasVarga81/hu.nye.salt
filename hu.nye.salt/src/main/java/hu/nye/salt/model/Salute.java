package hu.nye.salt.model;

public class Salute {

    private String size;
    private String activity;
    private String location;
    private String unit;
    private String time;
    private String equipment;

    public Salute(String size, String activity, String location, String unit, String time, String equipment) {
        this.size = size;
        this.activity = activity;
        this.location = location;
        this.unit = unit;
        this.time = time;
        this.equipment = equipment;
    }

    public String getSize() {
        return size;
    }

    public String getActivity() {
        return activity;
    }

    public String getLocation() {
        return location;
    }

    public String getUnit() {
        return unit;
    }

    public String getTime() {
        return time;
    }

    public String getEquipment() {
        return equipment;
    }

    @Override
    public String toString() {
        return "Salute{" +
                "size='" + size + '\'' +
                ", activity='" + activity + '\'' +
                ", location='" + location + '\'' +
                ", unit='" + unit + '\'' +
                ", time='" + time + '\'' +
                ", equipment='" + equipment + '\'' +
                '}';
    }
}
