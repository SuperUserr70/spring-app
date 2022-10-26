package com.nbit.urf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//import com.nbit.urf.Entity.User;
import com.nbit.urf.Service.UserService;
import com.nbit.urf.dto.UserDto;

@Controller
public class UserController {
	
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
    @GetMapping("/")
	public String showForm(Model model) {
    	UserDto userDto = new UserDto();
    	model.addAttribute("user", userDto);
		return "page-1";
	}
	
	  @PostMapping("/1") 
	  public String saveUser(@ModelAttribute("user") UserDto userDto) {
		 
	  userService.saveUser(userDto); 
	  return "redirect:/registered-users?success"; 
	  }
	  @GetMapping("/registered-users")
	  public String showUsers(Model model)
	  {
		  model.addAttribute("users", userService.getAllUser());
		  return "page-2";
	  }
	 @GetMapping("/userdata/{id}")
	 public String userInfo(@PathVariable Long id,Model model)
	 {
		 model.addAttribute("user",userService.getUserByusername(id));
		 return "page-3";
	 }
}

