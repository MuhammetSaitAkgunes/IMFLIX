package MSA.IMFLIX.business.abstracts;

import java.util.List;

import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.entities.concretes.SerieComment;

public interface SerieCommentService {
	DataResult<List<SerieComment>> getAll();
	Result add(SerieComment serieComment);

}
