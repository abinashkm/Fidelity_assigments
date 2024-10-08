public class MotorInsurance extends Insurance {
    private double idv;
    private final float depPercent;
//constructor
    public MotorInsurance(String insuranceNo, String insuranceName, double amountCovered, float depPercent) {
        super(insuranceNo, insuranceName, amountCovered);
        this.depPercent = depPercent;
    }

    public double getIdv() {
        return idv;
    }

    public float getDepPercent() {
        return depPercent;
    }

    public double calculatePremium() {
        idv = getAmountCovered() - ((getAmountCovered() * depPercent) / 100);
        return 0.03 * idv;
    }
}