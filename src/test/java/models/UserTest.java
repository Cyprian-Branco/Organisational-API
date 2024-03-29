package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    public User setupUser(){
        return new User("mike", "manager", "supervise", 3);
    }

    @Test
    public void getDepartmentIdInstantiatesCorrectly(){
        User testUser = setupUser();
        assertEquals(3, testUser.getDepartmentId());
    }

    @Test
    public void getCompany_positionInstantiatesCorrectly() {
        User testUser = setupUser();
        assertEquals("manager", testUser.getCompany_position());
    }

    @Test
    public void getRoleInstantiatesCorrectly() {
        User testUser = setupUser();
        assertEquals("supervise", testUser.getRole());
    }

    @Test
    public void getUsernameInstantiatesCorrectly() {
        User testUser = setupUser();
        assertEquals("mike", testUser.getUsername());
    }

    @Test
    public void getIdInstantiatesCorrectly() {
        User testUser = setupUser();
        assertEquals(0, testUser.getId());
    }

    @Test
    public void setUsernameInstantiatesCorrectly() {
        User testUser = setupUser();
        testUser.setUsername("mike");
        assertEquals("mike", testUser.getUsername());
    }

    @Test
    public void setCompany_positionInstantiatesCorrectly() {
        User testUser = setupUser();
        testUser.setCompany_position("manager");
        assertEquals("manager", testUser.getCompany_position());
    }

    @Test
    public void setRoleInstantiatesCorrectly() {
        User testUser = setupUser();
        testUser.setRole("supervise");
        assertEquals("supervise", testUser.getId());
    }

    @Test
    public void setIdInstantiatesCorrectly() {
        User testUser = setupUser();
        testUser.setId(0);
        assertEquals(0, testUser.getId());

    }

    @Test
    public void setDepartmentIdInstantiatesCorrectly() {
        User testUser = setupUser();
        testUser.setDepartmentId(3);
        assertEquals(3,testUser.getDepartmentId());
    }
}