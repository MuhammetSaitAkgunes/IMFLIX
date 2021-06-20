package MSA.IMFLIX.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MSA.IMFLIX.business.abstracts.SerieService;
import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.core.utilities.results.SuccessDataResult;
import MSA.IMFLIX.core.utilities.results.SuccessResult;
import MSA.IMFLIX.dataAccess.abstracts.SerieDao;
import MSA.IMFLIX.entities.concretes.Serie;

@Service
public class SerieManager implements SerieService{
	
	private SerieDao serieDao;
	
	@Autowired
	public SerieManager(SerieDao serieDao) {
		super();
		this.serieDao = serieDao;
	}

	@Override
	public DataResult<List<Serie>> getAll() {
		return new SuccessDataResult<List<Serie>>(this.serieDao.findAll(),"Diziler listelendi.");
	}

	@Override
	public DataResult<Serie> getBySerieName(String name) {
		return new SuccessDataResult<Serie>(this.serieDao.getByName(name),"Sonuç :");
	}

	@Override
	public DataResult<List<Serie>> getByCategoryIdentity(int id) {
		return new SuccessDataResult<List<Serie>>(this.serieDao.getByCategory(id),"Kategorideki diziler :");
	}

	@Override
	public DataResult<List<Serie>> getByNameContains(String name) {
		return new SuccessDataResult<List<Serie>>(this.serieDao.getByNameContains(name),"Bunu içeriyor :");
	}

	@Override
	public DataResult<List<Serie>> getByNameStartsWith(String name) {
		return new SuccessDataResult<List<Serie>>(this.serieDao.getByNameStartsWith(name),"Bunu mu demek istediniz ? :");
	}

	@Override
	public Result add(Serie serie) {
		this.serieDao.save(serie);
		return new SuccessResult("Film eklendi.");
	}
	
}
