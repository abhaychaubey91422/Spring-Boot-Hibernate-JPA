package in.sp.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
