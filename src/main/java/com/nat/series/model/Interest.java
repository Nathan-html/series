package com.nat.series.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Interest {

    @Id
    private Long id;

    private String name;

    // Already in user Java Bean
    // @ManyToMany
    // private List<User> client;
}
