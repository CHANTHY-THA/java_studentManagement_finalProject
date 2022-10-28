package jdbc.repository.Impl;

import jdbc.entity.Student;
import jdbc.repository.StudentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    @Override
    public List<Student> findAll() {
        try{
            String sql = "SELECT * FROM student;";
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            List<Student> studentList = new ArrayList<>();
            while(rs.next()){
                Student student = new Student();
                student.setId(rs.getLong("id"));
                student.setName(rs.getString("name"));
                student.setAddress(rs.getString("address"));
                student.setPhone(rs.getString("phone"));
                student.setCreated_by(rs.getString("created_by"));
                student.setCreated_date(rs.getDate("created_date"));
                studentList.add(student);
            }
            return studentList;
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
    public boolean save(Student student) {
        String insertSql = "INSERT INTO student " + "(name, address, phone, created_by) " +
                "VALUES( ? , ? , ? , ? )";
        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(insertSql);
            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getAddress());
            pstmt.setString(3, student.getPhone());
            pstmt.setString(4, student.getCreated_by());
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
    public boolean update(Student student) {
        String sql = "UPDATE student SET name=?, address=?, phone=? WHERE id=?";
        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getAddress());
            pstmt.setString(3, student.getPhone());
            pstmt.setLong(4, student.getId());
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
        String sql = "DELETE FROM student WHERE id=?";
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
    public Student findById(long id) {
        String sql = "SELECT * FROM student WHERE id=?";
        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1, id);
            rs = pstmt.executeQuery();
            if(rs.next()){
                Student student = new Student();
                student.setId(rs.getLong("id"));
                student.setName(rs.getString("name"));
                student.setAddress(rs.getString("address"));
                student.setPhone(rs.getString("phone"));
                student.setCreated_by(rs.getString("created_by"));
                student.setCreated_date(rs.getDate("created_date"));
                return student;
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
    public List<Student> findByName(String name) {
        String sql = "SELECT * FROM student WHERE name LIKE ?";
        try{
            con = DbConnection.init();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");
            rs = pstmt.executeQuery();
            List<Student> studentList = new ArrayList<>();
            while(rs.next()){
                Student student = new Student();
                student.setId(rs.getLong("id"));
                student.setName(rs.getString("name"));
                student.setAddress(rs.getString("address"));
                student.setPhone(rs.getString("phone"));
                student.setCreated_by(rs.getString("created_by"));
                student.setCreated_date(rs.getDate("created_date"));
                studentList.add(student);
            }
            return studentList;
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
