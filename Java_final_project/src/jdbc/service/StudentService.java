package jdbc.service;

import jdbc.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    boolean save(Student student);
    boolean update(Student student);
    boolean delete(long id);
    Student findById(long id);
    List<Student> findByName(String name);
}
