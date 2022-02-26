  package study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import study.Dao.CoordinatorDao;
import study.Dao.FacultyDao;
import study.Dao.StudentDao;
import study.Pojo.User;
import study.entity.Coordinator;
import study.entity.Faculty;
import study.entity.Student;



@Service
public class CustomUserDetailService implements UserDetailsService {
	
	
	@Autowired
	private CoordinatorDao coordinatorDao;
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private FacultyDao facultyDao;

	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user= new User();
		Coordinator coordinator = coordinatorDao.findByUsername(username);
		Student stud=studentDao.findByUsername(username);
		Faculty faculty= facultyDao.findByUsername(username);
		
		if(coordinator!=null)
		{
			user.setUsername(coordinator.getUsername());
			user.setPassword(coordinator.getPassword());
			user.setRole(coordinator.getRole());
		}
		else if(stud!=null)
		{
			user.setUsername(stud.getUsername());
			user.setPassword(stud.getPassword());
			user.setRole(stud.getRole());
		}
		else if(faculty!=null)
		{
			user.setUsername(faculty.getUsername());
			user.setPassword(faculty.getPassword());
			user.setRole(faculty.getRole());
		}
		
		if(coordinator==null && stud!=null && faculty!=null) {
			throw new UsernameNotFoundException(username+"No such user");
		}
		
		return new CustomUserDetail(user);
	}

}
