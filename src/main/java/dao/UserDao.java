package dao;

import models.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User>getAll();
    List<User> getAllUsersByDepartment(int departmentId);
    void deleteById(int id);
    void Update (String username, String company_position, String role, int departmentId);
    void clearAll();

}
