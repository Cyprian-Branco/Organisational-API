package dao;

import models.Department;

import java.util.List;

public interface DepartmentDao {
    void add(Department department);

    List<Department> getAll();

    Department findById(int id);

    void update(String deptName, String description, int noOfEmployees);

    void deleteBYListId(int id);
}
