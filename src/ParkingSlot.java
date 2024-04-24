public class ParkingSlot {
    int id;
    public int getId() {
        return id;
    }

    VechileType vechileType;
    Boolean isBooked;
    Vechile vechile;

    public ParkingSlot(int id, VechileType vechileType) {
        this.id = id;
        this.vechileType = vechileType;
        this.isBooked = false;
    }

    public Boolean getIsBooked() {
        return isBooked;
    }

    public void parkVechile(Vechile vechile) {
        this.vechile = vechile;
        this.isBooked = true;
    }

    public void clearParkingSlot() {
        this.vechile = null;
        this.isBooked = false;
    }
}
