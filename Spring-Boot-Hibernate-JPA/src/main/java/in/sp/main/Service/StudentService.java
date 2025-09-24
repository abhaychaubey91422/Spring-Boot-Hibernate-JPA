package in.sp.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.sp.main.Entity.Student;
import in.sp.main.Repository.StudentRepository;

@Service
public class StudentService {
    
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    // Create
    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    // Read all
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // Read one
    public Student getStudentById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Update
    public Student updateStudent(Long id, Student studentDetails) {
        Student s = repo.findById(id).orElse(null);
        if(s != null) {
            s.setName(studentDetails.getName());
            s.setCourse(studentDetails.getCourse());
            s.setEmail(studentDetails.getEmail());
            return repo.save(s);
        }
        return null;
    }

    // Delete
    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}

