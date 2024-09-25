public class Employee {
    protected int id;
    protected String name;
    protected float basicSalary;
    protected float bonus;
    protected float netSalary;

    public Employee(int id, String name, float basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public float getBasicSalary() { return basicSalary; }
    public float getBonus() { return bonus; }
    public float getNetSalary() { return netSalary; }


}
