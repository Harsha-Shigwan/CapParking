package com.smart.config;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smart.dao.ParkingSlotRepository;
import com.smart.dao.ParkingSlotService;
import com.smart.entities.ParkingSlot;

@Service
public class ParkingSlotServiceImpl implements ParkingSlotService {

    @Autowired
    private ParkingSlotRepository parkingSlotRepository;

    @Override
    public boolean reserveParkingSlot(int slotNumber, String userId) {
        // Check if the parking slot is already reserved
        ParkingSlot existingSlot = parkingSlotRepository.findBySlotNumber(slotNumber);
        if (existingSlot != null) {
            return false; // Slot is already reserved
        }

        // Reserve the parking slot
        ParkingSlot parkingSlot = new ParkingSlot(slotNumber, userId, LocalDateTime.now());
        parkingSlotRepository.save(parkingSlot);
        return true; // Reservation successful
    }

    // Other methods related to parking slot service
}
