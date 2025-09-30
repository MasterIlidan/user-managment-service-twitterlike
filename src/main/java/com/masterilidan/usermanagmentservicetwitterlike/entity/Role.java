package com.masterilidan.usermanagmentservicetwitterlike.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {
    @Id
    private long id;
    private String name;
}
