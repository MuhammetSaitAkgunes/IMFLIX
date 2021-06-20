package MSA.IMFLIX.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MSA.IMFLIX.business.abstracts.ActorService;
import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.core.utilities.results.SuccessDataResult;
import MSA.IMFLIX.core.utilities.results.SuccessResult;
import MSA.IMFLIX.dataAccess.abstracts.ActorDao;
import MSA.IMFLIX.entities.concretes.Actor;

@Service
public class ActorManager implements ActorService{
	
	private ActorDao actorDao;
	
	@Autowired
	public ActorManager(ActorDao actorDao) {
		super();
		this.actorDao = actorDao;
	}

	@Override
	public DataResult<List<Actor>> getAll() {
		return new SuccessDataResult<List<Actor>>(this.actorDao.findAll(),"Aktörler :");
	}

	@Override
	public DataResult<Actor> getByActorName(String name) {
		return new SuccessDataResult<Actor>(this.actorDao.getByName(name),"Sonuç :");
	}

	@Override
	public DataResult<List<Actor>> getByNameContains(String name) {
		return new SuccessDataResult<List<Actor>>(this.actorDao.getByNameContains(name),"Bunu içeriyor :");
	}

	@Override
	public DataResult<List<Actor>> getByNameStartsWith(String name) {
		return new SuccessDataResult<List<Actor>>(this.actorDao.getByNameStartsWith(name),"Bunu mu demek istediniz ? :");
	}

	@Override
	public Result add(Actor actor) {
		this.actorDao.save(actor);
		return new SuccessResult("Aktör eklendi.");
	}
	
	
}
