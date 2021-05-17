import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String name, int numRows, int seatsPerRow) {
        this.theatreName = name;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; ++row) {
            for (int col = 1; col <= seatsPerRow; ++col) {
                seats.add(new Seat(row + String.format("%02d", col)));
            }
        }
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int index = Collections.binarySearch(seats, requestedSeat, null);
        return index >=0 && requestedSeat.reserve();
    }

    public void getSeats() {
        for (Seat seat: seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat: " + getSeatNumber() + " reserved!");
                return true;
            }
            System.out.println("Seat already reserved!!");
            return false;
        }

        public String getSeatNumber() {
            return this.seatNumber;
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + getSeatNumber() + " cancelled");
                return true;
            }
            System.out.println("Seat " + getSeatNumber() + " wasn't reserved!");
            return false;
        }
    }
}
