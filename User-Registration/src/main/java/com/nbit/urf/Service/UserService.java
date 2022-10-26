package com.nbit.urf.Service;

import java.util.List;



import com.nbit.urf.Entity.User;
import com.nbit.urf.dto.UserDto;


public interface UserService {
	
	List<User> getAllUser();
	User saveUser(UserDto userDto);
	User getUserByusername(Long id);

}
