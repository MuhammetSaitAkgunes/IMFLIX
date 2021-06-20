package MSA.IMFLIX.business.abstracts;

import java.util.List;

import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.entities.concretes.Film;

public interface FilmService {
	DataResult<List<Film>> getAll();
	DataResult<Film> getByFilmName(String filmName);
	DataResult<List<Film>> getByCategoryIdentity(int id);
	DataResult<List<Film>> getByNameContains(String name);
	DataResult<List<Film>> getByNameStartsWith(String name);
	Result add(Film film);
}
