package MSA.IMFLIX.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import MSA.IMFLIX.entities.concretes.Serie;

public interface SerieDao extends JpaRepository<Serie, Integer>{
	Serie getByName(String name);
	List<Serie> getByNameContains(String name);
	List<Serie> getByNameStartsWith(String name);
	
	@Query("From Serie where category.id = :id")
	List<Serie> getByCategory(int id);
}
