package MSA.IMFLIX.business.abstracts;

import java.util.List;

import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
	Result add(User user);
}
