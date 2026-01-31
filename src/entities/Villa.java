package entities;

public class Villa extends Facility {
    private String standardRoom;
    private double areaPool;
    private int floor;

    public Villa() {
    }

    @Override
    public String toString() {
        return super.toString() +
                ", standardRoom='" + standardRoom + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor;
    }
}
