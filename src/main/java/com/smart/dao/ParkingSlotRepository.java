package com.smart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smart.entities.ParkingSlot;

@Repository
public interface ParkingSlotRepository extends JpaRepository<ParkingSlot, Long> {
    List<ParkingSlot> findByUserId(String userId);

    boolean existsBySlotNumber(int slotNumber);

    @Query("select ps from ParkingSlot ps where ps.slotNumber= :slotNumber")
    ParkingSlot findBySlotNumber(int slotNumber);
}
