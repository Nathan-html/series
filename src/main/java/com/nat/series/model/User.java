package com.nat.series.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client")
public class User {

    @Id
    private Long id;

    private String email;

    private String password;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    @ManyToMany
    private List<Interest> interest;
}
