public class TemproraryEmployee extends Employee {
    private int dailyWages;
    private int noOfDay;

    public TemproraryEmployee(int id, String name, int dailyWages, int noOfDay) {
        super(id, name, dailyWages * noOfDay);
        this.dailyWages = dailyWages;
        this.noOfDay = noOfDay;
    }

    public int getDailyWages() {
        return dailyWages;
    }
    public int getNoOfDay() {
        return noOfDay;
    }
    public void calculateSalary() {
        netSalary = dailyWages * noOfDay;
    }

    public void calculateBonus(){
        if(dailyWages < 1000){
            bonus = (float)(netSalary*0.15);
        } else if (dailyWages >=1000 && dailyWages < 1500) {
            bonus = (float)(netSalary*0.12);
        } else if (dailyWages >=1500 && dailyWages < 1750) {
            bonus = (float)(netSalary*0.11);
        } else if (dailyWages >=1750) {
            bonus = (float)(netSalary*0.08);
        }
    }
}
