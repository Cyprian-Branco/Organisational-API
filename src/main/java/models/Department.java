package models;

public class Department {
    private String DeptName;
    private String description;
    private int NoOfEmployees;
    private int id;

    public Department(String deptName, String description, int NoOfEmployees){
        this.DeptName = deptName;
        this.description = description;
        this.NoOfEmployees = NoOfEmployees;
    }

    public String getDeptName() {
        return DeptName;
    }

    public String getDescription() {
        return description;
    }

    public int getNoOfEmployees() {
        return NoOfEmployees;
    }

    public int getId() {
        return id;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNoOfEmployees(int noOfEmployees) {
        NoOfEmployees = noOfEmployees;
    }

    public void setId(int id) {
        this.id = id;
    }
}
