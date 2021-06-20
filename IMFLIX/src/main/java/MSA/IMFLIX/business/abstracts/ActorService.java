package MSA.IMFLIX.business.abstracts;

import java.util.List;

import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.entities.concretes.Actor;

public interface ActorService {
	DataResult<List<Actor>> getAll();
	DataResult<Actor> getByActorName(String name);
	DataResult<List<Actor>> getByNameContains(String name);
	DataResult<List<Actor>> getByNameStartsWith(String name);
	Result add(Actor actor);
}
