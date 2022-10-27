package jdbc_app.repository.impl;

import jdbc_app.entity.Shops;
import jdbc_app.entity.Vendors;
import jdbc_app.repository.VendorRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendorRepositoryImpl implements VendorRepository {

    private Connection con = null;
    private PreparedStatement pstmt= null;
    private ResultSet rs = null;
    @Override
    public List<Vendors> findAll() {
        try{
            String sql = "SELECT * FROM vendors";

            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            List<Vendors> vendorsList = new ArrayList<>();

            while(rs.next()){
                Vendors vendors = new Vendors();
                vendors.setId(rs.getLong("id"));
                vendors.setName(rs.getString("name"));
                vendors.setCreatedDate(rs.getDate("created_date"));
                vendors.setUpdatedDate(rs.getDate("updated_date"));
                vendors.setCreateBy(rs.getString("created_by"));
                vendors.setUpdatedBy(rs.getString("updated_by"));
                vendorsList.add(vendors);
            }
            return vendorsList;

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
    public boolean save(Vendors vendors) {
        String sql = "INSERT INTO vendors " +
                "(name, created_by, updated_by) " +
                "VALUES( ? , ? ,?)";
        try{

            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, vendors.getName());
            pstmt.setString(2, vendors.getCreateBy());
            pstmt.setString(3, vendors.getUpdatedBy());

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
    public boolean update(Vendors vendors) {
        String sql = "UPDATE vendors SET name=?,updated_by=?, updated_date=CURRENT_TIMESTAMP WHERE id=?";

        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, vendors.getName());
            pstmt.setString(2, vendors.getUpdatedBy());
            pstmt.setLong(3, vendors.getId());
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
        String sql = "DELETE FROM vendors WHERE id=?";

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
    public Vendors findById(long id) {
        String sql = "SELECT * FROM vendors WHERE id=?";
        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1, id);
            rs = pstmt.executeQuery();
            if(rs.next()){
                Vendors vendors = new Vendors();
                vendors.setId(rs.getLong("id"));
                vendors.setName(rs.getString("name"));
                vendors.setCreateBy(rs.getString("created_by"));
                vendors.setUpdatedBy(rs.getString("updated_by"));
                vendors.setCreatedDate(rs.getDate("created_date"));
                vendors.setUpdatedDate(rs.getDate("updated_date"));
                return vendors;
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
    public List<Vendors> findByName(String name) {
        String sql = "SELECT id, name  FROM shops WHERE name LIKE ?";
        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");
            rs = pstmt.executeQuery();
            List<Vendors> vendorsList = new ArrayList<>();
            while(rs.next()){
                Vendors vendors = new Vendors();
                vendors.setId(rs.getLong("id"));
                vendors.setName(rs.getString("name"));
                vendorsList.add(vendors);
            }
            return vendorsList;
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
