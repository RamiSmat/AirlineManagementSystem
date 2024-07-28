package com.airflight.management.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Setter
@Getter
@Table(name = "bookingRecord")
public class BookingRecord {
    @Id
    @GeneratedValue
    private long bookingId;
    private LocalDateTime bookingDate;

    private String destination;

    private double fare;

    private LocalDate flightDate;

    private String flightNumber;

    private LocalTime flightTime;

    private String origin;

    private String status;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name="bookingDetails", joinColumns = {@JoinColumn(name="bookingId")} , inverseJoinColumns = {@JoinColumn(name="passengerId")})
    private List<Passenger> passengers;
}
