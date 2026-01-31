package entities;

public class House extends Facility {
    private String standardRoom;
    private int floor;

    public House() {
    }

    @Override
    public String toString() {
        return super.toString() +
                ", floor=" + floor +
                ", standardRoom='" + standardRoom + '\'';
    }
}
