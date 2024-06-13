////package com.smart.entities;
////
////import javax.persistence.Column;
////import javax.persistence.Entity;
////import javax.persistence.GeneratedValue;
////import javax.persistence.GenerationType;
////import javax.persistence.Id;
////import javax.persistence.Table;
////
////@Entity
////@Table(name = "booking")
////public class Booking {
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    private Long id;
////
////    @Column(name = "car_number")
////    private String carNumber;
////
////    @Column(name = "car_model")
////    private String carModel;
////
////	public Long getId() {
////		return id;
////	}
////
////	public void setId(Long id) {
////		this.id = id;
////	}
////
////	public String getCarNumber() {
////		return carNumber;
////	}
////
////	public void setCarNumber(String carNumber) {
////		this.carNumber = carNumber;
////	}
////
////	public String getCarModel() {
////		return carModel;
////	}
////
////	public void setCarModel(String carModel) {
////		this.carModel = carModel;
////	}
////
////	@Override
////	public String toString() {
////		return "Booking [id=" + id + ", carNumber=" + carNumber + ", carModel=" + carModel + "]";
////	}   
////}
//
////package com.smart.entities;
////
////import javax.persistence.Column;
////import javax.persistence.Entity;
////import javax.persistence.GeneratedValue;
////import javax.persistence.GenerationType;
////import javax.persistence.Id;
////import javax.persistence.JoinColumn;
////import javax.persistence.ManyToOne;
////import javax.persistence.OneToOne;
////import javax.persistence.Table;
////
////@Entity
////@Table(name = "BOOKING")
////public class Booking {
////	
//	
////	@Id
////    @GeneratedValue(strategy = GenerationType.AUTO)
////    private Long bId;
////	
////    @Column(name = "car_number")
////    private String carNumber;
////
////    @Column(name = "car_model")
////    private String carModel;
////    
////    @Column(name = "slot_Name")
////    private String slotName;
////    
////    @Column(name = "slot_Time")
////    private String slotTime;
////    
////public String getSlotName() {
////		return slotName;
////	}
////
////	public void setSlotName(String slotName) {
////		this.slotName = slotName;
////	}
////
////	public String getSlotTime() {
////		return slotTime;
////	}
////
////	public void setSlotTime(String slotTime) {
////		this.slotTime = slotTime;
////	}
////
////	//    @ManyToOne
//////	private User user;
////    @ManyToOne
////    @JoinColumn(name = "user_id")
////    private User user;
////    
////    @OneToOne
////    @JoinColumn(name = "parking_slot_id")
////    private ParkingSlot parkingSlot;
////    
////    public ParkingSlot getParkingSlot() {
////        return parkingSlot;
////    }
////
////    public void setParkingSlot(ParkingSlot parkingSlot) {
////        this.parkingSlot = parkingSlot;
////    }
////    
////    public Long getbId() {
////		return bId;
////	}
////
////	public void setbId(Long bId) {
////		this.bId = bId;
////	}
////
////	public String getCarNumber() {
////		return carNumber;
////	}
////
////	public void setCarNumber(String carNumber) {
////		this.carNumber = carNumber;
////	}
////
////	public String getCarModel() {
////		return carModel;
////	}
////
////	public void setCarModel(String carModel) {
////		this.carModel = carModel;
////	}
////
////	public User getUser() {
////		return user;
////	}
////
////	public void setUser(User user) {
////		this.user = user;
////	}
////
////	@Override
////	public String toString() {
////		return "Booking [bId=" + bId + ", carNumber=" + carNumber + ", carModel=" + carModel + ", slotName=" + slotName
////				+ ", slotTime=" + slotTime + ", user=" + user + ", parkingSlot=" + parkingSlot + "]";
////	}
////
//////	@Override
//////	public String toString() {
//////		return "Booking [bId=" + bId + ", carNumber=" + carNumber + ", carModel=" + carModel + ", user=" + user + "]";
//////	}
////	
//
//package com.smart.entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "BOOKING")
//public class Booking {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long bId;
//    
//    @Column(name = "car_number")
//    private String carNumber;
//    
//    @Column(name = "car_model")
//    private String carModel;
//    
//    @Column(name = "slot_Name")
//    private String slotName;
//    
//    @Column(name = "slot_Time")
//    private String slotTime;
//    
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//    
//    // Constructors, getters, setters, and toString method
//    public Long getbId() {
//		return bId;
//	}
//
//
//	public void setbId(Long bId) {
//		this.bId = bId;
//	}
//
//
//	public String getCarNumber() {
//		return carNumber;
//	}
//
//
//	public void setCarNumber(String carNumber) {
//		this.carNumber = carNumber;
//	}
//
//
//	public String getCarModel() {
//		return carModel;
//	}
//
//
//	public void setCarModel(String carModel) {
//		this.carModel = carModel;
//	}
//
//
//	public String getSlotName() {
//		return slotName;
//	}
//
//
//	public void setSlotName(String slotName) {
//		this.slotName = slotName;
//	}
//
//
//	public String getSlotTime() {
//		return slotTime;
//	}
//
//
//	public void setSlotTime(String slotTime) {
//		this.slotTime = slotTime;
//	}
//
//
//	public User getUser() {
//		return user;
//	}
//
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//
////	@Override
////	public String toString() {
////		return "Booking [bId=" + bId + ", carNumber=" + carNumber + ", carModel=" + carModel + ", slotName=" + slotName
////				+ ", slotTime=" + slotTime + ", user=" + user + "]";
////	}
//
//
//}


//package com.smart.entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "booking")
//public class Booking {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "car_number")
//    private String carNumber;
//
//    @Column(name = "car_model")
//    private String carModel;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getCarNumber() {
//		return carNumber;
//	}
//
//	public void setCarNumber(String carNumber) {
//		this.carNumber = carNumber;
//	}
//
//	public String getCarModel() {
//		return carModel;
//	}
//
//	public void setCarModel(String carModel) {
//		this.carModel = carModel;
//	}
//
//	@Override
//	public String toString() {
//		return "Booking [id=" + id + ", carNumber=" + carNumber + ", carModel=" + carModel + "]";
//	}   
//}

package com.smart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKING")
public class Booking {

	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	// private Long bId;
	//
	// @Column(name = "car_number")
	// private String carNumber;
	//
	// @Column(name = "car_model")
	// private String carModel;
	//
	// @Column(name = "slot_Name")
	// private String slotName;
	//
	// @Column(name = "slot_Time")
	// private String slotTime;
	//
	// public String getSlotName() {
	// return slotName;
	// }
	//
	// public void setSlotName(String slotName) {
	// this.slotName = slotName;
	// }
	//
	// public String getSlotTime() {
	// return slotTime;
	// }
	//
	// public void setSlotTime(String slotTime) {
	// this.slotTime = slotTime;
	// }
	//
	// // @ManyToOne
	//// private User user;
	// @ManyToOne
	// @JoinColumn(name = "user_id")
	// private User user;
	//
	// @OneToOne
	// @JoinColumn(name = "parking_slot_id")
	// private ParkingSlot parkingSlot;
	//
	// public ParkingSlot getParkingSlot() {
	// return parkingSlot;
	// }
	//
	// public void setParkingSlot(ParkingSlot parkingSlot) {
	// this.parkingSlot = parkingSlot;
	// }
	//
	// public Long getbId() {
	// return bId;
	// }
	//
	// public void setbId(Long bId) {
	// this.bId = bId;
	// }
	//
	// public String getCarNumber() {
	// return carNumber;
	// }
	//
	// public void setCarNumber(String carNumber) {
	// this.carNumber = carNumber;
	// }
	//
	// public String getCarModel() {
	// return carModel;
	// }
	//
	// public void setCarModel(String carModel) {
	// this.carModel = carModel;
	// }
	//
	// public User getUser() {
	// return user;
	// }
	//
	// public void setUser(User user) {
	// this.user = user;
	// }
	//
	// @Override
	// public String toString() {
	// return "Booking [bId=" + bId + ", carNumber=" + carNumber + ", carModel=" +
	// carModel + ", slotName=" + slotName
	// + ", slotTime=" + slotTime + ", user=" + user + ", parkingSlot=" +
	// parkingSlot + "]";
	// }
	//
	//// @Override
	//// public String toString() {
	//// return "Booking [bId=" + bId + ", carNumber=" + carNumber + ", carModel=" +
	// carModel + ", user=" + user + "]";
	//// }
	//
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bId;

	@Column(name = "car_number")
	private String carNumber;

	@Column(name = "car_model")
	private String carModel;

	@Column(name = "slot_Name")
	private String slotName;

	@Column(name = "slot_Time")
	private String slotTime;

	@ManyToOne
	private User user;

	public Long getbId() {
		return bId;
	}

	public void setbId(Long bId) {
		this.bId = bId;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getSlotName() {
		return slotName;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}

	public String getSlotTime() {
		return slotTime;
	}

	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Booking [bId=" + bId + ", carNumber=" + carNumber + ", carModel=" + carModel + ", slotName=" + slotName
				+ ", slotTime=" + slotTime + ", user=" + user + "]";
	}

}

