package com.airflight.management.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Setter
@Getter
@Table(name = "airlineInfo")
public class AirlineInfo {
    @Id
    @GeneratedValue
    private long airlineId;
    private String airlineLogo;
    private String nameOfAirline;

}
