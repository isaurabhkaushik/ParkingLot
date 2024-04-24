public class FourWheelerCostCalculator extends CostCalculator {
    double cost = 20;
    public FourWheelerCostCalculator(double cost) {
        this.cost = cost;
    }
    @Override
    public Double calculateCost(Ticket ticket) {
        return ((System.currentTimeMillis() -  ticket.getEntryTime())/1000*60)*this.cost;
    }

}
