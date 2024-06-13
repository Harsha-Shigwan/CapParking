//package com.smart.controller;
//
//import java.io.File;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//import java.security.Principal;
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.http.HttpSession;
//
//import org.json.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
////import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.smart.dao.BookingRepository;
////import com.smart.dao.ParkingSlotRepository;
////import com.smart.dao.ParkingSlotService;
//import com.smart.dao.UserRepository;
//import com.smart.entities.Booking;
////import com.smart.entities.ParkingSlot;
//import com.razorpay.*;
//import com.smart.entities.User;
//import com.smart.helper.Message;
//import com.smart.service.BookingService;
//
//@Controller
//@RequestMapping("/user")
//public class UserController {
//	
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private BookingRepository bookingRepository;
//	
//	@Autowired
//    private BookingService bookingService;
//	
//	@GetMapping("/add-booking")
//	public String openAddContactForm(Model model) {
//		
//		model.addAttribute("title","Add Contact");
//		model.addAttribute("contact",new Booking());
//		
//		return "normal/Book_slot";
//	}
//	
//	@PostMapping("/process-booking")
//	public String processBooking(@ModelAttribute Booking booking, Principal principal,HttpSession session) {
//		
//		try {
//		//save user contact
//		String number = ((Booking) principal).getCarNumber();
//		User user = this.userRepository.getUserByUserName(number);
//		
////		if(3>2) {
////			
////		}
////		
//		
//		// Create a new Booking object with slotName and slotTime
//        //Booking booking = new Booking();
//        booking.setSlotName(booking.getSlotName());
//        booking.setSlotTime(booking.getSlotTime());
//        booking.setUser(user);
//        
//        // Save the booking to the database
//        bookingService.saveBooking(booking);
//		
//		
//		this.userRepository.save(user);
//		
//		
//		
//		//message success... used http session 
//		session.setAttribute("message", new Message("your contact is added !! Add more...","success"));
//		
//		
//		} catch(Exception e) {
//			System.out.println("ERROR"+e.getMessage());
//			e.printStackTrace();
//			
//			//message error
//			session.setAttribute("message", new Message("Something went wrong !! try again...","danger"));
//			
//		}
//		
//		return "normal/Book_slot";
//	}
//	
//	
////	@PostMapping("/bookings/create")
////    public Booking createBooking(@RequestParam String slotName, @RequestParam String slotTime) {
////        Booking newBooking = new Booking();
////        newBooking.setSlotName(slotName);
////        newBooking.setSlotTime(slotTime);
////        return bookingService.saveBooking(newBooking);
////    }
//	
////	@Autowired
////    private ParkingSlotRepository parkingSlotRepository;
////
////	private ParkingSlotService parkingSlotService;
//
////    @GetMapping("/save_slot")
////	public String saveSlot(@RequestParam String slotName, @RequestParam String slotTime, RedirectAttributes redirectAttributes) {
////	    // Save the slot booking information to the database
////	    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
////	    String currentPrincipalName = authentication.getName();
////	    User user = userRepository.getUserByUserName(currentPrincipalName);
////	    Booking booking = new Booking();
////	    booking.setSlotName(slotName);
////	    booking.setSlotTime(slotTime);
////	    booking.setUser(user);
////	    bookingRepository.save(booking);
////	    // Add a flash attribute to pass data to the redirected page
////	    redirectAttributes.addFlashAttribute("message", "Slot booking saved successfully");
////	    return "normal/view_slot"; // Redirect to the view_slot page
////	}
////    @PostMapping("/user/bookSlot")
////    public String bookSlot(@RequestParam String slotName, @RequestParam String slotTime) {
////        Booking booking = new Booking();
////        booking.setSlotName(slotName);
////        booking.setSlotTime(slotTime);
////       
////        
////        // Set other booking details
////        
////        bookingService.saveBooking(booking);
////        
////        return "redirect:/home"; // Redirect to home page after booking
////    }
//	
//	@GetMapping("/view_slot")
//    public String viewSlot(Model model) {
//        return "normal/view_slot";
//    }
//	
//	@PostMapping("/bookings")
//    public String createBooking(@RequestBody Booking booking) {
//        bookingService.saveBooking(booking);
//        return "Booking saved successfully";
//    }
////	@ModelAttribute
////	public void addCommonData(Model model, Principal principal) {
////		String userName = principal.getName();
////		System.out.println("USERNAME "+userName);
////		
////		//get the user using username(Email)
////		
////		User user = userRepository.getUserByUserName(userName);
////		System.out.println("USER "+user);
////		
////		model.addAttribute("user",user);
////	}
//	@ModelAttribute
//	public void addCommonData(Model model, Principal principal) {
//	    if (principal != null) {
//	        String userName = principal.getName();
//	        System.out.println("USERNAME " + userName);
//
//	        // Get the user using username (Email)
//	        User user = userRepository.getUserByUserName(userName);
//	        System.out.println("USER " + user);
//
//	        model.addAttribute("user", user);
//	    }
//	}
//
//
//
//	@RequestMapping("/index")
//	public String dashboard(Model model,Principal principal) {
//		
//		model.addAttribute("title","User Dashboard");
//		return "normal/user_dashboard";
//	}
//	
////	@GetMapping("/carRent")
////	public String openAddContactForm(Model model) {
////		
////		model.addAttribute("title","Add");
////		model.addAttribute("booking",new Booking());
////		
////		return "normal/carRent";
////	}
//	@GetMapping("/carRent")
//    public String carRent(Model model) {
//        model.addAttribute("title", "Car Rent");
//        model.addAttribute("booking", new Booking());
//        return "normal/carRent";
//    }
//
//	@GetMapping("/Book_slot")
//    public String bookSlot() {
//        // Add your logic for booking a slot here
//        return "normal/book_slot"; // Return the name of the view template for booking a slot
//    }
//	
////	@GetMapping("/view_slot")
////    public String viewSlot() {
////        // Add your logic for booking a slot here
////        return "normal/view_slot"; // Return the name of the view template for booking a slot
////    }
//	
////	@Autowired
////    public void ParkingController(ParkingSlotService parkingSlotService) {
////        this.parkingSlotService = parkingSlotService;
////    }
////	 @PostMapping("/reserveParkingSlot")
////	    public ResponseEntity<String> reserveParkingSlot(@RequestParam("slotNumber") int slotNumber) {
////	        // Implement logic to save reservation in the database
////	        // You can use your repository classes to interact with the database
////
////	        // For example:
////	        boolean success = parkingSlotService.reserveParkingSlot(slotNumber, getCurrentUserId());
////
////	        if (success) {
////	            return ResponseEntity.ok("Reservation successful");
////	        } else {
////	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error during reservation");
////	        }
////	    }
//	
////	 @PostMapping("/reserveParkingSlot")
////	    public ResponseEntity<String> reserveParkingSlot(@RequestParam int slotNumber, Principal principal) {
////	        String userId = getCurrentUserId(principal);
////	        if (userId != null) {
////	            if (parkingSlotService.reserveParkingSlot(slotNumber, userId)) {
////	                return ResponseEntity.ok("Parking slot reserved successfully");
////	            } else {
////	                return ResponseEntity.badRequest().body("Parking slot already reserved");
////	            }
////	        } else {
////	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not authenticated");
////	        }
////	    }
//
//	    private String getCurrentUserId(Principal principal) {
//	        if (principal != null) {
//	            return principal.getName();
//	        }
//	        return null;
//	    }
//	 
//	
//	
////	 @GetMapping("/getReservedSlots")
////	    public ResponseEntity<List<ParkingSlot>> getReservedSlots() {
////	        String userId = getCurrentUserId();  // Replace with your actual user ID retrieval logic
////	        List<ParkingSlot> reservedSlots = parkingSlotRepository.findByUserId(userId);
////	        return ResponseEntity.ok(reservedSlots);
////	    }
//	 
////	 @GetMapping("/view_slot")
////	 public String viewSlot(Model model) {
////	     List<ParkingSlot> reservedSlots = parkingSlotRepository.findByUserId(getCurrentUserId());
////
////	     if (!reservedSlots.isEmpty()) {
////	         // If there are reserved slots, pass them to the carRent view
////	         model.addAttribute("reservedSlots", reservedSlots);
////	         return "normal/carRent";
////	     } else {
////	         // If no slots are reserved, you can handle this scenario accordingly
////	         return "normal/no_reserved_slots";
////	     }
////	 }
//
////	@GetMapping("/view_slot")
////    public String viewSlot() {
////        // Add your logic for booking a slot here
////        return "normal/view_slot"; // Return the name of the view template for booking a slot
////    }
//	
////	 private String getCurrentUserId() {
////	        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
////	        return authentication.getName();
////	    }
////	
////	@GetMapping("/carRent")
////    public String carRent(Model model, @RequestParam("slotNumber") int slotNumber) {
////        // Check if the parking slot is already reserved
////        boolean isReserved = parkingSlotRepository.existsBySlotNumber(slotNumber);
////        if (isReserved) {
////            // Handle the case when the slot is already reserved
////            // You can redirect the user to an error page or display a message
////            return "error";
////        } else {
////            // Reserve the parking slot
////            ParkingSlot parkingSlot = new ParkingSlot(slotNumber, getCurrentUserId(), LocalDateTime.now());
////            parkingSlotRepository.save(parkingSlot);
////            model.addAttribute("slotNumber", slotNumber);
////            return "payment";
////        }
////    }
////	@RequestMapping("/payment")
////	public String paymentPage() {
////	    return "normal/payment";
////	}
//
//	
////	 @PostMapping("/processPayment")
////	    public String processPayment(Model model, @RequestParam("duration") String duration, @RequestParam("amount") String amount) {
////	        // Process the payment logic here
////	        // You can access the duration and amount values received from the form submission
////	        // Perform any necessary operations with the payment details
////
////	        // Add the payment details to the model for display on the payment success page
////	        model.addAttribute("duration", duration);
////	        model.addAttribute("amount", amount);
////
////	        return "normal/payment"; // Return the name of the view template for the payment success page
////	    }
//	
//	  @GetMapping("/processPayment")
//	    public String processPayment(@RequestParam("duration") String duration, @RequestParam("amount") double amount, Model model) {
//	        model.addAttribute("duration", duration);
//	        model.addAttribute("amount", amount);
//	        return "normal/payment";
//	    }
//	  
//	  
////	  @GetMapping("/carRent")
////	  public String carRent(Model model, @RequestParam("slotNumber") int slotNumber) {
////	      boolean isReserved = parkingSlotRepository.existsBySlotNumber(slotNumber);
////
////	      if (isReserved) {
////	          return "error"; // Handle the case when the slot is already reserved
////	      } else {
////	          // Reserve the parking slot
////	          ParkingSlot parkingSlot = new ParkingSlot(slotNumber, getCurrentUserId(), LocalDateTime.now());
////	          parkingSlotRepository.save(parkingSlot);
////	          model.addAttribute("slotNumber", slotNumber);
////	          return "normal/payment";
////	      }
////	  }
//	  
//	  private String getCurrentUserId() {
//	        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//	        return authentication.getName();
//	    }
//
////	  @GetMapping("/carRent")
////	  public String carRent(Model model, @RequestParam("slotNumber") int slotNumber) {
////	      // Check if the parking slot is already reserved
////	      boolean isReserved = parkingSlotRepository.existsBySlotNumber(slotNumber);
////
////	      if (isReserved) {
////	          // Handle the case when the slot is already reserved
////	          // You can redirect the user to an error page or display a message
////	          return "error";
////	      } else {
////	          // Reserve the parking slot
////	          ParkingSlot parkingSlot = new ParkingSlot(slotNumber, getCurrentUserId(), LocalDateTime.now());
////	          parkingSlotRepository.save(parkingSlot);
////
////	          // Create a new booking
////	          Booking booking = new Booking();
////	          User currentUser = userRepository.getUserByUserName(getCurrentUserId());
////	          booking.setUser(currentUser);
////	          booking.setParkingSlot(parkingSlot);
////	          bookingRepository.save(booking);
////
////	          model.addAttribute("slotNumber", slotNumber);
////	          return "normal/carRent";
////	      }
////	  }
//
////	  @GetMapping("/view_slot")
////	  public String viewSlot(Model model) {
////	      List<ParkingSlot> reservedSlots = parkingSlotRepository.findByUserId(getCurrentUserId());
////	      model.addAttribute("reservedSlots", reservedSlots);
////	      return "normal/view_slot";
////	  }
//
//	  
////	  @PostMapping("/create_order")
////	  @ResponseBody
////	  public String createOrder(@RequestBody Map<String, Object> data) throws RazorpayException {
////		  System.out.println(data);
////		  
////		  int amt=Integer.parseInt(data.get("amount").toString());
////		  
////		var client=new RazorpayClient("rzp_test_uu1SRJmVtNqZPW", "p8f7uxOruRonC9GA4uXQaRED");
////		
////		JSONObject ob=new JSONObject();
////		ob.put("amount", amt*100);
////		ob.put("currency", "INR");
////		ob.put("receipt", "txn_235425");
////		
////		//create new order
////		
////		Order order = client.Orders.create(ob);
////		System.out.println(order);
////		  
////		  return "done";
////	  }
//	  @PostMapping("/create_order")
//	  @ResponseBody
//	  public String createOrder(@RequestBody Map<String, Object> data) throws RazorpayException {
//	      System.out.println(data);
//
//	      // Parse the amount as a double
//	      double amt = Double.parseDouble(data.get("amount").toString());
//
//	      // Convert the double amount to an integer (assuming you want to work with integers in the Razorpay API)
//	      int amountInPaise = (int) (amt * 100);
//
//	      var client = new RazorpayClient("rzp_test_uu1SRJmVtNqZPW", "p8f7uxOruRonC9GA4uXQaRED");
//
//	      JSONObject ob = new JSONObject();
//	      ob.put("amount", amountInPaise);
//	      ob.put("currency", "INR");
//	      ob.put("receipt", "txn_235425");
//
//	      // Create a new order
//	      Order order = client.Orders.create(ob);
//	      System.out.println(order);
//	      
//	      //save the order in database
//	      
//	      
//
//	      //if you want you can save this to your data..
//	      return order.toString();
//	  }
//
//	  
//}



package com.smart.controller;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.smart.dao.BookingRepository;
import com.smart.dao.ParkingSlotService;
//import com.smart.dao.ParkingSlotRepository;
//import com.smart.dao.ParkingSlotService;
import com.smart.dao.UserRepository;
import com.smart.entities.Booking;
//import com.smart.entities.ParkingSlot;
import com.razorpay.*;
import com.smart.entities.User;
import com.smart.service.BookingService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BookingRepository bookingRepository;

	@Autowired
	private BookingService bookingService;

	// @Autowired
	// private ParkingSlotRepository parkingSlotRepository;
	//
	@Autowired
	private ParkingSlotService parkingSlotService;

	@GetMapping("/save_slot")
	public String saveSlot(@RequestParam String slotName, @RequestParam String slotTime,
			RedirectAttributes redirectAttributes) {
		// Save the slot booking information to the database
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		User user = userRepository.getUserByUserName(currentPrincipalName);
		Booking booking = new Booking();
		booking.setSlotName(slotName);
		booking.setSlotTime(slotTime);
		booking.setUser(user);
		bookingRepository.save(booking);
		// Add a flash attribute to pass data to the redirected page
		redirectAttributes.addFlashAttribute("message", "Slot booking saved successfully");
		return "normal/view_slot"; // Redirect to the view_slot page
	}

	@GetMapping("/view_slot")
	public String viewSlot(Model model) {
		return "normal/view_slot";
	}

	@PostMapping("/bookings")
	public String createBooking(@RequestBody Booking booking) {
		bookingService.saveBooking(booking);
		return "Booking saved successfully";
	}

	// @ModelAttribute
	// public void addCommonData(Model model, Principal principal) {
	// String userName = principal.getName();
	// System.out.println("USERNAME "+userName);
	//
	// //get the user using username(Email)
	//
	// User user = userRepository.getUserByUserName(userName);
	// System.out.println("USER "+user);
	//
	// model.addAttribute("user",user);
	// }
	@ModelAttribute
	public void addCommonData(Model model, Principal principal) {
		if (principal != null) {
			String userName = principal.getName();
			System.out.println("USERNAME " + userName);

			// Get the user using username (Email)
			User user = userRepository.getUserByUserName(userName);
			System.out.println("USER " + user);

			model.addAttribute("user", user);
		}
	}

	@RequestMapping("/index")
	public String dashboard(Model model, Principal principal) {

		model.addAttribute("title", "User Dashboard");
		return "normal/user_dashboard";
	}

	// @GetMapping("/carRent")
	// public String openAddContactForm(Model model) {
	//
	// model.addAttribute("title","Add");
	// model.addAttribute("booking",new Booking());
	//
	// return "normal/carRent";
	// }
	@GetMapping("/carRent")
	public String carRent(Model model) {
		model.addAttribute("title", "Car Rent");
		model.addAttribute("booking", new Booking());
		return "normal/carRent";
	}

	@GetMapping("/Book_slot")
	public String bookSlot() {
		// Add your logic for booking a slot here
		return "normal/book_slot"; // Return the name of the view template for booking a slot
	}

	// @GetMapping("/view_slot")
	// public String viewSlot() {
	// // Add your logic for booking a slot here
	// return "normal/view_slot"; // Return the name of the view template for
	// booking a slot
	// }

	// @Autowired
	// public void ParkingController(ParkingSlotService parkingSlotService) {
	// this.parkingSlotService = parkingSlotService;
	// }
	@PostMapping("/reserveParkingSlot")
	public ResponseEntity<String> reserveParkingSlot(@RequestParam("slotNumber") String slotNumber) {
		// Implement logic to save reservation in the database
		// You can use your repository classes to interact with the database

		// For example:
		System.out.println("donefailed");
		boolean success = parkingSlotService.reserveParkingSlot(Integer.parseInt(slotNumber), getCurrentUserId());

		if (success) {
			System.out.println("donefailed");
			return ResponseEntity.ok(getCurrentUserId());
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error during reservation");
		}
	}

	// @PostMapping("/reserveParkingSlot")
	// public ResponseEntity<String> reserveParkingSlot(@RequestParam int
	// slotNumber, Principal principal) {
	// String userId = getCurrentUserId(principal);
	// if (userId != null) {
	// if (parkingSlotService.reserveParkingSlot(slotNumber, userId)) {
	// return ResponseEntity.ok("Parking slot reserved successfully");
	// } else {
	// return ResponseEntity.badRequest().body("Parking slot already reserved");
	// }
	// } else {
	// return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not
	// authenticated");
	// }
	// }

	private String getCurrentUserId(Principal principal) {
		if (principal != null) {
			return principal.getName();
		}
		return null;
	}

	// @GetMapping("/getReservedSlots")
	// public ResponseEntity<List<ParkingSlot>> getReservedSlots() {
	// String userId = getCurrentUserId(); // Replace with your actual user ID
	// retrieval logic
	// List<ParkingSlot> reservedSlots = parkingSlotRepository.findByUserId(userId);
	// return ResponseEntity.ok(reservedSlots);
	// }

	// @GetMapping("/view_slot")
	// public String viewSlot(Model model) {
	// List<ParkingSlot> reservedSlots =
	// parkingSlotRepository.findByUserId(getCurrentUserId());
	//
	// if (!reservedSlots.isEmpty()) {
	// // If there are reserved slots, pass them to the carRent view
	// model.addAttribute("reservedSlots", reservedSlots);
	// return "normal/carRent";
	// } else {
	// // If no slots are reserved, you can handle this scenario accordingly
	// return "normal/no_reserved_slots";
	// }
	// }

	// @GetMapping("/view_slot")
	// public String viewSlot() {
	// // Add your logic for booking a slot here
	// return "normal/view_slot"; // Return the name of the view template for
	// booking a slot
	// }

	// private String getCurrentUserId() {
	// Authentication authentication =
	// SecurityContextHolder.getContext().getAuthentication();
	// return authentication.getName();
	// }
	//
	// @GetMapping("/carRent")
	// public String carRent(Model model, @RequestParam("slotNumber") int
	// slotNumber) {
	// // Check if the parking slot is already reserved
	// boolean isReserved = parkingSlotRepository.existsBySlotNumber(slotNumber);
	// if (isReserved) {
	// // Handle the case when the slot is already reserved
	// // You can redirect the user to an error page or display a message
	// return "error";
	// } else {
	// // Reserve the parking slot
	// ParkingSlot parkingSlot = new ParkingSlot(slotNumber, getCurrentUserId(),
	// LocalDateTime.now());
	// parkingSlotRepository.save(parkingSlot);
	// model.addAttribute("slotNumber", slotNumber);
	// return "payment";
	// }
	// }
	// @RequestMapping("/payment")
	// public String paymentPage() {
	// return "normal/payment";
	// }

	// @PostMapping("/processPayment")
	// public String processPayment(Model model, @RequestParam("duration") String
	// duration, @RequestParam("amount") String amount) {
	// // Process the payment logic here
	// // You can access the duration and amount values received from the form
	// submission
	// // Perform any necessary operations with the payment details
	//
	// // Add the payment details to the model for display on the payment success
	// page
	// model.addAttribute("duration", duration);
	// model.addAttribute("amount", amount);
	//
	// return "normal/payment"; // Return the name of the view template for the
	// payment success page
	// }

	@GetMapping("/processPayment")
	public String processPayment(@RequestParam("duration") String duration, @RequestParam("amount") double amount,
			Model model) {
		model.addAttribute("duration", duration);
		model.addAttribute("amount", amount);
		return "normal/payment";
	}

	// @GetMapping("/carRent")
	// public String carRent(Model model, @RequestParam("slotNumber") int
	// slotNumber) {
	// boolean isReserved = parkingSlotRepository.existsBySlotNumber(slotNumber);
	//
	// if (isReserved) {
	// return "error"; // Handle the case when the slot is already reserved
	// } else {
	// // Reserve the parking slot
	// ParkingSlot parkingSlot = new ParkingSlot(slotNumber, getCurrentUserId(),
	// LocalDateTime.now());
	// parkingSlotRepository.save(parkingSlot);
	// model.addAttribute("slotNumber", slotNumber);
	// return "normal/payment";
	// }
	// }

	private String getCurrentUserId() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}

	// @GetMapping("/carRent")
	// public String carRent(Model model, @RequestParam("slotNumber") int
	// slotNumber) {
	// // Check if the parking slot is already reserved
	// boolean isReserved = parkingSlotRepository.existsBySlotNumber(slotNumber);
	//
	// if (isReserved) {
	// // Handle the case when the slot is already reserved
	// // You can redirect the user to an error page or display a message
	// return "error";
	// } else {
	// // Reserve the parking slot
	// ParkingSlot parkingSlot = new ParkingSlot(slotNumber, getCurrentUserId(),
	// LocalDateTime.now());
	// parkingSlotRepository.save(parkingSlot);
	//
	// // Create a new booking
	// Booking booking = new Booking();
	// User currentUser = userRepository.getUserByUserName(getCurrentUserId());
	// booking.setUser(currentUser);
	// booking.setParkingSlot(parkingSlot);
	// bookingRepository.save(booking);
	//
	// model.addAttribute("slotNumber", slotNumber);
	// return "normal/carRent";
	// }
	// }

	// @GetMapping("/view_slot")
	// public String viewSlot(Model model) {
	// List<ParkingSlot> reservedSlots =
	// parkingSlotRepository.findByUserId(getCurrentUserId());
	// model.addAttribute("reservedSlots", reservedSlots);
	// return "normal/view_slot";
	// }

	// @PostMapping("/create_order")
	// @ResponseBody
	// public String createOrder(@RequestBody Map<String, Object> data) throws
	// RazorpayException {
	// System.out.println(data);
	//
	// int amt=Integer.parseInt(data.get("amount").toString());
	//
	// var client=new RazorpayClient("rzp_test_uu1SRJmVtNqZPW",
	// "p8f7uxOruRonC9GA4uXQaRED");
	//
	// JSONObject ob=new JSONObject();
	// ob.put("amount", amt*100);
	// ob.put("currency", "INR");
	// ob.put("receipt", "txn_235425");
	//
	// //create new order
	//
	// Order order = client.Orders.create(ob);
	// System.out.println(order);
	//
	// return "done";
	// }
	@PostMapping("/create_order")
	@ResponseBody
	public String createOrder(@RequestBody Map<String, Object> data) throws RazorpayException {
		System.out.println(data);

		// Parse the amount as a double
		double amt = Double.parseDouble(data.get("amount").toString());

		// Convert the double amount to an integer (assuming you want to work with
		// integers in the Razorpay API)
		int amountInPaise = (int) (amt * 100);

		var client = new RazorpayClient("rzp_test_uu1SRJmVtNqZPW", "p8f7uxOruRonC9GA4uXQaRED");

		JSONObject ob = new JSONObject();
		ob.put("amount", amountInPaise);
		ob.put("currency", "INR");
		ob.put("receipt", "txn_235425");

		// Create a new order
		Order order = client.Orders.create(ob);
		System.out.println(order);

		// save the order in database

		// if you want you can save this to your data..
		return order.toString();
	}

}

