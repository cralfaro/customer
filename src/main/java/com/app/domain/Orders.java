package com.app.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by ruben on 4/03/16.
 */
@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter
    private Integer id;

    @Getter @Setter
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @Getter @Setter
    private Customer customer;


    protected Orders() {}

    public Orders(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Order[id=%d, name='%s']",
                id, name);
    }

}
