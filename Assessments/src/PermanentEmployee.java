public class PermanentEmployee extends Employee {
    private int pf;
    public PermanentEmployee(int id, String name, float basicSalary, int pf) {
        super(id, name, basicSalary);
        this.pf = pf;
    }

    public int getPf() {
        return pf;
    }
    public void calculateSalary() {
        netSalary = basicSalary - pf;
    }

    public void calculateBonus() {
        if(pf<1000){
            bonus = (float) (basicSalary*0.10);
        } else if (pf>=1000 && pf < 1500){
            bonus = (float) (basicSalary*0.115);
        }  else if (pf>=1500 && pf < 1800){
            bonus = (float) (basicSalary*0.12);
        }  else if (pf>=1800){
            bonus = (float) (basicSalary*0.15);
        }
    }
}

