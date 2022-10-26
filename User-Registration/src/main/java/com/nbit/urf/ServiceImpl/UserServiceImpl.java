package com.nbit.urf.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nbit.urf.Entity.User;
import com.nbit.urf.Repository.UserRepository;
import com.nbit.urf.Service.UserService;
import com.nbit.urf.dto.UserDto;
@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	

	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}

	@Override
	public User saveUser(UserDto userDto) {
		User user = new User(userDto.getUsername(),userDto.getPassword(),userDto.getAge(),userDto.getLocation(),userDto.getEmail());
		return userRepository.save(user);
	}



	@Override
	public User getUserByusername(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}




	



	
	
	

}
