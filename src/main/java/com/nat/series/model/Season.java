package com.nat.series.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Season {

    @Id
    private Long id;

    private String name;

    @ManyToOne
    private Serie serie;

    @OneToMany(mappedBy = "season")
    private List<Episode> episodes;
}
