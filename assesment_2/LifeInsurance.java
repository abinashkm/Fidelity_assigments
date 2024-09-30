public class LifeInsurance extends Insurance {
    private final int policyTerm;
    private final float benefitPercent;

    public LifeInsurance(String insuranceNo, String insuranceName, double amountCovered, int policyTerm, float benefitPercent) {
        super(insuranceNo, insuranceName, amountCovered);
        this.policyTerm = policyTerm;
        this.benefitPercent = benefitPercent;
    }

    public int getPolicyTerm() {
        return policyTerm;
    }

    public float getBenefitPercent() {
        return benefitPercent;
    }

    public double calculatePremium() {
        return (getAmountCovered() - ((getAmountCovered() * benefitPercent) / 100)) / policyTerm;
    }
}