package sg.edu.rp.c346.employeeinfo;

public class EmployeeItem {
    private String name;
    private String job;
    private float pay;

    public EmployeeItem(String name, String job, float pay) {
        this.name = name;
        this.job = job;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Float getPay() {
        return pay;
    }

    public void setPay(Float pay) {
        this.pay = pay;
    }
}