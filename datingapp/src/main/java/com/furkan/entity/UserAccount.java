package com.furkan.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserAccount extends BaseEntity {
    private String firstName;
    private String lastName;
    private String gender;
    private Date birthOfDate;

    private List<LocationLog> locations;

}
