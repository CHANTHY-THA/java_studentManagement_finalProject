package jdbc.repository;

import jdbc.entity.Student;
import java.util.List;

public interface StudentRepository {

    List<Student> findAll();
    boolean save(Student student);
    boolean update(Student student);
    boolean delete(long id);
    Student findById(long id);
    List<Student> findByName(String name);
}
