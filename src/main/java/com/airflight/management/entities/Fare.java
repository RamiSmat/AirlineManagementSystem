package com.airflight.management.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@ToString
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="fare")
public class Fare {
    @Id
    @GeneratedValue
    private long fareId;
    private String currency;
    private double fare;

}
