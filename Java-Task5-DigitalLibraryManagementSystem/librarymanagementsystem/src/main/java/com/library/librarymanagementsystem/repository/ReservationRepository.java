package com.library.librarymanagementsystem.repository;

import com.library.librarymanagementsystem.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByBookIdAndStatus(Long bookId, Reservation.ReservationStatus status);
    List<Reservation> findByUserId(Long userId);

}
