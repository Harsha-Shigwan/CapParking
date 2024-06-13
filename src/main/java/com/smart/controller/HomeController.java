////package com.smart.controller;
////
////import java.security.Principal;
////
////import javax.servlet.http.HttpSession;
//////import javax.validation.Valid;
////import javax.validation.Valid;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.stereotype.Controller;
////import org.springframework.ui.Model;
////import org.springframework.validation.BindingResult;
////import org.springframework.validation.annotation.Validated;
////import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.ModelAttribute;
////import org.springframework.web.bind.annotation.PostMapping;
////import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.bind.annotation.RequestMethod;
////import org.springframework.web.bind.annotation.RequestParam;
////import org.springframework.web.servlet.ModelAndView;
////
////import com.smart.dao.UserRepository;
////import com.smart.entities.User;
////import com.smart.helper.Message;
////
////@Controller
////@Validated
////public class HomeController {
////	
////	@Autowired
////	private BCryptPasswordEncoder passwordEncoder;
////	
////	@Autowired
////	private UserRepository userRepository;
////	
////	@RequestMapping("/")
////	public String home(Model model) {
////		model.addAttribute("title","Parking page");
////		return "home";
////	}
////	
////	@RequestMapping("/signup")
////	public String signup(Model model) {
////		model.addAttribute("title","Register - Parking manager");
////		model.addAttribute("user",new User());
////		return "signup";
////	}
////	
//////	@GetMapping("/carRent")
//////    public String showParkingManagerPage() {
//////        return "normal/carRent"; // Return the name of the Thymeleaf template to be rendered
//////    }
////	@RequestMapping(value = "/do_register", method = RequestMethod.POST)
////	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result1,
////	                           @RequestParam(value = "agreement", defaultValue = "false") boolean agreement,
////	                           Model model, HttpSession session) {
////	    try {
////	        if (!agreement) {
////	            System.out.println("You have not agreed to the terms and conditions");
////	            throw new Exception("You have not agreed to the terms and conditions");
////	        }
////	        if (result1.hasErrors()) {
////	            System.out.println("ERROR" + result1.toString());
////	            model.addAttribute("user", user);
////	            return "signup";
////	        }
////	        user.setEnabled(true);
////	        user.setImageUrl("default.png");
////	        user.setPassword(passwordEncoder.encode(user.getPassword()));
////	        
////	        // Set the serial number before saving
////	        String serialNumber = user.getSerialNo();
////	        user.setSerialNo(serialNumber);
////	        
////	        User result = this.userRepository.save(user);
////	        
////	        model.addAttribute("user", new User());
////	        session.setAttribute("message", new Message("Successfully Registered!", "alert-primary"));
////	        return "signup";
////	    } catch (Exception e) {
////	        e.printStackTrace();
////	        model.addAttribute("user", user);
////	        session.setAttribute("message", new Message("Something Went Wrong: " + e.getMessage(), "alert-danger"));
////	        return "signup";
////	    }
////	}
////	
////
////	//handler for custom login
////	@GetMapping("/signin")
////	public String customLogin(Model model) {
////		
////		model.addAttribute("title","Login page");
////		return "login";
////	}
//////	@RequestMapping("/dologin")
//////    public String dashboard(Model model,@ModelAttribute("user") User user) {
//////        // Your dashboard logic
//////        model.addAttribute("user", user);
//////        return "normal/user_dashboard";
//////    }
//////	@GetMapping("/index")
//////    public String userDashboard(Model model, Principal principal) {
//////        model.addAttribute("title", "User Dashboard");
//////        return "normal/user_dashboard";
//////    }
////	
//////	@GetMapping("/dashboard")
//////    public String dashboard(Model model) {
//////        // Your dashboard logic
//////        return "index";
//////    }
////	 
//////	@RequestMapping("/login")
//////	public String dashboard(Model model,Principal principal) {
//////		
//////		model.addAttribute("title","User Dashboard");
//////		return "user_dashboard";
//////	}
////	
//////	 @GetMapping("/login")
//////	    public ModelAndView loginPage() {
//////	        return new ModelAndView("login");
//////	    }
//////
//////	    @PostMapping("/user/index")
//////	    public ModelAndView login(@RequestParam String username, @RequestParam String password) {
//////	        // Here you can add your logic to authenticate the user.
//////	        // For example, you can check the user's credentials against a database.
//////
//////	        // If the authentication is successful, redirect the user to the home page.
//////	        // Otherwise, show an error message on the login page.
//////
//////	        return new ModelAndView("redirect:/normal/user_dashboard");
//////	    }
//////	
//////	
////
////	
//////	@GetMapping("/slot")
//////    public String showParkingManagerPage() {
//////        return "carRent"; // Return the name of the Thymeleaf template to be rendered
//////    }
////}
////
////
//
//package com.smart.controller;
//
//import java.security.Principal;
//
//import javax.servlet.http.HttpSession;
////import javax.validation.Valid;
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.smart.dao.UserRepository;
//import com.smart.entities.Booking;
//import com.smart.entities.User;
////import com.smart.helper.Message;
//import com.smart.helper.Message;
//import com.smart.service.BookingService;
//
//@Controller
//@Validated
//public class HomeController {
//	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
//	
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//    private BookingService bookingService;
//
////    @PostMapping("/user/bookings/create")
////    public String createBooking(@RequestParam String slotName, @RequestParam String slotTime) {
////        if (slotName == null || slotName.isEmpty() || slotTime == null || slotTime.isEmpty()) {
////            // Handle missing or empty parameters
////            return "redirect:/error-page"; // Redirect to an error page
////        }
////
////        Booking booking = new Booking();
////        booking.setSlotName(slotName);
////        booking.setSlotTime(slotTime);
////        
////        // Set other booking details if needed
////        
////        Booking savedBooking = bookingService.saveBooking(booking);
////        
////        if (savedBooking != null) {
////            return "redirect:/success-page"; // Redirect to a success page
////        } else {
////            return "redirect:/error-page"; // Redirect to an error page if saving fails
////        }
////    }
////	
//	@RequestMapping("/")
//	public String home(Model model) {
//		model.addAttribute("title","Parking page");
//		return "home";
//	}
//	
//	@RequestMapping("/signup")
//	public String signup(Model model) {
//		model.addAttribute("title","Register - Parking manager");
//		model.addAttribute("user",new User());
//		return "signup";
//	}
//	
//	@RequestMapping("/about")
//	public String about(Model model) {
//		model.addAttribute("title","about - parking Manager");
//		return "about";
//	}
//	
//	//handler for custom login
//	@GetMapping("/signin")
//	public String customLogin(Model model) {
//		model.addAttribute("titile","Login Page");
//		return "login";
//	}
//	
//	@GetMapping("/slot")
//    public String showParkingManagerPage() {
//        return "carRent"; // Return the name of the Thymeleaf template to be rendered
//    }
//	@RequestMapping(value = "/do_register",method = RequestMethod.POST)
//	public String registerUser(@Valid @ModelAttribute("user") User user,BindingResult result1,@RequestParam(value="agreement",defaultValue = "false") boolean agreement,Model model,HttpSession session) {
//		
//		try {
//			
//			if(!agreement) {
//				System.out.println("You have not agreed term and condition");
//				throw new Exception("You have not agreed term and condition");
//			}
//			
//			if(result1.hasErrors()) {
//				System.out.println("ERROR"+ result1.toString());
//				model.addAttribute("user",user);
//				return "signup";
//			}
//		
//			user.setRole("ROLE_USER");
//			user.setEnabled(true);
//			user.setPassword(passwordEncoder.encode(user.getPassword()));
//			
//			System.out.println("Agreement"+agreement);
//			System.out.println("USER"+user);
//		
//	        String serialNumber = user.getSerialNo();
//	        user.setSerialNo(serialNumber);
//	        
//	        User result = this.userRepository.save(user);
//	        
//	        model.addAttribute("user", new User());
//	        session.setAttribute("message", new Message("Successfully Registered!", "alert-primary"));
//	        return "signup";
//	    } catch (Exception e) {
//	        e.printStackTrace();
//	        model.addAttribute("user", user);
//	        session.setAttribute("message", new Message("Something Went Wrong: " + e.getMessage(), "alert-danger"));
//	        return "signup";
//	    }
//	}
//	
//
////	//handler for custom login
////	@GetMapping("/signin")
////	public String customLogin(Model model) {
////		
////		model.addAttribute("title","Login page");
////		return "login";
////	}
//	
////	@GetMapping("/index")
////    public String userDashboard(Model model, Principal principal) {
////        model.addAttribute("title", "User Dashboard");
////        return "normal/user_dashboard";
////    }
//	
////	@RequestMapping("/dologin")
////    public String dashboard(Model model) {
////        // Your dashboard logic
////        return "index";
////    }
//	 
////	@RequestMapping("/login")
////	public String dashboard(Model model,Principal principal) {
////		
////		model.addAttribute("title","User Dashboard");
////		return "user_dashboard";
////	}
//	
////	 @GetMapping("/login")
////	    public ModelAndView loginPage() {
////	        return new ModelAndView("login");
////	    }
////
////	    @PostMapping("/user/index")
////	    public ModelAndView login(@RequestParam String username, @RequestParam String password) {
////	        // Here you can add your logic to authenticate the user.
////	        // For example, you can check the user's credentials against a database.
////
////	        // If the authentication is successful, redirect the user to the home page.
////	        // Otherwise, show an error message on the login page.
////
////	        return new ModelAndView("redirect:/normal/user_dashboard");
////	    }
////	
////	
//
//	
////	@GetMapping("/slot")
////    public String showParkingManagerPage() {
////        return "carRent"; // Return the name of the Thymeleaf template to be rendered
////    }
//}
//



package com.smart.controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;
//import javax.validation.Valid;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.smart.dao.UserRepository;
import com.smart.entities.User;
//import com.smart.helper.Message;
import com.smart.helper.Message;

@Controller
@Validated
public class HomeController {
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("title","Parking page");
		return "home";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title","Register - Parking manager");
		model.addAttribute("user",new User());
		return "signup";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title","about - parking Manager");
		return "about";
	}
	
	//handler for custom login
	@GetMapping("/signin")
	public String customLogin(Model model) {
		model.addAttribute("titile","Login Page");
		return "login";
	}
	
	@GetMapping("/slot")
    public String showParkingManagerPage() {
        return "carRent"; // Return the name of the Thymeleaf template to be rendered
    }
	@RequestMapping(value = "/do_register",method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user,BindingResult result1,@RequestParam(value="agreement",defaultValue = "false") boolean agreement,Model model,HttpSession session) {
		
		try {
			
			if(!agreement) {
				System.out.println("You have not agreed term and condition");
				throw new Exception("You have not agreed term and condition");
			}
			
			if(result1.hasErrors()) {
				System.out.println("ERROR"+ result1.toString());
				model.addAttribute("user",user);
				return "signup";
			}
		
			user.setRole("ROLE_USER");
			user.setEnabled(true);
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			
			System.out.println("Agreement"+agreement);
			System.out.println("USER"+user);
		
	        String serialNumber = user.getSerialNo();
	        user.setSerialNo(serialNumber);
	        
	        User result = this.userRepository.save(user);
	        
	        model.addAttribute("user", new User());
	        session.setAttribute("message", new Message("Successfully Registered!", "alert-primary"));
	        return "signup";
	    } catch (Exception e) {
	        e.printStackTrace();
	        model.addAttribute("user", user);
	        session.setAttribute("message", new Message("Something Went Wrong: " + e.getMessage(), "alert-danger"));
	        return "signup";
	    }
	}
	
	
//	//handler for custom login
//	@GetMapping("/signin")
//	public String customLogin(Model model) {
//		
//		model.addAttribute("title","Login page");
//		return "login";
//	}
	
//	@GetMapping("/index")
//    public String userDashboard(Model model, Principal principal) {
//        model.addAttribute("title", "User Dashboard");
//        return "normal/user_dashboard";
//    }
	
//	@RequestMapping("/dologin")
//    public String dashboard(Model model) {
//        // Your dashboard logic
//        return "index";
//    }
	 
//	@RequestMapping("/login")
//	public String dashboard(Model model,Principal principal) {
//		
//		model.addAttribute("title","User Dashboard");
//		return "user_dashboard";
//	}
	
//	 @GetMapping("/login")
//	    public ModelAndView loginPage() {
//	        return new ModelAndView("login");
//	    }
//
//	    @PostMapping("/user/index")
//	    public ModelAndView login(@RequestParam String username, @RequestParam String password) {
//	        // Here you can add your logic to authenticate the user.
//	        // For example, you can check the user's credentials against a database.
//
//	        // If the authentication is successful, redirect the user to the home page.
//	        // Otherwise, show an error message on the login page.
//
//	        return new ModelAndView("redirect:/normal/user_dashboard");
//	    }
//	
//	

	
//	@GetMapping("/slot")
//    public String showParkingManagerPage() {
//        return "carRent"; // Return the name of the Thymeleaf template to be rendered
//    }
}




