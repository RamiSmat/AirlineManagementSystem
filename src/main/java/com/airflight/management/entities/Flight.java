package com.airflight.management.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="flight")
public class Flight {
    @Id
    @GeneratedValue
    private long id;
    private String destination;
    private String duration;
    private LocalDate flightDate;
    private String flightNumber;
    private LocalTime flightTime;
    private String origin;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fareId")
    private Fare fare;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="flightInfoid")
    private FlightInfo flightInfo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="inventoryId")
    private Inventory inventory;

}
