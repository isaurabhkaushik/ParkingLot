public class FourWheelerParkingSlot extends ParkingSlot{
    Boolean isHeavyVechileAllowed;

    public Boolean getIsHeavyVechileAllowed() {
        return isHeavyVechileAllowed;
    }

    public FourWheelerParkingSlot(int id, Boolean isHeavyVechileAllowed) {
        super(id, VechileType.FOUR_WHEELER);
        this.isHeavyVechileAllowed = isHeavyVechileAllowed;
    }

    public FourWheelerParkingSlot(int id) {
        super(id, VechileType.FOUR_WHEELER);
        this.isHeavyVechileAllowed = false;
    }
}
