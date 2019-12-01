package models;

public class Department {
    private String deptName;
    private String description;
    private int noOfEmployees;
    private int id;

    public Department(String deptName, String description, int NoOfEmployees){
        this.deptName = deptName;
        this.description = description;
        this.noOfEmployees = NoOfEmployees;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getDescription() {
        return description;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    public int getId() {
        return id;
    }

    public void setDeptName(String deptName) {
        deptName = deptName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNoOfEmployees(int noOfEmployees) {
        noOfEmployees = noOfEmployees;
    }

    public void setId(int id) {
        this.id = id;
    }
}
