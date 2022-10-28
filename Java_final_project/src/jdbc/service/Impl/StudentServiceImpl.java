package jdbc.service.Impl;

import jdbc.entity.Student;
import jdbc.repository.Impl.StudentRepositoryImpl;
import jdbc.repository.StudentRepository;
import jdbc.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(){
        studentRepository = new StudentRepositoryImpl();
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public boolean save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public boolean update(Student student) {
        return studentRepository.update(student);
    }

    @Override
    public boolean delete(long id) {
        return studentRepository.delete(id);
    }

    @Override
    public Student findById(long id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findByName(String name) {
        return studentRepository.findByName(name);
    }
}
