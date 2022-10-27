package jdbc_app.repository.impl;

import jdbc_app.entity.Customer;
import jdbc_app.repository.CustomerRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    private Connection con = null;
    private PreparedStatement pstmt= null;
    private ResultSet rs = null;

    @Override
    public List<Customer> findAll() {
        try{
            String sql = "SELECT * FROM customers";

            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            List<Customer> customerList = new ArrayList<>();

            while(rs.next()){
                Customer customer = new Customer();
                customer.setId(rs.getLong("id"));
                customer.setName(rs.getString("name"));
                customer.setPhone(rs.getString("phone"));
                customer.setAddress(rs.getString("address"));
                customer.setCreatedDate(rs.getDate("created_date"));
                customer.setUpdatedDate(rs.getDate("updated_date"));
                customer.setCreateBy(rs.getString("created_by"));
                customer.setUpdatedBy(rs.getString("updated_by"));
                customerList.add(customer);
            }
            return customerList;

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
                con.close();
                pstmt.close();
                rs.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
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
        String sql = "UPDATE customers SET name=?, phone=?, updated_by=?, updated_date=CURRENT_TIMESTAMP WHERE id=?";

        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, customer.getName());
            pstmt.setString(2, customer.getPhone());
            pstmt.setString(3, customer.getUpdatedBy());
            pstmt.setLong(4, customer.getId());
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
    public boolean delete(long id) {
        String sql = "DELETE FROM customers WHERE id=?";

        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1, id);
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
    public Customer findById(long id) {
        String sql = "SELECT * FROM customers WHERE id=?";
        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1, id);
            rs = pstmt.executeQuery();
            if(rs.next()){
                Customer customer = new Customer();
                customer.setId(rs.getLong("id"));
                customer.setName(rs.getString("name"));
                customer.setPhone(rs.getString("phone"));
                customer.setAddress(rs.getString("address"));
                customer.setCreateBy(rs.getString("created_by"));
                customer.setUpdatedBy(rs.getString("updated_by"));
                customer.setCreatedDate(rs.getDate("created_date"));
                customer.setUpdatedDate(rs.getDate("updated_date"));
                return customer;
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
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        String sql = "SELECT id, name  FROM customers WHERE name LIKE ?";
        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");
            rs = pstmt.executeQuery();
            List<Customer> customerList = new ArrayList<>();
            while(rs.next()){
                Customer customer = new Customer();
                customer.setId(rs.getLong("id"));
                customer.setName(rs.getString("name"));
                customerList.add(customer);
            }
            return customerList;
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

        return null;
    }
}
