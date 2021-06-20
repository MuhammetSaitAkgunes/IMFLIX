package MSA.IMFLIX.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import MSA.IMFLIX.business.abstracts.FilmService;
import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.core.utilities.results.SuccessDataResult;
import MSA.IMFLIX.core.utilities.results.SuccessResult;
import MSA.IMFLIX.dataAccess.abstracts.FilmDao;
import MSA.IMFLIX.entities.concretes.Film;

@Service
public class FilmManager implements FilmService {

	private FilmDao filmDao;
	
	@Autowired
	public FilmManager(FilmDao filmDao) {
		super();
		this.filmDao = filmDao;
	}
	
	@Override
	public DataResult<List<Film>> getAll() {
		return new SuccessDataResult<List<Film>>(this.filmDao.findAll(),"Filmler listelendi.");
	}

	@Override
	public DataResult<Film> getByFilmName(String filmName) {
		return new SuccessDataResult<Film>(this.filmDao.getByName(filmName),"Sonuç : ");
	}

	@Override
	public DataResult<List<Film>> getByCategoryIdentity(int id) {
		return new SuccessDataResult<List<Film>>(this.filmDao.getByCategory(id),"Kategorideki filmler :");
	}

	@Override
	public DataResult<List<Film>> getByNameContains(String name) {
		return new SuccessDataResult<List<Film>>(this.filmDao.getByNameContains(name),"Bunu içeriyor :");
	}

	@Override
	public DataResult<List<Film>> getByNameStartsWith(String name) {
		return new SuccessDataResult<List<Film>>(this.filmDao.getByNameStartsWith(name),"Bunu mu demek istediniz ?");
	}
	
	@Override
	public Result add(Film film) {
		this.filmDao.save(film);
		return new SuccessResult("Film eklendi.");
	}
	
	
}
