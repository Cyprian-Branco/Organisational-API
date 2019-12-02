package dao;

import models.DepartmentNews;

import java.util.List;

public interface DepartmentNewsDao {
    void add(DepartmentNews departmentNews);

    List<DepartmentNews> getAll();

    List<DepartmentNews> getAllDepartmentNewsByDepartment(int departmentId);

    void deleteById(int id);
}
