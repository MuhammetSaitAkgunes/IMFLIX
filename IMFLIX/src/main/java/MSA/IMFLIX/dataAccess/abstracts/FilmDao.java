package MSA.IMFLIX.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import MSA.IMFLIX.entities.concretes.Film;

public interface FilmDao extends JpaRepository<Film, Integer>{
	Film getByName(String name);
	List<Film> getByNameContains(String name);
	List<Film> getByNameStartsWith(String name);
	
	@Query("From Film where category.id = :id")
	List<Film> getByCategory(int id);
}
