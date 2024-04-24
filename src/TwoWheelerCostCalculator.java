public class TwoWheelerCostCalculator extends CostCalculator {
    double cost = 10;
    public TwoWheelerCostCalculator(double cost) {
        this.cost = cost;
    }
    @Override
    public Double calculateCost(Ticket ticket) {
        return ((System.currentTimeMillis() -  ticket.getEntryTime())/1000*60*60)*this.cost;
    }
}
