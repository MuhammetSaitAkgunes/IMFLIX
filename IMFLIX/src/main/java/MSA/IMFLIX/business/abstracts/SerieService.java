package MSA.IMFLIX.business.abstracts;

import java.util.List;

import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.entities.concretes.Serie;

public interface SerieService {
	DataResult<List<Serie>> getAll();
	DataResult<Serie> getBySerieName(String name);
	DataResult<List<Serie>> getByCategoryIdentity(int id);
	DataResult<List<Serie>> getByNameContains(String name);
	DataResult<List<Serie>> getByNameStartsWith(String name);
	Result add(Serie serie);
}
