package jdbc_app.repository.impl;

import jdbc_app.entity.Customer;
import jdbc_app.repository.CustomerRepository;

import java.sql.*;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    private Connection con = null;
    private PreparedStatement pstmt= null;
    private ResultSet rs = null;

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public boolean save(Customer customer) {
        String sql = "INSERT INTO customers " +
                "(name, phone,address, created_by, updated_by) " +
                "VALUES( ? , ? , ?, ?, ?)";
        try{

            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, customer.getName());
            pstmt.setString(2, customer.getPhone());
            pstmt.setString(3, customer.getAddress());
            pstmt.setString(4, customer.getCreateBy());
            pstmt.setString(5, customer.getUpdatedBy());

            if(pstmt.executeUpdate() != 0){
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
                con.close();
                pstmt.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Customer findById(long id) {
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }
}
