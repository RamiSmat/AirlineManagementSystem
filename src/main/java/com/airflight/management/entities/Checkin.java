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
@Table(name = "checkin")
public class Checkin {
    @Id
    @GeneratedValue
    private long checkinId;
    private String seatNumber;
    private String gateNumber;
}
