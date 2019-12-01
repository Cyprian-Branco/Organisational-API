package dao;

import models.Department;

import java.util.List;

public interface GeneralNewsDao {

    void add (Department department);

    List<Department> getAll();
    Department findById(int id);

}
