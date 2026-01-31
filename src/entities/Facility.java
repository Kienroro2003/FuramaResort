package entities;


public abstract class Facility {
    protected int id;
    protected String name;
    protected double area;
    protected double price;
    protected int maximumPeople;
    protected TypeRent type;

    public Facility() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public TypeRent getType() {
        return type;
    }

    public void setType(TypeRent type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Resort{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maximumPeople=" + maximumPeople +
                ", type=" + type +
                '}';
    }
}
