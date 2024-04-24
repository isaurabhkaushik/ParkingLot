public class Vechile {
    int id;
    String VechileNumber;
    VechileType VechileType;
    Boolean isHeavyVechile;

    public Boolean getIsHeavyVechile() {
        return isHeavyVechile;
    }

    public Vechile(int id, String vechileNumber, VechileType vechileType, Boolean isHeavyVechile) {
        this.id = id;
        VechileNumber = vechileNumber;
        VechileType = vechileType;
        this.isHeavyVechile = isHeavyVechile;
    }

    public String getVechileNumber() {
        return VechileNumber;
    }

    public VechileType getVechileType() {
        return VechileType;
    }

    public Vechile(int id, String VechileNumber, VechileType VechileType) {
        this.id = id;
        this.VechileNumber = VechileNumber;
        this.VechileType = VechileType;
        this.isHeavyVechile = false;
    }

    public int getId() {
        return id;
    }
}
