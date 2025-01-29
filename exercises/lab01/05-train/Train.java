class Train {
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;

    void build(final int nFirstClassSeats, final int nSecondClassSeats) {
        this.nTotSeats = nFirstClassSeats + nSecondClassSeats;
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;
    }

    void reserveFirstClassSeats(final int nSeats) {
        if (nFirstClassReservedSeats + nSeats <= nFirstClassSeats) {
            nFirstClassReservedSeats += nSeats;
        }
    }

    void reserveSecondClassSeats(final int nSeats) {
        if (nSecondClassReservedSeats + nSeats <= nSecondClassSeats) {
            nSecondClassReservedSeats += nSeats;
        }
    }

    double getTotOccupancyRatio() {
        return (nFirstClassReservedSeats + nSecondClassReservedSeats) * 100.0 / nTotSeats;
    }

    double getFirstClassOccupancyRatio() {
        return nFirstClassReservedSeats * 100.0d / nFirstClassSeats;
    }

    double getSecondClassOccupancyRatio() {
        return nSecondClassReservedSeats * 100d / nSecondClassSeats;
    }

    void deleteAllReservations() {
        nFirstClassReservedSeats = 0;
        nSecondClassReservedSeats = 0;
    }
}
