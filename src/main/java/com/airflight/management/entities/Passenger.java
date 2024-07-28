package com.airflight.management.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Setter
@Getter
@Table(name = "passenger")
public class Passenger {
    @Id
    @GeneratedValue
    private long passengerId;
    private String emailAddress;

    private String firstName;

    private String gender;

    private String lastName;

    private long mobileNumber;

    private long bookingId;
    @OneToOne(cascade =  CascadeType.ALL)
    @JoinColumn(name="checkinId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Checkin checkIn;
}
