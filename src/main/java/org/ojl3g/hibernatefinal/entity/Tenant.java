package org.ojl3g.hibernatefinal.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tenants")
@NoArgsConstructor
public class Tenant { //Список жильцов
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "house_id", nullable = false)
    private House house;

    public Tenant(String name, House house) {
        this.name = name;
        this.house = house;
    }
}
