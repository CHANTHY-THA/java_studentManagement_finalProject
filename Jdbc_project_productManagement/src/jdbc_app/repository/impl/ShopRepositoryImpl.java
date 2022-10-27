package jdbc_app.repository.impl;

import jdbc_app.entity.Customer;
import jdbc_app.entity.Shops;
import jdbc_app.repository.ShopRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShopRepositoryImpl implements ShopRepository {

    private Connection con = null;
    private PreparedStatement pstmt= null;
    private ResultSet rs = null;
    @Override
    public List<Shops> findAll() {
        try{
            String sql = "SELECT * FROM shops";

            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            List<Shops> shopsList = new ArrayList<>();

            while(rs.next()){
                Shops shops = new Shops();
                shops.setId(rs.getLong("id"));
                shops.setName(rs.getString("name"));
                shops.setAddress(rs.getString("address"));
                shops.setCreatedDate(rs.getDate("created_date"));
                shops.setUpdatedDate(rs.getDate("updated_date"));
                shops.setCreateBy(rs.getString("created_by"));
                shops.setUpdatedBy(rs.getString("updated_by"));
                shopsList.add(shops);
            }
            return shopsList;

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
    public boolean save(Shops shops) {
        String sql = "INSERT INTO shops " +
                "(name,address, created_by, updated_by) " +
                "VALUES( ? , ? , ?, ?)";
        try{

            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, shops.getName());
            pstmt.setString(2, shops.getAddress());
            pstmt.setString(3, shops.getCreateBy());
            pstmt.setString(4, shops.getUpdatedBy());

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
    public boolean update(Shops shops) {
        String sql = "UPDATE shops SET name=?,address=? updated_by=?, updated_date=CURRENT_TIMESTAMP WHERE id=?";

        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, shops.getName());
            pstmt.setString(2, shops.getAddress());
            pstmt.setString(3, shops.getUpdatedBy());
            pstmt.setLong(4, shops.getId());
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
        String sql = "DELETE FROM shops WHERE id=?";

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
    public Shops findById(long id) {
        String sql = "SELECT * FROM shops WHERE id=?";
        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1, id);
            rs = pstmt.executeQuery();
            if(rs.next()){
                Shops shops = new Shops();
                shops.setId(rs.getLong("id"));
                shops.setName(rs.getString("name"));
                shops.setAddress(rs.getString("address"));
                shops.setCreateBy(rs.getString("created_by"));
                shops.setUpdatedBy(rs.getString("updated_by"));
                shops.setCreatedDate(rs.getDate("created_date"));
                shops.setUpdatedDate(rs.getDate("updated_date"));
                return shops;
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
    public List<Shops> findByName(String name) {
        String sql = "SELECT id, name  FROM shops WHERE name LIKE ?";
        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");
            rs = pstmt.executeQuery();
            List<Shops> shopsList = new ArrayList<>();
            while(rs.next()){
                Shops shops = new Shops();
                shops.setId(rs.getLong("id"));
                shops.setName(rs.getString("name"));
                shopsList.add(shops);
            }
            return shopsList;
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
