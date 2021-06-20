package MSA.IMFLIX.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MSA.IMFLIX.business.abstracts.FilmCommentService;
import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.core.utilities.results.SuccessDataResult;
import MSA.IMFLIX.core.utilities.results.SuccessResult;
import MSA.IMFLIX.dataAccess.abstracts.FilmCommentDao;

import MSA.IMFLIX.entities.concretes.FilmComment;

@Service
public class FilmCommentManager implements FilmCommentService{
	
	private FilmCommentDao filmCommentDao;
	
	@Autowired
	public FilmCommentManager(FilmCommentDao filmCommentDao) {
		super();
		this.filmCommentDao = filmCommentDao;
	}

	@Override
	public DataResult<List<FilmComment>> getAll() {
		return new SuccessDataResult<List<FilmComment>>(this.filmCommentDao.findAll(),"Tüm film yorumları :");
	}

	@Override
	public Result add(FilmComment filmComment) {
		this.filmCommentDao.save(filmComment);
		return new SuccessResult("Yorum eklendi.");
	}
	
	

}
