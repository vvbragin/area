package com.bragin.area.model.core;

/**
 * Created with IntelliJ IDEA.
 * User: Bragin
 * Date: 17.09.13
 * Time: 0:23
 * To change this template use File | Settings | File Templates.
 */
import javax.persistence.*;

@Entity (name = "RealtyUnit")
public class RealtyUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
