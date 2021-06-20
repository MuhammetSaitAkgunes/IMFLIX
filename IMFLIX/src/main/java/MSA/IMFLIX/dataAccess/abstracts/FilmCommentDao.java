package MSA.IMFLIX.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MSA.IMFLIX.entities.concretes.FilmComment;

public interface FilmCommentDao extends JpaRepository<FilmComment, Integer> {

}
