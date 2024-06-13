package com.smart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smart.entities.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer>{
	//to implement that user contact who login
	//	@Query("from Booking as b where b.user.id =:userId")
	// Incorrect: This is trying to set a String as the user in Booking
	//booking.setUser(getCurrentUserId());

	// Correct: You should set the User object in Booking
//	User currentUser = userRepository.getUserByUserName(getCurrentUserId());
//	booking.setUser(currentUser);

}
