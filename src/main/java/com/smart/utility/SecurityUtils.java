//package com.smart.utility;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//
//public class SecurityUtils {
//
//    public static Long getCurrentUserId() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String currentUserName = authentication.getName();
//        // Retrieve the user ID based on the current user name
//        // Implement the logic to fetch the user ID from your User entity or authentication mechanism
//        // Return the user ID as a Long
//        // Example:
//        // User user = userRepository.findByUserName(currentUserName);
//         //return user.getId();
//        return null; // Placeholder for the return statement, replace with your implementation
//    }
//}
