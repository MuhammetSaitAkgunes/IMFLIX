package MSA.IMFLIX.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MSA.IMFLIX.business.abstracts.SerieCommentService;
import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.core.utilities.results.SuccessDataResult;
import MSA.IMFLIX.core.utilities.results.SuccessResult;
import MSA.IMFLIX.dataAccess.abstracts.SerieCommentDao;
import MSA.IMFLIX.entities.concretes.SerieComment;

@Service
public class SerieCommentManager implements SerieCommentService{
	
	private SerieCommentDao serieCommentDao;
	
	@Autowired
	public SerieCommentManager(SerieCommentDao serieCommentDao) {
		super();
		this.serieCommentDao = serieCommentDao;
	}

	@Override
	public DataResult<List<SerieComment>> getAll() {
		return new SuccessDataResult<List<SerieComment>>(this.serieCommentDao.findAll(),"Tüm yorumlar listelendi :");
	}

	@Override
	public Result add(SerieComment serieComment) {
		this.serieCommentDao.save(serieComment);
		return new SuccessResult("Yorum eklendi");
	}

	
}
