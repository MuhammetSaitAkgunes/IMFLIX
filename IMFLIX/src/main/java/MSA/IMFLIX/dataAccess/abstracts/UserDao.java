package MSA.IMFLIX.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MSA.IMFLIX.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
