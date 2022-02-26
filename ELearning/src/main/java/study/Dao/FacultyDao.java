package study.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entity.Faculty;

@Repository
public interface FacultyDao extends JpaRepository<Faculty, Integer>  {

	public Faculty findByUsername(String username);
}
