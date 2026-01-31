package entities;

public class Booking {
    private int id;
    private String bookingDate;
    private String startDate;
    private String endDate;
    private int customerId;
    private int serviceId;

    public Booking() {
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", bookingDate='" + bookingDate + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerId=" + customerId +
                ", serviceId=" + serviceId;
    }
}
