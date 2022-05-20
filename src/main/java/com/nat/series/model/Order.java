package com.nat.series.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "oderded")
public class Order {

    @Id
    private Long id;

    private LocalDateTime buyAt;

    @ManyToOne
    private Serie serie;

    @ManyToOne
    private User customer;
}
