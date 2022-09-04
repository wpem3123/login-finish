package site.metacoding.red.domain.users;

import java.util.List;

import site.metacoding.red.web.dto.request.users.JoinDto;
import site.metacoding.red.web.dto.request.users.LoginDto;

public interface UsersDao {
	public void insert(JoinDto joinDto);
	public Users login(LoginDto loginDto);
	public Users findById(Integer id);
	public List<Users> findAll();
	public void update(Users users);
	public void delete(Integer id);

}
