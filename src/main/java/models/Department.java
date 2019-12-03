package models;

import java.util.Objects;

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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return id == that.id &&
                getNoOfEmployees() == that.getNoOfEmployees() &&
                Objects.equals(getDeptName(), that.getDeptName()) &&
                Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeptName(), getDescription(), getNoOfEmployees(), getId());
    }
}
