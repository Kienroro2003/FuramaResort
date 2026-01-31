package entities;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    @Override
    public String toString() {
        return super.toString() +
                ", freeService='" + freeService + '\'';
    }
}
