import java.util.List;

public class ParkingLotManager {
    List<TwoWheelerParkingSlot> twoWheelerSlots;
    List<FourWheelerParkingSlot> fourWheelerSlots;

    public ParkingLotManager(List<TwoWheelerParkingSlot> twoWheelerSlots,
            List<FourWheelerParkingSlot> fourWheelerSlots) {
        this.twoWheelerSlots = twoWheelerSlots;
        this.fourWheelerSlots = fourWheelerSlots;
    }

    ParkingSlot findParkingSlot(Vechile vehicle) {
        switch (vehicle.VechileType) {
            case TWO_WHEELER: {
                for (TwoWheelerParkingSlot slot : twoWheelerSlots) {
                    if (!slot.getIsBooked()) {
                        slot.parkVechile(vehicle);
                        return slot;
                    }
                }
                break;
            }
            case FOUR_WHEELER: {
                for (FourWheelerParkingSlot slot : fourWheelerSlots) {
                    if (!slot.getIsBooked() && (!vehicle.getIsHeavyVechile() || slot.getIsHeavyVechileAllowed())) {
                        slot.parkVechile(vehicle);
                        return slot;
                    }
                }
                break;
            }
            default:
                break;
        }
        return null;
    }

    void clearParkingSlot(ParkingSlot slot) {
        slot.clearParkingSlot();
    }
}
