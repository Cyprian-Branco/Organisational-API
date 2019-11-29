package models;

public class User {
    public String username;
    private String company_position;
    private String role;
    private int id;
    private int departmentId;

    public User(String username, String company_position, String role, int departmentId){
        this.username = username;
        this.company_position = company_position;
        this.role =role;
        this.departmentId = departmentId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getCompany_position() {
        return company_position;
    }

    public String getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCompany_position(String company_position) {
        this.company_position = company_position;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
