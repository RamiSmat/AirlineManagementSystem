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
@Setter@Getter
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue
    private long inventoryId;
    private int count;
}
