package org.ojl3g.hibernatefinal.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "owners")
@NoArgsConstructor
public class Owner { //владелец
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.PERSIST)
    private List<House> houses;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.PERSIST)
    private List<Auto> autos;

    public Owner(String name) {
        this.name = name;
    }
}
