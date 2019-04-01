package Management;

import Management.Manager;

public class Director extends Manager {

    private double budget;

    public Director(String name,int NI,int salary,String deptName,double budget){
        super(name,NI,salary,deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double payBonus(){
        return getSalary() * 0.2;
    }


}