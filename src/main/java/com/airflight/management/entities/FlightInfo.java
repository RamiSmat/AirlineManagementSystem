package com.airflight.management.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Setter
@Getter
@Table(name = "flightInfo")
public class FlightInfo {
    @Id
    @GeneratedValue
    private long flightInfoid;
    private String flightNumber;
    private String flightType;
    private int numberOfSeats;
    @ManyToOne
    @JoinTable(name = "flightsInfo",joinColumns = {@JoinColumn(name = "flightInfoid", referencedColumnName = "flightInfoid") }, inverseJoinColumns = {@JoinColumn(name = "airlineId", referencedColumnName = "airlineId") })
    private AirlineInfo airlineInfo;


}
