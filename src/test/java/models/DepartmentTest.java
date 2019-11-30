package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {

    public Department setupDepartment(){
        return new Department("field", "collecting data", 4);
    }

    @Test
    public void getDeptName() {
        Department testDepartment = setupDepartment();
        assertEquals("field", testDepartment.getDeptName());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getNoOfEmployees() {
    }

    @Test
    public void getId() {
    }

    @Test
    public void setDeptName() {
    }

    @Test
    public void setDescription() {
    }

    @Test
    public void setNoOfEmployees() {
    }

    @Test
    public void setId() {
    }
}