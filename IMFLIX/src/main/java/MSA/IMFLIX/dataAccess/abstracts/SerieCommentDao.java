package MSA.IMFLIX.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MSA.IMFLIX.entities.concretes.SerieComment;

public interface SerieCommentDao extends JpaRepository<SerieComment, Integer>{

}
