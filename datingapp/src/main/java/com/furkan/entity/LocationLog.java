package com.furkan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "location_logs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LocationLog extends BaseEntity {

    @Column(name = "place_name")
    String placeName;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @ManyToOne
    private UserAccount user;

}
