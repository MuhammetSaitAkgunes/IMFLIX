package MSA.IMFLIX.business.abstracts;

import java.util.List;

import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.entities.concretes.FilmComment;


public interface FilmCommentService {
	DataResult<List<FilmComment>> getAll();
	Result add(FilmComment filmComment);

}
