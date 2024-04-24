public class CostCalculator {
    Double cost = 1000.0;

    public CostCalculator(Double cost) {
        this.cost = cost;
    }

    public CostCalculator() {
    }

    public Double calculateCost(Ticket ticket) {
        return ((System.currentTimeMillis() -  ticket.getEntryTime())/1000)*this.cost;
    }
}
