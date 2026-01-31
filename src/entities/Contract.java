package entities;

public class Contract {
    private int id;
    private int bookingId;
    private double depositAmount;
    private double totalPaymentAmount;

    public Contract() {
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", bookingId=" + bookingId +
                ", depositAmount=" + depositAmount +
                ", totalPaymentAmount=" + totalPaymentAmount;
    }
}
