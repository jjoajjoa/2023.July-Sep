package Study01;

import java.util.ArrayList;
import java.util.List;

class User {
	private long id;
	private String username;
	
	public User(Long id, String username) {
		this.id = id;
		this.username = username;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
}

interface UserRepository<T> {
	T findById(Long id);
	List<T> findAll();
	void save(T entity);
	void delete(T entity);
}

class UserListRepository implements UserRepository<User> {
	private List<User> users = new ArrayList<>();

	@Override
	public User findById(Long id) {
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> findAll() {
		return new ArrayList<>(users);
	}

	@Override
	public void save(User entity) {
		users.add(entity);
	}

	@Override
	public void delete(User entity) {
		users.remove(entity);
	}
}

public class UserRepositoryClass {
	public static void main(String[] args) {
		UserRepository<User> userRepository = new UserListRepository();
		
		userRepository.save(new User(1L, "user1"));
		userRepository.save(new User(2L, "user2"));
		userRepository.save(new User(3L, "user3"));
		userRepository.save(new User(4L, "user4"));
		
		List<User> allUsers = userRepository.findAll();
		System.out.println("---All---");
		for(User user : allUsers) {
			System.out.println(user.getUsername());
		}
		
		User user = userRepository.findById(1L);
		System.out.println("유저 찾기: " + user.getUsername());
		
		userRepository.delete(user);
		User deleteUser = userRepository.findById(1L);
		
		if(deleteUser == null) {
			System.out.println("성공적으로 삭제되었슴다");
		}
	}
}
