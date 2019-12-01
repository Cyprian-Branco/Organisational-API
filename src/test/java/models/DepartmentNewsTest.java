package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentNewsTest {
    public DepartmentNews setupDepartmentNews() {
        return new DepartmentNews("agricultural tools", 5);
    }

    @Test
    public void getDepartmentIdInstantiatesCorrectly() {
        DepartmentNews testDepartmentNews = setupDepartmentNews();
        assertEquals(5, testDepartmentNews.getDepartmentId());
    }

}