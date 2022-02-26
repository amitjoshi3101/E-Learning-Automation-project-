package study.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

	public Student findByUsername(String username);
}
