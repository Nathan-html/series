package com.nat.series.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Episode {

    @Id
    private Long id;

    private String name;

    private Integer duration;

    @ManyToOne
    private Season season;
}
