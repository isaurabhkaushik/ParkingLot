public class EntryGate {
    int id;
    String gateNumber;
    ParkingLotManager lotManager;

    public EntryGate(int id, String gateNumber, ParkingLotManager lotManager) {
        this.id = id;
        this.gateNumber = gateNumber;
        this.lotManager = lotManager;
    }

    Ticket generateTicketIfAvailable(Vechile vechile) {
        ParkingSlot slot = lotManager.findParkingSlot(vechile);
        if (slot != null) {
            return new Ticket(vechile, slot, this.gateNumber);
        }
        return null;
    }
}
