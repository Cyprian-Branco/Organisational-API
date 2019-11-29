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
    public void getUsernameInstantiatesCorrectly() {
    }

    @Test
    public void getId() {
    }

    @Test
    public void setUsername() {
    }

    @Test
    public void setCompany_position() {
    }

    @Test
    public void setRole() {
    }

    @Test
    public void setId() {
    }

    @Test
    public void setDepartmentId() {
    }
}