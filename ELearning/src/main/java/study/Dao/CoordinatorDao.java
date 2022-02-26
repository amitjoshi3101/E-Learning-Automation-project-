package study.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entity.Coordinator;


@Repository
public interface CoordinatorDao extends JpaRepository<Coordinator, Integer> {

	 public Coordinator findByUsername(String username);
	
}
