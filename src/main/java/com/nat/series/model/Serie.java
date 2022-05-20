package com.nat.series.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Serie {

    @Id
    private Long id;

    private String name;

    // price in euro
    private Float price;

    @OneToMany(mappedBy = "serie")
    private List<Order> orders;

    @OneToMany(mappedBy = "serie", cascade = CascadeType.REMOVE)
    private List<Season> seasons;
}
