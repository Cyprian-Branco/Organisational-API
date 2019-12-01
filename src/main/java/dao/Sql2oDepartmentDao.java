package dao;

import models.Department;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

public class Sql2oDepartmentDao implements DepartmentDao {
    private final Sql2o sql2o;

    public Sql2oDepartmentDao (Sql2o sql2o){
        this.sql2o = sql2o;
    }
    @Override
    public void add(Department department){
        String sql = "INSERT INTO departments(deptName, description, noOfEmployees) VALUES (:deptName, :description, :noOfEmployees);";
        try (Connection conn = sql2o.open()){
            int id = (int) conn.createQuery(sql, true)
                    .bind(department)
                    .addParameter("noOfEmployees", department.getNoOfEmployees())
                    .executeUpdate()
                    .getKey();
            department.setId(id);

        }catch (Sql2oException ex){
            System.out.println(ex);
        }

    }


}
