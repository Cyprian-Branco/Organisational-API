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
}
