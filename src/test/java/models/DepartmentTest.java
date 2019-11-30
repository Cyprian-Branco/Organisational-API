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
        Department testDepartment = setupDepartment();
        assertEquals("collecting data", testDepartment.getDescription());
    }

    @Test
    public void getNoOfEmployees() {
        Department testDepartment = setupDepartment();
        assertEquals(4, testDepartment.getNoOfEmployees());
    }
    @Test
    public void getId() {
        Department testDepartment = setupDepartment();
        assertEquals(0,testDepartment.getId());
    }

    @Test
    public void setDeptName() {
        Department testDepartment = setupDepartment();
        testDepartment.setDeptName("field");
        assertEquals("field", testDepartment.getDeptName());
    }

    @Test
    public void setDescription() {
        Department testDepartment = setupDepartment();
        testDepartment.setDescription("collecting data");
        assertEquals("collecting data", testDepartment.getDescription());
    }

    @Test
    public void setNoOfEmployees() {
        Department testDepartment = setupDepartment();
        testDepartment.setNoOfEmployees(4);
        assertEquals(4,testDepartment.getNoOfEmployees());
    }

    @Test
    public void setId() {
        Department testDepartment = setupDepartment();
        testDepartment.setId(0);
        assertEquals(0,testDepartment.getId());
    }
}