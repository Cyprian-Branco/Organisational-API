package dao;

import models.Department;

import java.util.List;

public interface GeneralNewsDao {

    void add (Department department);

    List<Department> getAll();
    Department findById(int id);

    void update (String deptName, String description, int noOfEmployees);

    void deleteById (int Id);
}
