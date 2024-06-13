//package com.smart.entities;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//
//import java.time.LocalDateTime;
//
//@Entity
//public class ParkingSlot {
//	
//	 @OneToOne(mappedBy = "parkingSlot", cascade = CascadeType.ALL)
//	    private Booking booking;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column(name = "slot_number")
//    private int slotNumber;
//
//    @Column(name = "user_id")
//    private String userId;
//
//    @Column(name = "reservation_time")
//    private LocalDateTime reservationTime;
//
//    private String position;
//
//    public ParkingSlot() {
//    }
//
//    public ParkingSlot(int slotNumber, String userId, LocalDateTime reservationTime) {  // Update the constructor
//        this.slotNumber = slotNumber;
//        this.userId = userId;
//        this.reservationTime = reservationTime;
//    }
//
//    
//	public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public int getSlotNumber() {
//        return slotNumber;
//    }
//
//    public void setSlotNumber(int slotNumber) {
//        this.slotNumber = slotNumber;
//    }
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    public LocalDateTime getReservationTime() {
//        return reservationTime;
//    }
//
//    public void setReservationTime(LocalDateTime reservationTime) {
//        this.reservationTime = reservationTime;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    @Override
//    public String toString() {
//        return "ParkingSlot [id=" + id + ", slotNumber=" + slotNumber + ", userId=" + userId + ", reservationTime="
//                + reservationTime + ", position=" + position + "]";
//    }
//}

package com.smart.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import java.time.LocalDateTime;

@Entity
public class ParkingSlot {

    // @OneToOne(mappedBy = "parkingSlot", cascade = CascadeType.ALL)
    // private Booking booking;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "slot_number")
    private int slotNumber;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "reservation_time")
    private LocalDateTime reservationTime;

    private String position;

    public ParkingSlot() {
    }

    public ParkingSlot(int slotNumber, String userId, LocalDateTime reservationTime) { // Update the constructor
        this.slotNumber = slotNumber;
        this.userId = userId;
        this.reservationTime = reservationTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "ParkingSlot [id=" + id + ", slotNumber=" + slotNumber + ", userId=" + userId + ", reservationTime="
                + reservationTime + ", position=" + position + "]";
    }
}