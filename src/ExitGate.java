import java.util.HashMap;
import java.util.Map;

public class ExitGate {
    int id;
    String gateNumber;
    Map<VechileType, CostCalculator> costCalculatorMap;

    public ExitGate(int id, String gateNumber, Map<VechileType, CostCalculator> costCalculatorMap) {
        this.id = id;
        this.gateNumber = gateNumber;
        this.costCalculatorMap = costCalculatorMap;
    }

    public ExitGate(int id, String gateNumber) {
        this.id = id;
        this.gateNumber = gateNumber;
        // Default cost calculator
        HashMap<VechileType, CostCalculator> map = new HashMap<VechileType, CostCalculator>();
        map.put(VechileType.TWO_WHEELER, new CostCalculator());
        map.put(VechileType.FOUR_WHEELER, new CostCalculator());
        this.costCalculatorMap = map;
    }

    Double CalculateCost(Ticket ticket) {
        ClearParkingSlot(ticket);
        return costCalculatorMap.get(ticket.getVechile().getVechileType()).calculateCost(ticket);
    }

    void ClearParkingSlot(Ticket ticket) {
        ticket.getSlot().clearParkingSlot();
    }
}
