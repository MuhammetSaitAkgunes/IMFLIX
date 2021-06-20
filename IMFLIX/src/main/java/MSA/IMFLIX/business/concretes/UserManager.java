package MSA.IMFLIX.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MSA.IMFLIX.business.abstracts.UserService;
import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.core.utilities.results.SuccessDataResult;
import MSA.IMFLIX.core.utilities.results.SuccessResult;
import MSA.IMFLIX.dataAccess.abstracts.UserDao;
import MSA.IMFLIX.entities.concretes.User;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Kullanıcılar :");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kişi eklendi");
	}
	
	
}
