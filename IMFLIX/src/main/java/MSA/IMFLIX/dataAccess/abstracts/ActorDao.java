package MSA.IMFLIX.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import MSA.IMFLIX.entities.concretes.Actor;

public interface ActorDao extends JpaRepository<Actor, Integer>{
	Actor getByName(String name);
	List<Actor> getByNameContains(String name);
	List<Actor> getByNameStartsWith(String name);
}
