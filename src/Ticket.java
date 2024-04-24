public class Ticket {
    String id;
    long entryTime;
    String entryGateNumber;
    Vechile vechile;
    ParkingSlot slot;
    
    public String getId() {
        return id;
    }

    public long getEntryTime() {
        return entryTime;
    }


    public String getEntryGateNumber() {
        return entryGateNumber;
    }


    public Vechile getVechile() {
        return vechile;
    }


    public ParkingSlot getSlot() {
        return slot;
    }


    Ticket(Vechile vechile, ParkingSlot slot, String entryGateNumber) {
        this.id = util.generateRandomString(10);
        this.entryTime = System.currentTimeMillis();
        this.entryGateNumber = entryGateNumber;
        this.vechile = vechile;
        this.slot = slot;
    }
}
